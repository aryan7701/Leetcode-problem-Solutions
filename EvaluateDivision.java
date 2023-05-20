public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for(List<String> eq: equations) {
            for(String e: eq) if(!map.containsKey(e)) map.put(e, count++);
        }

        double[][] edges = new double[map.size()][map.size()];
        for(int i=0; i<equations.size(); i++) {
            double value = values[i];
            int x = map.get(equations.get(i).get(0));
            int y = map.get(equations.get(i).get(1));
            edges[x][y] = value;
            edges[y][x] = 1/value;
        }

        EDisjointSet ds = new EDisjointSet(map.size(), edges);
        for(int i=0; i<equations.size(); i++) {
            int x = map.get(equations.get(i).get(0));
            int y = map.get(equations.get(i).get(1));
            ds.union(x, y);
        }

        double[] result = new double[queries.size()];
        for(int i=0; i<queries.size(); i++) {
            int x = map.getOrDefault(queries.get(i).get(0), -1);
            int y = map.getOrDefault(queries.get(i).get(1), -1);
            result[i] = -1.;
            if(x!=-1 && y!=-1) {
                result[i] = ds.evaluate(x, y);
                edges[x][y] = result[i];
                edges[y][x] = 1/result[i];
            }
        }
        return result;
    }
}
class EDisjointSet {
    int[] root;
    int[] rank;
    int count;
    double[][] edges;
    public EDisjointSet(int size, double[][] edges) {
        this.edges = edges;
        count = size;
        root = new int[size];
        rank = new int[size];
        for(int i=0; i<size; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }
    public int find_original(int x) {
        if(root[x]==x) return x;
        return root[x]=find_original(root[x]);
    }
    public int find(int x) {
        return findAndCompute(x, new double[] {-1.});
    }
    public int findAndCompute(int x, double[] path_wt) {
        if(root[x]==x) {
            path_wt[0] = 1.;
            edges[root[x]][x] = 1.;
            edges[x][root[x]] = 1.;
            return x;
        }
        int root_temp = findAndCompute(root[x], path_wt);
        path_wt[0] *= edges[root[x]][x];
        edges[root_temp][x] = path_wt[0];
        edges[x][root_temp] = 1/path_wt[0];
        return root_temp;
    }
    public double evaluate(int x, int y) {
        if(edges[x][y] != 0) return edges[x][y];
        int root_x = find(x);
        int root_y = find(y);
        return root_x!=root_y? -1.: edges[x][root_x]*edges[root_y][y];
    }
    public void union(int x, int y) {
        int root_x = find(x);
        int root_y = find(y);
        edges[root_x][root_y] = edges[root_x][x] * edges[x][y] * edges[y][root_y];
        edges[root_y][root_x] = 1/edges[root_x][root_y];

        if(root_x != root_y) {
            if(rank[x] > rank[y])      root[root_y]=root_x;
            else if(rank[x] < rank[y]) root[root_x]=root_y;
            else {
                root[root_y] = root_x;
                rank[root_x] += 1;
            }
            count--;
        }
    }
    public int getCount() {
        return count;
    }
    public static void main(String[] args){

    }
}

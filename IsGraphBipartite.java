import java.util.*;

public class IsGraphBipartite {
    public static boolean isBipartite(int[][] graph) {
        var n = graph.length;
        boolean[] seen = new boolean[n], setA = new boolean[n], setB = new boolean[n];
        var queue = new ArrayDeque<Integer>();

        for (var i=0; i<n; i++) {
            if (seen[i]) continue;

            queue.offer(i);
            setA[i] = true;

            while (!queue.isEmpty()) {
                var node = queue.poll();
                seen[node] = true;

                var a = setA[node] ? setA : setB;
                var b = setA[node] ? setB : setA;

                for (var neighbor : graph[node]) {
                    if (a[neighbor]) return false;
                    b[neighbor] = true;

                    if (!seen[neighbor]) queue.offer(neighbor);
                }
            }
        }
        return true;
    }
    public static void main(String [] args){
        int[][] graph= {{1,2,3},{0,2},{0,1,3},{0,2}};
        System.out.println(isBipartite(graph));
    }
}

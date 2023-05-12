//import java.util.*;
//import java.util.function.Consumer;
//import java.util.*;
////Method- for spirL MATRIX
//public class SpiralMatrix {
//        public static List<Integer> spiralOrder(int[][] matrix) {
//            int m = matrix.length;
//            int n = matrix[0].length;
//            List<Integer> answer = new ArrayList<>();
//            int[][] direction = {{1,0}, {0,-1}, {-1,0}, {0,1}};
//            int[][] visited = new int[m][n];
//            for(int i = 0; i < m; i++) {
//                Arrays.fill(visited[i], 0);
//            }
//            Consumer<int[]> traverse = (coord) -> {
//                int index = 3;
//                Stack<int[]> stack = new Stack<>();
//                stack.push(coord);
//                while(!stack.isEmpty()) {
//                    coord = stack.pop();
//                    if(coord[0] >= m || coord[0] < 0 || coord[1] >= n || coord[1] < 0 || visited[coord[0]][coord[1]] == 1) {
//                        continue;
//                    }
//                    answer.add(matrix[coord[0]][coord[1]]);
//                    visited[coord[0]][coord[1]] = 1;
//                    int[] coord2 = {coord[0] + direction[index][0], coord[1] + direction[index][1]};
//                    if(coord2[0] >= m || coord2[0] < 0 || coord2[1] >= n || coord2[1] < 0 || visited[coord2[0]][coord2[1]] == 1) {
//                        index = (index + 1) % 4;
//                    }
//                    coord2 = new int[]{coord[0] + direction[index][0], coord[1] + direction[index][1]};
//                    stack.push(coord2);
//                }
//            };
//            traverse.accept(new int[]{0,0});
//            return answer;
//        }
//        public static void main(String [] args){
//
//        }
//    }
//}

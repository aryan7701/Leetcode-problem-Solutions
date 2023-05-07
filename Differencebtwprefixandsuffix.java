import java.util.Scanner;

public class Differencebtwprefixandsuffix {
        public static int[] distinctDifferenceArray(int[] arr) {
            int prefix=1;
            int suffix=0;
            int []res= new int [arr.length];
            for(int i=0;i<=arr.length-1;i++){

                suffix=arr.length-prefix;
                res[i]=prefix-suffix;
                prefix=prefix+1;
            }
            return res;
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int nums []={1,2,3,4,5};
            int capi[]={3,2,3,4,2};
            int res[]= distinctDifferenceArray(nums);
            for (int i=0;i<=res.length-1;i++){
                System.out.println(res[i]);
            }
            int res2[]= distinctDifferenceArray(capi);
            for (int i=0;i<=res.length-1;i++){
                System.out.println(res2[i]);
            }
        }

}


//Input: nums = [1,2,3,4,5]
//        Output: [-3,-1,1,3,5]

//Input: nums = [3,2,3,4,2]
//        Output: [-2,-1,0,2,3]
import java.util.*;
import java.util.Scanner;
public class PrefixCommonArrayTwoArrays {
    public static boolean contains(int[] arr, int fromIndex, int toIndex, int key) {
        for (int i = fromIndex; i <= toIndex; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int Common[] = new int[A.length];
        for(int i=0;i<A.length;i++){
            int count=0;
            for(int j=0;j<=i;j++){
                if(contains(A,0,i,A[j])&&contains(B,0,i,A[j])){
                    count++;
                }
            }
            Common[i]=count;
        }
        return Common;
    }
    public static void main(String[] args){


//            int X[] =;
//            System.out.println(Arrays.toString(X));  // Output: [0, 2, 3, 4]
        }
    }


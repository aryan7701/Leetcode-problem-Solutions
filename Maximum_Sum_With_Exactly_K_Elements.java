import java.util.*;
public class Maximum_Sum_With_Exactly_K_Elements {
    public static int maximizeSum(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int res = 0;
        for (int i = 0; i < k; i++) {
            res = res + max;
            max = max + 1;
        }
        return res;
    }
    public static void main(String [] args){
        int nums[]={1,2,3,4,5};
        int k=3;
        int ans= maximizeSum(nums,3);
        System.out.println(ans);
    }
}

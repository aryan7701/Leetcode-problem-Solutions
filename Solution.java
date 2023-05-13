import java.util.*;
import java.math.*;
public class Solution {
    public static int getMaximumOrValue(int[] nums, int k) {
        int n = nums.length;
        int maxNum = nums[0];
        for (int i = 1; i < n; i++) {
            maxNum = Math.max(maxNum, nums[i]);
        }
        int bit = Integer.highestOneBit(maxNum);
        while (k > 0 && bit > 0) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if ((nums[i] & bit) == 0) {
                    count++;
                } else {
                    nums[i] |= bit;
                }
            }
            if (count <= k) {
                k -= count;
            } else {
                break;
            }
            bit >>= 1;
        }
        int result = nums[0];
        for (int i = 1; i < n; i++) {
            result |= nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {12, 9};
        int k = 1;
        Solution solution = new Solution();
        int result = solution.getMaximumOrValue(nums, k);
        System.out.println(result);
    }
}




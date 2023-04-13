import java.util.Scanner;

public class Two_Sum {
    static public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int compi = target - nums[i];
                if (compi == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }
//
//    public static void main (String[] args){
//        Scanner scan = new Scanner(System.in);
//        int n= scan.nextInt();
//        int target = scan.nextInt();
//        int nums[]= new int[n];
//        for(int i=0;i<n-1;i++){
//            nums[i]= scan.nextInt();
//        }
//        System.out.println(twoSum(nums,target));
//    }
}

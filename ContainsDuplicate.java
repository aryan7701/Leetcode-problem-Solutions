import java.util.Arrays;
public class ContainsDuplicate {
    public static boolean IsDistict(int []nums){
        boolean res= true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                res= true;
            }
            if(nums[i]!=nums[i+1]){
                res=false;
            }
        }
        return res;
    }
    public  static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        int nums1 []={1,2,3,1};
        int nums2 []={1,2,3,4};
        int nums3 []={11,1,1,3,3,4,3,2,4,2};
        System.out.println(IsDistict(nums1));
        System.out.println(IsDistict(nums2));
        System.out.println(IsDistict(nums3));

    }
}

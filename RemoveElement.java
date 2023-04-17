import java.util.*;

public class RemoveElement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int var= sc.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<=nums.length-1;i++){
            nums[i]=sc.nextInt();
        }

        int indi=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]!=var){
                nums[indi]=nums[i];
                indi++;
            }
        }
        System.out.println(indi);
    }
}

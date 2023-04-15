import java.util.*;

public class Single_Integer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        int target=0;
        int nums[]=new int[x];
        for(int i=0;i<nums.length;i++) {
            nums[i] = scan.nextInt();
        }
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        System.out.println(result);
    }
}

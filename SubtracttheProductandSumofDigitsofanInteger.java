import java.util.Scanner;

public class SubtracttheProductandSumofDigitsofanInteger {
    public static int ProductAndSum(int n){
        int product=1;
        int add=0;
        while(n>0){
            int temp=n%10;
            product =product*temp;
            add=add+temp;
            n=n/10;
        }
        int ans= product - add;
        return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res= ProductAndSum(num);
        System.out.println(res);

    }
}

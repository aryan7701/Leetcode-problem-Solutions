import java.util.*;
public class SumOfTwoIntegers {
    public static int getSum(int a, int b) {
        return a+b;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int res= getSum(a,b);
        System.out.println(res);
    }
}

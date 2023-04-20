import java.util.Scanner;

public class DivideInteger {
    public static int divideInteger(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int res= dividend/divisor;
        return res;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int dividend= sc.nextInt();
        int divisor= sc.nextInt();
        System.out.println(divideInteger(dividend,divisor));
    }
}

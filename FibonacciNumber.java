import java.util.Scanner;

public class FibonacciNumber {
    public static int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String [] args){
        Scanner SC =  new Scanner(System.in);
        int A= SC.nextInt();
        int res = fib(A);
        System.out.println(res);
    }
}

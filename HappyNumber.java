import java.util.Scanner;

public class HappyNumber {
//    public static boolean HappyNumber(int n){
//        String s=String.valueOf(n);
//        for(int i=0;i<=s.length()-1;i++){
//            char ch= s.charAt(i);
//
//        }

//        int res=0;
//        int count=0;
//        while(n>=0){
//                n=n/10;
//                int m=n%10;
//                count++;
//                if(res!=1){
//                    for(int i=0;n>=0;i++){
//                        res=n*n+res;
//                        res=m*m+res;
//                    }
//                }
//        }
//        System.out.println(res);
//        if(res==1){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
private int digitSquareSum(int n) {
    int sum = 0;
    while (n > 0) {
        int digit = n % 10;
        sum += digit * digit;
        n = n/10;
    }
    return sum;
}
 public boolean HappyNumber(int n) {
    int slow = n, fast = n;
    do {
        slow = digitSquareSum(slow);
        fast = digitSquareSum(digitSquareSum(fast));
    } while (slow != fast);
    return slow == 1;
}
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(HappyNumber(n));
    }
}

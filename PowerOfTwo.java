import java.util.*;
public class PowerOfTwo {
    //Logic behind Power of two
    public static boolean isPowerOfTwo(int n) {

        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(isPowerOfTwo(n));
//    }
//}

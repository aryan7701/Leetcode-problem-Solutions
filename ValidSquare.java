import java.util.*;
import java.math.*;

public class ValidSquare {
    public static boolean IsPerfectSquare(int num){
        double a = Math.pow(num,0.5);
        if((a%1)==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res= IsPerfectSquare(num);
        System.out.println(res);
    }
}

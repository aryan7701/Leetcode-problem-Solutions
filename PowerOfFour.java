import java.util.Scanner;


public class PowerOfFour {
    public static boolean IsPowerFour(int n){
        if(n<0){
            return false;
        }
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%4!=0){
            return false;
        }
        return IsPowerFour(n/4);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean res= IsPowerFour(n);
        System.out.println(res);
    }
}

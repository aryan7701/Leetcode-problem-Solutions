import java.math.*;
import java.util.Scanner;


public class SuperPower {
    public static int superPow(int a, int[] b) {
        String exp="";
        for(int i=0;i<b.length;i++)
            exp=exp+Integer.toString(b[i]);
        BigInteger num=new BigInteger(Integer.toString(a));
        BigInteger a1=new BigInteger(exp);
        BigInteger a2=new BigInteger(Integer.toString(1337));
        BigInteger res=num.modPow(a1,a2);
//        System.out.println(res);
        return res.intValue();

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] nums= {1,0,0,0,0,0};
        int res= superPow(a,nums);
        System.out.println(res);
    }
}

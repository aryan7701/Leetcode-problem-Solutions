import java.util.*;
import java.math.BigInteger;
public class MultiplyStrings {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s1= sc.next();
        String s2=sc.next();
        BigInteger a= new BigInteger(s1);
        BigInteger b= new BigInteger(s2);
        BigInteger product=a.multiply(b);
        String res= String.valueOf(product);
        System.out.println(res);
    }
}

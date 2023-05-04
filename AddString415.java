import java.util.*;

public class AddString415 {
    public static String addStrings(String num1, String num2) {
        long a=Long.valueOf(num1);
        long b=Long.valueOf(num2);
        long sum=a+b;
        String res=String.valueOf(sum);
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String num1="6913259244";
        String num2="6913259244";
        System.out.println(addStrings(num1,num2));
    }
}

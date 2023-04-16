import java.util.Scanner;

public class AddBinary {
   public static String add(String A, String B){
        int a=A.length();
        int b= B.length();
        int carry=0;
        int sum=0;
        StringBuilder result=new StringBuilder();
        while((a>=0)||(b>=0)||carry==1){
            sum=carry;
            if(a>=0){
                sum=sum+A.charAt(a)-'0';
            }
            if(b>=0){
                sum=sum+B.charAt(b)-'0';
            }
            result.append((char)(sum%2+'0'));
            carry=sum/2;
            a--;
            b--;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String A= scan.nextLine();
        String B=scan.nextLine();
        System.out.println(add(A,B));
    }
}

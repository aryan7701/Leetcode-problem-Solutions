import java.util.Scanner;

public class Valid_Palindrome {

    public static boolean isPalindrom(String a,String b){
        String rev="";
        int n=a.length();
        int m = b.length();
        for(int i=0;i<=n-1;i++){
            char ch = a.charAt(i);
            rev=ch+rev;
        }
        if(rev==a){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s1= scan.nextLine();
        scan.nextLine();
        String s2=s1.toLowerCase();
        String s3=s2.trim();
        System.out.println(s3);
    }
}

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(int x){
        String s= String.valueOf(x);
        String rev="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            rev=ch+rev;
        }
        if(rev.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}

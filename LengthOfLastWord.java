import java.util.Scanner;

public class LengthOfLastWord {
    public static int Lengthlastword(String s){
        String[] sentence = s.split(" ");
        int a= sentence.length;
        String res= sentence[a-1];
        return res.length();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        System.out.println(Lengthlastword(s));
    }
}

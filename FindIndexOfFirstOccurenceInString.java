import java.util.Scanner;

public class FindIndexOfFirstOccurenceInString {
    public static  int strStr(String haystack, String needle) {
        return(haystack.indexOf(needle));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String needle= sc.nextLine();
        String hayStack= sc.nextLine();
        System.out.println(strStr(hayStack,needle));
    }
}

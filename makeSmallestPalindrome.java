import java.util.Scanner;

public class makeSmallestPalindrome {
    public static String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                char min= arr[i]<arr[j]?arr[i]:arr[j];
                arr[i]=min;
                arr[j]=min;
            }
            i++;
            j--;
        }
        String str = new String(arr);
        return str;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input= sc.next();
        
        System.out.println(makeSmallestPalindrome(input));
    }
}

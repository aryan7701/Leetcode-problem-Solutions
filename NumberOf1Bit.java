import java.util.Scanner;

public class NumberOf1Bit {
    public static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            int last_bit= n & 1;
            count+= last_bit;
            n = n>>>1;
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int res=hammingWeight(n);
        System.out.println(res);
    }
}

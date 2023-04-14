import java.util.Scanner;

public class NaiveSolSqrt {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int x=scan.nextInt();
        if (x == 0 || x == 1) {
            System.out.println(x);
        }
        int result=1;
        int count=0;
        for(int i=2;i*i<=x;i++) {
            if (result <= x) {
                result = i * i;
                count=i;
            }
        }
        System.out.println(count);
    }
}

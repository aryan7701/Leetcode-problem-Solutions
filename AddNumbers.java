import java.util.*;
public class AddNumbers {
        public static int addDigits(int num) {
            int temp = 0 ;
            temp = numnum(num);
            while(temp > 9){
                temp = numnum(temp);
            }
            return temp;
        }

        public static int numnum(int num){
            int temp = 0;
            while(num > 9){
                temp += num % 10 ;
                num /= 10;
            }
            return temp + num;
        }
        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            int num = sc.nextInt();
            int res= addDigits(num);
            System.out.println(res);
        }

}

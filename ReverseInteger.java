import java.util.Arrays;
import java.util.*;
public class ReverseInteger {

        public int reverse(int x) {
            long ans = 0;
            //checking if the input digit is zero or not
            while (x != 0) {
                // reversing the digit!!!
                ans = ans * 10 + x % 10;
                x /= 10;
            }
            return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
        }
    public static void main(String[] args){
            int arr[]= {5,5,5};
            int k=2;
            int max= Arrays.stream(arr).max().getAsInt();
            int res=0;
            for(int i=0;i<k;i++){
            res=res+max;
            max=max+1;
            }
            System.out.println(res);
        }
    }



import java.util.*;

public class BaseSeven {
    public static String convertToBase7(int num) {
        return Integer.toString(num,7);
    }
    public static void main(String [] args){
        Scanner SC =new Scanner(System.in);
        int num= SC.nextInt();
        System.out.println(convertToBase7(num));
    }
}

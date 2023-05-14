import java.util.*;
import java.math.*;
public class countseniors {
    public static int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            String detail = details[i];
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] details = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        int count = countSeniors(details);
        System.out.println(count);
    }
}

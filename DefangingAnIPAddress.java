import java.util.Scanner;

public class DefangingAnIPAddress {
    public static String defangIPaddr(String address) {
        String res= address.replace(".","[.]");
        return res;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(defangIPaddr(a));
    }
}

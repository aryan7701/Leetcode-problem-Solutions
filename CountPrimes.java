import java.util.*;
public class CountPrimes {
//    public static boolean IsPrime(int n){
//        boolean IsItPrime= true;
//        if(n<=1){
//            IsItPrime= false;
//            return  IsItPrime;
//        }else {
//            for (int i = 2; i <= n / 2; i++) {
//                if (n % i == 0) {
//                    IsItPrime = false;
//                    break;
//                }
//            }
//            return IsItPrime;
//        }
//    }
    public static int countPrimes(int n) {
        boolean[] list = new boolean[n];
        for (int i = 2; i*i<=n; i++) {
            if (list[i] == false) {
                for (int j = 2; j*i <n; j++) {
                    list[j*i] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i<n; i++) {
            if (list[i] == false) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
//        int count=0;
//        for(int i=2;i<=n;i++){
//            if(IsPrime(i)){
//                count=count+1;
//            }
//        }
        System.out.println(countPrimes(n));
//        System.out.println(count);
    }
}

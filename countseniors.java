//public class countseniors {
//    public static int countSeniors( String details[]){
//        String arr[]= new String[details.length];
//        int n=details.length;
//        int count=0;
//
//        for(int i=0;i<n-1;i++){
//             arr[i]= details[i].substring(11,13);
//        }
//
//        int res[]=new int[n];
//        for(int i=0;i< arr.length;i++){
//            res[i]= res[i]+Integer.parseInt(arr[i]);
//            if(res[i]>60){
//            count=count+1;
//        }
//        }
////
//        return count;
//    }
//    public static void main(String[] args){
//        String []details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
//        int a = countSeniors(details);
//        System.out.println(a);
//    }
//}
//
//
//public class CountSeniors {
//    public static int countSeniors(String[] details) {
//        int count = 0;
//        for (int i = 0; i < details.length; i++) {
//            String detail = details[i];
//            int age = Integer.parseInt(detail.substring(11, 13));
//            if (age > 60) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        String[] details = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
//        int count = countSeniors(details);
//        System.out.println(count);
//    }
//}

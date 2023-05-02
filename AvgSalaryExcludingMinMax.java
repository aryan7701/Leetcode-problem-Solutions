import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class AvgSalaryExcludingMinMax {
    public static int[] RemoveTheElement(int[] salary){
        if(salary ==null){
            return salary;
        }
         int max = Arrays.stream(salary).max().getAsInt();
         int min = Arrays.stream(salary).min().getAsInt();
        List<Integer> ArrayList = IntStream.of(salary).boxed().collect(Collectors.toList());
        //remove the specified element
        ArrayList.remove(Integer.valueOf(max));
        ArrayList.remove(Integer.valueOf(min));
        int [] newArray=ArrayList.stream().mapToInt(Integer::intValue).toArray();
        return newArray;
    }
    public static double average(int[] salary) {
        double n=salary.length;
        double total=0.00000;
        int []newSalary = RemoveTheElement(salary);
        int m=newSalary.length;
        for(int i=0;i<=m-1;i++){
            total=total+newSalary[i];
        }
        return (total/m);
    }
    public static void main(String[] args){
        int [] salary={4000,3000,1000,2000};
        int []  salary2={8000,9000,2000,3000,6000,1000};
//        int [] newSalo= RemoveTheElement(salary2,max,min);
        double ans2=average(salary);
        double ans=average(salary2);
        System.out.println(ans2);
        System.out.println(ans);
    }
}
//Optimize solution
//class Solution {
//    public static double average(int[] salary) {
//        double n=salary.length;
//        double total=0.00000;
//        // int []newSalary = RemoveTheElement(salary);
//        int max = Arrays.stream(salary).max().getAsInt();
//        int min = Arrays.stream(salary).min().getAsInt();
//        for(int s: salary){
//            if(s==min || s==max){
//                continue;
//            }
//
//            total=total+s;
//        }
//        double m= n-2;
//        // int m=newSalary.length;
//        // for(int i=0;i<=m-1;i++){
//        //     total=total+newSalary[i];
//        // }
//        return (total/m);
//    }
//}

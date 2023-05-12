import java.util.Scanner;

public class BrainPower {
    public static  long mostPoints(int[][] Q) {
        int len = Q.length;
        long dp[] = new long[len];
        dp[len-1]=Q[len-1][0];
        for(int i=len-2;i>=0;i--){
            long not =dp[i+1],take=0;
            if(i+Q[i][1]+1<len) take=Q[i][0]+dp[i+Q[i][1]+1];
            else take = Q[i][0];
            dp[i]= Math.max(take,not);
        } return dp[0];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        int [][]a={{3,2},{4,3},{4,4},{2,5}};
        System.out.println(mostPoints(a));

    }
}

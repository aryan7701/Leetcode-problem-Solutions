import java.util.Scanner;

public class NumberOfStepsToReachANumberToZero {

        public static int zero(int num){
            int step=0;

            while(num>0){
                if(num%2==0){
                    num =num/2;
                    step=step+1;

                }
                else if(num%2!=0){
                    num=num-1;
                    step=step+1;
                }
            }

            return step;
        }
        public static int numberOfSteps(int num) {
            int res= zero(num);
            return res;
        }

    public static void main(String [] args){
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();
        int ans= numberOfSteps(num);
        System.out.println(ans);

    }
}

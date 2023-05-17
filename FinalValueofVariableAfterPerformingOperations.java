import java.util.Scanner;

public class FinalValueofVariableAfterPerformingOperations {
    public static int Value( String[] operations){
        int ans=0;
        int res=0;
        int temp=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X")){
                --ans;
            }
            else if(operations[i].equals("X--")){
                ans--;
            }
            else if(operations[i].equals("X++")){
                ans++;
            }
            else if(operations[i].equals("++X")){
                ++ans;
            }
        }
        return ans;
    }
    public static int finalValueAfterOperations(String[] operations) {
        int res=0;
        for(int i=0;i<operations.length;i++){
            res=Value(operations);
        }
        return res;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String [] operations =new String[] {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
}

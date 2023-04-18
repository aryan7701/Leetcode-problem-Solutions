import java.util.Scanner;

public class MergeTwoString {
    static String mergeAlternately(String word1, String word2){

        StringBuilder concat= new StringBuilder();
        int i=0;
        int j=0;
        while (i<word1.length() && j<word2.length()) {
            concat= concat.append(word1.charAt(i));
            i++;
            concat=concat.append(word2.charAt(j));
            j++;
        }
        if(i<word1.length()){
            concat.append(word1.substring(i));
        }
        if(j<word2.length()){
            concat.append(word2.substring(j));
        }

        return concat.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word1= sc.nextLine();
        String word2= sc.nextLine();
        System.out.println(mergeAlternately(word1,word2));
    }
}

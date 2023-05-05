import java.util.*;
public class MaximumNumberofVowelsinSubstringofGivenLength {
    public static int isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return 1;
        return 0;
    }

    public static int maxVowels(String s, int k) {
        int max_vow = 0, cur_vow=0;
        for(int i=0;i<s.length();i++){
            cur_vow += isVowel(s.charAt(i));
            if(i>=k)
                cur_vow -= isVowel(s.charAt(i-k));
            max_vow = Math.max(max_vow, cur_vow);
        }
        return max_vow;
    }
    public static void main (String []args){
        Scanner sc =new Scanner(System.in);
        String word=sc.nextLine();
        int k=sc.nextInt();
        int max= maxVowels(word,k);
        System.out.println(max);
    }
}

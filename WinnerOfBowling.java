public class WinnerOfBowling {
        public int isWinner(int[] player1, int[] player2) {
            int n = player1.length;
            int m= player2.length;
            int score1=0;
            int score2=0;
            for (int i = 0; i < n; i++) {
                int x = player1[i];
                if (i>=2 && player1[i-2]==10) {
                    x=x*2;
                }
                if (i>=1 && player1[i-1]== 10) {
                    x=x*2;
                }
                if (i== n-1 && x==10){
                    x=x*2;
                }
                score1 = score1+x;
            }
            for (int i=0;i<m;i++){
                int x=player2[i];
                if (i>=2 && player2[i-2]==10) {
                    x=x*2;
                }
                if (i>=1 && player2[i-1]==10) {
                    x=x*2;
                }
                if (i==m-1 && x==10) {
                    x=x*2;
                }
                score2=score2+x;
            }
            if(score1>score2){
                return 1;
            }
            if(score1==score2){
                return 2;
            }
            else{
                return 0;
            }
        }
    }

import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int noclear[] = new int[N];
        double[] fail = new double[N];

        for(int i : stages){
            if(i != N + 1) {
                noclear[i - 1] += 1;
            }
        }        

        // System.out.println(Arrays.toString(noclear));
        int player = stages.length;
        for(int i = 0; i < N; i++){
            fail[i]= (double)noclear[i] / player;
            player -= noclear[i];
            answer[i] = i + 1;
        }
        // System.out.println(Arrays.toString(answer));
        double tmpFail = 0;
        int tmpAnswer = 0;

        for(int i = 0; i < N; i++){
            for (int j = 1; j < N - i; j++) {
                if(fail[j - 1] < fail[j]){
                    tmpFail = fail[j - 1];
                    fail[j - 1] = fail[j];
                    fail[j] = tmpFail;
                    
                    tmpAnswer = answer[j-1];
                    answer[j - 1] = answer[j];
                    answer[j] = tmpAnswer;
                }
            }
        }

        return answer;
    }
}
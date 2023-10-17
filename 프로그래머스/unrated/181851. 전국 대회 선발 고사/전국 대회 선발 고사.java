import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int a = -1;
        int b = -1;
        int c = -1;
        
        int[] rankCopy = Arrays.copyOf(rank, rank.length);
        Arrays.sort(rankCopy);
        
        for(int i = 0; i < rankCopy.length; i++) {
            int rankValue = rankCopy[i];
            int index = -1;
            
            for (int j = 0; j < rank.length; j++) {
                if (rank[j] == rankValue) {
                    index = j;
                    break;
                }
            }
            
            if (index != -1 && attendance[index]) {
                if (a == -1) {
                    a = index;
                } else if (b == -1) {
                    b = index;
                } else if (c == -1) {
                    c = index;
                    break;
                }
            }
        }
        
        if (a != -1 && b != -1 && c != -1) {
            answer = 10000 * a + 100 * b + c;
        }
        
        return answer;
    }
}

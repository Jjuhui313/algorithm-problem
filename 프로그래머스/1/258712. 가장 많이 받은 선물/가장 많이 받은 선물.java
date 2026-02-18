import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int n = friends.length;
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(friends[i], i);
        }
        
        int[][] give = new int[n][n];
        int[] giftScore = new int[n];
        int[] nextMonth = new int[n];
        
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int from = map.get(parts[0]);
            int to = map.get(parts[1]);
            
            give[from][to]++;
            giftScore[from]++;
            giftScore[to]--;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (give[i][j] > give[j][i]) {
                    nextMonth[i]++;
                } 
                else if (give[i][j] < give[j][i]) {
                    nextMonth[j]++;
                } 
                else {
                    if (giftScore[i] > giftScore[j]) {
                        nextMonth[i]++;
                    } 
                    else if (giftScore[i] < giftScore[j]) {
                        nextMonth[j]++;
                    }
                }
            }
        }
        
        for (int cnt : nextMonth) {
            answer = Math.max(answer, cnt);
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        
        for (int t : tangerine) {
            hm.put(t, hm.getOrDefault(t, 0) + 1);
        }
        
        List<Integer> counts = new ArrayList<>(hm.values());
        counts.sort(Comparator.reverseOrder());
        
        for (int count : counts) {
            k -= count;
            answer++;
            if (k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}
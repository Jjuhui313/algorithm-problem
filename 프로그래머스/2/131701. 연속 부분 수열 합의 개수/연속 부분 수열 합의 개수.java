import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> hs = new HashSet<>();
        
        for (int i = 0; i < elements.length; i++) {
            int num = 0;
            for (int j = 0; j < elements.length; j++) {
                num += elements[(i + j) % elements.length];
                hs.add(num);
            }
        }
        answer = hs.size();
        return answer;
    }
}
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> m = new HashMap<>();
        
        for (String[] c : clothes) {
            m.put(c[1], m.getOrDefault(c[1], 1) + 1);
        }
        
        for (int i : m.values()) {
            answer *= i;
        }
        
        return answer - 1;
    }
}
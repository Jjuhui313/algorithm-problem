import java.util.Map;
import java.util.HashMap;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Boolean> m = new HashMap<>();
        
        for (String s : phone_book) {
            m.put(s, true);
        }
        
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (m.getOrDefault(phone_book[i].substring(0, j), false)) {
                    return false;
                }
            }
        }
        
        
        return answer;
    }
}
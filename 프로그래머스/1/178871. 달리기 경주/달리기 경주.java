import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            hm.put(players[i], i);
        }
        for (String calling : callings) {
            int idx = hm.get(calling).intValue();
            
            String prevPlayer = players[idx - 1];
            String currentPlayer = players[idx];
                
            players[idx] = prevPlayer;
            players[idx - 1] = currentPlayer;
                
            hm.put(currentPlayer, idx - 1);
            hm.put(prevPlayer, idx);
            
        }
        return players;
    }
}
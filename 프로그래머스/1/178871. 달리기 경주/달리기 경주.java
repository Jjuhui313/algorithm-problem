import java.util.Map;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players.clone();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }

        int tempN;
        String tempS;
        for (int i = 0; i < callings.length; i++){
            tempN = map.get(callings[i]);

            map.put(answer[tempN], map.get(answer[tempN]) - 1);
            map.put(answer[tempN - 1], map.get(answer[tempN - 1]) + 1);

            tempS = answer[tempN];
            answer[tempN] = answer[tempN - 1];
            answer[tempN - 1] = tempS;
        }

        return answer;
    }
}
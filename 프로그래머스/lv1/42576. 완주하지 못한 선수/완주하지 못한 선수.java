import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        for(String i : participant) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }                                       

        for(String i : completion) {
            hm.put(i, hm.get(i) - 1);
        }

        for(String i : hm.keySet()) {
            if(hm.get(i) != 0) {
                answer = i;
            }
        }
        return answer;
    }
}
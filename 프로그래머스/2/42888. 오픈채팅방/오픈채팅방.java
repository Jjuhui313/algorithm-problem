import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
        
        Map<String, String> hm = new HashMap<>();
        
        for (String r : record) {
            String[] arr = r.split(" ");
            String cmd = arr[0];
            String uid = arr[1];
            
            if (cmd.equals("Enter") || cmd.equals("Change")) {
                String nickname = arr[2];
                hm.put(uid, nickname);
            }
        }
        
        List<String> result = new ArrayList<>();
        
        for (String r : record) {
            String[] arr = r.split(" ");
            String cmd = arr[0];
            String uid = arr[1];
            
            if (cmd.equals("Enter")) {
                result.add(hm.get(uid) + "님이 들어왔습니다.");
            } else if (cmd.equals("Leave")) {
                result.add(hm.get(uid) + "님이 나갔습니다.");
            }
        }
        String[] answer = result.toArray(new String[0]);
        return answer;
    }
}
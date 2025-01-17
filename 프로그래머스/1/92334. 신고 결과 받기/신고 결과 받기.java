import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
            hm.put(id_list[i], i);
        }
        
        ArrayList<Set<String>> arr = new ArrayList<>();
        for (int i = 0; i < id_list.length; i++) {
            arr.add(new HashSet<>());
        }
        
        for (String r : report) {
            String user = r.split(" ")[0];
            String reported = r.split(" ")[1];

            int userIndex = hm.get(user);
            arr.get(userIndex).add(reported); 
        }
        
        int[] reportCount = new int[id_list.length];
        
        for (Set<String> reports : arr) {
            for (String reported : reports) {
                int idx = hm.get(reported);
                reportCount[idx]++;
            }
        }
        
        for (int i = 0; i < arr.size(); i++) {
            for (String reported : arr.get(i)) {
                int idx = hm.get(reported);
                if (reportCount[idx] >= k) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}
import java.util.Map;
import java.util.HashMap;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> hm = new HashMap<>();
        
        hm.put('R', 0);
        hm.put('T', 0);
        
        hm.put('C', 0);
        hm.put('F', 0);
        
        hm.put('J', 0);
        hm.put('M', 0);
        
        hm.put('A', 0);
        hm.put('N', 0);
        
        
        for (int i = 0; i < survey.length; i++) {
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            
            int choice = choices[i];
            
            if (choice >= 5) {
                hm.put(agree, hm.get(agree) + (choice - 4));
            } else if (choice <= 3) {
                hm.put(disagree, hm.get(disagree) + (4 - choice));
            }
            
        }

        answer += (hm.get('R') >= hm.get('T')) ? 'R' : 'T';
        answer += (hm.get('C') >= hm.get('F')) ? 'C' : 'F';
        answer += (hm.get('J') >= hm.get('M')) ? 'J' : 'M';
        answer += (hm.get('A') >= hm.get('N')) ? 'A' : 'N';
        
        return answer;
    }
}
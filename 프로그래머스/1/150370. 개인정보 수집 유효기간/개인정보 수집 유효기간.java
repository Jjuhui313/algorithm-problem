import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        List<Integer> arr = new ArrayList<>();
        String[] tArr = today.split("\\.");
        int tYear = Integer.parseInt(tArr[0]);
        int tMonth = Integer.parseInt(tArr[1]);
        int tDate = Integer.parseInt(tArr[2]);
        
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] term = terms[i].split(" ");
            hm.put(term[0].charAt(0), Integer.parseInt(term[1]));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            String[] day = privacy[0].split("\\.");
            
            int year = Integer.parseInt(day[0]);
            int month = Integer.parseInt(day[1]);
            int date = Integer.parseInt(day[2]);
            
            char type = privacy[1].charAt(0);
            
            int plus = hm.get(type);
            
            month += plus;
            
            if (month > 12) {
                year += (month - 1) / 12;
                month = (month - 1) % 12 + 1;
            }
            
            if (date == 1) {
                month--;
                date = 28;
                if (month == 0) {
                    month = 12;
                    year--;
                }
            } else {
                date--;
            }
            
            if (year < tYear 
            || (year == tYear && month < tMonth) 
            || (year == tYear && month == tMonth && date < tDate)) {
                arr.add(i + 1);
            }
        }
        
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
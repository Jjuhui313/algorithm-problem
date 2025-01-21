import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> str = new ArrayList<>();
        
        for(int i = 0; i < strings.length; i++) {
            str.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(str);
        String[] answer = new String[str.size()];
        int index = 0;
        for(String i : str) {
            answer[index] = i.substring(1, i.length());
            index++;
        }
        
        
        return answer;
    }
}
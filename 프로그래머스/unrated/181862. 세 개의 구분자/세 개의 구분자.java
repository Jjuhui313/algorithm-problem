import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> array = new ArrayList<>();
        myStr += "a";
        String s = "";
        for(int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            if(c == 'a' || c == 'b' || c == 'c') {
                if(!s.equals("")) {
                    array.add(s);
                    s = "";
                } 
            } else {
                s += String.valueOf(c);
            }
        }
        
        String[] answer = new String[array.isEmpty() ? 1 : array.size()];
        
        if(array.isEmpty()) {
            answer[0] = "EMPTY";
        }
        
        int index = 0;
        for(String i : array) {
            answer[index++] = i;
        }
        
        
        return answer;
    }
}
import java.lang.StringBuilder;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean newWord = true;
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                newWord = true;
            } else {
                if (newWord) {
                    sb.append(Character.toUpperCase(c));
                    newWord = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}
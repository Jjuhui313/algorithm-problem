import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        Matcher matcher = Pattern.compile(pat).matcher(myString);
        while (matcher.find()) {
            answer = myString.substring(0, matcher.end());
        }
        
        return answer;
    }
}
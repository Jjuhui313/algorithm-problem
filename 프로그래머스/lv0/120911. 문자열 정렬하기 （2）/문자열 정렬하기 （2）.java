import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] c = my_string.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(c[i] >= 'A' && c[i] <= 'Z') {
                c[i] = (char)(c[i] + 32);
            }
            
        }
        
        Arrays.sort(c);
        for(int i = 0; i < c.length; i++) {
            answer += String.valueOf(c[i]);
        }

        
        return answer;
    }
}
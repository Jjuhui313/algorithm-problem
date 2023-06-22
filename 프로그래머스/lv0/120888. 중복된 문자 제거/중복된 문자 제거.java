class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            String s = my_string.substring(0, i);
            if(!s.contains(String.valueOf(c))) {
                answer += String.valueOf(c);
            }
        }
        
        return answer;
    }
}
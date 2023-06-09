class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= 'a' && c <= 'z') {
                answer += String.valueOf(c).toUpperCase();
            } else if(c >= 'A' && c <= 'Z') {
                answer += String.valueOf(c).toLowerCase();
            }
        }
        
        return answer;
    }
}
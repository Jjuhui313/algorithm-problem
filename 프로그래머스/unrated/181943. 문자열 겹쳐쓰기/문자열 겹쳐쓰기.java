class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String a = my_string.substring(0, s);
        String b = my_string.substring(a.length() + overwrite_string.length());
        
        answer = a + overwrite_string + b;
        
        
        return answer;
    }
}
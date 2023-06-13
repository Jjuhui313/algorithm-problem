class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] c = new char[my_string.length()];
        char temp = ' ';
        
        for(int i = 0; i < my_string.length(); i++) {
            c[i] = my_string.charAt(i);
        }
        
        temp = c[num1];
        c[num1] = c[num2];
        c[num2] = temp;
        
        for(int i = 0; i < c.length; i++) {
            answer += String.valueOf(c[i]);
        }
        
        
        return answer;
    }
}

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() % n == 0) ? my_str.length() / n : my_str.length() / n + 1];
        String s = "";
        int index = 0;
        
        for(int i = 0; i < my_str.length(); i++) {
            s += String.valueOf(my_str.charAt(i));
            
            if(i % n ==  n - 1) {
                answer[index++] = s;
                s = "";
            }
        }
        if(answer[answer.length - 1] == null) {
            answer[answer.length - 1] = s;
        }
        
        
        
        return answer;
    }
}
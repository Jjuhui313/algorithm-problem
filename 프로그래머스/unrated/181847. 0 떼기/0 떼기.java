class Solution {
    public String solution(String n_str) {
        String answer = "";
        int i = 0;
        for(i = 0; i < n_str.length(); i++) {
            char c = n_str.charAt(i);
            if(c != '0') {
                answer += c + "";
                break;
            }
        }
        for(int j = i + 1; j < n_str.length(); j++) {
            char c = n_str.charAt(j);
            answer += c + "";
        }
        
        return answer;
    }
}
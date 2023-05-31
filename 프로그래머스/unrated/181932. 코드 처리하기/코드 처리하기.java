class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                mode = (mode == 1) ? 0 : 1;
            } else {
                if(mode == 0) {
                    if (i % 2 == 0) answer += String.valueOf(code.charAt(i));
                } else if(mode == 1) {
                    if (i % 2 != 0) answer += String.valueOf(code.charAt(i));
                }
            }
        }
        
        if(answer.equals("")) {
            return "EMPTY";
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            switch(c) {
                case '2':
                    answer += "0";
                    break;
                case '0':
                    answer += "5";
                    break;
                case '5':
                    answer += "2";
                    break;
            }
        }
        
        return answer;
    }
}
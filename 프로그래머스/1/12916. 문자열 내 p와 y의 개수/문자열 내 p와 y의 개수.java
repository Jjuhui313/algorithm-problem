class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String alpha = s.toLowerCase();
        int pNum = 0;
        int yNum = 0;
        
        for(int i = 0; i < alpha.length(); i++) {
            if(alpha.charAt(i) == 'p') {
                pNum++;
            }
            if(alpha.charAt(i) == 'y') {
                yNum++;
            }                
        }
        
        if(pNum == yNum) {
            return answer;
        } else if(pNum == 0 && yNum == 0) {
            return answer;
        } else if (pNum != yNum) {
            answer = false;
        } 

        return answer;
    }
}
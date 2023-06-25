class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        StringBuilder bsb = new StringBuilder(before);
        StringBuilder asb = new StringBuilder(after);
        
        for(int i = 0; i < bsb.length(); i++) {
            for(int j = 0; j < asb.length(); j++) {
                if(bsb.charAt(i) == asb.charAt(j)) {
                    bsb.deleteCharAt(i);
                    asb.deleteCharAt(j);
                    i--;
                    break;
                }
            }
        }
        
        if(bsb.length() == 0 && asb.length() == 0) {
            answer = 1;
        }
        
        
        return answer;
    }
}
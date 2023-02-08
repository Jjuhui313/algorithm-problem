class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        String arr = new_id.toLowerCase();
        char[] step1 = arr.toCharArray();
        
        StringBuilder step2 = new StringBuilder();
        
        for(char i : step1) {
            if(i >= 'a' && i <= 'z' || i >= '0' && i <= '9' || i == '-' || i == '_' || i == '.') {
                step2.append(i);
            }
        }
        
        String step3 = step2.toString();
        while(step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }
        
        String step4 = step3;
        
        if(step4.length() > 0) {
            if(step4.charAt(0) == '.') {
                step4 = step4.substring(1, step4.length());
            }
        }
        if(step4.length() > 0) {
            if(step4.charAt(step4.length() - 1) == '.') {
                step4 = step4.substring(0, step4.length() - 1);
            }
        }
        
        String step5 = step4;
        
        if(step5.equals("")) {
            step5 += "a";
        }
        
        String step6 = step5;
        if(step6.length() >= 16) {
            step6 = step6.substring(0, 15);
            if(step6.charAt(step6.length() - 1) == '.') {
                step6 = step6.substring(0, step6.length() - 1);
            }
        }
        
        String step7 = step6;
        if(step7.length() <= 2) {
            for(int i = 0; step7.length() < 3; i++) {
                step7 += step7.charAt(step7.length() - 1);
            }
        }
        
        answer = step7;
        
        
        return answer;
    }
}
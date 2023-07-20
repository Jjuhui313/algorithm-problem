import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        ArrayList<Integer> form = new ArrayList<>();
        String[] dartArray = dartResult.split("");
        
        String sNum = "";
        int num = 0;
        
        for(int i = 0; i < dartArray.length; i++) {
            char c = dartArray[i].charAt(0);
            
            if(c >= '0' && c <= '9') {
                sNum += dartArray[i];
                
            } else if(dartArray[i].equals("*")) {
                if(form.size() > 1) {
                    form.set(form.size() - 1, form.get(form.size() - 1) * 2);
                    form.set(form.size() - 2, form.get(form.size() - 2) * 2);
                } else {
                    form.set(form.size() - 1, form.get(form.size() - 1) * 2);
                }
                
            } else if(dartArray[i].equals("#")) {
                form.set(form.size() - 1, form.get(form.size() - 1) * -1);
                
            } else {
                switch(dartArray[i]) {
                    case "S":
                        num = (int)Math.pow(Integer.parseInt(sNum), 1);
                        break;
                    case "D":
                        num = (int)Math.pow(Integer.parseInt(sNum), 2);
                        break;
                    case "T":
                        num = (int)Math.pow(Integer.parseInt(sNum), 3);
                        break;
                        
                }
                form.add(num);
                sNum = "";
            }
        }
        
        for(int i : form) {
            answer += i;
        }
        
        return answer;
    }
}
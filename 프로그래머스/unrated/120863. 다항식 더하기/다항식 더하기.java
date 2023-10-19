class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int n = 0;
        
        String[] sArr = polynomial.split(" ");        
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i].contains("x")){
                x += sArr[i].equals("x") ? 1 : Integer.parseInt(sArr[i].replace("x", ""));
            }else if(!sArr[i].equals("+")){
                n += Integer.parseInt(sArr[i]);
            }
        }
        
        if(x == 1 && n == 0){
            answer = "x";
        }else if(x == 1 && n != 0){
            answer = "x + " + n;
        }else if(x != 0 && n == 0){
            answer = x + "x";
        }else if(x != 0 && n != 0){
            answer = x + "x + " + n;
        }else if(x == 0 && n != 0){
            answer = Integer.toString(n);
        }
        
        return answer;
    }
}
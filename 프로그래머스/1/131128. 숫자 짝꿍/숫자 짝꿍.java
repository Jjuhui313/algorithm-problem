class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] XArr = new int[10];
        int[] YArr = new int[10];
        
        for(String x : X.split("")) {
            XArr[Integer.parseInt(x)]++;
        }
        for(String y : Y.split("")) {
            YArr[Integer.parseInt(y)]++;;
        }
        
        for(int i = 9; i >= 0; i--) {
            while(XArr[i] > 0 && YArr[i] > 0) {
                sb.append(i);
                XArr[i]--;
                YArr[i]--;
            }
        }
        if(sb.toString().equals("")) {
            return "-1";
        } else if(sb.toString().replaceAll("0", "").equals("")) {
            return "0";
        }
        
        answer = sb.toString();
        return answer;
    }
}
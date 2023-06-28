class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = "0";
        my_string += "a";
        char[] cArr = my_string.toCharArray();
        for(int i = 0; i < cArr.length; i++) {
            if(cArr[i] >= '0' && cArr[i] <= '9') {
                s += String.valueOf(cArr[i]);
            } else {
                answer += Integer.parseInt(s);
                s = "0";
            }
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] charArr = cipher.toCharArray();
        for(int i = code; i < charArr.length + 1; i += code) {
            answer += String.valueOf(charArr[i - 1]);
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] cArr = my_string.toCharArray();
        int index = 0;
        for(int i = 0; i < cArr.length; i++) {
            for(int j = 0; j < indices.length; j++) {
                if(i == indices[j]) {
                    cArr[i] = 0;
                }
            }
        }
        for(char c : cArr) {
            if(c != 0) {
                answer += String.valueOf(c);
            }
        }
        return answer;
    }
}
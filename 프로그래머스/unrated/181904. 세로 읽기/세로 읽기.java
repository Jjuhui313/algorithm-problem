class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[][] charArr = new char[my_string.length() / m][m];
        int index = 0;
        for(int i = 0; i < charArr.length; i++) {
            for(int j = 0; j < charArr[i].length; j++) {
                charArr[i][j] = my_string.charAt(index++);
                if(j + 1 == c) {
                    answer += String.valueOf(charArr[i][j]);
                }
            }
        }
        
        return answer;
    }
}
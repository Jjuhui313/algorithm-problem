class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] c = my_string.toCharArray();
        
        for(int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j = start; j <= end; j++) {
                char temp = c[j];
                c[j] = c[end];
                c[end] = temp;
                end--;
            }
        }
        
        for(char ch : c) {
            answer += String.valueOf(ch);
        }
        
        return answer;
    }
}
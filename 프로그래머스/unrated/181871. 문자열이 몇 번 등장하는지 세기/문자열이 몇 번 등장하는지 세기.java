class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i = 0; i < myString.length(); i++) {
            String s = (i + pat.length()) > myString.length() ? myString.substring(i) : myString.substring(i, i + pat.length());
            if(s.equals(pat)) {
                answer++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String change = "";
        for(char i: myString.toCharArray()) {
            if(i == 'A') {
                change += "B";
            } else if(i == 'B') {
                change += "A";
            }
        }
        
        answer = change.contains(pat) ? 1 : 0;
        
        return answer;
    }
}
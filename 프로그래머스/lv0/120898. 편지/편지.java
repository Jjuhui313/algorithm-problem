class Solution {
    public int solution(String message) {
        int answer = 0;
        int sum = 0;
        
        for (int i = 0; i < message.length(); i++) {
            sum++;
        }
        answer = sum * 2;
        
        return answer;
    }
}
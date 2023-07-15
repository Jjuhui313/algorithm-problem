class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i < food.length; i++) {
            int k = food[i] / 2;
            for(int j = 1; j <= k; j++) {
                answer += i;
            }
        }
        answer += 0;
        
        for(int i = food.length - 1; i >= 1; i--) {
            int k = food[i] / 2;
            for(int j = 1; j <= k; j++) {
                answer += i;
            }
        }
        
        return answer;
    }
}
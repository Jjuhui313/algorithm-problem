import java.util.Arrays;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisor = new int[number];
        
        for(int i = 1; i <= number; i++) {
            divisor[i - 1]++;
            for(int j = 1; j <= i / 2; j++) {
                if(i % j == 0) {
                    divisor[i - 1]++;
                }
                
                if(divisor[i - 1] > limit) {
                    divisor[i - 1] = power;
                    break;
                }
            }
            answer += divisor[i - 1];
        }
        
        return answer;
    }
}
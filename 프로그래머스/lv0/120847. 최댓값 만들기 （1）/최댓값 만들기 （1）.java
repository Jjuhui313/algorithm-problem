import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        
        num1 = numbers[numbers.length - 1];
        num2 = numbers[numbers.length - 2];
        answer = num1 * num2;
        
        
        return answer;
    }
}
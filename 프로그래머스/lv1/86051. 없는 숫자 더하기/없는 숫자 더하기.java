import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for(int i = 0; i < 10; i++) {
            if(!contains(numbers, i)) {
                answer += i;
            }
        }
        return answer;
    }
    
    public static boolean contains(int[] numbers, int num) {
        boolean isFind = false;
        
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == num) {
                isFind = true;
            }
        }
        return isFind;
    }
}
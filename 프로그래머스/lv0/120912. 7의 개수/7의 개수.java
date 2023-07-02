class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            answer += sevenCount(array[i]);
        }
        return answer;
    }
    
    public static int sevenCount(int num) {
        int count = 0;
        while(num > 0) {
            
            int n = num % 10;
            if(n % 7 == 0 && n != 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
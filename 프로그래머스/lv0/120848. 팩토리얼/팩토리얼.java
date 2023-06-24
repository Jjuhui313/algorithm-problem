class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= 10; i++) {
            if(n >= factorial(i)) {
                answer = i;
            }
        }
        
        return answer;
    }
    
    public static int factorial(int i) {
        if (i > 1) {
            return i * factorial(i - 1);
        }
        return i;
    }
}
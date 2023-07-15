class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n / a > 0) {
            int remainSum = n % a;
            answer += n / a * b;
            n = n / a * b + remainSum;
        }
        
        
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int answer = n + 1;
        
        int count = countBit(n);
        
        while (true) {
            if (countBit(answer) == count) {
                break;
            }
            answer++;
        }
        
        return answer;
    }
    
    private int countBit(int n) {
        int count = 0;
        
        while (n > 0) {
            if ((n & 1) == 1) count++;
            n >>= 1;
        }
        
        return count;
        
    }
    
    
}
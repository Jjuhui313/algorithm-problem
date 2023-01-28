class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // double d = Math.sqrt(n);
        
        // answer = (long)((d % 1 == 0) ? Math.pow(d+1, 2) : -1);
        
        answer = (long)(Math.sqrt(n) % 1 == 0 ? (Math.sqrt(n) + 1) * (Math.sqrt(n) + 1) : -1);
        
        return answer;
    }
}
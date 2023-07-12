class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a <= b) {
            for(long i = Long.valueOf(a); i <= Long.valueOf(b); i++) {
                answer += i;
            }
        } else {
            for(long i = Long.valueOf(b); i <= Long.valueOf(a); i++) {
                answer += i;
            }
        } 
        
        return answer;
    }
}
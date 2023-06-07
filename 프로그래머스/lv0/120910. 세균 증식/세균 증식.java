class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        long result = n;
        int hour = 1;
        while(hour <= t) {
            result *= 2;
            hour++;
        }
        answer = Long.valueOf(result).intValue();
        return answer;
    }
}
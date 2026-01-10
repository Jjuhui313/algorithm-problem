class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        answer = n;
        int hour = 1;
        while(hour <= t) {
            answer *= 2;
            hour++;
        }
        return answer;
    }
}
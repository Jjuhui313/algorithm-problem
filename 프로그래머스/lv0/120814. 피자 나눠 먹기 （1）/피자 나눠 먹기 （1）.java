class Solution {
    public int solution(int n) {
        int answer = 0;
        double result = (n % 7 == 0) ? Math.floor(n / 7) : Math.floor(n / 7) + 1;
        answer = (int)result;
        return answer;
    }
}
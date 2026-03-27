class Solution {
    public int solution(int n) {
        int answer = 0;
        int MOD = 1_000_000_007;

        if (n == 1) return 1;
        if (n == 2) return 2;

        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            int c = (a + b) % MOD;
            a = b;
            b = c;
        }
        answer = b;
        return answer;
    }
}
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int n = Integer.parseInt(a + "" + b);
        int m = 2 * a * b;
        answer = Math.max(n, m);
        return answer;
    }
}
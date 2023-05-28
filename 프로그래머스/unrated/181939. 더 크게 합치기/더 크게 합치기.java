class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int n = Integer.parseInt(a + "" + b);
        int m = Integer.parseInt(b + "" + a);
        if(n > m || n == m) answer = n;
        else if(m > n) answer = m;
        return answer;
    }
}
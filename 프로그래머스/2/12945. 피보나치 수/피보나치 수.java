class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = fibo(n);
        return answer;
    }
    
    public int fibo(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        int[] f = new int[num + 1];
        f[0] = 0;
        f[1] = 1;
        
        for (int i = 2; i <= num; i++) {
            f[i] = (f[i - 2] + f[i - 1]) % 1234567;
        }
        
        return f[num];
    }
}
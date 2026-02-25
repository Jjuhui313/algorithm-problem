class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String converted = Integer.toString(n, k);
        
        String[] splited = converted.split("0");
        
        for (String s : splited) {
            if (s.equals("")) continue;
            
            long num = Long.parseLong(s);
            
            if (isPrime(num)) answer++;
        }
        
        return answer;
    }
    
    private boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
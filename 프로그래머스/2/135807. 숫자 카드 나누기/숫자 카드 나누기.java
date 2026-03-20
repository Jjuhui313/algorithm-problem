class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = getGCD(arrayA);
        int gcdB = getGCD(arrayB);
        
        int answerA = check(gcdA, arrayB);
        int answerB = check(gcdB, arrayA);
        
        return Math.max(answerA, answerB);
    }
    
    private int getGCD(int[] arr) {
        int gcd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcd = gcd(gcd, arr[i]);
        }
        return gcd;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    private int check(int gcd, int[] other) {
        for (int num : other) {
            if (num % gcd == 0) {
                return 0;
            }
        }
        return gcd;
    }
}
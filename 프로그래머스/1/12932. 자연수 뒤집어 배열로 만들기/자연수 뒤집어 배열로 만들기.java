class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int num = 0;
        while(n > 0) {
            answer[num] += n % 10;
            num++;
            n /= 10;
        }
        
        
        return answer;
    }
}
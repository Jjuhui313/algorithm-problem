class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int index = 0;
        int count = 0;

        long i = Long.valueOf(x);
        while(count != n) {
            answer[index++] = i;
            i += Long.valueOf(x);
            count++;
        }
        
        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] arr = new int[score.length / m];
        int index = 0;
        int min = 10;
        
        Arrays.sort(score);
        
        for (int i = score.length - 1; i >= m - 1; i -= m) {
            for (int j = i; j > i - m; j--) {
                min = Math.min(min, score[j]);
            }
            
            arr[index++] = min * m;
        }
        
        for(int i : arr) {
            answer += i;
        }

        return answer;
    }
}
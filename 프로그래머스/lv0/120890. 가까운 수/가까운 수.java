import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        int num = n+100;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
          if (num > Math.abs(array[i] - n)) {
            num = Math.abs(array[i] - n);
            temp = i;
          }
        }
        
        answer = array[temp];
        return answer;
    }
}
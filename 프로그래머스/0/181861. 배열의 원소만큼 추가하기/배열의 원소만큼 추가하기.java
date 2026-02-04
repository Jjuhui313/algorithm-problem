import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[Arrays.stream(arr).sum()];
        int index = 0;
        for(int i : arr) {
            for(int j = 0; j < i; j++) {
                answer[index++] = i;
            }
        }
        
        return answer;
    }
}
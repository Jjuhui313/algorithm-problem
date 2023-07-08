import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] before = new int[arr.length];
        
        while(!Arrays.equals(before, arr)) {
            before = Arrays.copyOf(arr, arr.length);
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                } else if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else {
                    continue;
                }
            }
            answer++;
        }
        
        answer -= 1;
        
        return answer;
    }
}
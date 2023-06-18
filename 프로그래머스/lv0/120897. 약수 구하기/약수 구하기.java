import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0) {
                arr.add(i);
            }
        }
        arr.add(n);
        
        int[] answer = new int[arr.size()];
        int index = 0;
        for(int i : arr) {
            answer[index++] = i;
        }
        
        return answer;
    }
}
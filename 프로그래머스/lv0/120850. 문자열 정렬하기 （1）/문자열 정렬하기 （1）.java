import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                arr.add(my_string.charAt(i) - '0');
            }
        }
        int[] answer = new int[arr.size()];
        
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
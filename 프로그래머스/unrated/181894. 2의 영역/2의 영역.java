import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> twoArr = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                twoArr.add(i);
            }
        }
        
        int[] answer = new int[twoArr.isEmpty() ? 1 : twoArr.get(twoArr.size() - 1) - twoArr.get(0) + 1];
        
        if(twoArr.isEmpty()) {
            answer[0] = -1;
            return answer;
        }
        
        int index = 0;
        
        for(int i = twoArr.get(0); i <= twoArr.get(twoArr.size() - 1); i++) {
            answer[index++] = arr[i];
        }
        
        
        return answer;
    }
}
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            if(stk.isEmpty()) {
                stk.add(arr[i]);
            } else if(!stk.isEmpty()) {
                if(stk.get(stk.size() - 1) == arr[i]) {
                    stk.remove(stk.size() - 1);
                } else if(stk.get(stk.size() - 1) != arr[i]) {
                    stk.add(arr[i]);
                }
            }
            i += 1;
            
        }
        
        if(stk.isEmpty()) {
            return new int[] {-1};
        }
        
        int[] answer = new int[stk.size()];
        int index = 0;
        
        for(int s : stk) {
            answer[index++] = s;
        }
        
        return answer;
    }
}
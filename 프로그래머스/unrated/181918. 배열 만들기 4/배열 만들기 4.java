import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> stkArr = new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            if(stkArr.isEmpty()) {
                stkArr.add(arr[i]);
                i++;
            } else {
                if(stkArr.get(stkArr.size() - 1) < arr[i]) {
                    stkArr.add(arr[i]);
                    i++;
                } else {
                    stkArr.remove(stkArr.size() - 1);
                }
            }
        }
        int[] stk = new int[stkArr.size()];
        i = 0;
        for(int s : stkArr) {
            stk[i++] = s;
        }
        
        return stk;
    }
}
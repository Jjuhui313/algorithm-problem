import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (contains0or5(i)) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    private boolean contains0or5(int num) {
        while (num > 0) {
            int d = num % 10;
            if (d != 0 && d != 5) {
                return false;
            }
            num /= 10;
        }
        
        return true;
    }
}
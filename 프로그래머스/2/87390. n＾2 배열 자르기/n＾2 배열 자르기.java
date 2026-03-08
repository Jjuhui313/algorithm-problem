import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n, long left, long right) {
        
        List<Integer> list = new ArrayList<>();
        int leftN = (int)left;
        int rightN = (int)right;
        for(long i = left; i <= right; i++){
            if(i / n <= i % n)
                list.add((int)(i % n) + 1);
            else
                list.add((int)(i / n) + 1);
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) answer[i] = list.get(i);

        return answer;
    }
}
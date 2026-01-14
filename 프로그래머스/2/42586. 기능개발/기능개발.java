import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = progresses.length - 1; i >= 0; i--) {
            progresses[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
            st.push(progresses[i]);
        }
        int pre = st.pop();
        int count = 1;
        while (!st.empty()) {
            if (st.peek() <= pre) {
                st.pop();
                count++;
            } else {
                answer.add(count);
                count = 1;
                pre = st.pop();
            }
        }
        answer.add(count);
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}
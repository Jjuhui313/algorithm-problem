import java.util.Stack;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int box = 1;
        for (int o : order) {
            
            while (box <= order.length && box < o) {
                st.push(box++);
            }
            
            if (box == o) {
                answer++;
                box++;
                
            } else if (!st.empty() && st.peek() == o) {
                st.pop();
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}
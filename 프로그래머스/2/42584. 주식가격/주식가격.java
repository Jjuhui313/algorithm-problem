import java.util.Stack;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < prices.length; i++) {
            while (!st.empty() && prices[st.peek()] > prices[i]) {
                int index = st.pop();
                answer[index] = i - index;
            }
            st.push(i);
        }
        
        while (!st.empty()) {
            int index = st.pop();
            answer[index] = prices.length - index - 1;
        }
        
        return answer;
    }
}
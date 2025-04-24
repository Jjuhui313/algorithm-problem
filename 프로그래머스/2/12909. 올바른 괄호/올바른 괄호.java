import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') st.push(c);
            else {
                if (st.isEmpty() != true && st.peek() == '(') st.pop();
                else st.push(c);
            }
            
        }
        
        answer = st.isEmpty() ? true : false;

        return answer;
    }
}
import java.util.Stack;
import java.util.ArrayList;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Stack<Integer>> arr = new ArrayList<>();
        
        for (int i = 0; i < board.length; i++) {
            Stack<Integer> stack = new Stack<>();
            arr.add(stack);
        }
        
        for (int i = board.length - 1; i >= 0; i--) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 0) {
                    arr.get(j).push(board[i][j]);
                }
                
            }
        }
        
        Stack<Integer> basket = new Stack<>();
        for (int move : moves) {
            int column = move - 1;
            if (!arr.get(column).isEmpty()) {
                int peeked = arr.get(column).pop();
                if (!basket.isEmpty() && basket.peek() == peeked) {
                    basket.pop();
                    answer += 2;
                } else {
                    basket.push(peeked);
                }
            }
            
        }
        
        return answer;
    }
}
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answerArr = new ArrayList<>();
        
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answerArr.add(arr[i]);
        }
        for(int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            answerArr.add(arr[i]);
        }
        
        int[] answer = new int[answerArr.size()];
        
        for(int i = 0; i < answerArr.size(); i++) {
            answer[i] = answerArr.get(i);
        }
        
        return answer;
    }
}
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++) {
            arr.add(score[i]);
            Collections.sort(arr);
            if(arr.size() > k) {
                answer[i] = arr.get(arr.size() - k);
            } else {
                answer[i] = arr.get(0);
            }
        }
        
        return answer;
    }
}
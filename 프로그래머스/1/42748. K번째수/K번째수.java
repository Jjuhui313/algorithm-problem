import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        
        for(int i = 0; i < commands.length; i++) {
            for(int j = commands[i][0]; j <= commands[i][1]; j++) {
                arr.add(array[j - 1]);
                Collections.sort(arr);
            }
            answer[i] = arr.get(commands[i][2] - 1);
            arr.clear();
        }

        
        return answer;
    }
}
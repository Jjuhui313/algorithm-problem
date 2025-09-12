import java.util.Arrays;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        float[] arr = new float[score.length];
        
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                arr[i] += score[i][j];
            }
            arr[i] /= (float)score[i].length;
        }
        
        for(int i = 0; i < arr.length; i++) {
            int num = 1;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    num++;
                }
                answer[i] = num;
            }
            
        }
        System.out.println(Arrays.toString(arr));
        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] arr = new double[numlist.length];
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] - n < 0) {
                arr[i] = Math.abs(numlist[i] - n) + 0.5;
            } else {
                arr[i] = numlist[i] - n;
            }
        }
        
        Arrays.sort(arr);

        for(int i = 0; i < numlist.length; i++) {
            if(arr[i] % 1 != 0) {
                answer[i] = n - (int)arr[i];
            } else {
                answer[i] = (int)arr[i] + n;            
            }
        }
        
        return answer;
    }
}
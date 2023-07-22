import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (count == k) {
                break;
            }
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                answer[count] = arr[i];
                count++;
            }
        }
        
        while (count < k) {
            answer[count] = -1;
            count++;
        }
        
        return answer;
    }
}
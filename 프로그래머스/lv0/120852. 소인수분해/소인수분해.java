import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        int num = n;
        
        for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    if(arr.isEmpty()) {
                        arr.add(i);
                    } else if(arr.get(arr.size() - 1) != i) {
                        arr.add(i);
                    }
                    n = n/i;
                }
        }
        int[] answer = new int[arr.size()];

        int i = 0;
        for(int k : arr) {
            answer[i++] = k;
        }
        
        return answer;
    }
}
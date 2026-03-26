import java.util.List;
import java.util.ArrayList;
class Solution {
    static List<int[]> result = new ArrayList<>();
    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);
        int[][] answer = new int[result.size()][2];
        
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
    
    private void hanoi(int n, int from, int to, int via) {
        if (n == 1) {
            result.add(new int[]{from, to});
            return;
        }
        
        hanoi(n - 1, from, via, to);
        
        result.add(new int[]{from, to});
        
        hanoi(n - 1, via, to, from);
    }
}
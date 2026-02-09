import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> queue = new LinkedList<>();
        int[] count = new int[10];
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
            count[priorities[i]]++;
        }

        int currentMax = 9;

        while (!queue.isEmpty()) {
            while (count[currentMax] == 0) {
                currentMax--;
            }

            int[] current = queue.poll();

            if (current[1] == currentMax) {
                answer++;
                count[currentMax]--;

                if (current[0] == location) {
                    return answer;
                }
            } else {
                queue.offer(current);
            }
        }

        return answer;
    }
}
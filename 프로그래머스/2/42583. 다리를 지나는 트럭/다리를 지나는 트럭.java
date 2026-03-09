import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int sum = 0;
        int idx = 0;

        while (idx < truck_weights.length) {
            time++;

            if (bridge.size() == bridge_length) {
                sum -= bridge.poll();
            }

            if (sum + truck_weights[idx] <= weight) {
                bridge.offer(truck_weights[idx]);
                sum += truck_weights[idx];
                idx++;
            } else {
                bridge.offer(0);
            }
        }

        return time + bridge_length;
    }
}
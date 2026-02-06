import java.util.Arrays;
import java.util.PriorityQueue;
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[][] times = new int[book_time.length][2];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < book_time.length; i++) {
            String[] start = book_time[i][0].split(":");
            String[] end = book_time[i][1].split(":");

            times[i][0] = Integer.parseInt(start[0]) * 60 + Integer.parseInt(start[1]);

            times[i][1] = Integer.parseInt(end[0]) * 60 + Integer.parseInt(end[1]) + 10;
        }
        
        Arrays.sort(times, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        
        for (int i = 0; i < times.length; i++) {
            if (!pq.isEmpty() && pq.peek() <= times[i][0]) pq.poll();
            pq.add(times[i][1]);
        }
        
        answer = pq.size();
        
        return answer;
    }
}
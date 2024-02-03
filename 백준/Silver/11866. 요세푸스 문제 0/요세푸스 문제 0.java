import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int index = 1;
        while(!queue.isEmpty()) {
            if(index == K) {
                sb.append(queue.poll()).append(", ");
                index = 1;
            } else {
                int n = queue.poll();
                queue.add(n);
                index++;
            }
        }
        System.out.println(sb.substring(0, sb.length() - 2) + ">");

    }
}

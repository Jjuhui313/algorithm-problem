
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    Integer num = queue.poll();
                    if (num == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(num).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    Integer frontNum = queue.peek();
                    if (frontNum == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(frontNum).append("\n");
                    }
                    break;
                case "back":
                    Integer backNum = queue.peekLast();
                    if (backNum == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(backNum).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}

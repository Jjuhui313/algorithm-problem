
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
        Deque<Integer> d = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());

            switch (Integer.parseInt(st.nextToken())) {
                case 1:
                    d.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    d.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(d.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(d.poll()).append("\n");
                    }
                    break;
                case 4:
                    if(d.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(d.pollLast()).append("\n");
                    }
                    break;
                case 5:
                    sb.append(d.size()).append("\n");
                    break;
                case 6:
                    if(d.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 7:
                    if(d.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(d.peek()).append("\n");
                    }
                    break;
                case 8:
                    if(d.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(d.peekLast()).append("\n");
                    }
                    break;
            }
        }

        System.out.println(sb);

    }
}

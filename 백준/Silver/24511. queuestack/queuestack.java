
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            int QueueOrStack = Integer.parseInt(st1.nextToken());
            int n = Integer.parseInt(st2.nextToken());
            if(QueueOrStack == 0) {
                deque.add(n);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st1 = new StringTokenizer(br.readLine());

        while(M-- > 0) {
            int value = Integer.parseInt(st1.nextToken());

            deque.addFirst(value);
            sb.append(deque.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}

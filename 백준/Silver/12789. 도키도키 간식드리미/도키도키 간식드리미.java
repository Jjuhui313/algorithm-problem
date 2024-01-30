
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        Stack<Integer> waitStack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int turn = 1;
        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(st.nextToken());
            waitStack.push(n);
            while(!waitStack.isEmpty() && waitStack.peek() == turn) {
                waitStack.pop();
                turn++;
            }
        }

        if(waitStack.empty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }


    }
}

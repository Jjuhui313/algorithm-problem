
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0) {
                s.pop();
            } else {
                s.push(n);
            }
        }
        int result = 0;
        for(int i : s) {
            result += i;
        }

        System.out.println(result);
    }
}

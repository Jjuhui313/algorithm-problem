
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        br.close();

        System.out.println(factorial(N) / (factorial(K) * factorial(N - K)));

    }

    public static int factorial(int n) {
        int num = 1;
        for(int i = 2; i <= n; i++) {
            num *= i;
        }
        return num;
    }
}

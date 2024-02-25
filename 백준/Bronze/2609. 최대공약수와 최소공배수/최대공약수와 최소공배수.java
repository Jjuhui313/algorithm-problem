
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int GCD = gcd(N, M);
        int LCM = (N * M) / GCD;
        sb.append(GCD).append("\n").append(LCM).append("\n");

        System.out.println(sb);
    }
    public static int gcd(int n, int m) {
        int GCD = 1;
        int min = Math.min(m, n);
        int max = Math.max(m, n);

        if (max % min == 0) {
            return min;
        }

        for (int i = 1; i <= n / 2 && i <= m / 2; i++) {
            if (n % i == 0 && m % i == 0) {
                GCD = i;
            }
        }

        return GCD;
    }
}

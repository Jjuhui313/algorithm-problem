
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        hanoi(1, 2, 3, N);
        System.out.println(count);
        System.out.println(sb);
    }

    public static void hanoi(int from, int m, int to, int num) {
        if (num == 0) return;

        hanoi(from, to, m, num - 1);

        count++;
        sb.append(from).append(" ").append(to).append("\n");
        hanoi(m, from, to, num - 1);
    }
}

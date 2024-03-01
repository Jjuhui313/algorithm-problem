
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static boolean[] isUse;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        isUse = new boolean[N];
        arr = new int[M];

        back(N, M, 0);
        System.out.println(sb);
    }

    private static void back(int N, int M, int depth) {

        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isUse[i]) {
                isUse[i] = true;
                arr[depth] = i + 1;
                back(N, M, depth + 1);

                isUse[i] = false;
            }
        }
    }
}

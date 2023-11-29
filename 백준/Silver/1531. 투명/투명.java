import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] paper = new int[101][101];
        int result = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j = x1; j <= x2; j++) {
                for(int k = y1; k <= y2; k++) {
                    paper[j][k]++;
                }
            }

        }

        for(int i = 1; i <= 100; i++) {
            for(int j = 1; j <= 100; j++) {
                if(paper[i][j] > M) {
                    result++;
                }
            }
        }

        System.out.println(result);

    }
}

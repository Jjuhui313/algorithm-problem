import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] paper = new int[101][101];
        int result = 0;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            for(int j = left; j < left + 10 && j < 101; j++) {
                for(int k = right; k < right + 10 && k < 101; k++) {
                    paper[j][k]++;
                }
            }
        }

        for(int i = 0; i < paper.length; i++) {
            for(int j = 0; j < paper[i].length; j++) {
                if(paper[i][j] >= 1) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}

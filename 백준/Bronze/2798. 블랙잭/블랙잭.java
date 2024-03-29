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
        int[] arr = new int[N];
        int close = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            if(arr[i] > M) continue;
            for(int j = i + 1; j < N; j++) {
                if(arr[i] + arr[j] > M) continue;
                for(int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if(close < sum && sum < M) {
                        close = sum;
                    }

                    if(sum == M) {
                        close = sum;
                    }

                }
            }
        }

        System.out.println(close);
    }
}

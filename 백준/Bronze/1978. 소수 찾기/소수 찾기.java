import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());


        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            int count = 1;
            if(num == 1) {
                continue;
            }
            for(int j = 1; j <= num / 2; j++) {
                if(num % j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                result++;
            }
        }

        System.out.println(result);
    }
}

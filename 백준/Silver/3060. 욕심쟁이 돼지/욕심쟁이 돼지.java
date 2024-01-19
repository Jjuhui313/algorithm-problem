import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(in.readLine());

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(in.readLine());
            st = new StringTokenizer(in.readLine());

            long sum = 0;
            int day = 1;

            for(int j = 0; j < 6; j++){
                sum += Integer.parseInt(st.nextToken());
            }

            while(sum <= N) {
                sum *= 4;
                ++day;
            }

            sb.append(day).append("\n");
        }

        System.out.print(sb);
    }
}

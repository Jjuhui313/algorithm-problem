
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            String s = br.readLine();
            if (s.equals("0 0 0")) {
                break;
            }
            st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int[] arr = {a, b, c};

            Arrays.sort(arr);

            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }

        }

        System.out.println(sb);
    }
}

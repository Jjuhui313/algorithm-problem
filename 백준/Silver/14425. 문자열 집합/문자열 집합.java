import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        List<String> arrN = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            arrN.add(br.readLine());
        }

        for(int j = 0; j < M; j++) {
            String s = br.readLine();
            if(arrN.contains(s)) {
                count++;
            }
        }

        System.out.println(count);

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> sangHM = new HashMap<>();

        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            sangHM.put(n, sangHM.getOrDefault(n, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(sangHM.containsKey(n)) {
                sb.append(sangHM.get(n)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        
        System.out.println(sb.substring(0, sb.length() - 1));

    }
}

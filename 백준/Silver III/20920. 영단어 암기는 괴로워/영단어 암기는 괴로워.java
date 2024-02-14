
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.length() < M) {
                continue;
            }

            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }

        List<String> list = new ArrayList<>(hm.keySet());

        Collections.sort(list, (o1, o2) -> {
            if ((int) hm.get(o1) != hm.get(o2)) {
                return Integer.compare(hm.get(o2), hm.get(o1));
            }
            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            }
            return o1.compareTo(o2);
        });

        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);

    }
}

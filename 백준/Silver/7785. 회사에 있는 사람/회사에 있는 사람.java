import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, String> hm = new TreeMap<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();
            if ("enter".equals(log)) {
                hm.put(name, "enter");
            } else {
                hm.remove(name);
            }

        }
        List<String> keySet = new ArrayList<>(hm.keySet());

        for(String key : keySet) {
            System.out.println(key);
        }
    }
}

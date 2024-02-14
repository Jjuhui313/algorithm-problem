
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Set<String> hs = new HashSet<>();
        hs.add("ChongChong");
        StringTokenizer st;
        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());
            String name1 = st.nextToken();
            String name2 = st.nextToken();

            if(hs.contains(name1)) {
                hs.add(name2);
            } else if(hs.contains(name2)) {
                hs.add(name1);
            }

        }

        System.out.println(hs.size());

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int NA = Integer.parseInt(st.nextToken());
        int NB = Integer.parseInt(st.nextToken());
        Set<Integer> hsA = new HashSet<>();
        Set<Integer> hsB = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < NA; i++) {
            int num = Integer.parseInt(st.nextToken());
            hsA.add(num);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < NB; i++) {
            int num = Integer.parseInt(st.nextToken());
            hsB.add(num);
        }
        int resultA = 0;
        int resultB = 0;
        for(int i : hsA) {
            if(!hsB.contains(i)) {
                resultA++;
            }
        }
        for(int i : hsB) {
            if(!hsA.contains(i)) {
                resultB++;
            }
        }

        System.out.println(resultA + resultB);

    }
}

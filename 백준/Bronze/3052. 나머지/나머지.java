import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashSet<Integer> hs = new HashSet<>();
        int count = 0;

        while(count < 10) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            hs.add(A % 42);
            count++;
        }
        System.out.println(hs.size());
    }
}

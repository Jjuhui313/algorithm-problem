import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(A.length() - i - 1);
            sb1.append(c);
        }
        for (int i = 0; i < B.length(); i++) {
            char c = B.charAt(B.length() - i - 1);
            sb2.append(c);
        }



        System.out.println(Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString())));
    }
}

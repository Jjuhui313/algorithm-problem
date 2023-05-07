import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] result = new String[N];

        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            if(s.length() == 1) {
                result[i] = s + s;
                continue;
            }
            result[i] = s.charAt(0) + s.substring(s.length() - 1);
        }
        for(String i : result) {
            System.out.println(i);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] sArr = new String[N];

        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            sArr[i] = s;
        }

        Arrays.sort(sArr, (s1, s2) -> {
            if(s1.length() == s2.length()) {
                return s1.compareTo(s2);
            } else {
                return s1.length() - s2.length();
            }
        });

        System.out.println(sArr[0]);
        for(int i = 1; i < N; i++) {
            if(!sArr[i].equals(sArr[i - 1])) {
                System.out.println(sArr[i]);
            }
        }

    }
}

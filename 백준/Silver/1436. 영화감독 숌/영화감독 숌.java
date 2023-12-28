import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sixN = 666;
        while(true) {
            String s = String.valueOf(sixN);

            for(int i = 0; i < s.length() - 2; i++) {
                if(s.charAt(i) == '6' && s.charAt(i + 1) == '6' && s.charAt(i + 2) == '6') {
                    N--;
                    break;
                }
            }
            if(N == 0) break;
            sixN++;
        }

        System.out.println(sixN);
    }
}

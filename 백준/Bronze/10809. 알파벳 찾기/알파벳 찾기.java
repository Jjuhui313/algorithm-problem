import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        Arrays.fill(alpha, -1);

        String s = br.readLine();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(alpha[c - 'a'] == -1) {
                alpha[c - 'a'] = i;
            }
        }
        for(int al : alpha) {
            System.out.print(al + " ");
        }
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int i = 0;
        while (i < s.length()) {
            if(i <= s.length() - 4 && s.substring(i, i + 4).equals("XXXX")) {
                sb.append("AAAA");
                i += 4;
            } else if (i <= s.length() - 2 && s.substring(i, i + 2).equals("XX")) {
                sb.append("BB");
                i += 2;
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }

        if (sb.toString().contains("X")) {
            System.out.println("-1");
        } else {
            System.out.println(sb);
        }
    }
}

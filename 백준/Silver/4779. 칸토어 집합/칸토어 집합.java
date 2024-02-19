
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            if(s.isEmpty()) {
                break;
            }

            int N = Integer.parseInt(s);
            String str = "-".repeat((int)Math.pow(3, N));
            System.out.println(cantor(str));

        }

    }

    public static String cantor(String str) {
        if(str.length() == 1) {
            return str;
        }

        int slice = str.length() / 3;
        String first = str.substring(0, slice);
        String middle = " ".repeat(slice);
        String last = str.substring(slice * 2);

        return cantor(first) + middle + cantor(last);
    }
}

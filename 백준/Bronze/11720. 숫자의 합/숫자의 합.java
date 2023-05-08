import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int total = 0;
        for(byte b : br.readLine().getBytes()) {
            total += (b - '0');
        }

        System.out.println(total);
    }
}

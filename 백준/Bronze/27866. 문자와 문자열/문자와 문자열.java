import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int index = Integer.parseInt(br.readLine()) - 1;
        char c = s.charAt(index);
        System.out.print(c);
    }
}

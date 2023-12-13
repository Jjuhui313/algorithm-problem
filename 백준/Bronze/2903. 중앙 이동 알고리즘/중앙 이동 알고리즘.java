import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int side = 2;
        for (int i = 1; i <= n; i++) {
            side = (side-1) + side;
        }
        System.out.println(side * side);
    }
}
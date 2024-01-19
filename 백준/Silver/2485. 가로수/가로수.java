
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        int GCD = 0;

        for(int i = 0; i < arr.size() - 1; i++) {
            int num = arr.get(i + 1) - arr.get(i);
            GCD = getGCD(num, GCD);
        }

        System.out.println((arr.get(arr.size() - 1) - arr.get(0)) / GCD + 1 - arr.size());


    }
    public static int getGCD(int a, int b) {
        while(b != 0) {
            int n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
}

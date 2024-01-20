
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Long.parseLong(br.readLine());
        for(int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());
            while(true) {
                if(isPrime(n)) {
                    break;
                } else {
                    n++;
                }
            }
            System.out.println(n);
        }
    }

    public static boolean isPrime(long num) {
        if(num < 2) {
            return false;
        }
        boolean flag = true;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return flag;
    }
}

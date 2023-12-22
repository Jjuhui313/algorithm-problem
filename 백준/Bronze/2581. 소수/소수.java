import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int totalSum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = M; i <= N; i++) {
            if(isPrime(i)) {
                totalSum += i;
                if(min > i) {
                    min = i;
                }
            }
        }

        if(totalSum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(totalSum);
            System.out.println(min);
        }

    }

    public static boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}

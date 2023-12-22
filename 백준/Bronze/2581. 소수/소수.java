import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int totalSum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = M; i <= N; i++) {
            if(isPrime(i)) {
                arr.add(i);
                totalSum += i;
            }
        }

        if(arr.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(totalSum);
            System.out.println(arr.get(0));
        }

    }

    public static boolean isPrime(int num) {
        int count = 0;
        for(int i = 1; i <= num / 2; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        if(count == 1) {
            return true;
        } else {
            return false;
        }
    }
}

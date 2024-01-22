
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static boolean[] prime = new boolean[246913];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        countPrime();
        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0){
                break;
            }

            int count = 0;

            for(int i = N + 1; i <= 2 * N; i++){
                if(!prime[i])  count++;
            }

            System.out.println(count);
        }
    }

    public static void countPrime(){

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++){

            if(prime[i]) continue;

            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}

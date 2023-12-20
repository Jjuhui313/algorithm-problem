import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            int n = Integer.parseInt(br.readLine());
            int total = 0;

            if(n == -1) {
                break;
            }
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 1; i <= n / 2; i++) {
                if(n % i == 0) {
                    arr.add(i);
                }
            }
            for(int i = 0; i < arr.size(); i++) {
                total += arr.get(i);
            }
            if(n == total) {
                System.out.print(n + " = ");
                for(int i = 0; i < arr.size(); i++) {
                    if(i != arr.size() - 1) {
                        System.out.print(arr.get(i) + " + ");
                    } else {
                        System.out.println(arr.get(i));
                    }

                }
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int num = 2;
        while(N > 1) {
            if(N % num == 0) {
                N /= num;
                arr.add(num);
            } else {
                num++;
            }

        }

        for(int i : arr) {
            System.out.println(i);
        }
    }
}

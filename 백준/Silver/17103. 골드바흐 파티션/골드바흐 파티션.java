
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[1000001];
        arr[0] = arr[1] = true;
        for(int i = 2; i < 1000001; i++) {
            if(!arr[i]) {
                for(int j = i + i; j < 1000001; j += i) {
                    arr[j] = true;
                }
            }
        }

        while(T-- > 0) {
            int num = Integer.parseInt(br.readLine());
            int count = 0;
            for(int i = 2; i <= num / 2; i++) {
                if(!arr[i] && !arr[num - i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

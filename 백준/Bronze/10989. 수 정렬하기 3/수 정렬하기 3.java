import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[20000001];
        for(int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 10000000] += 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                for(int j = 0; j < arr[i]; j++) {
                    sb.append(i - 10000000).append('\n');
                }
            }
        }
        System.out.println(sb);

    }
}

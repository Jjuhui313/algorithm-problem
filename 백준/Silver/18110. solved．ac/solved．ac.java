
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int total = 0;
        int result = 0;

        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int num = (int) Math.round(T * 0.15);
        int people = 0;
        for (int i = num; i < T - num; i++) {
            people++;
            total += arr[i];
        }

        result = Math.round((float) total / people);

        System.out.println(result);
    }
}


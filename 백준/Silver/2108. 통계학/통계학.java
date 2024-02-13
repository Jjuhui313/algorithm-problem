
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        StringBuilder sb = new StringBuilder();
        double total = 0;
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            total += arr[i];
        }
        int average = (int)Math.round(total / T);
        sb.append(average).append("\n");

        Arrays.sort(arr);
        sb.append(arr[arr.length / 2]).append("\n");

        int count = 0;
        int mod = arr[0];
        int max = Integer.MIN_VALUE;
        boolean isChecked = false;

        for (int i = 0; i < T - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }

            if(max < count) {
                max = count;
                mod = arr[i];
                isChecked = true;
            } else if(isChecked == true && max == count) {
                mod = arr[i];
                isChecked = false;
            }
        }

        sb.append(mod).append("\n");

        sb.append(arr[arr.length - 1] - arr[0]).append("\n");

        System.out.println(sb);

    }
}

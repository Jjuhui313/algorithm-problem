import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int numberOne = Integer.parseInt(br.readLine());
        int result = 0;

        int[] arr = new int[N - 1];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(N == 1) {
            System.out.println(result);
            return;
        }

        while(true) {
            boolean flag = true;
            Arrays.sort(arr);
            int max = arr.length - 1;

            if(numberOne <= arr[max]) {
                numberOne++;
                arr[max]--;
                result++;
                flag = false;
            }
            if(flag) {
                break;
            }
        }
        System.out.println(result);

    }
}

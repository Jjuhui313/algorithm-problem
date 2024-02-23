
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long total = 0;
        List<Integer> arr = new ArrayList<>();
        while (T-- > 0) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i) - i;
            if (num <= 0) {
                break;
            }
            total += num;
        }
        System.out.println(total);

    }
}

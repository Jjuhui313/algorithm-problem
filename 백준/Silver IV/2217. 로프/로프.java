
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
        int max = Integer.MIN_VALUE;
        List<Integer> arr = new ArrayList<>();
        List<Integer> resultArr = new ArrayList<>();
        while (T-- > 0) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        int N = arr.size();

        for (int i = 0; i < N; i++) {
            resultArr.add((N - i) * arr.get(i));
        }

        for (Integer i : resultArr) {
            if (max < i) {
                max = i;
            }
        }

        System.out.println(max);


    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arrInput = new int[N];
        int[] arrSort = new int[N];
        Map<Integer, Integer> hm = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arrInput[i] = arrSort[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrSort);
        int count = 0;
        for(int i : arrSort) {
            if(!hm.containsKey(i)) {
                hm.put(i, count);
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(hm.get(arrInput[0]));
        for(int i = 1; i < N; i++) {
            sb.append(" ").append(hm.get(arrInput[i]));
        }

        System.out.println(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        int count = 1;

        while(count <= M) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            while(i <= j) {
                basket[i - 1] = k;
                i++;
            }
            count++;
        }
        for (int i = 0; i < basket.length; i++) {
            System.out.printf("%d", basket[i]);
            if (i != basket.length - 1) {
                System.out.print(" ");
            }
        }
    }
}

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
        int k = 1;
        for(int i = 0; i < basket.length; i++) {
            basket[i] = k;
            k++;
        }
        k = 1;

        while (k <= M) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            while(i < j) {
                int temp = basket[i];
                basket[i++] = basket[j];
                basket[j--] = temp;
            }

            k++;
        }

        for(int i = 0; i < basket.length; i++) {
            System.out.printf("%d", basket[i]);
            if (i != basket.length - 1) {
                System.out.print(" ");
            }
        }
    }
}

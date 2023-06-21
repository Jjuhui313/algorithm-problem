import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberN = Integer.parseInt(st.nextToken());
        int sumM = Integer.parseInt(st.nextToken());
        long[] longArr = new long[numberN + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= numberN; i++) {
            longArr[i] = longArr[i - 1] + Integer.parseInt(st.nextToken());
        }
        for(int k = 0; k < sumM; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(longArr[j] - longArr[i - 1]);
        }

    }
}

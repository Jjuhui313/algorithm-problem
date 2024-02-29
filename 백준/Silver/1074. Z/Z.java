
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N; static int R; static int C; static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        zCount(0, 0, (int)Math.pow(2, N));
    }

    public static void zCount(int r, int c, int size) {

        if (size == 1) {
            System.out.println(count);
            return;
        }

        int newSize = size / 2;
        if (R < r + newSize && C < c + newSize) {
            zCount(r, c, newSize);
        }

        if (R < r + newSize && c + newSize <= C) {
            count += (size * size) / 4;
            zCount(r, c + newSize, newSize);
        }

        if (r + newSize <= R && C < c + newSize) {
            count += ((size * size) / 4) * 2;
            zCount(r + newSize, c, newSize);
        }

        if (r + newSize <= R && c + newSize <= C) {
            count += ((size * size) / 4) * 3;
            zCount(r + newSize, c + newSize, newSize);
        }

    }
}

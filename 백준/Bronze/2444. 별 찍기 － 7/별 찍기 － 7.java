import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            int whiteSpace = N - i - 1;

            System.out.println(" ".repeat(whiteSpace) + "*".repeat(i + (i + 1)));

        }
        for(int i = N - 1; i > 0; i--) {
            int whiteSpace = N - i;
            System.out.println(" ".repeat(whiteSpace) + "*".repeat(i + (i - 1)));
        }
    }
}

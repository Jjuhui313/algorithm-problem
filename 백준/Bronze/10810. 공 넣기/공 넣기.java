import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];
        int count = 1;

        while(count <= M) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
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

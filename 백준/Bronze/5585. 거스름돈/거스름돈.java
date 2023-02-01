import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int change = 1000 - num;
        int[] money = {500, 100, 50, 10, 5, 1};
        int count = 0;

        while(change > 0) {
            for (int i : money) {
                count += change / i;
                change %= i;
            }
        }

        System.out.println(count);
    }
}
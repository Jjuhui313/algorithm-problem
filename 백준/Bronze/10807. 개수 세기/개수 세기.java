import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        int[] array = new int[index];
        int num = 0;

        for(int i = 0; i < index; i++) {
            array[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for(int j : array) {
            if (j == v) {
                num++;
            }
        }
        System.out.println(num);



    }
}
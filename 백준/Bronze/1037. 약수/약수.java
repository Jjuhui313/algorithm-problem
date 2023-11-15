import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        
        for(int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);
        
        System.out.println(array[num - 1] * array[0]);
        
    }
}


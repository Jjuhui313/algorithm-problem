import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        char[] charArr = s.toCharArray();
        int[] numberArr = new int[10];
        int[] countArr = new int[10];

        for(int i = 0; i < charArr.length; i++) {
            numberArr[(charArr[i] - '9') * -1] = charArr[i] - '0';
            countArr[(charArr[i] - '9') * -1]++;
        }

        for(int i = 0; i < numberArr.length; i++) {
            for(int j = 0; j < countArr[i]; j++) {
                System.out.print(numberArr[i]);
            }

        }
        System.out.println();


    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int[] stickArr = {64, 32, 16, 8, 4, 2, 1};
        int sum = 0;
        int result = 0;
        for(int i = 0; i < stickArr.length; i++) {
            if(input >= stickArr[i]) {
                sum += stickArr[i];
                result++;
            }

            if(sum > input) {
                sum -= stickArr[i];
                result--;
            }

            if(sum == input) {
                break;
            }
        }

        System.out.println(result);
    }
}

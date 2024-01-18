import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input == null || input.equals("")) {
                break;
            }

            String[] arr = input.split(" ");
            int n = Integer.parseInt(arr[0]);
            int k = Integer.parseInt(arr[1]);

            int chickenCount = 0;

            chickenCount += n;

            int coupon = n;

            while (coupon >= k) {
                int useCoupon = coupon / k;

                coupon = useCoupon + coupon % k;
                chickenCount += useCoupon;
            }

            System.out.println(chickenCount);
        }
    }
}


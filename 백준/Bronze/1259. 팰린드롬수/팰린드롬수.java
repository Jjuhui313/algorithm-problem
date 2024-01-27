
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            boolean isPalindrome = false;
            if(s.equals("0")) {
                break;
            } else {
                for(int i = 0; i <= s.length() / 2; i++) {
                    if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                        isPalindrome = false;
                        System.out.println("no");
                        break;
                    } else {
                        isPalindrome = true;
                    }
                }
                if(isPalindrome) {
                    System.out.println("yes");
                }
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] alphaArr = new int[26];
        int result = 0;
        boolean isContinuity = true;
        for(int i = 0; i < num; i++) {
            String s = br.readLine();
            s.toLowerCase();
            isContinuity = true;
            for(int j = 0; j < s.length(); j++) {
                int asciiNum = s.charAt(j) - 97;
                alphaArr[asciiNum] += 1;
                if(alphaArr[asciiNum] > 1) {
                    if(s.charAt(j - 1) - 97 != asciiNum) {
                        isContinuity = false;
                        break;
                    }
                }
            }

            if(isContinuity) {
                result++;
            }


            for(int k = 0; k < alphaArr.length; k++) {
                alphaArr[k] = 0;
            }
        }
        System.out.println(result);

    }
}

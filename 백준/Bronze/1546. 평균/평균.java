import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        double[] resultArr = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        while(count < N) {
            arr[count] = Integer.parseInt(st.nextToken());

            count++;
        }
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        double result;
        for(int i = 0; i < arr.length; i++) {
            result = arr[i] / (double)max * 100;
            resultArr[i] = result;
        }

        double resultAdd = 0.0;
        for(double i : resultArr) {
            resultAdd += i;
        }
        double resultAve = resultAdd / arr.length;
        System.out.println(resultAve);
    }
}

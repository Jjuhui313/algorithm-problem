
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrA = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            arrA.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrB = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            arrB.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arrA);

        int result = 0;
        for(int i = 0; i < arrA.size(); i++) {
            int maxIndexB = maxAmongB(arrB);
            result += arrA.get(i) * arrB.get(maxIndexB);
            arrB.remove(maxIndexB);
        }
        System.out.println(result);
    }

    public static int maxAmongB(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > max) {
                max = arr.get(i);
                maxIndex = i;
            }
        }
        return maxIndex;

    }
}

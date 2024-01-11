import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> hmHear = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            hmHear.put(s, 1);
        }

        Map<String, Integer> cantHearAndSee = new TreeMap<>();
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            if(hmHear.containsKey(s)) {
                cantHearAndSee.put(s, 1);
            }
        }
        System.out.println(cantHearAndSee.size());
        for(String s : cantHearAndSee.keySet()) {
            System.out.println(s);
        }

    }
}

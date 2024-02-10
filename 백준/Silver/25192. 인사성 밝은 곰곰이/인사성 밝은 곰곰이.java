
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Set<String> hs = new HashSet<>();
        int count = 0;
        while(T-- > 0) {
            String s = br.readLine();
            if(s.equals("ENTER")) {
                hs.clear();
            } else if(!hs.contains(s)) {
                hs.add(s);
                count++;
            }
        }

        System.out.println(count);
    }
}

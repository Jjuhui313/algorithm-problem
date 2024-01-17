
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int moleculeA = Integer.parseInt(st.nextToken()); //분자
        int denominatorA = Integer.parseInt(st.nextToken()); //분모

        st = new StringTokenizer(br.readLine());
        int moleculeB = Integer.parseInt(st.nextToken()); //분자
        int denominatorB = Integer.parseInt(st.nextToken()); //분모
        
        moleculeA = moleculeA * denominatorB + moleculeB * denominatorA;
        denominatorA = denominatorA * denominatorB;
        int GCD = 0;
        for(int i = 1; i <= denominatorA && i <= moleculeA; i++) {
            if(denominatorA % i == 0 && moleculeA % i == 0) {
                GCD = i;
            }
        }

        System.out.println(moleculeA / GCD + " " + denominatorA / GCD);
    }
}

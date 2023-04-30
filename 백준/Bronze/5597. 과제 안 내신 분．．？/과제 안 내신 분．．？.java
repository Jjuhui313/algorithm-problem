import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] studentsAll = new int[30];
        ArrayList<Integer> students = new ArrayList<>();
        StringTokenizer st;
        int count = 1;
        for(int i = 0; i < studentsAll.length; i++) {
            studentsAll[i] = count;
            count++;
        }
        count = 0;
        while(count < 28) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            for(int i = 0; i < studentsAll.length; i++) {
                if(studentsAll[i] == num) {
                    studentsAll[i] = 0;
                }
            }
            count++;
        }

        for(int i : studentsAll) {
            if(i != 0) {
                System.out.println(i);
            }

        }

    }
}

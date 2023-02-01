import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int score = 0;
        ArrayList<Integer> scoreArr = new ArrayList<>();

        int count = 0;

        while(num > 0) {
            String ox = sc.nextLine();
            if(ox.equals("")) {
                continue;
            }
            char[] c = ox.toCharArray();

            for(int j = 0; j < c.length; j++) {
                if(c[j] == 'O') {
                    count += 1;
                    score += count;
                } else {
                    count = 0;
                    score += count;
                }
            }
            num--;
            scoreArr.add(score);

            score = 0;
            count = 0;
        }

        for(int i : scoreArr) {
            System.out.println(i);
        }

    }
}
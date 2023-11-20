import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int[] today = new int[3];
        int[] dday = new int[3];
        int idx1 = 0;
        int idx2 = 0;

        while(st1.hasMoreTokens()) {
            today[idx1] = Integer.parseInt(st1.nextToken());
            idx1++;
        }

        while(st2.hasMoreTokens()) {
            dday[idx2] = Integer.parseInt(st2.nextToken());
            idx2++;
        }

        if((dday[0] - today[0] > 1000) || (dday[0] - today[0] == 1000 && dday[1] > today[1])
                || (dday[0] - today[0]) == 1000 && dday[1] == today[1] && dday[2] >= today[2]) {
            System.out.println("gg");
        } else {
            System.out.println("D-" + (dDaySave(dday) - dDaySave(today)));
        }
    }

    static int[] leapYear(int year) {
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            day[1] = 29;
        }
        return day;
    }

    static long dDaySave(int[] dayArr) {
        long days = 0;
        int[] date;
        for(int i = 1; i < dayArr[0]; i++) {
            date = leapYear(i);
            for(int j = 0; j < 12; j++) {
                days += date[j];
            }
        }
        date = leapYear(dayArr[0]);
        for(int i = 0; i < dayArr[1] - 1; i++) {
            days += date[i];
        }
        days += dayArr[2];
        return days;
    }
}

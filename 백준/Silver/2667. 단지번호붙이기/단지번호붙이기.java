// ver 2
import java.util.*;
import java.io.*;

class Main {
    final static int MAX = 25 + 10;
    static boolean[][] graph;
    static int countPerDanji;
    static int dirY[] = { 1, -1, 0, 0 };
    static int dirX[] = { 0, 0, 1, -1 };

    static void dfs(int y, int x) {
        graph[y][x] = false;
        countPerDanji++;

        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if (graph[newY][newX])
                dfs(newY, newX);
        }
    }

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        graph = new boolean[MAX][MAX];

        // 1. 그래프 정보 입력
        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            for (int j = 1; j <= N; j++)
                graph[i][j] = s.charAt(j - 1) == '1';
        }

        // 2. (1, 1) 부터 (N, N)까지 dfs 수행
        ArrayList<Integer> countList = new ArrayList<>();
        for (int i = 1; i <= N; i++)
            for (int j = 1; j <= N; j++)
                if (graph[i][j]) {
                    countPerDanji = 0;
                    dfs(i, j);
                    countList.add(countPerDanji);
                }

        // 3. 출력
        System.out.println(countList.size());
        Collections.sort(countList);
        for (int i = 0; i < countList.size(); i++)
            System.out.println(countList.get(i));
        br.close();
    }
}

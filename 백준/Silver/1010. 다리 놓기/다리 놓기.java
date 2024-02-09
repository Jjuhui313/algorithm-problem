import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static final int[][] dp = new int[31][31];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String[] temp = br.readLine().split(" ");
			
			int N = Integer.parseInt(temp[0]);
			int M = Integer.parseInt(temp[1]);
			
			System.out.println(func(M, N));
		}
	}
	
	private static int func(int n, int r) {
		if (dp[n][r] > 0) {
			return dp[n][r];
		} else if (n == r || r == 0) {
			return dp[n][r] = 1;
		} else {
			return dp[n][r] = func(n - 1, r - 1) + func(n - 1, r);
		}
	}
}
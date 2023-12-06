import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] numArr = {1, 1, 2, 2, 2, 8};
		
		for(int i = 0; i < 6; i++) {
			numArr[i] = numArr[i] - Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < numArr.length; i++) {
			if(i != numArr.length - 1) {
				System.out.print(numArr[i] + " ");
			} else {
				System.out.print(numArr[i]);
			}
			
		}
		System.out.println();
		
	}

}

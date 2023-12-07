import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char[] cArr = s.toCharArray();
		String reverse = "";
		
		for(int i = cArr.length - 1; i >= 0; i--) {
			reverse += String.valueOf(cArr[i]);
			
		}
		if(reverse.equals(s)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

}

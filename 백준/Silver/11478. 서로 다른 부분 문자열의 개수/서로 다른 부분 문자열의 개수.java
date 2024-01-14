import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main 
{ 
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<>();
		String S = br.readLine();
		
		for(int i = 0; i < S.length(); i++)
		{
			String name = "";

			for(int j = i; j < S.length(); j++)
			{
				name += S.substring(j, j + 1);
				set.add(name);
			}

		}
		System.out.println(set.size());
	}

	
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj10872
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println(factorial(n));

	}


	public static int factorial(int n)
	{
		int result;
		if (n<=0)
		{
			return 1;
		}
		result = n * factorial(n-1);

		return result;
		
	}

}
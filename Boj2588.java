import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj2588
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.println(num1 * (num2%10));
		System.out.println(num1 * (num2%100/10));
		System.out.println(num1 * (num2/100));
		System.out.println(num1 * num2);
	}
}
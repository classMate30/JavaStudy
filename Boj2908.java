import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj2908
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);

		a = (a/100) + ((a%100)/10)*10  + ((a%100)%10)*100;
		b = (b/100) + ((b%100)/10)*10 + ((b%100)%10)*100;

		System.out.println(a > b ? a : b);
	}
}
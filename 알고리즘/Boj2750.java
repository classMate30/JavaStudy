import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj2750
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i=1; i<n; i++)
		{	
			int j;
			int temp =arr[i];

			for (j=i; j>0 && arr[j-1]>temp; j--)
			{
				arr[j] = arr[j-1];
			}
			arr[j]=temp;
		}
		
		for (int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
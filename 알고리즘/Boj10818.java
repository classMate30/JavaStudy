import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Boj10818
{
	public static void main(String[] args) throws IOException
	{
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int max,min;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<arr.length; i++)
		{	
			arr[i] = sc.nextInt();
		}
		max = min = arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] > max)
			{
				arr[i] = arr[i]^max;
				max = max^arr[i];
				arr[i] = arr[i]^max;
			}
			if (arr[i]<min)
			{
				arr[i]= arr[i]^min;
				min=min^arr[i];
				arr[i]=arr[i]^min;
			}
		}	
		System.out.println(min + " " +max);
	}
}
/*
5
20 10 35 30 7


7 35
*/
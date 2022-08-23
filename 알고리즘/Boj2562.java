/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
*/
import java.util.Scanner;
public class Boj2562
{
	public static void main(String[] args)	
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[9];
		int max;
		int max_index=0;
		for (int i=0; i<arr.length; i++)
		{	
			//arr[i] = Integer.parseInt(br.readLine());
			arr[i]=sc.nextInt();
		}
		max = arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (max <arr[i])
			{
				max = arr[i];
				max_index = i+1;	
			}
		}
		System.out.println(max);
		System.out.println(max_index);

	}
}

/*
3
29
38
12
57
74
40
85
61


85
8
*/
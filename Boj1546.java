import java.util.Scanner;
import java.util.Arrays;
public class Boj1546
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		double sum =0;
		double avg;
		for (int i=0; i<n; i++)
		{
			arr[i] = sc.nextDouble();
		}
		

		Arrays.sort(arr);

		for (int i=0; i<n; i++)
		{
			arr[i] = arr[i] / arr[n-1] *100;
			sum += arr[i];
		}
		
		avg = sum/n;
		System.out.println(avg);


	}
}
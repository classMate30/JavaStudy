/*
어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다.
따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
*/

//N이 주어지면 N의 생성자를 찾는다.
//312

/*
*1. for 문으로 N전까지 돌린다.
	
*2. 각 자릿수의 합 + (i)가 N이 된다면 그 값을 출력한다

*3. 생성자가 없을시에 0을 출력한다.
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj2231
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int n = Integer.parseInt(br.readLine());
		int answer =0;
		for (int i=0; i<n; i++)
		{
			//char[] charArr = String.valueOf(i).toCharArray();
			int temp = i;
			int result = i;
			while (temp>=10)
			{
				result += temp %10;
				temp = temp/10;
			}
			result += temp;

			if (result == n)
			{
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}
}
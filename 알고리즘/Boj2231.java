/*
� �ڿ��� N�� ���� ��, �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ��Ѵ�. 
� �ڿ��� M�� �������� N�� ���, M�� N�� �����ڶ� �Ѵ�. ���� ���, 245�� �������� 256(=245+2+4+5)�� �ȴ�.
���� 245�� 256�� �����ڰ� �ȴ�. ����, � �ڿ����� ��쿡�� �����ڰ� ���� ���� �ִ�. �ݴ��, �����ڰ� ���� ���� �ڿ����� ���� �� �ִ�.
�ڿ��� N�� �־����� ��, N�� ���� ���� �����ڸ� ���س��� ���α׷��� �ۼ��Ͻÿ�.
*/

//N�� �־����� N�� �����ڸ� ã�´�.
//312

/*
*1. for ������ N������ ������.
	
*2. �� �ڸ����� �� + (i)�� N�� �ȴٸ� �� ���� ����Ѵ�

*3. �����ڰ� �����ÿ� 0�� ����Ѵ�.
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
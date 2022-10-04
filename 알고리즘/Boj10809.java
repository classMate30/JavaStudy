/*
���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����.
������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

/*
baekjoon
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj10809
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		int flag = -1;
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = -1;
		}
		String s = br.readLine();
		
		for (int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if (arr[ch-97]==-1)
			{
				arr[ch-97] = i;
			}
			
		}

		for (int a : arr)
		{
			System.out.print(a+" ");
		}

	}
}
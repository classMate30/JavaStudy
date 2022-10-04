/*
알파벳 소문자로만 이루어진 단어 S가 주어진다.
각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
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
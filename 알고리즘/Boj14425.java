/*
�� N���� ���ڿ��� �̷���� ���� S�� �־�����.

�Է����� �־����� M���� ���ڿ� �߿��� ���� S�� ���ԵǾ� �ִ� ���� �� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

*/

/*
5 11
baekjoononlinejudge
startlink
codeplus
sundaycoding
codingsh
baekjoon
codeplus
codeminus
startlink
starlink
sundaycoding
codingsh
codinghs
sondaycoding
startrink
icerink

4
*/

/*
1. �ΰ��� ���ڸ� �޾ƿͼ� Key���� String ���� Value���� int������
2. for���� �ΰ������� ���Ë����� ���ؼ� ī��Ʈ ���ְ� �ۼ�
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
public class Boj14425
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> m = new HashMap<>();
		for (int i=0; i<num1; i++)
		{
			m.put(br.readLine(),0);
		}
		int cnt = 0;
		for (int i=0; i<num2; i++)
		{
			if (m.containsKey(br.readLine()))
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}



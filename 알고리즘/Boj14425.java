/*
총 N개의 문자열로 이루어진 집합 S가 주어진다.

입력으로 주어지는 M개의 문자열 중에서 집합 S에 포함되어 있는 것이 총 몇 개인지 구하는 프로그램을 작성하시오.

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
1. 두개의 숫자를 받아와서 Key값에 String 으로 Value값은 int로저장
2. for문을 두개돌려서 들어올떄마다 비교해서 카운트 해주게 작성
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



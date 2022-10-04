//숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다.
//정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.

/*
중복이 없다 -> Set사용

1.n개의 카드를 입력받아서 상근이 카드는 HashSet에 저장해둠
2.m개의 카드를 입력받는데 하나씩 비교해가면서 상근이가 갖고있는 숫자면 1 없는 숫자면 0을 출력해줌


*/
/*
예제 입력
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10

예제 출력
1 0 0 1 1 0 0 1

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;
public class Boj10815
{
	public static void main(String[] args) throws IOException
	{
		HashSet<Integer> s = new HashSet<Integer>();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr ;
		for (int i=0; i<n; i++)
		{
			s.add(Integer.parseInt(st.nextToken()));
		}
		int m = Integer.parseInt(br.readLine());
		
		arr = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++)
		{
			int checkNum= Integer.parseInt(st.nextToken());
			
			if (s.contains(checkNum))
			{
				arr[i] = 1;
			}
			else
			{
				arr[i] = 0;
			}
		}
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}
}

//StringTokenizer 의 nextToken()

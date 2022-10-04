/*
첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 
둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 
넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다.
이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
*/

/*
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10



3 0 0 1 2 0 0 2
*/
/*
1.입력된 값 n에 해당하는 만큼의 int배열을 생성
2.n에 해당하는 만큼 공백을 짤라서 배열 방에 넣어준다.
3.입력된 값 m에 해당하는 만큼의 HashMap을 만들건데, key값에 인트를 받아오고, value값을 0(int)으로 모두 초기화 시켜둔다
4.Iterator를 통해서 key값이 존재하는 숫자를 카운트 해서 존재할때마다 value값 ++;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
public class Boj10816
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strarr = br.readLine().split(" ");
		int[] arr = new int[n];
		Map<Integer,Integer> map1 = new HashMap<Integer,Integer>(n);
		for (int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(strarr[i]);
			map1.put(arr[i], map1.getOrDefault(arr[i],0)+1);
		}

		int m =Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			sb.append(map1.getOrDefault(key, 0)).append(' ');
		}
		
		System.out.println(sb);

	}	
}

/*
--map


--공간낭비가 심함

카운팅 정렬 활용
①중복값이 많고 
②숫자의 범위가 작을때

남풀이... 이해 안됐음...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static final int max = 10000000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] n = new int[max*2+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		for(int i=0; i<N; i++) {
			n[Integer.parseInt(st.nextToken())+max]++;
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] m = new int[M];
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++) {
			sb.append(m[i] = n[Integer.parseInt(st.nextToken())+max]).append(' ');
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
*/





/*
내풀이 시간초과
public class Boj10816
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] strarr = br.readLine().split(" ");
		for (int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(strarr[i]);
		}
		
		
		출력 테스트 Ok!
		for (int i=0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		
		int m = Integer.parseInt(br.readLine());
		String[] strarr2 = br.readLine().split(" ");
		Map<Integer,Integer> map = new HashMap<Integer,Integer>(m);
		for (int i=0; i<m; i++)
		{
			map.put(Integer.parseInt(strarr2[i]),0);
		}
		
		for (int i=0; i<n; i++)
		{
			if (map.containsKey(arr[i]))
			{	
				int value = map.get(arr[i]);
				map.replace(arr[i],value+1);
			}
		}

		for (int i=0; i<m; i++)
		{
			System.out.print(map.get(Integer.parseInt(strarr2[i]))+ " ");
		}
		
	}
}

*/
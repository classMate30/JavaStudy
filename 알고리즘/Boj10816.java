/*
ù° �ٿ� ����̰� ������ �ִ� ���� ī���� ���� N(1 �� N �� 500,000)�� �־�����. 
��° �ٿ��� ���� ī�忡 �����ִ� ������ �־�����. ���� ī�忡 �����ִ� ���� -10,000,000���� ũ�ų� ����, 10,000,000���� �۰ų� ����.

��° �ٿ��� M(1 �� M �� 500,000)�� �־�����. 
��° �ٿ��� ����̰� �� �� ������ �ִ� ���� ī������ ���ؾ� �� M���� ������ �־�����, �� ���� �������� ���еǾ��� �ִ�.
�� ���� -10,000,000���� ũ�ų� ����, 10,000,000���� �۰ų� ����.
*/

/*
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10



3 0 0 1 2 0 0 2
*/
/*
1.�Էµ� �� n�� �ش��ϴ� ��ŭ�� int�迭�� ����
2.n�� �ش��ϴ� ��ŭ ������ ©�� �迭 �濡 �־��ش�.
3.�Էµ� �� m�� �ش��ϴ� ��ŭ�� HashMap�� ����ǵ�, key���� ��Ʈ�� �޾ƿ���, value���� 0(int)���� ��� �ʱ�ȭ ���ѵд�
4.Iterator�� ���ؼ� key���� �����ϴ� ���ڸ� ī��Ʈ �ؼ� �����Ҷ����� value�� ++;
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


--�������� ����

ī���� ���� Ȱ��
���ߺ����� ���� 
������� ������ ������

��Ǯ��... ���� �ȵ���...

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
��Ǯ�� �ð��ʰ�
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
		
		
		��� �׽�Ʈ Ok!
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
//���� ī��� ���� �ϳ��� ������ �ִ� ī���̴�. ����̴� ���� ī�� N���� ������ �ִ�.
//���� M���� �־����� ��, �� ���� �����ִ� ���� ī�带 ����̰� ������ �ִ��� �ƴ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

/*
�ߺ��� ���� -> Set���

1.n���� ī�带 �Է¹޾Ƽ� ����� ī��� HashSet�� �����ص�
2.m���� ī�带 �Է¹޴µ� �ϳ��� ���ذ��鼭 ����̰� �����ִ� ���ڸ� 1 ���� ���ڸ� 0�� �������


*/
/*
���� �Է�
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10

���� ���
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

//StringTokenizer �� nextToken()

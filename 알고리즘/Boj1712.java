/*
�������ڴ� ��Ʈ���� �����ϰ� �Ǹ��ϴ� ȸ���̴�. 
��Ʈ�� �Ǹ� ����� ������� �ų� �Ӵ��, ��꼼, �����, �޿� �� A������ ���� ����� ���,
�� ���� ��Ʈ���� �����ϴ� ������ ����� �ΰǺ� �� �� B������ ���� ����� ��ٰ� �Ѵ�.

���� ��� A=1,000, B=70�̶�� ����. �� ��� ��Ʈ���� �� �� �����ϴ� ���� �� 1,070������ ���, �� �� �����ϴ� ���� �� 1,700������ ���.

��Ʈ�� ������ C�������� å���Ǿ��ٰ� �Ѵ�. 
�Ϲ������� ���� ����� �÷� ���� ���� ��� ���� �� ����(�Ǹź��)�� �� ���(=�������+�������)���� �������� �ȴ�
. ���ʷ� �� ������ �� ��뺸�� ������ ������ �߻��ϴ� ������ ���ͺб���(BREAK-EVEN POINT)�̶�� �Ѵ�.

A, B, C�� �־����� ��, ���ͺб����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
/*
1000 70 170 >11
3 2 1 > -1
2100000000 9 10 >2100000001
*/

/*
1000 + 70x <170x
1000 <100x
10 < x  x=11

a b  <c 
x = a/c-b

3+2x<x
3<-x   -1
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Boj1712
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if (c-b<=0)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(a/(c-b)+1);
		}

	}
	
}
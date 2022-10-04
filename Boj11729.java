/*
�� ���� ��밡 �ְ� ù ��° ��뿡�� �ݰ��� ���� �ٸ� n���� ������ �׿� �ִ�.
�� ������ �ݰ��� ū ������� �׿��ִ�. ���� �����µ��� ���� ��Ģ�� ���� ù ��° ��뿡�� �� ��° ���� �ű�� �Ѵ�.

�� ���� �� ���� ���Ǹ��� �ٸ� ž���� �ű� �� �ִ�.
�׾� ���� ������ �׻� ���� ���� �Ʒ��� �ͺ��� �۾ƾ� �Ѵ�.
�� �۾��� �����ϴµ� �ʿ��� �̵� ������ ����ϴ� ���α׷��� �ۼ��϶�. ��, �̵� Ƚ���� �ּҰ� �Ǿ�� �Ѵ�.

�Ʒ� �׸��� ������ 5���� ����� �����̴�.


ù° �ٿ� �ű� Ƚ�� K�� ����Ѵ�.

�� ��° �ٺ��� ���� ������ ����Ѵ�.
�� ��° �ٺ��� K���� �ٿ� ���� �� ���� A B�� ��ĭ�� ���̿� �ΰ� ����ϴµ�,
�̴� A��° ž�� ���� ���� �ִ� ������ B��° ž�� ���� ���� �ű�ٴ� ���̴�.
*/

import java.util.Scanner;
public class Boj11729
{	
	public static StringBuilder sb = new StringBuilder();
	public static int count = 0;

	public static void hanoi(int n, int x, int y)
	{
		count++;

		if (n>1)
		{
			hanoi(n-1, x,6-x-y);
			
		}

		//System.out.println(x+" " +y);
		sb.append(x+" "+y+"\n");
		if (n>1)
		{
			hanoi(n-1,6-x-y,y);
		}
	}

	public static void main(String[] args)
	{	
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//System.out.println((int)Math.pow(2,n)-1);
		hanoi(n,1,3);
		System.out.println(count);
		System.out.println(sb);
	}
}


/*
import java.util.Scanner;

public class Boj11729
{	
	public static void hanoi(int n, int x, int y)
	{
		if (n>1)
		{
			hanoi(n-1, x,6-x-y);
		}

		System.out.println(x+" " +y);
		
		if (n>1)
		{
			hanoi(n-1,6-x-y,y);
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(Math.pow(2,n)-1);
		hanoi(n,1,3);
	}
}*/
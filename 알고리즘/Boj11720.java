
//���ڿ��� �����ؼ� �ϳ��� �߶�ͼ� ���ؾ���.
//charAt()���� �������� ���� �ƽ�Ű �ڵ���
//�ƽ�Ű �ڵ带 ������������ �ٲٷ��� 48�� �������

import java.util.Scanner;
public class Boj11720
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		int sum=0;

		for (int i=0; i<n; i++)
		{
			sum += s.charAt(i) -48;
		}
		System.out.println(sum);

	}
}
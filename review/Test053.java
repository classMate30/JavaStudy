/*����� ���� �帧�� ��Ʈ��(���) ������
- �ݺ���(while��) �ǽ�
==========================================*/

//�� ����
//	 ����ڷκ��� ������ ������ �Է¹޾�
//	 1���� �Է¹��� �� ����������
//	 ��ü �հ�, ¦���� �հ�, Ȧ���� ����
//	 ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 284
// >> 1 ~ 284 ���� ������ �� : xxxx
// >> 1 ~ 284 ���� ¦���� �� : xxxx
// >> 1 ~ 284 ���� Ȧ���� �� : xxxx
// ����Ϸ��� �ƹ�Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		int i=1, sum=0, oddSum=0, evenSum=0;
		while (i<=n)
		{
			sum += i;
			if (i%2!=0)
				oddSum+=i;
			else if (i%2==0)
				evenSum+=i;
			
			i++;
		}
		System.out.printf(" >> 1 ~ %d ���� ������ �� : %d%n", n, sum);
		System.out.printf(" >> 1 ~ %d ���� Ȧ���� �� : %d%n", n, oddSum);
		System.out.printf(" >> 1 ~ %d ���� ¦���� �� : %d%n", n, evenSum);
	}
}

//���� ���
/*
������ ���� �Է� : 10
 >> 1 ~ 10 ���� ������ �� : 55
 >> 1 ~ 10 ���� Ȧ���� �� : 25
 >> 1 ~ 10 ���� ¦���� �� : 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


������ ���� �Է� : 100
 >> 1 ~ 100 ���� ������ �� : 5050
 >> 1 ~ 100 ���� Ȧ���� �� : 2500
 >> 1 ~ 100 ���� ¦���� �� : 2550
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
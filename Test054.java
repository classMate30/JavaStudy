/*����� ���� �帧�� ��Ʈ��(���) ������
- �ݺ���(while��) �ǽ�
==========================================*/

//����ڷκ��� ���ϴ� ��(������)�� �Է¹޾�
//�ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, 1�� ~ 9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
// �̿� ���� �ȳ��� �� �� ���α׷��� ������ �� �ֵ��� ó���Ѵ�.

// ���� ��)
// ���ϴ� ��(������) �Է� : 7
// 7 * 1 = 7
// 7 * 2 = 14
// 7 * 3 = 21
//	 :
// 7 * 9 = 63
// ����Ϸ��� �ƹ� Ű�� ��������...

//���ϴ� ��(������)�Է� : 11
//1���� 9������ ������ �Է��� �����մϴ�.
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dan;			//-- ����ڷκ��� �Է°��� ���� ���·� ��Ƴ� ���� (��)

		//���� �� ó��
		System.out.print("���ϴ� ��(������) �Է� : ");
		dan = Integer.parseInt(br.readLine());

		if (dan<1 || dan>9)
		{
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");
			return;
		}

		int n=0;
		
		//��� ���(�ݺ� ���)
		while (n<9)
		{
			n++;
			System.out.printf("%d * %d = %d%n", dan , n, (dan*n));
		}
	
	}
}

//���� ���
/* 
���ϴ� ��(������) �Է� : 15
1���� 9������ ������ �Է��� �����մϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
���ϴ� ��(������) �Է� : 4
4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
4 * 6 = 24
4 * 7 = 28
4 * 8 = 32
4 * 9 = 36
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/



/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,i=0;
		int result;
		System.out.print("���ϴ� ��(������) �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		if (n>=1 && n<=9)
		{
			while (n <10)
			{	
				while (i<9)
				{
					i++;
					result = n * i;					
					System.out.println(n + " * " + i + "= " +result);
				}
				n++;
				break;	
			}
		}
		else 
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");

	}

}
*/
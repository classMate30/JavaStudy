/*==========================================
����� ���� �帧�� ��Ʈ��(���) ������
==========================================*/

// break �ǽ�

//�� break Ű���尡 ���ϴ� �ǹ�
//	 ����� + (�׸��� ����������)

//������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
//��, �Է¹޴� ������ 1 ~ 100 �����ȿ����� 
//�����ϵ��� �ۼ��Ѵ�.

//���� ��)

//������ ���� �Է� : -10

//������ ���� �Է� : 0

//������ ���� �Է� : 2022

//������ ���� �Է� :10

//1~10������ �� : 55	
//��� �Ͻðڽ��ϱ�(Y/N) : y

//������ ���� �Է� : 100
//>> 1~100������ �� : 5050
//��� �Ͻðڽ��ϱ�(Y/N) : N
//����Ϸ��� �ƹ�Ű�� ��������...�� ���α׷� ����


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test065
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,s=0;
		char ch;
		while (true)
		{
			do
			{
				System.out.print("������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			for (int i=1; i<=n; i++)
			{
				s += i;
			}
			System.out.printf(">> 1 ~ %d������ �� : %d%n", n, s);

			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			ch = (char)System.in.read();

			if (ch!='Y' && ch!='y')
			{
				break;
			}
			
			System.in.skip(2);


		}

	}
}

//���� ���
/*
������ ���� �Է� : 20
>> 1 ~ 20������ �� : 210
����Ͻðڽ��ϱ�(Y/N)? : y
������ ���� �Է� : 30
>> 1 ~ 30������ �� : 675
����Ͻðڽ��ϱ�(Y/N)? : Y
������ ���� �Է� : 50
>> 1 ~ 50������ �� : 1950
����Ͻðڽ��ϱ�(Y/N)? : N
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
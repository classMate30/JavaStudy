/*����� ���� �帧�� ��Ʈ��(���) ������
- �ݺ���(while��) �ǽ�
==========================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿ܿ� � ���ε�
//			 ������ �������� �ʴ� ��
//			 ��, 1�� �Ҽ� �ƴ�

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ��ƴ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// �Ҽ��� ���� : 1�� �ڽŸ��� �μ��� ���� ��


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=2;
		int num;
		boolean flag = true;

		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		while (n<num)
		{
			if (num%n==0)
			{
				flag = false;
				break;
			}
			n++;

		}
		
		if (flag && num!=1)
			System.out.printf("%d �� �Ҽ�%n", num);
		else
			System.out.printf("%d �� �Ҽ� �ƴ�%n", num);

	}
}

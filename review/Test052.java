/*����� ���� �帧�� ��Ʈ��(���) ������
- �ݺ���(while��) �ǽ�
==========================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// �Է¹��� �� ���� ��
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� :100
// �� ��° ���� �Է� :200
// >> 100 ~ 200������ �� : xxxx
// ����Ϸ��� �ƹ�Ű�� ��������...

// ù ��° ���� �Է� :1000
// �� ��° ���� �Է� : 2
// >> 2~1000 ������ �� : xxxx
// ����Ϸ��� �ƹ�Ű�� ��������...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		int su1, su2;
		int result=0;

		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());

		if (su1>su2)
		{
			su1 = su1 ^ su2;
			su2 = su2 ^ su1;
			su1 = su1 ^ su2;
		}
		
		n = su1;
		while (n<=su2)
		{
			result += n;
			n++;
		}

		System.out.printf("%d ~ %d������ �� : %d%n", su1, su2, result);
	}
}


//���� ���

/*

ù ��° ���� �Է� : 1
�� ��° ���� �Է� : 100
1 ~ 100������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



ù ��° ���� �Է� : 200
�� ��° ���� �Է� : 100
100 ~ 200������ �� : 15150
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, max=0, min=0;
		int sum=0;


		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		if (num1 >= num2)
		{
			max = num1;
			min = num2;
		}
		else if (num2 > num1) // else if ���� �ȵǰ� else�� �Ǵ�����??????????????????
		{						//else�� ������ �ʰ� else if�� ������ ������ �ʱ�ȭ����� �Ѵ�.
			max = num2;
			min = num1;
		}
		
		//�������� i�� ���� while���� ���� ��
		int i = min;
		while (i <= max)
		{
			sum += i;
			i++;
		}
		System.out.printf("%d ~ %d������ �� : %d%n", min, max, sum);

	}
}

*/
/*����� ���� �帧�� ��Ʈ��(���) ������
- if ��
- if ~ else �� �ǽ�
==========================================*/
//����ڷκ��� ������ ���� 5���� �Է¹޾�
//¦����, Ȧ���� �հ踦 ����ϴ� ���α׷��� �����Ѵ�.
//��, Scanner�� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� 5�� �Է�(���� ����) : 1 2 3 4 5

// >> ¦���� ���� 6 �̰�, Ȧ���� ���� 9�Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
public class Test038
{
	public static void main(String[] args)
	{
		//�ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		
		//�� �ʱ�ȭ �ʿ��Ѱ� check~!!!
		// �������� ���� ���� 0���� �ʱ�ȭ!
		int evenSum=0;	//-- ¦���� ���� ��Ƴ� ���� ����
		int oddSum=0;		//-- Ȧ���� ���� ��Ƴ� ���� ����
		int num1, num2, num3, num4, num5;
		//--����ڷκ��� �Է¹��� �ټ� ���� ������ ��Ƴ� ���� ����
				

		//���� �� ó��
		System.out.print("������ ���� 5�� �Է�(���� ����) : "); // 1 2 3 4 5
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if(num1%2==0)		//--num1�� ¦���� ��
			//evenSum�� num1��ŭ �������Ѷ�
			evenSum += num1;
		else				//--num1�� Ȧ���� �� 
			//oddSum�� num1��ŭ �������Ѷ�
			oddSum += num1;

		if(num2%2==0)		//--num2�� ¦���� ��
			//evenSum�� num2��ŭ �������Ѷ�
			evenSum += num2;
		else				//--num2�� Ȧ���� �� 
			//oddSum�� num2��ŭ �������Ѷ�
			oddSum += num2;

		if(num3%2==0)		//--num3�� ¦���� ��
			//evenSum�� num3��ŭ �������Ѷ�
			evenSum += num3;
		else				//--num3�� Ȧ���� �� 
			//oddSum�� num3��ŭ �������Ѷ�
			oddSum += num3;

		if(num4%2==0)		//--num4�� ¦���� ��
			//evenSum�� num4��ŭ �������Ѷ�
			evenSum += num4;
		else				//--num4�� Ȧ���� �� 
			//oddSum�� num4��ŭ �������Ѷ�
			oddSum += num4;

		if(num5%2==0)		//--num5�� ¦���� ��
			//evenSum�� num5��ŭ �������Ѷ�
			evenSum += num5;
		else				//--num5�� Ȧ���� �� 
			//oddSum�� num5��ŭ �������Ѷ�
			oddSum += num5;

		//��� ���
		System.out.printf("\n>> ¦���� ����	%d �̰�, Ȧ���� ���� %d�Դϴ�.\n", evenSum, oddSum);
	}
}

/*
������ ���� 5�� �Է�(���� ����) : 2 4 6 8 10

>> ¦���� ����  30 �̰�, Ȧ���� ���� 0�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� 5�� �Է�(���� ����) : 22 23 24 25 26

>> ¦���� ����  72 �̰�, Ȧ���� ���� 48�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/



/*
������ ���� 5�� �Է�(���� ����) : 11 13 15 17 19

>> ¦���� ����  0 �̰�, Ȧ���� ���� 75�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/

/*
import java.util.Scanner;
public class Test038
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,oddSum = 0,evenSum = 0;

		System.out.print("������ ���� 5�� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		if (a % 2 ==0)
		{
			evenSum += a;
		}
		else if (a % 2 != 0)
		{
			oddSum += a;
		}

		if (b % 2 ==0)
		{
			evenSum += b;
		}
		else if (b % 2 != 0)
		{
			oddSum += b;
		}		

		if (c % 2 ==0)
		{
			evenSum += c;
		}
		else if (c % 2 != 0)
		{
			oddSum += c;
		}

		if (d % 2 ==0)
		{
			evenSum += d;
		}
		else if (d % 2 != 0)
		{
			oddSum += d;
		}

		if (e % 2 ==0)
		{
			evenSum += e;
		}
		else if (e % 2 != 0)
		{
			oddSum += e;
		}

		System.out.printf("¦���� ���� %d �̰�, Ȧ���� ���� %d �Դϴ�.%n",evenSum ,oddSum);
	}	
}
*/
/*==========================================
����� Ŭ������ �ν��Ͻ�������
==========================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// (Calculate Ŭ���� ����)

// ���� ��)
// ������ �� ���� �Է�(���� ����): 10 5
// ������ ������(+ - * /)		:  +
// >> 10 + 5 = 15
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;
class Calculate
{
	//�ֿ� ���� ����
	int su1, su2;			//-- ����ڷκ��� �Է¹��� �� ������ ��Ƴ� ����
	char op;				//-- ����ڷκ��� �Է¹��� �����ڸ� ��Ƴ� ����


	//�޼ҵ� ����(��� : �Է�)
	void input() throws IOException	//���� �޾Ƴ��� �� ���̴� ��ȯ�� �� ���� �� void
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������(+ - * /)		    : ");
		op = (char)System.in.read();
	}

	//�޼ҵ� ����(��� : ����) �� ������ ���굵 ���� ������� ó�� (���� �����ε�,�������̵� ����� �ʾұ� ������)
	//��ȯ �ڷ��� int~!!!
	int cal()
	{
		//int result = -1; // default�� �ؿ�ó�� �ֳ� �̷��� �ֳ� �Ȱ���
		int result = 0;
		switch (op)
		{
			case '+' :result = su1 + su2; break;
			case '-' :result = su1 - su2; break;
			case '*' :result = su1 * su2; break;
			case '/' :result = su1 / su2; break;
			//default  :result = -1;
		}

		return result;
	}
	

	//�޼ҵ� ����(��� : ���)
	void print(int s)		//�Է¹��� ������ su1,op,su2�� ������ ������ ����� �ָ�ǰڴ�
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s);
	}

}


public class Test073
{
	public static void main(String[] args) throws IOException
	{
		Calculate cal = new Calculate();

		cal.input();			//-- ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		int r= cal.cal();		//-- ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		cal.print(r);			//-- ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��

	}
}
/*import java.util.Scanner;
import java.io.IOException;
class Calculate
{	
	//�ֿ� ���� ����
	int a, b;
	char o;
	double num;
	
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����)");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("������ ������[+ - * /] : ");
		o = (char)System.in.read();
	}

	double calculate()
	{
		if (o=='+')
			num = a + b;
		else if(o=='-')
			num = a - b;
		else if (o=='*')
			num = a * b;
		else if (o=='/')
			num = (double)a / b;

		return num;
	}

	void print(double num)
	{
		System.out.printf("%d %c %d = %.2f\n", a, o, b, num);
	}	
}


public class Test073
{
	public static void main(String[] args) throws IOException
	{

		Calculate ob = new Calculate();
		ob.input();
		
		double num = ob.calculate();

		ob.print(num);
	}
}
*/

// ���� ���

/*
������ �� ���� �Է�(���� ����) : 10 5
������ ������(+ - * /)              : +
>> 10 + 5 = 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
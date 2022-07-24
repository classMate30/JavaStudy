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
	int su1, su2;
	char op;

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������( + - * /) : ");
		op = (char)System.in.read();
	}

	int cal()
	{
		int result =-1;
		switch (op)
		{

		case '+': result = su1 + su2; break;
		case '-': result = su1 - su2; break;
		case '*': result = su1 * su2; break;		
		case '/': result = su1 / su2; break;
		}
		return result;
	}
	
	void print(int a)
	{
		System.out.printf(">> %d %c %d = %d%n", su1, op, su2, a);
	}
}
public class Test073
{
	public static void main(String[] args) throws IOException
	{
		Calculate cal = new Calculate();
		cal.input();
		cal.print(cal.cal());
	
	}
}
/*
������ �� ���� �Է�(���� ����) : 10 5
������ ������( + - * /) : +
>> 10 + 5 = 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
/*
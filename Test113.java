/*======================================
   ���� Ŭ���� ��� ����
   -���(Inheritance)
=======================================*/

//������ ���� ���α׷��� �����Ѵ�
//��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5
// ����Ϸ��� �ƹ� Ű�� ��������...

//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}
class Bclass extends Aclass
{
	/* ������� �������� �͵�
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/
	Bclass()
	{
		//super(); ������ ȣ��� �ڵ����� �θ��� ������ �̷��� ȣ���ؿ�
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		String temp = br.readLine();			//���ڿ��� ��°�� �޾ƿ��� ����  "20 15"
		
		//�ع��ڿ�. ���� ��밡��	���±��� temp.length / temp.substring ���
		//  ���ڿ�.split("������")
		//  ���ڿ�.split("\\s");			//--������ �����
		//	ex) "10 20 30 40 50".split("\\s");
		//		�� ��ȯ �� {"10", "20", "30", "40", "50"}
		
		//	ex) "010-1234-4567".split("-");
		//		�� ��ȯ �� {"010", "1234", "4567"}

		String[] strArr = temp.split("\\s");	//���ڿ��� �迭�� ��ȯ
		
		if(strArr.length != 2)
			return false;
		//-- false�� ��ȯ�ϸ� input() �޼ҵ� ����
		//	 �� ������ �����Ͽ� if���� �����ϰ� �� ���
		//	 �Ʒ� �����ؾ� �� �ڵ尡 �����ִ���
		//	 �����(false)�� ��ȯ�ϸ� �޼ҵ�� ����ȴ�
		
		x =	Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		
		if (op!='+' && op!='-' && op!='*' && op!='/')	//or �ƴ� check~!!
		{
			return false;
		}
		
		return true;
		/*
		if(op=='+' || op=='-' || op=='*' || op=='/')	//������ ���� ����
		{
			return true;
		}
		
		
		return false;
		*/
	}	//close input()


	double calc()
	{
		double result = 0;
		
		switch (op)
		{
		case '+': result = x+y; break;
		case '-': result = x-y; break;
		case '*': result = x*y; break;
		case '/': result = (double)x/y;
		
		}
		
		return result;

	}//end calc()


}//close class Bclass


public class Test113
{
	public static void main(String[] args) throws IOException
	{	
		Bclass ob = new Bclass();
		
		//ob.input()
		if (ob.input()==false)
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();
		ob.write(result);
		
		
		/*
		ob.input();
		double result = ob.cal();
		ob.write(result);
		*/
	}
}


/*
class Bclass extends Aclass 
{	
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
	}
	public double cal()
	{	
		double result=0;
		
		switch (op)
		{
		case '+' : result = x+y; break;
		case '-' : result = x-y; break;
		case '*' : result = x*y; break;
		case '/' : result = (double)x/y; break;
		}
		return result;
	}

}
		/*
		if (op=='+')
			result = x + y;
		else if (op=='-')
			result = x - y;
		else if (op=='*')
			result = x * y;
		else if (op=='/')
			result = (double)x / y;
		return
			result;
		*/



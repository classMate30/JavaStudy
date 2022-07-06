/*����� ���� �帧�� ��Ʈ��(���) ������
- switch �� �ǽ�
==========================================*/

//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, switch���� Ȱ���Ͽ� ó�� �� �� �ֵ��� �ϸ�,
//���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

//���� ��)
//ù ��° ���� �Է� : 3
//�� ��° ���� �Է� : 17
//������ �Է�[+ - * /]

// >> 3 -17 = -14
// ����Ϸ��� �ƹ�Ű�� ��������

// ���° ���
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result = 0;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		switch (op)
		{
		case '+':result = a + b; break;
		case '-':result = a - b; break;
		case '*':result = a * b; break;
		case '/':result = a / b; break;
		default : return;	//�ؿ� ������ ���� �޼ҵ� �����ض� 
		}
		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);

	}
}

/*
ù ��° ���� �Է� : 14
�� ��° ���� �Է� : 6
������ �Է�[+ - * /] : -

>> 14 - 6 = 8
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/

/* ��
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int a, b, result=0;
		int op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("ù ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read();

		// + �� op :43 , - �� op :45 , * �� op : 42, / �� op : 47
		
		switch (op)
		{
		case 43: result = a + b; break;
		case 45: result = a - b; break;
		case 42: result = a * b; break;
		case 47: result = a / b; break;
		default: return; //1.���� ��ȯ�Ѵ�
						 //2.�ڸ޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� �����
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d%n", a, op, b, result);
	}
}

*/

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, op, result = 0;	
		char op1;
		
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� : ");
		op = System.in.read(); //+ 43 -45 *42 /47

		switch (op)
		{
		case 43: result = num1 + num2; break;
		case 45: result = num1 - num2; break;
		case 42: result = num1 * num2; break;
		case 47: result = num1 / num2; break;
		}
		op1 =(char)op;

		System.out.println(">>" + num1 + op1 +num2+" = " +result);

	}
}
*/
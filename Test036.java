/*=======================================
����� ���� �帧�� ��Ʈ��(���) ������
- if ��
- if ~ else �� �ǽ�
==========================================*/
// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//    if ��, if ~ else��, ���� ������, ���� if ��(if�� ��ø)
//    , switch ���� �ִ�.

// 2. if ���� if ������ ������ ���� ���
//    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.


//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, if ���ǹ��� Ȱ���Ͽ� ó�� �� �� �ֵ��� �ϸ�,
//���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.


//���� ��)
//ù ��° ���� �Է� : 10
//�� ��° ���� �Է� : 3
//������ �Է� [ + - * /]

// >> 10 + 3 = 13
// ����Ϸ��� �ƹ�Ű�� ��������...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test036
{
	public static void main(String[] args) throws IOException
	{
		//����	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result = 0;
		char op;
		
		System.out.print("ù ��° ���� �Է�		:");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�		:");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /]	:");
		op = (char)System.in.read();

		if (op == '+') //������Ʈ��Ʈ �ϳ��϶� {}���� ���� ���Ͽ� ����
			result = a + b;
		else if (op == '-')
			result = a - b;
		else if (op == '*')
			result = a * b;
		else if (op == '/')
			result = a / b;

		System.out.printf("\n>> %d %c %d = %d%n", a, op, b, result); 
	}
}

		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, op;			//-- ù ��°, �� ��° ����, ������ check~!!!
		System.out.print("ù ��° ���� �Է� : "); 
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		//Integer.parseInt()
		//"1234" �� Integer.parseInt() �� 1234
		//"abdc" �� Integer.parseInt() �� (X) ���� �߻�(numberformatException)

		// System.in.read()�� ��Ʈ������ �ƽ�Ű�ڵ� ���� ��ȯ

		System.out.print("������ [+ - * /] : ");
		// op = (char)Integer.parseInt(br.readLine()); ��� �Ұ� "+" ���ڿ� ����x
		
		op =System.in.read();

		if (op == 43) //����ڰ� �Է��� �����ڰ� �����̶��
		{
			//a �� b�� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == 45)
		{
			//a �� b�� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == 42)
		{
			//a �� b�� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == 47)
		{
			//a �� b�� ������ ���� �����Ͽ� ���
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else 
		{
			System.out.println("\n>> �Է� ������ ������ �����մϴ�.");
		}
	}
}
*/
		
		//����
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, op;			//-- ù ��°, �� ��° ����, ������ check~!!!
		System.out.print("ù ��° ���� �Է� : "); 
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		//Integer.parseInt()
		//"1234" �� Integer.parseInt() �� 1234
		//"abdc" �� Integer.parseInt() �� (X) ���� �߻�(numberformatException)

		// System.in.read()�� ��Ʈ������ �ƽ�Ű�ڵ� ���� ��ȯ

		System.out.print("������ [+ - * /] : ");
		// op = (char)Integer.parseInt(br.readLine()); ��� �Ұ� "+" ���ڿ� ����x
		
		op =System.in.read();

		if (op == 43) //����ڰ� �Է��� �����ڰ� �����̶��
		{
			//a �� b�� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == 45)
		{
			//a �� b�� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == 42)
		{
			//a �� b�� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == 47)
		{
			//a �� b�� ������ ���� �����Ͽ� ���
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else 
		{
			System.out.println("\n>> �Է� ������ ������ �����մϴ�.");
		}
	}
}
*/


/*
ù ��° ���� �Է� : 45
�� ��° ���� �Է� : 1
������ [+ - * /] : +

>> 45 + 1 = 46
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

	
*/


		//����
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;			//-- ù ��°, �� ��° ����
		char op;			//-- ������

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		//Integer.parseInt()
		//"1234" �� Integer.parseInt() �� 1234
		//"abdc" �� Integer.parseInt() �� (X) ���� �߻�(numberformatException)

		// System.in.read()�� ��Ʈ������ �ƽ�Ű�ڵ� ���� ��ȯ

		System.out.print("������ [+ - * /] : ");
		// op = (char)Integer.parseInt(br.readLine()); ��� �Ұ� "+" ���ڿ� ����x
		
		op =(char)System.in.read();

		if (op == '+')
		{
			//a �� b�� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == '-')
		{
			//a �� b�� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == '*')
		{
			//a �� b�� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == '/')
		{
			//a �� b�� ������ ���� �����Ͽ� ���
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else 
		{
			System.out.println("\n>> �Է� ������ ������ �����մϴ�.");
		}


		//������ �� �������� �׽�Ʈ Ȯ��
		//System.out.println("�Է��� ������ : " +op);
		
		//����ڰ� �Է��� �����ڰ� '+'���
		//a �� b�� ���� ���� �����Ͽ� ���

		//����ڰ� �Է��� �����ڰ� '-'���
		//a �� b�� ���� ���� �����Ͽ� ���
		
		//����ڰ� �Է��� �����ڰ� '*'���
		//a �� b�� ���� ���� �����Ͽ� ���

		//����ڰ� �Է��� �����ڰ� '/'���
		//a �� b�� ������ ���� �����Ͽ� ���


		
	}
}
*/

/*
 ���� �� Ǯ��
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test036
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, numResult = 0;
		char mark =	' ' ;

		//��������� �Է� �޾ƿ�
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� [+ - * /] ");
		mark = (char)System.in.read();

		//���� �� ó��
		if (mark == '+')
		{
			numResult = num1 + num2;
		}
		else if (mark == '-')
		{
			numResult = num1 - num2;
		}
		else if (mark == '*')
		{
			numResult = num1 * num2;
		}
		else if (mark == '/')
		{
			numResult = num1 / num2;
		}
		System.out.println();
		System.out.printf(">> %d %c %d = %d%n", num1, mark, num2, numResult);

	}
}
*/
/*

		//��������� �Է� �޾ƿ�
		System.out.print("ù ��° ���� �Է� : ");
		num1 = System.in.read();
		System.in.skip(2);

		System.out.print("�� ��° ���� �Է� : ");
		num2 = System.in.read();
		System.in.skip(2);

		System.out.print("������ �Է� : ");
		mark = (char)System.in.read();

*/
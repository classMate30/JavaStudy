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
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int a, b, result=0;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		switch (op )
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		default : return;
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d%n", a, op, b, result);



	}

}

//���� ���
/*
ù ��° ���� �Է� : 3
�� ��° ���� �Է� : 17
������ �Է�[+ - * /] : -

>> 3 - 17 = -14
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 3
�� ��° ���� �Է� : -17
������ �Է�[+ - * /] : -

>> 3 - -17 = 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
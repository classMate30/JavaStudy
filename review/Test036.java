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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� [ + - * /]");
		op = (char)System.in.read();

		if (op == '+')
			System.out.printf("%d + %d = %d%n",num1,num2,num1+num2);
		else if (op =='-')
			System.out.printf("%d - %d = %d%n",num1,num2,num1-num2);
		else if (op == '*')
			System.out.printf("%d * %d = %d%n",num1,num2,num1*num2);
		else if (op == '/')
			System.out.printf("%d / %d = %d%n",num1,num2,num1/num2);
		else 
			System.out.print("���� �Ұ�~!!!%n");
		
		
	}
}

//���� ���

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 3
������ �Է� [ + - * /]+
10 + 3 = 13
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
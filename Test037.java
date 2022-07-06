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


//����ڷκ��� ������ ���� ������ �Է� �޾�
//���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�

//���� ��)
//ù ��° ���� �Է� : 753
//�� ��° ���� �Է� : 42
//�� ��° ���� �Է� : 127

//>> ���� ��� : 42 127 753
//����Ϸ��� �ƹ� Ű�� ��������...
/* ���� : ���ϴ� ���� /�ڸ��ٲٴ� ������ ���������� �̷���� ��

		8		20		75			123		87		65
		----------					---		---
									87		123		65
		--				--			----			---
				----------			65		123		87
											---		---
									65		87		123


*/

// �� ù ��° ���� vs �� ��° ���� ũ�� ��
//	  ��ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

// �� ù ��° ���� vs �� ��° ���� ũ�� ��
//	  ��ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

// �� �� ��° ���� vs �� ��° ���� ũ�� ��
//	  ��� ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;		//--����ڰ� �Է��ϴ� ������ ������ ��Ƶ� ����

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		if (a > b) //�� ù ��° ���� vs �� ��° ���� ũ�� ��
		{
			//�ڸ� �ٲ�(a�� b)
			a = a^b;
			b = b^a;
			a = a^b
		}
		
		if (a > c)	//�� ù ��° ���� vs �� ��° ���� ũ�� ��
		{
			//�ڸ� �ٲ�(a�� c)
			a = a^c;
			c = c^a;
			c = a^c;
		}

		if (b > c)	// �� �� ��° ���� vs �� ��° ���� ũ�� ��
		{
			//�ڸ� �ٲ�(b�� c)
			b = b^c;
			c = c^b;
			b = b^c;
		}
		// �� ù ��° ���� vs �� ��° ���� ũ�� ��
		//	  ��ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

		// �� ù ��° ���� vs �� ��° ���� ũ�� ��
		//	  ��ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

		// �� �� ��° ���� vs �� ��° ���� ũ�� ��
		//	  ��� ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�
		
		System.out.printf("
		//if 
		//if
		//if ������ ó���ؾ��� if else if �ٷ� ���� �ٸ��� ó�� ���ϱ� ����
	}
}


/* ���� �� Ǯ��
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test037
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, num3 , max, min, cen, temp;
		
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		max = num1;
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num3 = Integer.parseInt(br.readLine());
		
		if (num1 >= num2 && num1 >= num3 && num2 >= num3)
			System.out.printf(">> ���� ��� : %d %d %d%n", num3, num2, num1);
		else if (num1 >= num2 && num1 >= num3 && num3 >= num2)
			System.out.printf(">> ���� ��� : %d %d %d%n", num2, num3, num1);
		else if (num2 >= num1 && num2 >= num3 && num1 >= num3)
			System.out.printf(">> ���� ��� : %d %d %d%n", num3, num1, num2);
		else if (num2 >= num1 && num2 >= num3 && num3 >= num1)
			System.out.printf(">> ���� ��� : %d %d %d%n", num1, num3, num2);
		else if (num3 >= num1 && num3 >= num2 && num1 >= num2)
			System.out.printf(">> ���� ��� : %d %d %d%n", num2, num1, num3);
		else if (num3 >= num1 && num3 >= num2 && num2 >= num1)
			System.out.printf(">> ���� ��� : %d %d %d%n", num1, num2, num3);
		else
			System.out.println("�Է� ����");
	}
}
*/


// 1 
// 2 
// 3 3>2>1

//������ ���
//1. a-b ������ ��� ���� ���ؼ� �� ���� 
//2. max , min �� �ʱ�ȭ �ϴ� ��� ��� �ϴ°ɱ�? �������� �����ΰ�?????
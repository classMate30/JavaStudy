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

// ����ڷκ��� ������ ������ �Է¹޾�
// Ȧ�� / ¦���� �Ǻ��ϴ� ���α׷��� �����Ѵ�.
// Ȧ�� , ¦�� �� ���� if���� 

// Ȧ�� , ¦�� , �� �� if �� ��ø
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;

		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		
		String result = "���� �Ұ�";
		if (num==0)
		{
			result = "��";
		}
		else if (num%2==0)
		{
			result = "¦��";
		}
		else if (num%2!=0)
		{
			result = "Ȧ��";
		}
		//else
		//{
		//	result = "�����Ұ�"
		//}
		
		System.out.println(num+ " ��" + result);


		/*if (num % 2 !=0)
		{
			System.out.println(num + " �� Ȧ��");
		}
		else if (num ==0)
		{
			System.out.println(num + " �� ��");
		}
		else if (num % 2 ==0)
		{
			System.out.println(num + " �� ¦��");
		}
	*/
		/*
		if (num % 2 == 0)
		{
			System.out.printf(">> %d��(��) ¦���Դϴ�.%n", num);
		}
		else if(num % 2 != 0) 
		{
			System.out.printf(">> %d��(��) Ȧ���Դϴ�.%n", num);
		}
		else
		{
			System.out.println(n+ "��(��) ���Դϴ�.");
		}
		*/
	
	}
}
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
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int num;

		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		if (num%2!=0)
			System.out.printf("%d �� Ȧ�� %n", num);
		if (num%2==0)
		{
			if (num==0)
				System.out.printf("%d �� �� %n", num);
			
			else if (num!=0)	
				System.out.printf("%d �� ¦�� %n", num);
		}


	}
}

//���� ���

/*
������ ���� �Է� : 7
7 �� Ȧ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 20
20 �� ¦��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



������ ���� �Է� : 0
0 �� ��
 ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/
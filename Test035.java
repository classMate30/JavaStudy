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

// �� ����
//	  ����ڷκ��� ������ ������ �Է¹޾�
//	  �Է¹��� ������... ��������, ������� �Ǻ��Ͽ�
//	  �� ����� ����ϴ� ���α׷��� �����Ѵ�
//	  ��, �Է��� BufferedReader�� Ȱ���ϰ�,
//	  if ���ǹ��� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�.

//4�ǹ�� 366
//100�ǹ�� 365
//400�� ��� 366

// ���� ��)
//������ ���� �Է� : 2000
// 2000 �� ����
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� : 2012
// 2012 �� ����
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� : 2022
// 2022 �� ���
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;

		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		if (year % 400 == 0)
		{
			System.out.printf("%d �� ����%n", year);
		}
		else if (year % 100 == 0)
		{
			System.out.printf("%d �� ���%n", year);
		}
		else if (year % 4 == 0)
		{
			System.out.printf("%d �� ����%n", year);
		}
		else if (year % 400 != 0 || year % 100 != 0 || year % 4 !=0)
		{
			System.out.printf("%d �� ���%n", year);
		}
		else 
		{
			System.out.printf("%d �� �����Ұ�%n", year);
		}
	}
}
/*=======================================
����Ῥ����(Operator)������
- ���� ������ == ���� ������
==========================================*/
//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������...�������� ������� �Ǻ��Ͽ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, �Է��� BufferedReader�� Ȱ���ϰ�
//���� �����ڸ� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�.

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

// �� ������ �Ǻ� ����
//	  ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//	  400�� ����̸� ����
//    �׷��� ������ ���

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		String strResult;

		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		strResult = (year%4==0 && year%100!=0) || year%400==0 ? "����" : "���";
		//strResult = (year % 400 == 0) ? "����" : (year % 4 == 0 && year % 100 != 0) ? "����" : "���";
		System.out.printf("%d �� %s%n", year, strResult);
	}
}
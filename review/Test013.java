/*=====================================================
 ������ �ڹ��� ���� �� Ư¡ ������
 -������ �ڷ���
 -�ڹ� �⺻ ����� : Quiz
=======================================================*/
/* ����
	�ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
	�� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�


���࿹)
	��ﰢ���� ���� ���ϴ� ���α׷���
	-�ﰢ���� �غ� �Է� :
	-�ﰢ���� ���� �Է� : 

	>>�غ��� ?, ���̰� 5�� �ﰢ���� ���� : xxxx
	����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test013
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int underLength, height;
		double area;

		System.out.println("��ﰢ���� ���� ���ϴ� ���α׷���");
		System.out.print("�ﰢ���� �غ� �Է� : ");
		underLength = Integer.parseInt(br.readLine());
		System.out.print("�ﰢ���� ���� �Է� : ");
		height = Integer.parseInt(br.readLine());
		

		area = underLength * height / 2.0;
		//System.out.printf("�غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f%n", underLength, height, (underLength*height/2.0));
		System.out.printf("�غ��� %d, ���̰� %d�� �ﰢ���� ���� %.2f%n", underLength, height, area);

	}
}

//���� ���

/*
��ﰢ���� ���� ���ϴ� ���α׷���
�ﰢ���� �غ� �Է� : 10
�ﰢ���� ���� �Է� : 50
�غ��� 10, ���̰� 50�� �ﰢ���� ���� 250.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*=======================================
����Ῥ����(Operator)������
- ���� ������ == ���� ������
==========================================*/
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����ʹ� BufferedReader�� Ȱ���ϰ�
// ���� ������(���� ������)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : -12
// -12 �� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 257
// 257 �� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� : 0
// 0 �� ��
// ����Ϸ��� �ƹ� Ű�� ��������...

//��Ʈ : ���ǿ����� ��ø

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n;
		String strResult;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		strResult = n==0 ? "��" : (n>0)? "���" : "����";

		System.out.printf("%d �� %s%n", n, strResult);
	
	}
}

//���� ���
/*
������ ���� �Է� : -12
-12 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 257
257 �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


������ ���� �Է� : 0
0 �� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .




*/
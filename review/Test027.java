/*=======================================
����Ῥ����(Operator)������
- ���� ������ == ���� ������
==========================================*/
/*

				����������������
	�ǿ����� ������ �ǿ����� ������ �ǿ�����
	--------		-------		   --------
		1��			  2��			  3��

	�ǿ����� ? �ǿ����� : �ǿ�����
	--------   -------	 --------
		1��	     2��			3��

	1���� ���� ���	�� true		�� 2�� ����(ġȯ)
					�� false		�� 3�� ����(ġȯ)
*/
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ ¦������ Ȧ������ �Ǻ��ϴ� ���α׷��� �����Ѵ�
// ��, ���ǿ�����(���׿�����)�� Ȱ���Ͽ� ������ �ذ� �� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� 251

// ===[�Ǻ� ���]===
// 251 �� Ȧ��
// =================
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test027
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String even = "¦��" , odd = "Ȧ��";
		String strResult;
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		strResult = n%2!=0 ? odd : even;
		
		System.out.println("===[�Ǻ� ���]===");
		System.out.printf("%d �� %s%n", n, strResult);
		System.out.println("=================");
	}
}

//���� ���
/*
������ ���� �Է� : 250
===[�Ǻ� ���]===
250 �� ¦��
=================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 251
===[�Ǻ� ���]===
251 �� Ȧ��
=================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/
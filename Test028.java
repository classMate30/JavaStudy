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


//���� �ۼ��� �ڵ�

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		String strResult;
	
		System.out.print("������ ���� �Է�: " );
		n = Integer.parseInt(br.readLine());
		/*
		n�� 0���� ũ��	�� true		��n�� ���
						�� false		��n�� 0���� �۴�		��	true	��n �� ����	
																��	false	��n �� ��
		
		*/	

		strResult = (n > 0) ? ("���") :((n < 0) ? "����" : "��");

		//System.out.printf("%d �� %s%n", n, strResult);
		System.out.println(n + " �� " + strResult);
/* ���� �ۼ��� �ڵ�
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1;
		String strResult;
	
		System.out.print("������ ���� �Է�: " );
		num1 = Integer.parseInt(br.readLine());
		//br.readLine();
		//Integer.parseInt(br.readLine());
		//num1 = Integer.parseInt(br.readLine());
		
		
		//strResult = (num1 > 0) ? "���" : "����";
		strResult = (num1 == 0) ? "��" : ((num1 >0) ? "���" : "����");


		System.out.printf("%d �� %s\n", num1, strResult);
*/
	}
}

/*
������ ���� �Է�: 5
5 �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�: -3
-3 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


������ ���� �Է�: 0
0 �� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
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
		int a, b, c;
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());
		if (a>b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}
		if (a>c)
		{
			a = a^c;
			c = c^a;
			a = a^c;
		}
		if (b>c)
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}
		
		System.out.printf(">> ���� ��� %d %d %d%n", a, b, c);
		
	}
}
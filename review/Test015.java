/*=======================================
������ڹ� �⺻ ���α׷��� ������
-������ �ڷ���
-�ڹ��� �⺻ ����� : System.in.read();
==========================================*/
/*
��System.in.read()���޼ҵ�� (�Է� ��⿭�κ���) �� ���ڸ� �����´�
��, �Է� ���� �ϳ��� ���ڸ� ���� �״�� �������� ���� �ƴ϶�
ASCII Code ������ ��ȯ�Ѵ�.
*/

//���� ��)
//�� ���� �Է�		: A
//�� �ڸ� ���� �Է�	: 9

// >> �Է��� ���� : A
// >> �Է��� ���� : 9
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		char ch;
		int n;

		char temp;

		System.out.print("�� ���� �Է�       : ");
		ch = (char)System.in.read();

		System.in.skip(2);	
		System.out.print("�� �ڸ� ���� �Է�  : ");
		n= System.in.read();

		n -= 48;
		
		
		System.out.println();
		System.out.println("�Է��� ���� : " + ch);
		System.out.println("�Է��� ���� : " + n);
		
	
	}
}
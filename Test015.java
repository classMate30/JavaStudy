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

		//�ֿ� ���� ����
		char ch;					//--�Է¹��� ���ڸ� ���� ����
		int n;						//--�Է¹��� ������ ���� ����


		//�߰� ���� ����
		char temp;					//�ӽ÷� �߰� ������ ����


		//���� �� ó��
		//-����ڿ��� �ȳ� �޼��� ���
		System.out.print("�� ���� �Է�          : ");
		ch = (char)System.in.read();

		//�Է� ��⿭�� �����ִ� ��\r������\n���� ��ŵ�Ѵ�.(�ǳʶٱ�)
		System.in.skip(2);
		//�Ű�����(2)�� ���� �� ���ڸ� �о�� �ʰ� �ǳʶڴ�.(������)

		System.out.print("�� �ڸ� ���� �Է�     : ");
		n = System.in.read();
		//temp = (char)System.in.read();


		//1 �� 49
		//2 �� 50
		//3 �� 51
		//	...

		//9 �� 57
		n -= 48;




		//��� ���
		System.out.println();
		System.out.println("�Է��� ���� : " + ch);
		System.out.println("�Է��� ���� : " + n);
		//System.out.println(">>�Է��� ���� : "+n);
		//System.out.println("�Է��� ���� : " +temp);

		/* ���� �ۼ� �� �� , ���ڸ� �ǰ� �������� �ķ�� �Ѿ

		char ch;
		int a;

		System.out.print("�� ���� �Է� : ");
		ch=(char)System.in.read();
		System.out.print("�� �ڸ� ���� �Է� : ");
		a =  (int)System.in.read();

		System.out.println();
		System.out.println("�Է��� ���� : " + ch);
		System.out.println("�Է��� ���� : " + a);
		*/



		/*//�ֿ� ���� ����
		char ch;			//--����

		//���� �� ó��
		System.out.print("���� �ϳ� �Է��ϼ��� : ");       //A
		ch = (char)System.in.read();				      // 65(��Ƽ������)->���� �� ��ȯ

		//��� ���
		System.out.println(ch);
		*/

	}
}
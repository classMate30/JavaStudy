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

/* �ع��� �ν� �� �м�
	�ﰢ���� ����= �غ� * ����/2
	����ڷκ��� �����͸� �Է¹޾� ó�� �� BufferedReader Ȱ��
	BufferedReader�� ������ ���? �Ѱ����?
*/
//�������̶� ���� �ۼ��� �ڵ�
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test013
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ����

		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�غ� ���� ����
		int underLength, height;		//--�غ��� ���� ���� ����
		double area;					//--����   �Ǽ����·� �����ؾ��Ѵ�.check!!!
		

		//���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.println("�� �ﰢ�� ���� ���ϴ� ���α׷���");
		System.out.print(" - �ﰢ���� �غ� �Է� : ");
		

		// �� ����ڰ� �Է��� ������ ���� underLength�� ��Ƴ���
		underLength = Integer.parseInt(br.readLine());

		// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print(" - �ﰢ���� ���� �Է� : ");

		// �� ����ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ�� �� ���� height�� ��Ƴ���
		height = Integer.parseInt(br.readLine());
		
		// �� �ﰢ���� ���� ���ϴ� ����ó��
		//	  �ﰢ���� ���� = �غ�*���� /2
		//area = underLength * height / 2;
		//		������		 ������ / ������ �� ���� ��� ���� (��, ���� ���ϰ� �������� ����)
		area = underLength * height / 2.0;     //check
		//		������		 ������   �Ǽ��� �� �Ǽ� ��� ����
		
		//�� �Ǽ� �ڷ����� ��������� ������ ��������
		//	 �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//	 ������ ��2���� �ƴ�, �Ǽ������� ��2.0������ ������ ������ �����ϰ� �Ǹ�
		//	 �� ������ �Ǽ� ������� ó���ȴ�.


		//area=(double)(underLength * height / 2);        (X)
		//area=(double)underLength * height / 2;
		//area=underLength * (double)height / 2;
		//��� ���
		

	}
}

/*���� �ۼ��� ��
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;

		double c;

		System.out.println("��ﰢ���� ���� ���ϴ� ���α׷���");
		System.out.print("�ﰢ���� �غ� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�ﰢ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		c = (a*b)/2.0;

		System.out.printf("�غ��� %d,�̸� , ���̰� %d�� �ﰢ���� ���� : %.1f%n",a,b,c);
*/
	
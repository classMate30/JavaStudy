/*=======================================
������ڹ� �⺻ ���α׷��� ������
-������ �ڷ���
-�ڹ��� �⺻ ����� : BufferedReader Ŭ����
==========================================*/
//����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
//�̸��� ������ ����ϴ� ���α׷��� �����Ѵ�

//���� ��)
// �̸��� �Է��ϼ��� : ������
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70


//===========[���]=========
// �̸�: ������
// ���� : 240
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args)
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//�ֿ亯�� ����
		String strName;
		int nKor, nEng, nMat;
		int nTot
		String strTemp;		//���ڿ� �ӽ� ���� ����
	
		//���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� :");

		//- ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();

		//- ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է�:");
		
		//-����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		//- ��Ƴ� �����͸� ��ȯ�� �ʿ��� ������ �ٽ� ���
		nKor = integer.parseInt(strTemp);

		//-����ڿ��� �ȳ� �޼��� ���(��������)
		System.out.print("���� ���� �Է�:");

		//-����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		//-��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
		nEng = Integer.parseInt(strTemp);

		//- ����ڿ��� �ȳ� �޼��� ���(��������)
		System.out.print
	


	




	}
	/*public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int korean, english, math;
		int sum;

		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine();
		System.out.print("���� ���� �Է�: ");
		korean = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է�: ");
		english = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է�: ");
		math = Integer.parseInt(br.readLine());

		sum = korean + english + math;

		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+ sum);
		
	}
}*/

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
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strName;
		int nKor, nEng, nMat;
		int nTot;
		String strTemp;

		System.out.print("�̸��� �Է��ϼ��� : ");
		strName = br.readLine();

		System.out.print("���� ���� �Է� : ");
		strTemp = br.readLine();
		nKor = Integer.parseInt(strTemp);

		System.out.print("���� ���� �Է� : ");
		strTemp = br.readLine();
		nEng = Integer.parseInt(strTemp);

		System.out.print("���� ���� �Է� : ");
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);

		nTot = nKor + nEng + nMat;

		System.out.println("\n=====���=====");
		//System.out.println("�̸� : " + strName);
		System.out.printf("�̸� : %s%n", strName);
		System.out.printf("���� : %d%n", nTot);
	}
}

//���� ���

/*
�̸��� �Է��ϼ��� : ������
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

=====���=====
�̸� : ������
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
/*==========================================
����� Ŭ������ �ν��Ͻ�������
==========================================*/
// �� Test071.java�� ��Ʈ

//���� ���̿� �ѷ� ���ϱ�
//���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�
// (Ŭ������ : CircleTest) �� CircleTest.java
// BufferedReader�� readLine();

//���� ���� = ������ * ������ * 3.141592
//���� �ѷ� = ������ * 2 * 3.141592

//���� ��)
//������ �Է� : xxx

// >> �������� xxx�� ���� 
// >> ���� : xxxx.xx
// >> �ѷ� : xxxx.xx
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest	
{
	//�ֿ� �Ӽ�(������) �� ��� ���� (CircleTest�� ���ԵǾ��ִ� ����)
	int r;						// ������
	final double PI=3.141592;	// ������(������ ���ȭ)

	//�ֿ� ���(����, ����) �� ��� �޼ҵ�
	//������ �Է� ��� �� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.prin("������ �Է� : ")
		r = Integer.parseInt(br.readLine());
	}


	//���� ��� ��� �� �޼ҵ� ����
	
	//�ѷ� ��� ��� �� �޼ҵ� ����

	//��� ��� ��� �� �޼ҵ� ����
	
	//������ �� �޾ƿ��� �޼ҵ� �ۼ�
	/*void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());

	}


	//�ѷ��� ���ϴ� �޼ҵ� �ۼ�
	double calLength()
	{
		return r*2*PI;
	}

	double calArea()
	{
		return r*r*PI;
	}
	
	void print(double l, double a)
	{
		System.out.printf(">> �������� %d�� ����%n", r);
		System.out.printf(">> ���� : %.2f%n", a);
		System.out.printf(">> �ѷ� : %.2f%n", l);
		*/
	}
}
/*==========================================
����� Ŭ������ �ν��Ͻ�������
	-���簢�� Ŭ���� ���� �ǽ�
==========================================*/
/*
���簢���� ���̿� �ѷ� ��� �� Ŭ������ ǥ��

Ŭ������ ��ü�� �� ���簢���� ���赵
Ŭ������ �Ӽ�   �� ����, ����, (����, �ѷ�, ����, ����, ����, ����,.......)
Ŭ������ ���   �� ���� ���, �ѷ� ���, ���� ���� �Է�, ��� ���,( .....)

��ü�� ����     �� ������(�Ӽ�,  ����)  + ���(����,  ����)
	��					 ��					��
Ŭ���� ����     ��		����            + �޼ҵ�

class ���簢��
{
	//������(�Ӽ�,����)		�� ���� (���� �ǹ� ����)
	int ����, ����;

	//���(����, ����)		�� �޼ҵ�(���� �ǹ� ����)
	���μ����Է�()
	{
	}

	�ѷ����
	{
	}
	
	���̰��
	{
	}

	������
	{
	}
}

*/
import java.util.Scanner;
class Rect
{	
	int w, h;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		w = sc.nextInt();
		System.out.print("���� �Է� : ");
		h = sc.nextInt();
	}

	int calLength()
	{
		int result;
		result = (w + h)*2;
		return result;
	}

	int calArea()
	{
		return w * h;
	}
	
	void print(int a, int l)
	{
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + l);
	}
}

public class Test070
{
	public static void main(String[] args)
	{
		//Rect Ŭ���� ����� �ν��Ͻ� ����
		Rect ob = new Rect();

		// �Է� �޼ҵ� ȣ��
		ob.input();

		//���� ���� �޼ҵ� ȣ��
		int area = ob.calArea();
		
		//�ѷ� ���� �޼ҵ� ȣ��
		int length = ob.calLength();

		//��� �޼ҵ� ȣ��
		ob.print(area, length); //���� a�� l ŰƼ area�� length�� �̴��ó��� �����ϸ��
	
	}
}

// ���� ���

/*
���� �Է� : 500
���� �Է� : 60
���� : 500
���� : 60
���� : 30000
�ѷ� : 1120
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
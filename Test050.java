/*����� ���� �帧�� ��Ʈ��(���) ������
- �ݺ���(while��) �ǽ�
==========================================*/

//�ݺ����� Ȱ���Ͽ� ������ ���� ����
//cf.           ������

// 1 * 2 * 3 * ... * 9 * 10

// ���� ��)
// ���� ��� : xxx
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test050
{
	public static void main(String[] args)
	{
		//�ֿ� ���� ���� �� �ʱ�ȭ
		int n=0;			//-- ���� ����
		int result=1;		//-- �������� ��Ƴ� ����

		//���� �� ó��(�ݺ��� ����)
		while (n<10)
		{
			n++;
			result *= n;

		}
		System.out.println("���� ��� : " +result);
		System.out.println(n);
		/*
		int n=1, mul=1;

		while (n <=10)
		{
			mul *= n;
			n++;

		}
		System.out.println("���� ��� : " + mul);
		*/
	}

}

/*=======================================
����Ῥ����(Operator)������
- ��Ʈ ���� ������
- �� ������	����ִ� ����(��) �ٲٱ� �� ����(swap)
  �� ��xor�������� Ȱ�� ���� 

==========================================*/
public class Test024
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int x = 20, y = 23;

		//int temp;				//-- �ӽ� ���� ����(�� ��)
		
		//����ִ� ���빰 Ȯ��
		System.out.printf("x �� %d, y �� %d%n", x, y);

		/*
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		*/
	
		y = y ^ x;
		x = x ^ y;
		y = y ^ x;


		// ���� �� ó��
		/*temp = x;
		x = y;
		y = temp;*/
		System.out.printf("x �� %d, y �� %d%n", x, y);


		// ��� ���

	}
}
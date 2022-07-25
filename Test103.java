/*======================================
   ���� �޼ҵ� �ߺ����ǡ���
   - �޼ҵ� ���� �ε�(Method Overloading)
=======================================*/
/*
��  �޼ҵ� �����ε�(Method Overloading)�� ����

	�޼ҵ� �����ε��̶� �޼ҵ尡 ó���ϴ� ����� ����,
	�޼ҵ� ��ȣ �ӿ� ���� �μ�(����,�Ű�����,�Ķ����)�� ������ �ٸ��ų�
														-------------
	�ڷ���(Data Type)�� �ٸ� ���
	-----------------------------
	�޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ���
	���������� ����ϰ� �Ǵµ�,
	�̸� �޼ҵ� �����ε�(Method Overloading)�̶�� �Ѵ�.

	//�޼ҵ��� �������̵���
	�ڻ���̶�� �������� �ʿ��ϴ١�

*/

public class Test103
{
	public static void main(String[] args)
	{
		/*
		Test103 ob = new Test103();
		ob.drawLine();
		*/

		//Test103.drawLine();
		drawLine();
		//--==>>==================== 

		drawLine('-');
		//--==>>--------------------

		drawLine('+',40);
		//--==>>++++++++++++++++++++++++++++++++++++++++
		
		drawLine('-',30);
		//--==>>------------------------------

		drawLine('/',35);
		//--==>>///////////////////////////////////

	}


	//���� �׸��� �޼ҵ� ����
	public static void drawLine()
	{
		System.out.println("====================");
	}

	//���� �׸��� �޼ҵ� ���� �� ���� ���¸� �ٲپ� �׸��� �޼ҵ�
	//public static void drawLine()		//�Ű������� ������ �Ұ��� �ϴ�
	public static void drawLine(char c)
	{
		//System.out.println("\\\\\\\\\\\\\\\\\\");
		for (int i=0; i<20; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	
	//���� �׸��� �޼ҵ� ���� �� ���� ���¿� ���̸� �ٲپ� �׸��� �޼ҵ�
	public static void drawLine(char c, int n)
	{
		for (int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}


}
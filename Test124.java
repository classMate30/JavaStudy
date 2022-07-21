/*=============================================
 	����Ŭ���� ��ޡ���
 	- ��ø Ŭ����
 =============================================*/


// outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;
	
	class InnerNested		//inner�� write() �޼ҵ�
	{
		int c = 30;

		void write()
		{
			System.out.println("inner�� write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}

	void write()			//outer��  write()�޼ҵ�
	{
		System.out.println("outer�� write()...");
		
		InnerNested	ob1 = new InnerNested();
		ob1.write();		//-- inner�� write() �޼ҵ� ȣ��
	}
}


public class Test124
{
	public static void main(String[] args)
	{
		//InnerOuterTest(outer) Ŭ���� ����� �ν��Ͻ� ����
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();		//-- outer�� write() �޼ҵ� ȣ��
		//--==>>outer�� write()...
		//		inner�� write()...
		//		a : 10
		//		b : 20
		//		c : 30

		// InnerNested(inner) Ŭ���� ��� �ν��Ͻ� ����
		//InnerNested ob3 = new InnerNested();
		//--==>>���� �߻� (������ ����)

		// check~!!! �� Test122�� ��~!!!
		//InnerOuterTest(outer)Ŭ������ ���� InnerNested(inner) Ŭ���� ��� �ν��Ͻ� ����
		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//--==>>���� �߻� (������ ����)
		//static�� �پ����� �ʾƼ� �׷�

		// �� ��ø ���� Ŭ����(static ��ø Ŭ����)�� �޸�
		//	  �ܺ� Ŭ������ �ν��Ͻ�(��ü)�� ������� �ʰ�
		//	  �ܵ����� ���� Ŭ������ �ν��Ͻ��� �����ϴ� ���� �Ұ��� �ϴ�
		//	  ��ܺ� Ŭ������ ��ü�� ����ϸ�
		//		���� Ŭ������ ��ü�� �����ϴ� ���� �����ϴ�

		
		// check~!!! �� Test122�� ��~!!
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		//--==>>inner�� write()...
		//		a : 10
		//		b : 20
		//		c : 30

		// check~!!! �� Test122�� ��~!!
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		//--==>>inner�� write()...
		//		a : 10
		//		b : 20
		//		c : 30
	
		//outerŬ������.innerŬ������ ���������� = new outer������().new inner������();
		
		//�غ񱳴��
		//cf) static �� ��ø ���� Ŭ����
		// outerŬ������.innerŬ������ ���������� = new outerŬ������.inner������();

	
	}
}
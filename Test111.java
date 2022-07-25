/*======================================
   ���� Ŭ���� ���� ����
   -���(Inheritance)
=======================================*/

/*

��	���(Inheritance)
	���� ����(����)�ϰ��� �ϴ� Ŭ������
	�̹� ����Ǿ� �ִ� �ٸ� Ŭ������ ��ɰ� �ߺ��Ǵ� ���
	�̹� ����� Ŭ������ �Ϻκ��̳� ��ü ������ ������ �� �ֵ��� �ϴ� ����� �ǹ��Ѵ�.

	��, ����� ��ü�� �� �� ���� ���� �� �ִ�
	�������� ���뼺(reusablity)�� Ȯ���ϰ�
	��ü ���� ���踦 ���������ν�
	��ü ������ �� �ٸ� Ư¡�� ������������ ������ ��밡 �ȴ�.

	����� ���� ���α׷��� Ŭ���� ������ ���������ν�
	�ߺ��� �ڵ���� ���ۼ��� �ʿ� ����
	�ݺ����̰� �������� �۾��� ó������ �ʱ� ������
	���α׷��� �ۼ��ϴ� �ð��� ������ �� �ְ�
	���������� �����ϰ� �� �� ������
	���α׷��� ���̵� ª������ �ȴ�.

	����, �̹� �ۼ��� ���α׷����� �ռ� �׽�Ʈ �Ǿ��� ������
	������ ���� �� �־� ���� �ۼ� ���� ���α׷����� ������ �� �ִ�.

�� ������ ��
	
	�ڹٴ� ����.��.��.�ӡ��� �������� �ʱ� ������
	�� �� �̻��� Ŭ�����κ��� ��ӹ��� �� ����.

	�ڹٴ� ����.��.��.�ӡ��� �����Ѵ�.
	
	�θ�� ������ ��.��.
*/

/*
����� ��� ���� �����̴�???
���������δ� �ڵ��� ������ ��������������,
����� �ڵ带 �����ϱ� ���� ����Ϸ���, Ŭ������ �ٽ� ���� �ϴ� ��찡 �ǹ����� ������...

�ǹ�����......
�����̵���Ρ� ���� �ϴ� �������� ���

*/

//�θ� Ŭ���� == ���� Ŭ���� == ����(Super) Ŭ���� == �����ִ� Ŭ���� == ����ϴ� Ŭ����
class SuperTest111
{
	protected double area;


	//������
	SuperTest111()
	{
		System.out.println("Super Class...");
	}
	

	void write(String title)
	{
		System.out.println(title + " - " + area);
	}
}

//�ڽ� Ŭ���� == ���� Ŭ���� == ����(Sub) Ŭ���� == �����޴� Ŭ���� == ��ӹ޴� Ŭ����
public class Test111 extends SuperTest111		//this �� Test111     super �� SuperTest111
{
	/* ���������� �̷��� �� �Ŷ�� �����ϸ� ����
	protected double area;						// �θ�κ��� �������� area


	// check~~~!!!
	// �� �� �����ڴ� ��� ��󿡼� ���ܵȴ�~!!!

	
	void write(String title)					// �θ�κ��� �������� write() �޼ҵ�
	{
		System.out.println(title + " - " + area);
	}


	*/
	
	// �ڵ����� ���ԵǴ� default ������~!!!	����� ���� �����ڰ� ������ super();�� ���Ե� default������ 
	// 		 �� 
	// ����� ���� ������
	public Test111()
	{
		// �� ������ ���ο��� �� �ٸ� ������ ȣ��
		//	  - �����ϴ�. ��, ������ ���ο��� ���� ���� ����Ǿ�� �Ѵ�.
		
		super();

		//super();
		//��~ ����ִ�~!!!				//-- (X)
		//		��
		//�θ� Ŭ���� ������ ȣ�� ����	//-- (O)

		//SuperTest111();				//-- (X)
		
		System.out.println("Sub Class..");

		//super();						//�����ڿ��� �ٸ� �����ڸ� ȣ���Ҷ��� �ݵ�� �� ù�ٿ� �־�� �Ѵ�.
	
	}
	
	
	public void actionCircle()
	{
		int r = 10;
		area = r * r * 3.141592;
		//this.area = r * r * 3.141592;
		//super.area = r * r * 3.141592;
		write("��");
	}

	public void actionRect()
	{
		int w=20, h=5;
		area = w*h;
		write("�簢��");
	}


	public static void main(String[] args)
	{	
		// Test111 Ŭ����(�ڽ�) ��� �ν��Ͻ� ���� 
		Test111 ob = new Test111();
		//--==>> Super Class...
		//		 Sub Class...

		ob.actionCircle();
		ob.actionRect();

	}
}

//���� ���
/*
Super Class...
Sub Class..
�� - 314.1592
�簢�� - 100.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
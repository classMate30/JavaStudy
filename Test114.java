/*======================================
   ���� Ŭ���� ��� ����
   -���(Inheritance)
=======================================*/
/*

�ظ޼ҵ� �������̵�(Method Overriding)�� Ư¡
	- �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�
	- �ݵ�� ��� ���谡 �־�� �Ѵ�
	 ��----------------------------��
	- �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
	  ����Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�
	  �������, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
	  �������������ڴ� ��public���Ǵ� ��protected���̾�� �Ѵ�
	- ��static��,��final��,��private���޼ҵ�� �������̵�(Overriding)�� �� ����.
	   
	   static ź�������� �ν��Ͻ��� �������
	   final�� �޼ҵ忡 ������ ���� �Ұ�
	   private�� �ƿ� ����� ������
	
	- Exception�� �߰��� �Ұ����ϴ�
	  ��, ���� �޼ҵ尡 ������ �ִ� ���� ���ܻ��׿�
	  ���ο� Exception�� �߰��ϴ� ���� �Ұ��� �ϴٴ� ���̴�
	(��������: �ڹٴ� ���������� �ϳ��� ��ü��.)

���߻� Ŭ������ �����ϱ� ���ؼ� ����̶�� ������ �Ϻ��� �����ؾ� �ϸ�
  �������̽��� �����ϱ� ���ؼ� �߻� Ŭ������ �����ؾ� �Ѵ�
  �׸���, spring framework�� �� �ٷ�� ���ؼ��� �������̽��� �� �����ؾ��Ѵ�.

*/

//�θ� Ŭ����(���� Ŭ����, super class)
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
}


//�ڽ� Ŭ����(���� Ŭ����, sub class)
class SubTest114 extends SuperTest114
{
	protected int b = 100;
	//��� �غ��� �� ���� �θ��� b�� �ְ� �ڽĿ����� b�� ��������


	public void print()
	{
		//System.out.println("Sub print() �޼ҵ� : " + a + " : " + b + " : " + c);
		//--==>> ���� �߻�(������ ����)
		//-- ����Ŭ�������� ����� ���� a���� ������ �� ����.
		//	�� private �����̱� ������...

		System.out.println("Sub print() �޼ҵ� : " + b + " : " + c);
		System.out.println("Sub print() �޼ҵ� : " + b);
		System.out.println("Sub print() �޼ҵ� : " + this.b);	//SubTest114.b
		System.out.println("Sub print() �޼ҵ� : " + super.b);	//SuperTest114.b

		//���� ���� ������ �ִ� �ﱹ�� å(b)�� ���µ� �������� �ﱹ���� �ִٸ�
		// b�� this.b�� super.b ���� �������� �ﱹ�� å
		// �ٵ�, ���� ������ �ִ� �ﱹ�� å�� ������
		// b�� this.b�� ���� ������ �ִ� �ﱹ�� å�̰�
		// super.b�� �������� �ﱹ�� å

		//���� b�� ���� ����� ���� �ٸ� b�� ���� �� ����� �̷������.
		//����Ŭ�������� ����� b, ����Ŭ�������� ����� b
		
		System.out.println("Sub print() �޼ҵ� : " + c);
		System.out.println("Sub print() �޼ҵ� : " + this.c);	
		System.out.println("Sub print() �޼ҵ� : " + super.c);
		//--==>>Sub print() �޼ҵ� : 20
		//Sub print() �޼ҵ� : 20
		//Sub print() �޼ҵ� : 20
		//-- ���� c�� �����ϴµ� �ƹ��� ����� ������ ����
		///	 ����Ŭ�������� ����� c
	
	}//end print()

	@Override
	public void write()
	{
		//System.out.println("Sub write() �޼ҵ� : " + a + " : " + b + " : " + c);
		//--==>>���� �߻�(������ ����)
		//--����Ŭ�������� ����� ���� a���� ���� �� ������(print() �޼ҵ�� ��������)
		//	��private �����̱� ������...

		System.out.println("Sub write() �޼ҵ� : " + b + " : " + c);
	}

}


//main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test114
{
	public static void main(String[] args)
	{
		// ���� Ŭ����(SubTest114) �ν��Ͻ� ����
		SubTest114 ob = new SubTest114();
		ob.print();
		//--==>>Sub print() �޼ҵ� : 100 : 20
		ob.write();
		//--==>>Super write() �޼ҵ� : 5 : 10 : 20 
		//	  >>Sub write() �޼ҵ� : 100 : 20

		System.out.println("----------------------���м�");

		System.out.println(ob.b);
		//--==>> 100

		System.out.println(((SuperTest114)ob).b);
		//--==>> 10

		ob.write();
		//--==>>Sub write() �޼ҵ� : 100 : 20
		((SuperTest114)ob).write();
		//--==>>Sub write() �޼ҵ� : 100 : 20
		
		//check~!
		// �ظ޼ҵ�� ������ �� ������ ��
		
	}
}
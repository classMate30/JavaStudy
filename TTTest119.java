/*===================================
Ŭ���� ���
�������̽�
================================*/

interface Demo
{
	public void write();
	public void print();
}

abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������");
	}
	
	
}

class DemoImplSub extends DemoImpl
{
	//�������� write�� �����޴´�.
	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������");
	}
}


public class Test119
{
	public static void main(String[] args)
	{
		DemoImplSub ob = new DemoImplSub();
		
		//DemoImpl������ print()������ ���ؼ� ��ü ������ �ȵǰ�
		//DemoImpl���� �������� write()�� �����ް� print()�� �������� DemoImplSub�� ��ü ������ �����ϴ�.
	}
}
/*==========================================
   ���� Ŭ������ �ν��Ͻ� ����
   - ������(constructor)
=========================================*/

class NumberTest2
{
	int num;
	
	/*
	//����Ʈ(default) ������
	NumberTest2()
	{
		//�� ��� �ִ� ����	
	}
	*/
	// �� ����� ���� �����ڰ� ���ǵǾ� �����Ƿ�
	//	  default �����ڰ� �ڵ����� �������� ����


	// ������ �� ����� ���� ������
	NumberTest2(int n)
	{
		num = n;
		System.out.println("������ ȣ�� �� �Ű����� ���� : " + n);
	}
	

	int getNum()
	{
		return num;
	}
}

public class Test075
{
	public static void main(String[] args)
	{	
		//NumberTest2 �ν��Ͻ� ����
		//NumberTest2 ob1 = new NumberTest2(); �̷��� �θ��� �Ű� �����ִ� �����ڸ� �Ű����� ���� �����ͼ� ����
		//--==>> ���� �߻� (������ ����)
		//-- NumberTest2 Ŭ��������
		//	 ����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱� ������
		//	 ��default�����ڡ��� �ڵ����� ���Ե��� ������
		//	 ����ڰ� ������ �����ڴ� �Ű������� ���� �����̱� ������
		//	 ���� ���� �Ű����� ���� �����ڸ� ȣ���ϴ� ������ ������
		//	 ������ �߻���Ű�� �ȴ�

		NumberTest2 ob1 = new NumberTest2(10);
		//--==>> ������ ȣ��� �Ű����� ���� :10

		System.out.println("�޼ҵ� ��ȯ �� : " +ob1.getNum());
		//--==>> �޼ҵ� ��ȯ �� : 10

		System.out.println("ob1.num : " + ob1.num);
		//--==>> ob1.num : 10

		NumberTest2 ob2 = new NumberTest2(3564);
		//--==>> ������ ȣ�� �� �Ű����� ���� : 3564

		System.out.println("�޼ҵ� ��ȯ �� : " + ob2.getNum());
		//--==>>�޼ҵ� ��ȯ �� : 3564

		System.out.println("ob2.num : " + ob2.num);
		//--==>>ob2.num : 3564
	
	}
}
/*=============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
 	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Wrapper Ŭ����
=============================================*/	
public class Test134
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;
		float f = 1.2f;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		Float f2 = new Float(f);

		System.out.println(b2);
		System.out.println(i2);
		//--==>>3
		//		256

		print(b2);
		print(i2);
		print(f2);

	}	
		
		//print(3);
		//3�̶�� ������ ��ü�� ����ִ� ���� �ڽ��� �Ͼ�� 
		//�װ� ��ĳ������ �Ͼ�� ó���� �Ǵ�����

		//java.lang.Number Ŭ����(�߻� Ŭ����)��
		//��� ������ Wrapper Ŭ������ �θ� Ŭ����
		// (���� Ŭ����, ���� Ŭ����)�̴�
		//b2, i2�ڷ����� Number�� �Ѿ���鼭
		//��ĳ������ �Ͼ�� �ȴ�

		public static void print(Number nb)
		{	
			System.out.println(nb);
			if (n instanceof Integer)
			{
				System.out.println(n.intValue());
			}

		}

		/*

		public static void print(Byte b)
		{
		}
		public static void print(Short s)
		{
		}
		public static void print(Integer i)
		{
			Systemtn.out.println(i);
		}
		public static void print(Long l)
		{
		}
		public static void print(Float f)
		{
		}
		public static void print(Double d)
		{
		}

		*/

}
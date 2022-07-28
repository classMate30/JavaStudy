/*=============================================
  ���� ���� ó�� (Exception Handling) ����
=============================================*/	
// Test150.java ���ϰ� ��~!!!	

// �� throw���ǵ������� ���ܸ� �߻���ų�� 	cf)throws �翩���� ������ �޼ҵ� ������ ������
class Demo
{
	private int value;

	public void setValue(int value) throws Exception
	{
		if (value <= 0)
		{
			//return
			throw new Exception("value�� 0���� �۰ų� ������ �����ϴ�.");
			//���ܰ� ���������� �ٿ�		
			//�޼ҵ�ȣ��(); //throws Exception;

		}
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
	
}
public class Test151
{											//��
	public static void main(String[] args) //throws Exception
	{
		Demo ob = new Demo();
		
		try
			{
				ob.setValue(-3);
				int result = ob.getValue();
				System.out.println(result);	
			}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

	}
}
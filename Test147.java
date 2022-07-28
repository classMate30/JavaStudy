/*=============================================
  ���� ���� ó�� (Exception Handling) ����
=============================================*/	

/*
��  ���α׷����� �߻��ϴ� ����(Error)�� 
	
	�� �߸��� ������ ����ϰų� �������� �������� ���� ���¿���
	   ��������ν� ������ �ܰ迡�� �߻��ϴ� �������� ����(Error)��

	�� ���α׷��� �����ϴ� �������� �߻��Ǵ� ��Ÿ�� ����(Error)�� ���� �� �ִ�
	
	   - �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
	     ������ ����� �������� �Ǵ� ������ ����(Error)��

	   - �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����(Error), �׸���

	   - ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ� ���ܻ���(Exception)�� �ִ�

	     �������,
		 �� � ���� 0���� �����ų�...
		 �� �迭�� �����ϴ� �������� ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�
		 �� �������� �ʴ� ������ �����Ͽ� �о���δٰų�
	
	==> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ� 
		������ �����ϱ� ���� ������ �����ϵ��� ������ ������ ���� ��
		�� . �� . ó . ��

�� ������ ���� ����~!!! (�� Exception Ŭ����)
	
	- ���ܴ� ���α׷� ���� �߿� �߻� �� �� �ִ�
	  ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
	  �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(Object, ��ü)�̴�

	- ���α׷� �����߿� �޼ҵ� �ȿ��� ����(Error)�� �߻��ϰ� �� ���
	  �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
	  �װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� ������ �ش�
			��--------------------------------��
	
	- �ڹٿ����� ��� ���� Ŭ������ Throwable Ŭ������
	  Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�
		
	(��� ���ܴ� ���� �� �ִ�??????)

	- Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
	  ���ܰ� �߻��� ���� ���α׷��� ���¿� ���� ������ �����ϰ� �ִ�
	
	- Throwable Ŭ�������� �Ļ��� Ŭ����
	  
	  ��Exception Ŭ����
	  	Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
		������ �� �ִ� ���� ��Ȳ����
		�޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��
	  
	  ��Error Ŭ����	
		�ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�
		
�� ������ ����
	- checked exception
	  �޼ҵ� ������ ���ܰ� �߻��� ���
	  �޼ҵ带 ���� �Ҷ� ��throws������ �޼ҵ� ������ �߻��� �� �ִ� 
	  ���ܵ��� ����� �ְų� �Ǵ� �� ���ܸ� ��try-catch���ؼ�
	  ó���� �־�߸� �ϴ� �����̴�
	  �����Ϸ��� ������ �ϴ� �������� ��checked exception����
	  ��throws���Ǵ°��� ���� Ȥ�� ��try-catch���Ǵ����� ���θ� �Ǵ��Ͽ�
	  ���α׷����� ���ܸ� �������ε� ó������ ������
	  ������ ��ü�� �Ұ����ϴ�

	- unchecked exception
	  ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�
	  ��Ÿ�� �ÿ� �߻��� �� �ִ� �����̴�
*/

/*
��  java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�

	- String toString()
	  : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�
	- void printStackTrace(PrintStream s)
	- void printStackTrace(PrintWriter w)
	  : ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�

��  �ֿ� ��Ÿ�� ���� Ŭ����
	
	- ArithmeticException
	  : ��ġ ������ ����(0���� ������ ��)
	- ArrayStoreException
	  : �迭�� �߸��� ������ ���� �����Ϸ� ���� ��� �߻��ϴ� ����
	- IndexOutOBoundsException
	  : �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����
	- ClassCastException
	  : Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����
	- NullPointerException
	  : �� ��ü�� �����ϴ� ���(�ʱ�ȭ ���� ���� ���� ��� ��)
	    �߻��ϴ� ����
	- SecurityException
	  : �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����

	         :

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test147
{										   //�� ���α׷� ���� �ٱ�����(��� �� ���� ����ϴ� ���θ޼ҵ�)
										   //   �ٱ����� ���� ������
										   // �����ڴ�
										   //  - ���� �ľ� �Ұ���
	public static void main(String[] args) //throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;
		
		//��� ��� try-catch�����
		//     ��Ƽ� ��� ����ϰڴ�
		// �ڵ� ����������, ex)���߹� ó������ �����ͼ�
		//						���� �������� ��Ƴ���.
		/*
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a+b;
			System.out.println("��� : " + c);
		}
		catch (IOException e) //��Ƴ� ���� ��� ó�� �ؾ��ϹǷ�, �̸��� ���� ,��ġ �Ű�����ó��
		{	
			// IOException �� checked exception
			// -- �޼ҵ带 �����ϴ� �������� throws�� ����
			//    ��Ƴ��ų� ������ ������� ������ ���� �߻�
			System.out.println(e.toString());
		}
		*/

		// ��
		// checked exception�� unchecked exception�� ��ڴ� catch�� �ϳ�������
		/*
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a+b;
			System.out.println("��� : " + c);
		}
		catch (IOException e) //��Ƴ� ���� ��� ó�� �ؾ��ϹǷ�, �̸��� ���� ,��ġ �Ű�����ó��
		{	
			// IOException �� checked exception
			// -- �޼ҵ带 �����ϴ� �������� throws�� ����
			//    ��Ƴ��ų� ������ ������� ������ ���� �߻�
			System.out.println(e.toString());
			//	�������̵� �� ����
		}
		catch(NumberFormatException e2)
		{	
			// NumberFormatException �� unchecked exception
			//--��Ÿ�ӽ� �߻��� �� �ִ� ���ܷ�
			//  �ݵ�� �����ʿ䵵 ��Ƴ� �ʿ䵵 ����
			System.out.println(e2.toString());
			System.out.println(">> ���� ������ �����͸� �Է��ؾ� �մϴ�~!!!!");
		
		}
		*/

		/*
		//��
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a+b;
			System.out.println("��� : " + c);
		}
		catch (Exception e) //��Ƴ� ���� ��� ó�� �ؾ��ϹǷ�, �̸��� ���� ,��ġ �Ű�����ó��
		{		//Exception e�� ��ĳ���� �� ����  NumberFormatException�� IOException
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			//java.lang.NumberFormatException: For input string: "abcd"
			//For input string: "abcd"
			System.out.println("printStackTrace...");
			e.printStackTrace();	//���� �ڷ����� void�� �� ��ü�� �������
		}
		*/
		
		//etc...
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a+b;
			System.out.println("��� : " + c);
		}
		catch (Exception e) //��Ƴ� ���� ��� ó�� �ؾ��ϹǷ�, �̸��� ���� ,��ġ �Ű�����ó��
		{		//Exception e�� ��ĳ���� �� ����  NumberFormatException�� IOException
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			//java.lang.NumberFormatException: For input string: "abcd"
			//For input string: "abcd"
			System.out.println("printStackTrace...");
			e.printStackTrace();	//���� �ڷ����� void�� �� ��ü�� �������
		}
		
		finally 
		{
			//���ܰ� �߻��ϰų� �߻����� �ʰų� ������ ����Ǵ� ����
			System.out.println("��������̽��ϴ�. �����մϴ�.");
		}
	}
}

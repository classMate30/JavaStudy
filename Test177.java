/*=============================================
       ���� ��ü ����ȭ(Object Serialization) ����
=============================================*/	

/*
��  ��ü ����ȭ(Object Serialization)
	
	�޸𸮿� ������ Ŭ���� ��ü�� ��� ������ ���� ���¸�
	�״�� �����ؼ� ���Ͽ� �����ϰų�
	��Ʈ��ũ�� ���� ������ �� �ִ� �������
	��� ������ ���� �����Ѵٰų�
	�ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�

	��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȯ�Ͽ�
	���� �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ�
	������ִ� ������ �� ��, ��ü�� ��� ������ �޸𸮸����� ������ ���� ���Ѵ�
							-------------------------------------------------��

	����, �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�.
			------------------------------------------------��

��  ��ü ����ȭ�� ����
	
	��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
	��ü�� ���Ͽ� ���������ν� ���Ӽ��� ���� �� �� ������
	��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְ� �ȴ�

	��ü ����ȭ�� �ڹ� 1.1���Ŀ� ���ԵǾ��µ�
	�� ������ RMI�� Bean���� �̾���.
	RMI�� ���� ��ü ����� �����ؾ� �ϱ� ������
	��ü�� �״�� �̵��� �� �־�� �Ѵ�
	���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̾���

	����, Bean�� ����� ���¿� ���� ������ �����Ҷ�
	�� ��ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ������ �� �ִ�

	��  RMI(Remote Method Invocation)
		���� �ٸ� ���� �����ġ�� �����ϴ� �Լ���
		ȣ���ϰ� �����ϴ� ����� ����Ѵ�
		���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
		��� ������ �����ϴ� �������� �����ϸ� ���ڴ�.

	��  Bean(��)     (��Ģ�̶�� �����ϸ� ����)
		C/S ������ �𵨿��� ������ ������ �ش��ϸ�
		���� ������ ����Ʈ���� ��ü�� ���� �� �ְ� �ϴ� ������Ʈ ���
		�ۼ��� ��ü�� ������ �����ϸ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�
		Ŭ���̾�Ʈ�� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��

��  Serializable �������̽�
	
	��ü ����ȭ�� �ϱ� ���� ���� ��ü ����ȭ�� �����ϵ���
	java.io.Serializable �������̽��� ������ �־�� �Ѵ�
	�� �������̽��� ��ü ����ȭ�� �����Ǿ�� �Ѵٴ� �����
	JVM�� �˷��ִ� ������ �����Ѵ�  (Serializable�� ������ JVM�� ����ȭ�� �ʿ��ϴٴ� ���� ��)
	����, Serializable �������̽���
	�ٸ� �������̽��� �޸� �����ؾ��� �޼ҵ尡 ���� ������ 
	���� ���� ���ָ� �ȴ�.

	����
	��
	public class Ŭ������ implements Serializable
	{
		//....
	}

	��
	Serializable �������̽��� ������ ��
	ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ �̿��Ͽ�
	��ü ������ ������� �����ϰ� �ȴ�

	��  ��� ������ static���� ����� ���
		(��, Ŭ���� ������ ���)
		��ü ����ȭ ��󿡼� ���ܵȴ�.

��  Object Stream

	java.io.ObjectInputStream
	ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ ����
	���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü��
	����ȭ�� �����ϴ� ����� �����Ѵ�
	��, java.io.Serializable �������̽���
	java.io.Externalizable �������̽��� �������ִ� ��ü�� ���ؼ���
	����� �����ϴ�

	��, Serializable �������̽��� Externalizable�������̽��� 
	������ ��ü������ ����� �����ϴٴ� ���̴�
	�̶�, readObject() �޼ҵ带 �̿��Ͽ�
	��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������

	�̷��� ���� ��ü�� �迭, ���ڿ� �Ǵ� �� ��ü ��
	������ ��(Type)���� ĳ���� �� �־�� �Ѵ�


	
*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

public class Test177
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		String appDir = System.getProperty("user.dir");	
		
		//�׽�Ʈ (Ȯ��)
		//System.out.println(appDir);
		//--==>>C:\JavaStudy\JavaStudy
		
		//���� ��ü ����
		File f0 = new File(appDir,"\\data\\test.ser");
		//-- appDir �� C:\JavaStudy\JavaStudy
		//-- appDir ��ġ�� ��������(�߽�����) "\\data\\test.ser"��
		//	 �����ϰڴٴ� �ǹ�
		//-- ��������� ��c:\JavaStudy\JavaStudy\data\test.ser������

		//�׽�Ʈ (Ȯ��)
		//System.out.println(f0.getParentFile().exists());
		//--==>>false
		//-- ��test.ser�������� ������� ���͸� ��ΰ� �����Ǿ� ���� �ʴ�

		
		// �� ��c:\JavaStudy\JavaStudy�� ��ο� ��data�����͸� ���� �� �ٽ� Ȯ��
		//�׽�Ʈ (Ȯ��)
		//System.out.println(f0.getParentFile().exists());
		//--==>>true
		//-- ��test.ser�������� ������� ���͸� ��ΰ� �����Ǿ� �ִ�.


		//-- ��test.ser�������� ������� ���͸� ��ΰ� �����Ǿ� ���� �ʴٸ�...
		if (!f0.getParentFile().exists())
		{
			//���͸��� ����ڴ�
			f0.getParentFile().mkdirs();
		}
		
		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String>h1 = new Hashtable<String, String>();

		//������ h1�̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("2206428","���ҿ�");
		h1.put("2206436","������");
		h1.put("2206512","�ӽÿ�");
		h1.put("2206524","������");
		h1.put("2206537","������");
		
		//���� ���� ��� ��Ʈ�� ����(�������� ����)
		FileOutputStream fos = new FileOutputStream(f0);
		//--���� ���� ��� ��Ʈ��(���ٱ�)��
		//	f0��� ���� ��ü�� ���ڴ�
		//Like) InputStreamReader isr = new InputStreamReader(System.in);


		//��ü ���� ��� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//--��ü ���� ��� ��Ʈ��(���ٱ�)����
		//	fos ��� ���� ���� ��� ��Ʈ���� ���ΰڴ�
		//Like) BufferedReader br = new BufferedReader(isr);
		
		//���� Line 152~159
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));
		//		�ؿ� ���� ���� / ���������� ������ ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		//��  ObjectOutptStream Ŭ������
		//	  ��ü���� ����ϴ� ����� �����ϴ� Ŭ������
		//	  ��� ��Ʈ���� ����ϱ� ������
		//	  ���������� ��ü ����ȭ�� �����ϰ� �ȴ�
		//	  �ڹ� �⺻�� ������ �Ǵ� ��ü����
		//	  ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϱ� ����
		//	  ������ ��ü�� ����ȭ�ϴ� ����� �����ϴ� ���̴�
		//DB


		//������ ��Ʈ���� ������ ��ü�� ���
		oos.writeObject(h1);
		//-- out.write(ch)�� ���� ������ ����


		//��ü ���� ���ҽ� �ݳ�		//���ҽ� �ݳ��Ҷ��� ������ ������ �ݴ�
		oos.close();
		//-- ObjectOutputStream ���ҽ� �ݳ�



		//���� ���� ���ҽ� �ݳ�
		fos.close();
		//-- FileOutputStream ���ҽ� �ݳ�

		//(��ü�� ����ȭ�Ͽ� ���Ϸ�) �������� ��~~!!!!
		//----------------------------------------------------------------------------
		
		
		
		//(��ü�� ����ȭ�Ͽ� ������ ����) �о���̱� ����~!!!

		//f0 ���� ��ü�� �����Ѵٸ�...
		if (f0.exists())
		{	
			//f0 ������ ���� �Է� ��Ʈ������ �о���̰�
			FileInputStream fis = new FileInputStream(f0);

			//fis���� �Է� ��Ʈ�����κ��� ��ü �Է� ��Ʈ��(ObjectInputStream)�� ����
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//��ü �Է� ��Ʈ��(ois, ObjectInputStream)���� ���� �о���� ��ü(Object)��
			// ĳ����(Hashtable)�Ͽ� h2��� Hashtable �ڷᱸ���� ��Ƴ���
			// Object obj = ois.readObject();		//Ÿ���� Object�̱⿡ �ٿ�ĳ���� �Ѱ� �Ʒ�����
			Hashtable h2 = (Hashtable)ois.readObject();
			
			ois.close();
			//-- ois, ObjectInputStream ���ҽ� �ݳ�

			fis.close();
			//-- fis, FileInputStream ���ҽ� �ݳ�

			//------------------------------------������� �����ϸ�
			//									  �о���̴� �۾� ��~~~!!

			String key;
			String value;
			
			// �ڿ��⼱ Enumeration�� �����ϰ� Iterator�� �ȵ�! ��
			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement();
				//-- Hashtable �ڷᱸ���� ������� key���� �о���̴� ����
				System.out.print(key);

				value = (String)h2.get(key);
				//-- Hashtable �ڷᱸ���� ������� key�� Ȱ���Ͽ� value�� ���� ����

				System.out.println(key +  " �� " + value);
				//--==>>
				/*
				22065122206512 �� �ӽÿ�
				22065242206524 �� ������
				22064362206436 �� ������
				22065372206537 �� ������
				22064282206428 �� ���ҿ�
				����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
				*/
			}
		}
	}
}
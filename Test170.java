/*=============================================
       ���� �÷��� (Collection) ����
=============================================*/	

// Map	�� Hashtable , HasMap
// (��)

/*
��  java.util.Map �������̽���
	Ű(key)�� ��(value)�� ����(mapping)�Ͽ�
	������ Ű�� ����� �� ����, �����ؾ� �ϸ�
	�� Ű�� �Ѱ��� ������ �����ؾ� �Ѵ�
	��, �ϳ��� Ű�� �����ϴ� ���� �ϳ��� ���� ���� �ڷᱸ���̴�.
*/

/*
��  Hashtable<K, V> Ŭ����
	
	- �ؽ����̺� ������ ��ü �𵨸��� Ŭ������
	  �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�

	- �ؽ����̺��̶� Ű(key)�� �׿� �����ϴ� ������(value)��
	  ���е� ������ �����̴�

	- �����͸� �����ϰ�, �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ�
	  �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�

	- ����, Hashtable Ŭ������ key �Ǵ� value�� ������ null�� ������� �ʴ´�
	
*/
import java.util.Hashtable;

public class Test170
{	
	private static final String[] names 
	= {"������", "������", "�ֳ���", "����", "������", "�ݺ���"};

	private static final String[] tels 
	= {"010-7202-6306", "010-2546-0266", "010-7236-0813", "010-4016-6208", "010-4051-5510", "010-6375-7524"};

	public static void main(String[] args)
	{
		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> ht = new Hashtable<String, String>();
				//key      value �ش��ϴ� ������ Ÿ��	
		// ht ��� Hashtable �ڷᱸ���� 
		// �迭(names, tels)�� ����ִ� �����͸� ��ҷ� ��Ƴ���
		// �� put(k,v);
		for (int i=0; i<names.length; i++)
		{
			//ht.put("������","010-7202-6306");			//ht��� Hashtable�� put()�ϰڴ�!
			ht.put(names[i], tels[i]);
		}
		
		// ht��� Hashtable �ڷᱸ������ 
		// key�� �̿��Ͽ� �˻� 
		// �� get(k);
		String findName1 = "������";
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + " ��ȭ��ȣ : " + str);
		}
		//else 
		//{
		//	System.out.println("���~~");
		//}
		System.out.println();
		//--==>>������ ��ȭ��ȣ : 010-4051-5510
		
		
		// ht��� Hashtable �ڷᱸ����... key�� �����ϴ����� ���� Ȯ��
		// �� containsKey()
		String findName2 = "�ֵ���";
		
		if (ht.containsKey(findName2))
		{
			System.out.println("�����Ͱ� �����մϴ�.");
		}
		else
		{
			System.out.println(findName2 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		//--==>>�ֵ��� �����Ͱ� �������� �ʽ��ϴ�.
		

		String findName3 = "�ֳ���";
		if (ht.containsKey(findName3))
		{
			System.out.println(findName3 + " �����Ͱ� �����մϴ�.");
		}
		else
		{
			System.out.println(findName3 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//--==>>�ֳ��� �����Ͱ� �����մϴ�.


		// ht��� Hashtable �ڷᱸ����... value�� �����ϴ����� ���� Ȯ��
		// �� contains()
		String findTel1 = "010-2546-0266";
		if (ht.contains(findTel1))
		{
			System.out.println(findTel1 + " �����Ͱ� �����մϴ�.");
		}
		else 
		{
			System.out.println(findTel1 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//--==>>010-2546-0266 �����Ͱ� �����մϴ�.
		
		// ht ��� Hashtable �ڷᱸ������ ���ݺ����������� ����
		// �� remove()
		ht.remove("�ݺ���");
		
		// �� ��remove()���޼ҵ�� ���ڰ����� key�� �Ѱܹ�����
		//     �� ��, key�� �����Ǵ� ���� �ƴϴ�
		//	   �ش� key�� ����Ǿ�(���εǾ�) �ִ� value�� �Բ� remove() �ȴ�.

		// ����(remove()) ���� key�� �����ϴ��� Ȯ��
		if (ht.containsKey("�ݺ���"))
			System.out.println("�����̰� �����մϴ�.");
		else
			System.out.println("������ ��𰬾�???????");
		System.out.println();
		//--==>>������ ��𰬾�???????

		// ����(remove()) ���� value�� �����ϴ��� Ȯ��
		if (ht.contains("010-6375-7524"))
			System.out.println("������ ��ȭ��ȣ�� �����մϴ�.");
		else 
			System.out.println("������ ��ȭ��ȣ�� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>>������ ��ȭ��ȣ�� �������� �ʽ��ϴ�.
		
		
		// �� null ���� ó��			null �� �ƹ��͵� ���ٴ� ���°�  // �ƹ��͵� ���°͵� ���¸��� �� �ٸ� empty,null,undefined,void
		//ht.put(null, null);				//-- key, value ��� null
		//--==>> ���� �߻�(��Ÿ�� ����)
		//		 NullPointerException
		
		//ht.put("������", null);			//-- value�� null
		//--==>> ���� �߻�(��Ÿ�� ����)
		//		 NullPointerException
		
		//ht.put(null, "010-1234-5678");	// key�� null
		//--==>> ���� �߻�(��Ÿ�� ����)
		//		 NullPointerException
		
		// �ߺ��� key �Է�
		ht.put("������","010-1111-1111");
		System.out.println(ht.get("������"));
		//--==>> 010-1111-1111
		//-- �ߺ��� key�� Ȱ���Ͽ� �����͸� �Է��� ���
		//	 ���� "010-2546-0266"���� "010-1111-1111"�� ����Ǿ����� Ȯ��
		//	 (����� ����)

		// �ߺ��� value �Է�
		ht.put("���¹�", "010-7202-6306");
		System.out.println(ht.get("������"));
		//--==>> 010-7202-6306
		System.out.println(ht.get("���¹�"));
		//--==>> 010-7202-6306

		// �� value�� �ߺ��� ���� �ԷµǴ��� ���� �����Ϳ� �ƹ��� ������ ��ġ�� ����

	}	
}
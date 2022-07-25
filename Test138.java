/*=============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
 	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- StringBuffer Ŭ����
=============================================*/	
/*
��  StringBuffer Ŭ����
	
	���ڿ��� ó���ϴ� Ŭ������ String Ŭ������ ��������
	String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
	StringBuffer Ŭ������ ���ڿ��� ����� �� (��Ÿ�� ��������)
	���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�

	��, StringBuffer ��ü�� �������� ���̸� �����Ƿ� 
	��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
	���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�

	���� JDK1.5���ĺ��ʹ�
	���ڿ��� ó���ϴ� StringBuilder��� Ŭ������ �����Ѵ�
	StringBuilder Ŭ������ ����� Stringbuffer Ŭ������ ����������
	���� ū �������� ��multi-thread unsafe����� ���̴�
	��, Syncronization�� ���� ������
	StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
	StringBuilder�� ����ϴ� ���� ������ ����ų �� �ִ�
	-����ȭ : ��ġ��Ű�� �۾�(ex>��,��)


	- StringBuffer�� ����� �� ����
	- ��ɰ� ������ �ݺ��

	thread - �⺻������ �۾��� ó���ϴ� ����

	CPU�� ������ ���� �� �ϳ��� �̳� ���� ó���ϰ� ����

	String ����, ������ ó��
	StringBuffer ����, ������ ó��
*/

public class Test138
{
	public static void main(String[] args)
	{
		String str1 = new String("seoul");
		String str2 = new String("seoul");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));		//String Ŭ������ �������̵��� ����
		//--==>>false
		//		true
		
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));		//StringBufferŬ������ �������̵��� ����		
		//--==>>false
		//		false
		
		System.out.println("------------------------------");
		
		System.out.println(sb1);
		//--==>>korea
		//		StringBufferŸ���� ����� ����
		
		System.out.println(sb1.toString());
		//--==>>korea
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		//				-------
		//				�޼ҵ�
		//				------------------
		//				String��ü
		//��StringBuffer��ü�� �� �ϴ¹����
		//--==>>true
		
		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer �⺻ ������ ȣ��(�ν��Ͻ� ���� ����)
		//	 �⺻������ �����Ǵ� ������ ũ��� ��16��
		
		//capacity()
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� :16
		
		//////////////////////////////////////////////////
		System.out.println(sb3);
		//--==>> ��
		
		/*	
		String name = "���̰�";
		name += "������";
		name += "�ֵ���";
		name += "�ӽÿ�";
		
		System.out.println(name);
		//--==>>���̰��������ֵ����ӽÿ�
		*/
		
		sb3.append("seoul");			// sb3 += "seoul";
		sb3.append("korea");			// sb3 += "korea";
		sb3.append("�츮����");			// sb3 += "�츮����";
		sb3.append("���ѹα�");			// sb3 += "���ѹα�";
		System.out.println(sb3);
		System.out.println(sb3.toString());
		//--==>>seoulkorea�츮������ѹα�
		//		seoulkorea�츮������ѹα�
		
		//���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>>���� ũ�� : 34
		
		//////////////////////////////////////////////////////////////
		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE
		
		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and oracle
		
		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//--==>> ���� �߻�(������ ����)

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//--==>>SEOULKOREA�츮������ѹα�

		System.out.println(sb3.toString().toUpperCase());
		//--==>>SEOULKOREA�츮������ѹα�

		//seoulkorea�츮������ѹα� sb3���� ����ִ� ����
				
		// �� ��� ���ڿ�(sb3) �� seoul �տ�
		//	  "�ѱ�" �̶�� ���ڿ� �߰�
		//	  �� �ѱ�seoulkorea�츮������ѹα�

		sb3.insert(0, "�ѱ�");
		//sb3�� ������� insert
		System.out.println("seoul �տ� ���ѱ��� �߰� : " + sb3.toString());
		//--==>>seoul �տ� ���ѱ��� �߰� : �ѱ�seoulkorea�츮������ѹα�

		//  �� ��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		//	   "���" �̶�� ���ڿ� �߰�
		//		��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ �ʰ�...
		//		���ѱ�seoulkorea����츮������ѹα�
		
		//sb3.insert(sb3.toString().indexOf("��"), "���");
		//System.out.println(sb3.toString());
		
		//�׽�Ʈ ��
		System.out.println(sb3.toString());
		//--==>>�ѱ�seoulkorea�츮������ѹα�

		//�׽�Ʈ ��
		//sb3.insert(12, "���");
		//System.out.println("korea �ڿ� ��������߰� : " +sb3.toString());
		//--==>>korea �ڿ� ��������߰� : �ѱ�seoulkorea����츮������ѹα�
		
		//�׽�Ʈ ��
		sb3.indexOf("korea");
		System.out.println(sb3.indexOf("korea"));
		//--==>>7

		//�׽�Ʈ ��
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "���"));
		//--==>>�ѱ�seoul���korea�츮������ѹα�
		
		//�׽�Ʈ ��
		//System.out.println(sb3.insert(sb3.indexOf("korea") +5 , "���"));
		//--==>>�ѱ�seoulkorea����츮������ѹα�
		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length() , "���"));
		//--==>>�ѱ�seoulkorea����츮������ѹα�
		
		//  �� ��� ���ڿ�(sb3) ����
		//	   ��"�츮����"�����ڿ� ����
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		
		sb3.delete(sb3.indexOf("�츮����"), sb3.indexOf("�츮����")+ "�츮����".length());
		System.out.println(sb3.toString());
		//--==>>�ѱ�seoulkorea������ѹα�

		//	�� ��� ���ڿ�(sb3)����
		//	   ��"korea"������ ���ڿ� ����(korea ����)
		//		�ѱ�seoulkorea������ѹα� �� �ѱ�seoul
		
		//sb3.delete(7,18);
		//sb3.delete(sb3.indexOf("korea"), sb3.toString().length());
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3.toString());
		
		//////////////////////////////////////////////////////////
		//���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34

		// ���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//--==>> ���ڿ��� ���� : 7

		//���� ũ�� ����
		//	�� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���..
		// trimToSize()
		sb3.trimToSize();

		//���� ũ�� ���� ���� ���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : "+ sb3.capacity());
		//--==>>���� ũ�� : 7





		
	}
}
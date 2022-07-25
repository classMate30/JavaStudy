/*=============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
 	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- String Ŭ����
=============================================*/	




public class Test137
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println("s : " + s);
		//--==>> s : seoul korea

		// �� ���ڿ� ����
		System.out.println(s.substring(6, 9));
		//--==>> kor

		// �� ��String.substring(s, e)��
		//	   String ���ڿ��� �������
		//	   s ��°���� ... e-1 ��°���� ����
		//	   ��, �ε����� 0���� ����

		System.out.println(s.substring(7));
		// �� ��String.substring(s, e)��
		//	   String ���ڿ��� �������
		//	   s ��°���� ... ������ ����
		//	   (��, ���ڿ��� ���� ���̸�ŭ...)

		// �� ���ڿ��� ������(��) ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));	
		//--==>>true
		//		false
		//-- ��ҹ��� ������ ����'

		System.out.println(s.equalsIgnoreCase("SEOUL KOREA"));
		//--==>>true
		//-- ��ҹ��� ���� ����


		// ��   ã���� �ϴ� ��� ���ڿ�(s)�� 
		//		��kor�����ڿ��� �����ұ�?
		//		�����Ѵٸ�... �� ��ġ�� ��� �ɱ�?
		
		// "seoul korea"
		//	0123456789

		System.out.println(s.indexOf("kor"));
		//--==>>6

		System.out.println(s.indexOf("ea"));
		//--==>>9

		System.out.println(s.indexOf("e"));
		//���� �ϳ� ã���� ����
		//--==>>1
		//-- ���� ã�� ���ڿ��� �ε����� ��ȯ�ϰ� ����

		System.out.println(s.indexOf("tt"));
		//--==>>-1
		//-- ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		//	 �� ���ڿ��� �ε����� ��ȯ������
		//	 �������� ���� ��� ������ ��ȯ�ϰ� �ȴ�. (-1)

		// �� ��� ���ڿ�(s)�� ��rea���� ���������� ���� Ȯ��
		//	  (true / false)

		System.out.println(s.endsWith("rea"));
		System.out.println(s.endsWith("oul"));
		//--==>>true
		//		false
		

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//	  ��e�����ڿ��� �����ұ�?
		//	  �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?
		//	  (��, �ڿ��� ���� �˻�)

		// seoul korea
		System.out.println(s.indexOf("e"));
		//--==>>1
		System.out.println(s.indexOf("o"));
		//--==>>2

		System.out.println(s.lastIndexOf("e"));
		//--==>>9
		System.out.println(s.lastIndexOf("o"));
		//--==>>7

		
		// �� ��� ���ڿ�(s) ��
		//	  ��6����° �ε��� ��ġ�� ���ڴ�?	

		// seoul korea
		System.out.println(s.charAt(6));

		//System.out.println(s.charAt(22));
		//--==>> ���� �߻�(��Ÿ�� ����)
		//--	 StringIndexOutOfBoundsException

		// �� ��� ���ڿ�(s)�� �� ���ڿ� ��seoul corea����
		//	  � ���ڿ��� �� ū��?			�� ���ڿ��� ���� ũ�� ��
		//	  �� ���ڿ��� ���ٸ� ?			�� 0 
		//	  �� ���ڿ��� �ٸ��ٸ� ?			�� ���̸� ��


		System.out.println(s.compareTo("seoul korea"));
		//--==>>0 �� �� ���ڿ��� ����.(s �� "seoul korea"��...)
		System.out.println(s.compareTo("seoul corea"));
		//--==>>8
		//-- c ~ k �� defghijk �� 8


		// �� ��� ���ڿ�(s) ��
		//	  �ش� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ������ ���ڿ� ��ȯ
		//	  �װ� �ٽ� ��ƾ� ��.(��ó�� �����Ǵ� ������ �ƴϱ⿡)

		s = "�츮���� ���ѹα� ���ѵ��� ����";
		s = s.replaceAll("����", "����");
		System.out.println("ó�� ��� : " + s);
		//--==>>ó�� ��� : �츮���� ���ֹα� ���ֵ��� ����

		
		// �� ���� ����
		// trim()�� ���� ������̸� ���ø� ��
		
		s = "          ��          ��          ";
		System.out.println("|" + s + "|");
		//--==>>|          ��          ��          |


		System.out.println("|" + s.trim() + "|");
		//--==>>|��          ��|
		//�ڡڡھ��� �����ڸ� ���� ���šڡڡ�
		//�ڵ��ϼ� ��ɿ� �ڿ� ���� trim���� ���� ����
		//       ��Ÿ�� �ݿ��� �ų��� �����       
		// ��� ���� �յ� ���� trim���� ���� ����
		System.out.println("|" + s.replaceAll(" ", "") + "|");
		//--==>>|���|

		// "50"
		int temp = Integer.parseInt("50");
		System.out.printf("%d%n",temp);
		//--==>>50

		s = Integer.toString(30);
		System.out.printf("%s%n", s);
		//--==>>30
		//�������̵� �ƴϰ� �����ε���

		//--==>>d.toString() : 10
		
		int n =2345678;
		System.out.printf("%d", n);
		System.out.format("%d", n);
		//--==>>23456782345678
		
		System.out.println();

		s = String.format("%d", n);  //���ڿ� ���¸� ��ȯ�ϴ� �޼ҵ�
		System.out.println(s);
		//--==>>2345678

		s = String.format("%,d", n);  //���ڿ� ���¸� ��ȯ�ϴ� �޼ҵ�
		System.out.println(s);
		//--==>>2,345,678
		//%�ڿ� , ������ ���ڸ����� ��,�������	
		
		String str = "�⺻,����,���";
		String[] strArr = str.split(",");

		String[] strArr2 = "�⺻,����,���".split(",");
		
		for (String strl : strArr2)			//Ÿ�� : �ڷᱸ�� 
			System.out.print(strl + " " );
		System.out.println();
		//--==>> �⺻ ���� ���
			


	}
}
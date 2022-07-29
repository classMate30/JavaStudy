/*=============================================
       ���� �÷��� (Collection) ����
=============================================*/	

// Set �� HashSet, TreeSet
// - ���� ����. 
// - �ߺ��� ������� �ʴ� ����(�⺻)

/*
��  TreeSet<E> Ŭ����

	java.util.TreeSet<E> Ŭ������
	Ste �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
	�����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ �ȴ�


����� ��ü�϶�??

*/

// VO	- Value Object				(�����Ͻ� ������ ���Ե�?????)
// DTO	- Data Transfer Object		�ǳڶ� �վȿ� ����ִ� ��
// DAO	- Data Access Object		�ǳڶ� �ӴڼӴ� �ǳ״� ��


import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;
class GradeVO
{
	//�ֿ� �Ӽ� ����
	private String hak;					//-- �й�
	private String name;				//-- �̸�
	private int kor, eng, mat;			//-- ����, ����, ���� ����
	

	//������(����� ���� ������) �� 5���� �Ű������� ���� ������
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//default ������ �ڵ� ���Ե��� ����~~!!!

	//������(����� ���� ������) �� �Ű����� ���� ������
	//-- �Ű������� �����ϴ� �����ڸ� ����� ���� �����ڷ� �����Ͽ��� ������
	//	 default �����ڰ� �ڵ����� ���Ե��� ���� ���� ����Ͽ�
	//	 �߰��� ������ ������

	GradeVO()
	{
		this("", "", 0, 0, 0);
	}
	//getter/setter ����
	public String getHak()
	{
		return hak;
	}
	public void setHak(String hak)
	{
		this.hak = hak;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getKor()
	{
		return kor;
	}
	public void setKor(int kor)
	{
		this.kor = kor;
	}
	public int getEng()
	{
		return eng;
	}
	public void setEng(int eng)
	{
		this.eng = eng;
	}
	public int getMat()
	{
		return mat;
	}
	public void setMat(int mat)
	{
		this.mat = mat;
	}

	// �߰� �޼ҵ� ����(���� ����)
	public int getTotal()
	{	
		//return kor + eng + mat;	���� ���� ����������
		return this.kor + this.eng + this.mat;
	}
}
//�ڷᱸ��<E>
//E�� ������ �ִ� �ڷᱸ��

// <T>
// Ÿ���� ��� ��
class MyComparator<T> implements Comparator<T>
{
	// �� �޼ҵ� ������
	@Override	
	public int compare(T o1, T o2)		//TŸ���� ù��° �Ķ���� TŸ���� �ι�° �Ķ����
	{
		GradeVO s1 = (GradeVO)o1;	
		GradeVO s2 = (GradeVO)o2;

		// �й� ����(��������)
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		// return Integer.paserInt("2206113") - Integer.parseInt("2206115");
		// return 2206113 - 2206115;
		// return -2;
		

		// �й� ����(��������)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());
		
		// ���� ����(��������)
		//return s1.getTotal() - s2.getTotal();
		
		// ���� ����(��������)
		//return s2.getTotal() - s1.getTotal();
		

		// �̸� ����(��������)
		//return s1.getName().charAt(0) - s2.getName().charAt(0);
		
		//return s1.getName().compareTo(s2.getName());
		//		s1<��ü(GradeVO)
		//		s1.getName()  < ���ڿ�(String)
		//		s1.getName(). <StringŬ������ �����ϴ� �޼ҵ� ��밡��
		
		// �̸� ����(��������)
		return s2.getName().compareTo(s1.getName());
		
		//"������"   "
	}	

}

		
public class Test169
{		
	public static void main(String[] args)
	{	
		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();
		
		// TreeSet �ڷᱸ�� set�� ��� �߰� �� add();
		set.add("�͸���Į��");
		set.add("��Ž���ڳ�");
		set.add("����ť");
		set.add("�����̸���");
		set.add("���ϸ�");
		set.add("����ġ���������Ҹ�");
		set.add("�������庥ó");
		set.add("�̿��������");
		set.add("¯���¸�����");
		set.add("�Ʊ����Ѹ������������");
		set.add("������̺�");
		
		// Iterator�� Ȱ���� set ��� ��ü ���
		Iterator<String> it = set.iterator();		//set�ڷᱸ���ȿ��� iterator()�޼ҵ尡 ����
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//--==>>�͸���Į�� �����̸��� �������庥ó ������̺� ��Ž���ڳ� ����ġ���������Ҹ�
		//		�Ʊ����Ѹ������������ �̿�������� ¯���¸����� ���ϸ� ����ť
		//-- ��Ҹ� ���ڿ��� ������ ���
		//	 �����ټ� �� �������� ����
		

		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		// TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		//
		// MyComparator Ŭ������ �����Ͽ�
		// compare() �޼ҵ带 ������ ���� �ٽ� ����
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());
		
		// TreeSet �ڷᱸ�� set2�� ��� �߰�
		set2.add(new GradeVO("2206113", "������", 90, 80, 70));
		set2.add(new GradeVO("2206115", "�ֵ���", 91, 81, 71));	
		set2.add(new GradeVO("2206128", "���α�", 88, 78, 68));
		set2.add(new GradeVO("2206139", "������", 70, 60, 50));
		set2.add(new GradeVO("2206150", "������", 99, 82, 72));
		/*
		for (Object obj : set2)
		{
			System.out.printf("�й� : %s, �̸� : %s, ���� : %d, ���� : %d, ���� : %d",obj.getHak(),obj.getName(),obj.getKor(),obj.getEng(),obj.getMat());
		}
		*/
			
		/*
		//Iterator�� Ȱ���� set2 ��� ��ü ���
		Iterator<GradeVO> it1 = set2.iterator();
		while (it1.hasNext())
		{	
			System.out.print(it1.next() + " ");
			//--==>>���� �߻�( ��Ÿ�� ����)
			//Exception in thread "main" java.lang.ClassCastException: 
			//GradeVO cannot be cast to java.lang.Comparable
			//System.out.print(((GradeVO)it1).next() + " ");
		}
		*/
		//
		//					��
		//
		// MyComparator Ŭ������ �����Ͽ�
		// compare() �޼ҵ带 �������� �� �ٽ� ����
		/*
		Iterator<GradeVO> it1 = set2.iterator();
		while (it1.hasNext())
		{	
			System.out.print(it1.next() + " ");
		}		
		System.out.println();	
			//--==>> GradeVO@15db9742 GradeVO@6d06d69c GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e 
		
		*/
		
		//				��
		
		//��ü�� ���� ����ϴ� ���� �ƴ϶�
		//��ü�� �����ִ� �Ӽ��� �����Ͽ� ����� �� �ֵ��� ó��
		
		Iterator<GradeVO> it1 = set2.iterator();

		while (it1.hasNext())
		{	
			GradeVO vo = it1.next();
			//System.out.println(vo.getHak() + " " + vo.getName() + " " +vo.getKor() + " " +vo.getEng() +" " +vo.getMat());
			System.out.printf("%7s %4s %3d %3d %3d %6d%n", vo.getHak(), vo.getName(), vo.getKor(), vo.getEng(), vo.getMat(), vo.getTotal());
			/*
			System.out.print(it1.next().getName()+ " ");
			System.out.print(it1.next().getKor()+ " ");
			System.out.print(it1.next().getEng()+ " ");
			System.out.print(it1.next().getMat()+ " ");
			*/
		}
		System.out.println();
		
		//--==>>
		/*
		(�й� �������� ���� ����)
		2206113  ������  90  80  70    240
		2206115  �ֵ���  91  81  71    243
		2206128  ���α�  88  78  68    234
		2206139  ������  70  60  50    180
		2206150  ������  99  82  72    253
		*/

		/*
		(�й� �������� ���� ����)
		2206150  ������  99  82  72    253
		2206139  ������  70  60  50    180
		2206128  ���α�  88  78  68    234
		2206115  �ֵ���  91  81  71    243
		2206113  ������  90  80  70    240
		*/
		
		/*
		//	���� ����(��������)
		2206139  ������  70  60  50    180
		2206128  ���α�  88  78  68    234
		2206113  ������  90  80  70    240
		2206115  �ֵ���  91  81  71    243
		2206150  ������  99  82  72    253
		*/

		/*
		//	���� ����(��������)
		2206150  ������  99  82  72    253
		2206115  �ֵ���  91  81  71    243
		2206113  ������  90  80  70    240
		2206128  ���α�  88  78  68    234
		2206139  ������  70  60  50    180
		*/
		
		// �̸� ����(��������)
		/*
		2206128  ���α�  88  78  68    234
		2206113  ������  90  80  70    240
		2206150  ������  99  82  72    253
		2206139  ������  70  60  50    180
		2206115  �ֵ���  91  81  71    243	
		*/

		// �̸� ����(��������)
		/*
		2206115  �ֵ���  91  81  71    243
		2206139  ������  70  60  50    180
		2206150  ������  99  82  72    253
		2206113  ������  90  80  70    240
		2206128  ���α�  88  78  68    234


		*/
		

	}
}
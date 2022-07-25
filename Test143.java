/*=============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
 	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Calendar Ŭ����
=============================================*/	
/*

��  java.util.Calendar Ŭ������
	��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
	��, ��, ��, ����, ��, ��, �� ������
	�ð��� ��¥�� ���õ� ������ �����Ѵ�
	�׸���, Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
	�������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
	GregorianCalendar Ŭ������ ���ǵǾ� �ִ�

	�ý������κ��� ���� �ý��� �ð� ������ ���� ��
	getInstance()��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�
	������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������
	�� ��ü�� �����Ǹ� �����ִ� �ð� ��������
	get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

	getInstance() �޼ҵ�� ���������δ� GregorianCalendar ��ü�� �����Ͽ� 
	�����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
	���� ���� �ִ�
*/

/*
��  �ǽ� ����
	����ڷκ��� ��, ���� �Է¹޾�
	�޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�
	��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�
	��API Document �����Ͽ� getActualMaximum() �޼ҵ��� Ȱ�� ��� ������ ��~!!!


���� ��)
���� �Է� 0
���� �Է� 2022
�� �Է� -20
�� �Է� 16
�� �Է� 7

	[2022�� 7��]

  ��  ��  ȭ  ��  ��  ��  ��
============================
                      1   2
  3   4   5   6   7   8   9
 10  11  12  13  14  15  16
 17  18  19  20  21  22  23
 24  25  26  27  28  29  30
 31
============================
����Ϸ��� �ƹ�Ű�� ��������...
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
//import java.util.GregorianCalendar;
public class Test143
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader Ŭ���� ��� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		//�ֿ� ���� ����
		int y, m;		//-- ��, ��
		int w;			//-- ����
		int i;			//-- ���� ����

		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
		
		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		
		//����ڷκ��� �Է¹��� ��(y), ��(m)�� �̿��Ͽ�
		//�޷��� ��¥ ����
		cal.set(y, m-1, 1);
		//-- �� ���� �� �Է� ��(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//	 �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�
		//-- �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�
		//	 1���� ���� Ȯ�� �ʿ�~!!!
		
		// ���õ� �޷��� ��¥�κ��� ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		// �׽�Ʈ(Ȯ��)
		//System.out.println(w);
		//--==>> ���� �Է� : 2022
		//		  �� �Է�  : 7
		//					 6 �� 2022�� 7�� ���� �� �ݿ��� �� 2022�� 7�� 1���� �ݿ���~~!!
		
		//��� ��� �� �޷� �׸���
		System.out.println();
		System.out.println("\t\t[ " + y + "�� " + m + "�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");
		for (i=1; i<w; i++)
		{
			System.out.print("    ");
		}
		//�׽�Ʈ(Ȯ��)
		//System.out.printf("%4d", 1);

		// Calendar Ŭ���� ��getActualMaximum()���޼ҵ� check~!!
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d", i);
			w++;							//-- �ݺ����� �����Ͽ� ��¥�� ���� �� ������
											//	 ���ϵ� �Բ� ���� �� �� �ֵ��� ó��
											//-- ������ ������ �Ͽ����� �� �� ����
											//	 ������  ��µ� �� �ֵ��� ó��
			if (w%7==1)
				System.out.println();
		}
		if (w%7!=1)							//-- �Ͽ��� ������ ������� �ʾ��� ��쿡��
			System.out.println();			//	 ���� ó��
		
		System.out.println("============================");
	
	}

}
/*
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Test143
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int y, m, w;
		do
		{
			System.out.print("���� �Է� : ");
			y = sc.nextInt();
		}
		while (y<1);
		
		do
		{
			System.out.print("�� �Է� : ");
			m = sc.nextInt();
		}
		while (m<1 || m>12);
	
	Calendar cal = new GregorianCalendar();
	cal.set(y,m-1,1);
	//System.out.println("�ش� ���� ù�� : " + cal.get(Calendar.DAY_OF_WEEK));
	//�ش� ���� ù�� ���� ���	
	//System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	//�ش� ���� �������� ���� ���
	
	w = cal.get(Calendar.DAY_OF_WEEK);
	System.out.println(w);
	//�ش���� ù�� ���� Ȯ��
	System.out.println();
	System.out.printf("\t[%d�� %d��]%n%n", y, m);
	System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");	//�Ϸ� 4ĭ
	System.out.println("============================");
	for (int i=1; i<cal.get(Calendar.DAY_OF_WEEK); i++)
		System.out.print("    ");
	for (int i=1; i<=cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++)
	{
		System.out.printf("%4d",i);
		w++;

		if (w%7==1)
		{
			System.out.println();
		}
	}
	if (w%7!=1)
	{
		System.out.println();
	}
	


	System.out.println("============================");
	}

}
*/

/* 
1. ������ 1���� ������ �Է��� �ٽ� �޾ƿ´�
2. ���� 1���� �۰ų� 12���� ũ�� �Է��� �ٽ� �޾ƿ´�
3. �ش� ������ �ش���� ù��° ���� ���� �������� �˾Ƴ��� ��
4. �ش� ������ �ش���� ������ ���� ��ĥ���� �˾Ƴ����� (28/29/30/31)
5. �޷� �׸���
6. �����̽��� ����

*/

//���� ���
/*
���� �Է� : 0
���� �Է� : 2022
�� �Է� : -20
�� �Է� : 16
�� �Է� : 7

        [2022�� 7��]

  ��  ��  ȭ  ��  ��  ��  ��
============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
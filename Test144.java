/*=============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
 	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Calendar Ŭ����
=============================================*/	
/*
	�� �ǽ� ����
	   ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
	   Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�

���� ��)
���� ��¥ : 2022-07-26 ȭ����
��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

=========[Ȯ�� ���]===========
200�� �� : xxxx-xx-xx x����
==============================
����Ϸ��� �ƹ�Ű�� ��������...

�� Calendar�� ������ API Document ����~!!
	add()Ȯ�� �� ��
	:���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ�
	�� ����ü.add(Calendar.DATE, �� ��);��

*/
import java.util.Scanner;
import java.util.Calendar;
public class Test144
{
	public static void main(String[] args) 
	{	
		//Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		//Calendar Ŭ���� ��� �ν��Ͻ� ����
		//Calendar now = new Calendar(); [X]
		Calendar now = Calendar.getInstance();
		
		//�ֿ� ���� ����
		int nalsu;					//-- ����ڷκ��� �Է¹��� �� ��
		int y, m, d, w;				//-- ��, ��, ��, ����
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		//������ ��,��,��,���� Ȯ�� (�氡������ : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		//������ ��,��,��,���� Ȯ�ΰ�� ���
		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d +" " +week[w-1] + "����");
		
		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();

		}
		while (nalsu<1);
		
		// check~!!!
		now.add(Calendar.DATE,nalsu);

		System.out.println();
		System.out.println("==========[Ȯ�� ���]==========");
		System.out.printf("%d�� �� : %tF %tA%n", nalsu, now, now);	
	
		// String.format("%tF", �޷°�ü);
		// �� ��-��-�� ������ ���ڿ� ��ȯ

		// String.format("%tA", �޷°�ü);
		// ����� ������ ���ڿ� ��ȯ

	
	}
}

/*
import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test144
{
	public static void main(String[] args) throws IOException
	{	
		Calendar cal = Calendar.getInstance();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y, m, d, w, n;				//y-�� m-�� d-�� w-���� n-�Է°�
		y = cal.get(Calendar.YEAR);		
		m = cal.get(Calendar.MONTH);
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		String week = "";
		switch (w)
		{
		case 1: week="�Ͽ���";break;
		case 2: week="������";break;
		case 3: week="ȭ����";break;
		case 4: week="������";break;
		case 5: week="�����";break;
		case 6: week="�ݿ���";break;
		case 7: week="�����";break;
		}
		System.out.printf("���� ��¥ : %d-%d-%d %s%n", y, m+1, d, week);
		System.out.print("��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		n = Integer.parseInt(br.readLine());


		//���� �� ó�� ����
		//�Է� ���� n���� ���ؼ� ��¥�� ��� �ؾ� �Ѵ�
		cal.add(Calendar.DAY_OF_MONTH,n);
		

		//���
		System.out.println();
		System.out.println("==========[Ȯ�� ���]==========");
		System.out.println(n + "�� �� : " +cal.get(Calendar.YEAR) + "�� " + (cal.get(Calendar.MONTH)+1)+ "�� "
		+ cal.get(Calendar.DAY_OF_MONTH) + "��");
		System.out.println("===============================");	
	}
}
*/
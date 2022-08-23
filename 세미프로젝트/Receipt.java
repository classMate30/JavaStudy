import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Vector;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalTime;

public class Receipt
{
	// �������� ��¥ ����� �ϱ� ���� ������
	static Calendar cal = Calendar.getInstance();
	static LocalDate nd = LocalDate.now();
	static LocalTime nt = LocalTime.now();
	
	//����ð�
	static int hour = nt.getHour();
	//���� ��
	static int minute = nt.getMinute();
	//���� ��
	static int second = nt.getSecond();
	// ���� �ð��� ��� ���� ����ϴ¹� Ȱ��
	static String[] week = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

	static String temp;
	static int receiptNumber;

	public static void receiptDispRun() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(">> �������� ����Ͻðڽ��ϱ�? (��� : Y �Ǵ� y) ");
		temp = br.readLine();
		
		if (temp.equals("Y") || temp.equals("y"))
		{
			if (Pay.selPay == 1)
				receiptDispForCard();	// ī����� �� ī�� ������
			else if (Pay.selPay == 2)
				receiptDispForCash();	// ���ݰ��� �� ���� ������
		}
		// Sales Ŭ������ ��� �ڷῡ Ȱ��Ǵ� ���� �ʱ�ȭ������ �޼ҵ�
		Sales.addSales();
	}

	public static void receiptDispForCard()
	{
		// ���������� �������Ḧ ����� ���
		// �̸� �����Ͽ� �������� ���� �̸��� �������� �������
		RandomDrink.detectRandom();
		System.out.println("\n������������������������������������������������������������������������������������������������������������");
		System.out.println("                    [��   ��   ��]                   \n");
		System.out.printf("%s %02d:%02d:%02d %s         [ �ֹ���ȣ : %04d ]\n\n", nd, hour, minute, second, week[cal.get(Calendar.DAY_OF_WEEK)-1], ++receiptNumber);
		System.out.println("        ������ �޴�    �ɼ�                   ���� ");
		System.out.println("������������������������������������������������������������������������������������������������������������");
		for (int i = 0; i < Cart.vc.size(); i++)
		{
			// ������������ ��ٱ��Ͽ� ���������� ���� ������ ����� �޴���� 
			// ���� ����� ���� ������ -1 ���������Ƿ� ��� ������ +1�� ǥ������
			if (Cart.vc.get(i).getCouponUse() == true)
				System.out.printf("%2d�� %7s %7s %8s %8d�� %3d��\n", i + 1, Cart.vc.get(i).getName(), Cart.vc.get(i).getHoc(), Cart.vc.get(i).getIce()
					, Cart.vc.get(i).getPrice() * Cart.vc.get(i).getCount(), Cart.vc.get(i).getCount() + 1);
			else
				System.out.printf("%2d�� %7s %7s %8s %8d�� %3d��\n", i + 1, Cart.vc.get(i).getName(), Cart.vc.get(i).getHoc(), Cart.vc.get(i).getIce()
					, Cart.vc.get(i).getPrice() * Cart.vc.get(i).getCount(), Cart.vc.get(i).getCount());
		}
		System.out.println("������������������������������������������������������������������������������������������������������������");
	}

	public static void receiptDispForCash()
	{
		receiptDispForCard();
		// ī�� ������ ����� �״�� �������� �ű⿡ �Ž����� ��ĸ� ������
		// pay�� ������ �ݾ�, getChangeSum()�� ReturnChange�� returnChangeSum ������ �������� �޼ҵ�
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.println("�����Ͻ� �ݾ� : " + ReturnChange.pay);
		System.out.println("�Ž�����      : " + ReturnChange.getChangeSum());
		System.out.println("������������������������������������������������������������������������������������������������������������");
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Pay
{
	public static final int card = 1;
	public static final int cash = 2;
	public static final int yes = 1;
	public static final int no = 2;
	public static int selPay = 1;
	public static int selStamp = 1;
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	
	// ����ڷκ��� ���� �Է¹޾� ī�����, ���ݰ����� ���ù޴� �޼���
	public static void cashOrCard() throws IOException
	{
		do
		{
			System.out.print(">> ���� ����� �����Ͽ� �ֽʽÿ�. (1 : ī�� ����,  2 : ���� ����) : ");
			selPay = Integer.parseInt(br.readLine());

			if (selPay < card || selPay > cash)
			{
				System.out.println("�ٽ� �Է��� �ֽʽÿ�.");
				continue;
			}

			switch (selPay)
			{
				// ����ڰ� �Է¹޴� ���� ���� PayCard Ȥ�� PayCash Ŭ������
				// ���� �޼ҵ带 ȣ����
				case card: PayCard.cardInsert(); break;
				case cash: PayCash.cashInsert(); break;
			}
		}
		while (selPay < card || selPay > cash);	
	}
	
	// ī��, Ȥ�� ���� ������ ���������� insert()�޼��� ����.
	public static void insert() throws IOException
	{
		String str;

		if (selPay == card)
			System.out.println("\n���������������������������������������� [ī��  ����] ����������������������������������������");
		else if (selPay == cash)
			System.out.println("\n���������������������������������������� [����  ����] ����������������������������������������");

		do
		{
			System.out.print(">> ���� : Y or y, �ڷ� ���� : Ctrl+z : ");
			str = br.readLine();
			
			// �ڷΰ��⸦ ���������� �ٽ� ������� ���� �ܰ�� ���ư�
			if (str == null)
				cashOrCard();
		}
		while (!(str.equals("y") || str.equals("Y")));
	}
	
	// �����Ϸ� �� ������ ����ó���� ���ÿ� ó���ϴ� �޼ҵ�
	public static void pay(String str) throws IOException
	{
		do
		{
			System.out.print(">> �������� �����Ͻðڽ��ϱ�? (�� : 1 , �ƴϿ� : 2) : ");
			selStamp = Integer.parseInt(br.readLine());

			if (selStamp < yes || selStamp > no)
				System.out.println("�ٽ� �Է��� �ֽʽÿ�.");
		}
		while (selStamp < 1 || selStamp > no);
		
		switch (selStamp)
		{
			// �����ϱ⸦ �����ٸ� �ٽ� �α��θ޼ҵ� ȣ���ϰ�
			// stamp Ŭ������ ���������� �޼ҵ��� printStampResult() ȣ��
			case yes: UserList.userLogin(); Stamp.printStampResult();
			// �������� �ʱ⸦ �����ٸ� �ٷ� ������ ���
			case no: Receipt.receiptDispRun(); break;
		}

		if (str.equals("card"))
			Sales.totalCard += Cart.totalSum;		// ī�� �Ѹ��� ������
		else if (str.equals("cash"))
			Sales.totalCash += Cart.totalSum;		// ���� �Ѹ��� ������
		Sales.totalSale += Cart.totalSum;			// �Ѹ��� ������

		Cart.vc.clear();
		Cart.totalSum = 0;

		System.out.println();

		Cafe.operate();
	}
}
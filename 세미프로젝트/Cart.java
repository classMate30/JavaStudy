import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;
import java.io.IOException;

public class Cart
{
	public static Vector<Drink> vc = new Vector<Drink>();
	public static int sel; 
	public static int totalSum = 0; // �� �ݾ� ����
	public static int couponUseCount = 0;

	public static void printVC() throws IOException
	{
		total();  // �ֹ��� ������ ������ �ݾ��� totalSum�� �����.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n                     [��ٱ���]");
		System.out.println("������������������������������������������������������������������������������������������������������������");

		for (int i = 0; i < vc.size(); i++)
		{
			// ���� ��ٱ����� i��°�� �ش��ϴ� �޴��� ������ ����ߴٸ�
			// ���� �޼ҵ忡 ���� ������ �ϳ� �پ������Ƿ� ����� ���� ����
			// ������ +1�� ����.
			if (vc.get(i).getCouponUse() == true)
				System.out.printf("%2d�� %6s %6s %8s %8d�� %2d��\n", i+1, vc.get(i).getName(), vc.get(i).getHoc(), vc.get(i).getIce()
					, vc.get(i).getPrice() * vc.get(i).getCount(), vc.get(i).getCount() + 1);
			else
				System.out.printf("%2d�� %6s %6s %8s %8d�� %2d��\n", i+1, vc.get(i).getName(), vc.get(i).getHoc(), vc.get(i).getIce()
					, vc.get(i).getPrice() * vc.get(i).getCount(), vc.get(i).getCount());
		}

		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.println("                                  �� �ݾ� : " + totalSum + "��");
		System.out.println("1. �����ϱ�       2.�׸� �����ϱ�       3. �ڷ� ����\n");

		System.out.print(">> ���ϴ� �׸� : ");
		sel = Integer.parseInt(br.readLine());
		System.out.println();

		switch (sel)
		{
			case 1 : 
				if(InitialUI.sel == InitialUI.couponUse && couponUseCount == 0)
				{
					// InitailUI.sel�� InitialUI.couponUse�� ����
					// �ʱ�ȭ�鿡�� ��������� ���� ī�װ��� �����ߴٴ� ���̰�
					// couponUseCount�� 0�̶�� ���� �̹� �ֹ����� ���� ������
					// ������� �ʾҴٴ� ���̹Ƿ� ���� ���� �޼��带 ȣ��
					CouponUse.bargenByCoupon();
					// ���ε� ������ Ȯ���ϱ� ���� �ٽ� �� �� ��ٱ��� ȣ��
					printVC();
				}
				// PayŬ�������� ī�����, ���ݰ��� ���� ����
				Pay.cashOrCard(); 
				break;
			case 2 : remove();						// �����ϸ� �ٽ� ī�װ��� ��.
			case 3 : CategoryUI.categoryRun(); break;
		}
	}
	
	// ������ ������ �̸�, �ɼ��� ���� �޴��� ��ø���Ѽ� ������ ������Ű�� �޼ҵ�
	public static void overLap(Drink dr)
	{
		for(int i = 0; i < vc.size() - 1; i++)
		{
			if ((dr.getName()).equals(vc.get(i).getName()) && (dr.getHoc()).equals(vc.get(i).getHoc()) && dr.getIce().equals(vc.get(i).getIce()))
			{
				int x = vc.get(i).getCount();		// �̸�, �ɼ��� ������� -> ������ 
				x += dr.getCount();					// ���� �ֹ������� �߰���
				vc.get(i).setCount(x);           
				vc.remove(vc.size()-1);				// �׸��� ������ �ֹ�����(�ߺ��� �޴�)�� ���Ϳ��� ����
			}
		}	
	}
	
	// ��ٱ��Ͽ��� �׸��� �����ϴ� �޼ҵ�
	public static void remove() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(">> ������ �׸��� ��ȣ�� �Է��ϼ��� : ");
		int temp = Integer.parseInt(br.readLine());
		totalSum -= vc.get(temp-1).getPrice() * vc.get(temp-1).getCount();
		vc.remove(temp-1);
	}
	
	// ��ٱ��Ͽ� ����ִ� ������ ���� totalSum�� �����ִ� �޼ҵ�
	public static void total()
	{
		int temp = 0;
		for (int i = 0; i < vc.size(); i++)
			temp += vc.get(i).getPrice() * vc.get(i).getCount();
		totalSum = temp;                     
	}
}
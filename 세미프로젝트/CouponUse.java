import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class CouponUse
{
	private static UserList ul = new UserList();
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// �ʱ�ȭ�鿡�� ��������� �����ϸ� ����Ǵ� �޼ҵ�
	public static void couponRun() throws IOException
	{
		System.out.print("\n>> ������ ����Ͻðڽ��ϱ�? (Y �Ǵ� y) : ");
		String temp = br.readLine();
		
		if (temp.equals("Y") || temp.equals("y"))
		{
			// ���� ���� ��뿡�� y�� �����ٸ� userListŬ������
			// userLogion() �޼��� ����
			ul.userLogin();	
			
			// ul.flag�� true�� ����ȸ���̶�� ��
			if (ul.flag)
			{
				// ID�� ������ ���� ������ 0���� ���
				if (ul.couponForLogIn < 1)
				{
					System.out.println("\n������������������������������������������������������������������������������������������������������������");
					System.out.println("��            ��밡���� ������ �����ϴ�!!            ��");
					System.out.println("������������������������������������������������������������������������������������������������������������");
					return;
				}
				// ID�� �ְ� ���� ������ 1�� �̻��� ���
				else
				{
					System.out.println("\n������������������������������������������������������������������������������������������������������������");
					System.out.println("��               �α��ο� �����Ͽ����ϴ�.             ��");
					System.out.println("������������������������������������������������������������������������������������������������������������");
					System.out.println(" - ���� ���� ������ �� : " + ul.user.get(ul.dispUserNumber-1).getStamp());
					System.out.println(" - ���� ���� ���� ��   : " + ul.user.get(ul.dispUserNumber-1).getCoupon());
					CategoryUI.categoryRun();
				}
			}
			// ul.flag == flase�� ����̹Ƿ� ����ȸ���� �ƴ϶�� ��.
			else 
			{
				System.out.println("\n������������������������������������������������������������������������������������������������������������");
				System.out.println("��              ��ġ�ϴ� ID�� �����ϴ�!!              ��");
				System.out.println("������������������������������������������������������������������������������������������������������������");
			}
		}
	}
	
	// ���� ��� ���ý� ȣ��Ǵ� ���� �޼ҵ�
	public static void bargenByCoupon() throws IOException
	{
		int sel;

		System.out.println(">> ������ ����� �޴� ��ȣ�� �Է����ּ���.");
		System.out.print(">> �޴� ��ȣ �Է� : ");
		sel = Integer.parseInt(br.readLine());
		
		// ����� ��Ȳ�� �������ݾ��� �ݿ�����
		Sales.totalCoupon += Cart.vc.get(sel - 1).getPrice();
		
		// ���� ������ �޴���ȣ�� ���᰹���� 1����� �ܼ��ϰ� ���ݸ� 0������ ��������
		if (Cart.vc.get(sel - 1).getCount() == 1)
			Cart.vc.get(sel - 1).setPrice(0);
		// 1���� �ƴ϶� ��������� ������ -1 ������. (���� ��� ������ �ش� ��ü�� price * count �̹Ƿ�)
		Cart.vc.get(sel - 1).setCount(Cart.vc.get(sel - 1).getCount() - 1);
		
		Cart.couponUseCount++; // Cart�� couponUseCount�� 1�� ����������. �� ������ 1�̸� ������ �ٽ� ��� �� ��.
		// �ش� ���� ��ü�� couponUse ������ true�� ��ȯ������ (���߿� ��ٱ��ϳ� ������ ��½� ���)
		Cart.vc.get(sel - 1).setCouponUse(true);
	}
}
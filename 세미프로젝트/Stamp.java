public class Stamp extends UserList
{
	// �α��� �� ������ �������� ������ ��
	public static int userStamp;
	// �α��� �� ������ �������� ���� ��
	public static int userCoupon;
	public static int drinkCountForStamp;

	public static void stampCal()
	{
		// ������ ������ ������ ���� ����
		drinkCountForStamp = 0;
		
		// couponUseCount�� 0�� �ƴ϶�� ���� ������ ����� ���ᰡ �ִٴ� ���̹Ƿ�
		// ���� ���� �������� -1 ������.
		// �׸��� couponUseCount�� ������ ���⼭ �������Ƿ� �ٽ� 0���� �ʱ�ȭ������.
		if (Cart.couponUseCount != 0)
		{
			drinkCountForStamp--;
			userCoupon--;
			Cart.couponUseCount = 0;
		}
		
		// ��ٱ��Ͽ� ��� ���� ��ü�� �ݺ������� ã�Ƽ�
		// �����ڰ� ������ ���� ������ŭ drinkCountForStamp ������ ����������
		for (int i = 0; i < Cart.vc.size(); i++)
		{
			drinkCountForStamp += Cart.vc.get(i).getCount();		// �����ڰ� ������ ���� ����
			
			// ��ٱ��� ���� ��ü �� ������ ����� �޴��� �ִٸ� if�� ����
			if (Cart.vc.get(i).getCouponUse() == true)
			{
				// ���� �ڵ�� �浹�� ����Ű�� �ڵ��ε�
				// ó������ ���� ���θ޼ҵ带 �ۼ��� �� ���������� �����ؼ� �����Ϸ��� ������
				// �����ϰ� ������ �����ϴ� ������� �ٲ�.
				// ������ �����Ҷ��� ������ -1�� �����༭ �� �¾Ҿ��µ�
				// ������ �����ϴ� ������� �ٲٴϱ� ���᰹���� -2�� �ż�
				// ���⼭ �ٽ� +1�� �����ִ� ������� ������ ��������.
				drinkCountForStamp++;
				// �ش� ���ᰴü�� CouponUse�� �ٽ� false�� ��ȯ����
				Cart.vc.get(i).setCouponUse(false);
			}
		}
		
		// ���� �������� �������ŭ ����������
		userStamp += drinkCountForStamp;
		
		// ������������ 10���� �Ѿ�� if�� ����
		if (userStamp >= 10)
		{
			// ���� ���� userStamp�� 10���� ���� ��ŭ ����������
			userCoupon += userStamp / 10;
			// ������ ���� 10���� ���� ������ ��ŭ�� �ٽ� ���Խ�����
			userStamp = userStamp % 10;
		}
	}
	
	// ���� ��� ��� �޼ҵ�
	public static void printStampResult()
	{
		System.out.println("\n������������������������������������������������������������������������������������������������������������");
		System.out.println("��            ������ ������ �Ϸ�Ǿ����ϴ�.           ��");
		System.out.println("������������������������������������������������������������������������������������������������������������");
		
		// ���� ȸ������ �α��� �������� flag ������ true
		if (flag == true)
		{
			// UserList���� ������ ȸ����ȣ�� ���⼭ �α����� ���� ������ �ҷ����� ���� �ε��� ��ȣ�� ����
			System.out.println("- ���� �� ������ �� : " + user.get(dispUserNumber - 1).getStamp());
			System.out.println("- ���� �� ���� ��   : " + user.get(dispUserNumber - 1).getCoupon());
			flag = false;
		}
		else
		{
			// flag�� false�� ���� �ű�ȸ���� ���
			// �ε��� ��ȣ�� ������ add������ ���� �� ���̹Ƿ� user.size()-1 ��°�� ��ü�� ��ȸ����
			System.out.println("- ���� �� ������ �� : " + user.get(user.size() - 1).getStamp());
			System.out.println("- ���� �� ���� ��   : " + user.get(user.size() - 1).getCoupon());
		}
		System.out.println("������������������������������������������������������������������������������������������������������������");
	}
}
public class User
{
	private String phoneNumber;
	private int stamp = 0;
	private int coupon = 0;
	private int userNumber;

	User()
	{
	}
	
	// ���� ���� ������
	// �ű�ȸ������ ���� �� �Ű����� �ִ� ������ Ȱ��
	User(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
		stamp = 0;
		coupon = 0;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public int getStamp()
	{
		return stamp;
	}

	public void setStamp(int stamp)
	{
		this.stamp = stamp;
	}
	
	public int getCoupon()
	{
		return coupon;
	}

	public void setCoupon(int coupon)
	{
		this.coupon = coupon;
	}

	public int getUserNumber()
	{
		return userNumber;
	}

	public void setUserNumber(int userNumber)
	{
		this.userNumber = userNumber;
	}
}
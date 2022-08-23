public class Drink
{
	private String name; // �ش� ������ �̸�							 ex) �Ƹ޸�ī��
	private int price;   // �ش� ������ ���� ����						 ex) 1500
	private String hoc;  // option �޼ҵ�� �ʱ�ȭ�� hot or cold		 ex) cold
	private String ice;  // option �޼ҵ�� �ʱ�ȭ�� ������			     ex) ���� ����
	private int count;   // cupsCount �޼ҵ�� �ʱ�ȭ �� �ֹ� ����		 ex)  3
	private int categoryNumber; // �ش� ī�װ��� ���ù�ȣ�� ���� ����	 ex)  0  (���� �����ڿ��� �ʱ�ȭ��.) - Sales �� addSales �޼ҵ��������ؼ� ����
	private int drinkNumber;    // �ش� ������     ���ù�ȣ�� ���� ����  ex)  0  (���� �����ڿ��� �ʱ�ȭ��.) - ���� ����
	private boolean couponUse;

	public Drink(String hoc, String ice, int count)  // Option �޼ҵ�� �޾ƿ� ���� �Ű������� �ν��Ͻ� ����.
	{
		this.hoc = hoc;                        
		this.ice = ice;
		this.count = count;
		categoryNumber = CategoryUI.sel - 1; 
		drinkNumber = DrinkUI.sel - 1;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public String getHoc()
	{
		return hoc;
	}

	public void setHoc(String hoc)
	{
		this.hoc = hoc;
	}

	public String getIce()
	{
		return ice;
	}

	public void setIce(String ice)
	{
		this.ice = ice;
	}

	public int getCount()
	{
		return count;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}

	public int getCategoryNumber()
	{
		return categoryNumber;
	}
	
	public void setCategoryNumber(int categoryNumber)
	{
		this.categoryNumber = categoryNumber;
	}

	public int getDrinkNumber()
	{
		return drinkNumber;
	}
	
	public void settDrinkNumber(int drinkNuber)
	{
		this.drinkNumber = drinkNumber;
	}

	public boolean getCouponUse()
	{
		return couponUse;
	}
	
	public void setCouponUse(boolean couponUse)
	{
		this.couponUse = couponUse;
	}

}
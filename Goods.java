public class Goods
{
	private String name;
	private int price;
	private int count;
	private int number;

	public Goods()
	{
		name="";
		price=0;
		count=0;
		number=0;
	}		
	//������(��ǰ ��, ����, ����)
	public Goods(int number, String name, int price, int count)		// 
	{
		this.number = number;
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}

	//	 �̸�
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	// ����
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}

	// ��ǰ ���Ž� ��� ������Ʈ		
	public void countDown()
	{
		count--;
	}
	public void countUp()
	{
		count++;
	}
}
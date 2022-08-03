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
	//생성자(상품 명, 가격, 수량)
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

	//	 이름
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	// 가격
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}

	// 상품 구매시 재고 업데이트		
	public void countDown()
	{
		count--;
	}
	public void countUp()
	{
		count++;
	}
}
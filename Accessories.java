public class Accessories implements Items
{
	int itemId;
	String name;
	int amount;
    int price;
    long date;

	
	public Accessories(int itemId, String name, int price, int amount)
	{
        this.itemId = itemId;
		this.name = name;
        this.price = price;
		this.amount = amount;
        this.date = System.currentTimeMillis();
	}

	public void add(){};							//부족한 재고를 파악해서 Maximum(10)까지 한번에 채워주는 기능을 담당하는 메소드
	public String getName(){return this.name;};		//Name을 리턴 하는 함수
	public int getPrice(){return this.price;};		//Price를 리턴 하는 함수
	public int getAmount(){	return  this.amount;};
													//Amount를 리턴 하는 함수					
										
	public int getId(){return this.itemId;};

	public int getSize(int n){return 0;};

	public void setSize(String s){};
}
public class Accessories implements Items //잡화
{ 
	int itemId;
	String name;
	int amount;
    int price;
	
	public Accessories(int itemId, String name, int price, int amount)
	{
        this.itemId = itemId;
		this.name = name;
        this.price = price;
		this.amount = amount;
	}
	public void fill(){ //부족한 재고를 파악해서 Maximum(10)까지 한번에 채워주는 기능을 담당하는 메소드
		this.amount = amount + 5 ;
	}
	public String getName(){return name;}		//Name을 리턴 하는 함수
	public int getPrice(){return price;}		//Price를 리턴 하는 함수
	public int getAmount(){	return amount;}      //Amount를 리턴 하는 함
	public boolean setAmount(){
		
			if (this.amount==0)
			{
				System.out.println("<<품절>> 구매 불가능 합니다.");
				return false ;
			}
			else {
				this.amount = amount - 1;
				return true ;
			}
	
	} //Amount를 설정 하는 함수(-1 해줌)

	@Override
	public String toString() {
		return itemId + ". " + name + "는 현재 " + amount + "개 입니다.";
	}
}
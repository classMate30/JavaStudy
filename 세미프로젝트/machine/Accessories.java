public class Accessories implements Items //��ȭ
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
	public void fill(){ //������ ��� �ľ��ؼ� Maximum(10)���� �ѹ��� ä���ִ� ����� ����ϴ� �޼ҵ�
		this.amount = amount + 5 ;
	}
	public String getName(){return name;}		//Name�� ���� �ϴ� �Լ�
	public int getPrice(){return price;}		//Price�� ���� �ϴ� �Լ�
	public int getAmount(){	return amount;}      //Amount�� ���� �ϴ� ��
	public boolean setAmount(){
		
			if (this.amount==0)
			{
				System.out.println("<<ǰ��>> ���� �Ұ��� �մϴ�.");
				return false ;
			}
			else {
				this.amount = amount - 1;
				return true ;
			}
	
	} //Amount�� ���� �ϴ� �Լ�(-1 ����)

	@Override
	public String toString() {
		return itemId + ". " + name + "�� ���� " + amount + "�� �Դϴ�.";
	}
}
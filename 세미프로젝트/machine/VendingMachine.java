//속성 + 기능 클래스 선에서 강조
//합쳐서 쓰면 자료구조 필요(현재 단계에선 자료구조 고려 안함)
//★money랑 coin이라는 변수이름 조심해야함★ 
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine
{
	//주요 변수들 선언
	private List<Items> items ;
	private MoneyInsert moneyinsert;
	private Sales sales;

	public VendingMachine()
	{	
		//List 인덱스로 이것들을 접근할 수 있게 됨
		items = new ArrayList<>();		//선언 이유
		items.add(new Clothes(1, "민소매", 5000, new int[]{5,5,5}));
		items.add(new Clothes(2, "반팔", 15000, new int[]{5,5,5}));
		items.add(new Clothes(3, "코트", 50000, new int[]{5,5,5}));
		items.add(new Clothes(4, "패딩", 100000, new int[]{5,5,5}));
		items.add(new Clothes(5, "히트텍상의", 10000, new int[]{5,5,5}));
		items.add(new Clothes(6, "반바지", 15000, new int[]{5,5,5}));
		items.add(new Clothes(7, "긴바지", 20000, new int[]{5,5,5}));
		items.add(new Clothes(8, "기모바지", 30000, new int[]{5,5,5}));
		items.add(new Clothes(9, "냉장고바지", 10000, new int[]{5,5,5}));
		items.add(new Clothes(10, "히트텍하의", 10000, new int[]{5,5,5}));
		items.add(new Accessories(11, "우산", 3000,5));
		items.add(new Accessories(12, "모자", 15000,5));
		items.add(new Accessories(13, "목도리", 15000,5));
		items.add(new Accessories(14, "장갑", 10000,5));
		items.add(new Accessories(15, "선글라스", 30000,5));
		moneyinsert  = new MoneyInsert() ;
		sales = new Sales(items);
	}
	public void getRanking() {
		sales.ranking();
	}
	public void moneyDisplay() {
		moneyinsert.Display();
	}
	public int getSalesAll() {
		return sales.getsumAll();
	}
	public void ItemsDisplay() {
		for(Items item : items){
			System.out.println(item);
		}
	}
	public List<Items> getItems() {return this.items;}
	public Sales getSales()
	{
		return this.sales;
	}
	public int getInsert(){
		int coin = moneyinsert.insert_coin();
		return coin ;
	}
	public void returnRemainMoney(int remain)
	{
		moneyinsert.returnMoney(remain);
	}
	public void stockUp(int itemId) {
		if (itemId >= 0 && itemId < 15)
		{
			items.get(itemId).fill();
			System.out.println(items.get(itemId).getName() + " 이(가) 5개 추가되었습니다.");
		}
		else
		{
			System.out.print("잘못 입력하셨습니다.");
		}
	}
	public boolean buy(int itemId) {
		boolean result = items.get(itemId).setAmount();
		return result ;
	}
}
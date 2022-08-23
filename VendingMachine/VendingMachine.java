//속성 + 기능 클래스 선에서 강조
//합쳐서 쓰면 자료구조 필요(현재 단계에선 자료구조 고려 안함)
//★money랑 coin이라는 변수이름 조심해야함★ 
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine
{
	public MoneyInsert moneyinsert;
	//주요 변수들 선언
	private List<Items> items ;
	private int amount = 5;
	private int total = 0;
	private Sales sales;

	//금액 집어넣기 실행 테스트
	//"총 금액이 얼마인게 맞습니까 ?" profit 
	//밴딩 머신에서 재고 관리 및 돈 관리 ??????????????
	//System.out.println("S" + size[0]);
	
	//핵심
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
		items.add(new Accessories(11, "우산", 3000,amount));
		items.add(new Accessories(12, "손풍기", 15000,amount));
		items.add(new Accessories(13, "목도리", 15000,amount));
		items.add(new Accessories(14, "장갑", 10000,amount));
		items.add(new Accessories(15, "선글라스", 30000,amount));
		moneyinsert  = new MoneyInsert() ;
		sales = new Sales(items);
	}
	public List<Items> getItems() {return this.items;}
	public boolean buy(int itemId) {
		// 돈 체크 부터
		this.items.get(itemId).setAmount();
		return true ;
	}
	public int pay(int totalprice) {
		// 돈 체크 부터
		int remain = this.moneyinsert.setSum_coin(totalprice);
		
		return remain;
	}

	public boolean stock(int itemId){							//
		this.items.get(itemId).fill();
		return true ;
	}
	public int getItemIdPrice(int itemId){						//해당 물건 가격 띄워주는 기능				
		return this.items.get(itemId).getPrice();
	}			
	public int getInsert(){
		int coin = moneyinsert.insert_coin();
		return coin ;
	}
	public int totalReturn(){return total;}						//합계 리턴 기능
	public void setTotal(int price){total += price ;}			//돈 추가 기능

	public String getName(int itemId){
		return this.items.get(itemId).getName();
	}

	public Sales getSales()
	{
		return this.sales;
	}
	
	public void returnRemainMoney(int remain)
	{
		moneyinsert.returnMoney(remain);
		total = 0;
	}
}
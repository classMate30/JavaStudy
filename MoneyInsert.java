import java.util.ArrayList;
import java.util.Scanner;
public class MoneyInsert {
	// 우선 변수명을 맘대로 설정했음
	int coin;
	int sum_coin = 0;
	private ArrayList<Money> money_list;


	public MoneyInsert() {
		money_list = new ArrayList<>();
		money_list.add(new Money(1, 50000, 20));    //money.get(0).amount
		money_list.add(new Money(2, 10000, 20));
		money_list.add(new Money(3, 5000, 20));
		money_list.add(new Money(4, 1000, 20));
		money_list.add(new Money(5, 500, 20));
		money_list.add(new Money(6, 100, 20));
	}
	// 현금 투입 메소드
	int insert_coin() {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("현금을 투입하세요. : ");
			System.out.println("①:50000원 ②:10000원 ③:5000원 ④:1000원 ⑤:500원 ⑥:100원 ");
			coin = sc.nextInt();
			money_list.get(coin - 1).setAmount(1); // 자판기 보유 화폐 증가
			int now_coin = money_list.get(coin - 1).getValue();
			sum_coin += now_coin;
			System.out.println("현재투입된 금액은 : " + sum_coin);
			
			System.out.println("더 넣으시겠습니까? : Y/N ");
			String check = sc.next() ;
			if (check.equals("N") || check.equals("n") ) {
				flag = false;

			}
		}
	//	System.out.println("현재투입된 금액은 : " + sum_coin);	  //22.08.07 15:57분 수정 오류시 돌아올 것
		return sum_coin ;
	}

	public ArrayList<Money> getMoney_list() {
		return money_list;
	}

	public int getSum_coin() {
		return sum_coin;
	}
	public int setSum_coin(int price) {
		return sum_coin -= price ;
	}
	public void Display()
	{
		System.out.println(" 현금 단위      현금 수량");
		System.out.println("===================================================");
		for (Money money : money_list)
			System.out.printf(" %-5d (원)      %2d\n",money.getValue(),money.getAmount());
		System.out.println("===================================================");
	}

	public void returnMoney(int remain)
	{	
		int _50000won = sum_coin /50000;
		int _10000won = sum_coin %50000/10000;
		int _5000won = sum_coin  %50000%10000/5000;
		int _1000won = sum_coin  %50000%10000%5000/1000;
		int _500won = sum_coin   %50000%10000%5000%1000/500;
		int _100won = sum_coin   %50000%10000%5000%1000%500/100;
		/*
		System.out.println("50000원 권 :" + _50000won + "개 입니다.");
		System.out.println("10000원 권 :" + _10000won + "개 입니다.");
		System.out.println("5000원 권 :" + _5000won+ "개 입니다.");
		System.out.println("1000원 권 :" + _1000won +"개 입니다.");
		System.out.println("500원 권 :" + _500won +"개 입니다.");  
		System.out.println("100원 권 :" + _100won+ "개 입니다.");  
		*/
		//거스름돈 반환 후의 자판기가 가지고 있는 거스름돈 통에서 차감
		money_list.get(0).setAmount(-_50000won);
		money_list.get(1).setAmount(-_10000won);
		money_list.get(2).setAmount(-_5000won);
		money_list.get(3).setAmount(-_1000won);
		money_list.get(4).setAmount(-_500won);
		money_list.get(5).setAmount(-_100won);
		System.out.println(sum_coin + "원 을 반환합니다");
		System.out.println();
		System.out.println("이용해 주셔서 감사합니다.");
		System.out.println();
		sum_coin=0;
	}
}



















		
		//테스트(확인) 자판기에 넣은 화폐 개수 확인
		/*
		System.out.println(" 오만원 :"+_50000won);
		System.out.println(" 만  원 :"+_10000won);
		System.out.println(" 오천원 :"+_5000won);
		System.out.println(" 천  원 :"+_1000won);
		System.out.println(" 오백원 :"+_500won);
		System.out.println(" 백  원 :"+_100won);
		*/


/*
	_50000won = 잔금 /50000;
   _10000won = 잔금 %50000/10000;
   _5000won = 잔금 %50000%10000/5000;
   _1000won = 잔금 %50000%10000%5000/1000;
   _500won = 잔금 %50000%10000%5000%1000%500;
   _100won = 잔금  %50000%10000%5000%1000%500%100;
*/
/*
	public void showCoinCount ( )
	{
		//거스름돈 반환 후의 자판기가 가지고 있는 거스름돈 통에서 차감
		_50000won -= this._50000won;
		_10000won -= this._10000won;
		_5000won -= this._5000won;
		_1000won -= this._1000won;
		_500won -= this._500won;
		_100won -= this._100won;
	}
*/
	

/*
	public static void main(String[] args)
	{
		MoneyInsert mi = new MoneyInsert();
		mi.insert_coin();
	}
*/

/*

*/
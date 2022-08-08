import java.util.ArrayList;
import java.util.Scanner;
public class MoneyInsert {
	// 우선 변수명을 맘대로 설정했음
	int coin;
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
	int insert_coin() {
		Scanner sc = new Scanner(System.in);
		int sum_coin = 0;
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
		return sum_coin ;
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
		money_list.get(0).setAmount(remain/50000);
		money_list.get(1).setAmount(remain%50000/10000);
		money_list.get(2).setAmount(remain%50000%10000/5000);
		money_list.get(3).setAmount(remain%50000%10000%5000/1000);
		money_list.get(4).setAmount(remain%50000%10000%5000%1000/500);
		money_list.get(5).setAmount(remain%50000%10000%5000%1000%500/100);
		System.out.println(remain + "원 을 반환합니다");
		System.out.println();
		System.out.println("이용해 주셔서 감사합니다.");
		System.out.println();
		/*
		System.out.println("50000원 권 :" + _50000won + "개 입니다.");
		System.out.println("10000원 권 :" + _10000won + "개 입니다.");
		System.out.println("5000원 권 :" + _5000won+ "개 입니다.");
		System.out.println("1000원 권 :" + _1000won +"개 입니다.");
		System.out.println("500원 권 :" + _500won +"개 입니다.");
		System.out.println("100원 권 :" + _100won+ "개 입니다.");
		*/
		//거스름돈 반환 후의 자판기가 가지고 있는 거스름돈 통에서 차감
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

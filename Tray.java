import java.util.Scanner;
public class Tray
{
	private String name;
	private int price;
	void insert_coin()
	{	
		Scanner sc = new Scanner(System.in);
		int coin;
		int money=0;
		boolean flag = true;
		System.out.println("현금을 투입하세요. : ");
		
		while(flag)
		{
			System.out.print("①:10000원 ②:5000원 ③:1000원 ④:500원 ⑤:500원");
			coin = sc.nextInt();

			switch (coin)
			{
			case 1: money += 10000; break;
			case 2: money += 5000; break;
			case 3: money += 1000; break;
			case 4: money += 500; break;
			case 5: money += 100; break;
			default : flag = false;
			}
			
		}
		System.out.println("현재 투입된 금액 : "+ money);
	}

/*
	_50000won = 잔금 /50000;
	_10000won = 잔금 %50000/10000;
	_5000won = 잔금 %50000%10000/5000;
	_1000won = 잔금 %50000%10000%5000/1000;
	_500won = 잔금 %50000%10000%5000%1000%500;
	_100won = 잔금  %50000%10000%5000%1000%500%100;
*/

	public static void main(String[] args)
	{
		Tray mc = new Tray();
		mc.insert_coin();
	}
}
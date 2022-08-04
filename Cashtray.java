import java.util.Scanner;
public class Cashtray extends CoinList	// 코인리스트 상속
{
	int max = 20;	//자판기에 채워질 화폐 수
	int coin;
	int _50000won=0,_10000won=0,_5000won=0,_1000won=0,_500won=0,_100won=0;
	int totalMoney=0;


	//사용자 화폐 투입기
	void insert_coin()
	{	
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("현금을 투입하세요. : ");
		
		while(flag)
		{
			System.out.print("①:50000원 ②:10000원 ③:5000원 ④:1000원 ⑤:500원 ⑥:100원 ");	
			coin = sc.nextInt();

			switch (coin)
			{
			case 1: _50000won += 1; break;
			case 2: _10000won += 1; break;
			case 3: _5000won += 1; break;
			case 4: _1000won += 1; break;
			case 5: _500won += 1; break;
			case 6: _100won += 1; break;
			default : flag = false;
			}
			totalMoney=_50000won*50000+_10000won*10000+_5000won*5000+_1000won*1000+_500won*500+_100won*100;
		}
		System.out.println("\n현재 투입된 금액 : "+ totalMoney);
		
		//테스트(확인) 자판기에 넣은 화폐 개수 확인
		/*
		System.out.println("[현재 투입한 화폐]");
		System.out.printf(" %-5d(원) : %d\n",50000,+_50000won);
		System.out.printf(" %-5d(원) : %d\n",10000,+_10000won);
		System.out.printf(" %-5d(원) : %d\n",5000,+_5000won);
		System.out.printf(" %-5d(원) : %d\n",1000,+_1000won);
		System.out.printf(" %-5d(원) : %d\n",500,+_500won);
		System.out.printf(" %-5d(원) : %d\n",100,+_100won);
		*/

	}
	
	//사용자 화폐 투입 후 (자판기가 가지고있는 금액)
	void discCoins() 
	{
		coins[0] += _50000won;
		coins[1] += _10000won;
		coins[2] += _5000won;
		coins[3] += _1000won;
		coins[4] += _500won;
		coins[5] += _100won;

		System.out.println("\n [ 자판기 현금 확인 ]");
		System.out.printf("[ 금 액 ]     [ 매수 ]\n");
		for (int i=0;i<coins.length ;i++ )
		{
			System.out.printf(" %-6d(원)  |",value[i]);
			System.out.printf("%4d\n",coins[i]);
		}
	}

	//사용자에게 거스름돈 반환하는 메소드
	/*int change (int balance)// 잔금
	{
		_50000won = balance /50000;
		_10000won = balance %50000/10000;
		_5000won = balance %50000%10000/5000;
		_1000won = balance %50000%10000%5000/1000;
		_500won = balance %50000%10000%5000%1000%500;
		_100won = balance %50000%10000%5000%1000%500%100;

		return 
	}
	 
	for(int i=0; i<coins[].length; i++) 
	{
        if(price/coins[i] > 0) 
			{
                System.out.println(coins[i]+"원 : "+price/coins[i]+" 개 ");
                price%=coins[i];
            }
        }System.out.println();
	*/
		
	

	//각 화폐의 max값 만큼 화폐 추가 기능(거스름통 채우기)
	void maxCoins()
	{
		System.out.println("\n [자판기 현금 채우기]");
		System.out.printf("[ 금 액 ]     [ 매수 ]\n");
		for (int i=0; i<coins.length ;i++ )
		{
			for (int j=1;j<=max ;j++ )
			{
				coins[i]+=1;
			}
				
				System.out.printf(" %-6d(원)  |",value[i]);
				System.out.printf("%5d\n",coins[i]);
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Cashtray ct = new Cashtray();
		ct.discCoins();
		ct.maxCoins();
		ct.insert_coin();
		ct.discCoins();
		
	}
	

}

import java.util.Scanner;
public class Cashtray extends CoinList	// ���θ���Ʈ ���
{
	int max = 20;	//���Ǳ⿡ ä���� ȭ�� ��
	int coin;
	int _50000won=0,_10000won=0,_5000won=0,_1000won=0,_500won=0,_100won=0;
	int totalMoney=0;


	//����� ȭ�� ���Ա�
	void insert_coin()
	{	
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("������ �����ϼ���. : ");
		
		while(flag)
		{
			System.out.print("��:50000�� ��:10000�� ��:5000�� ��:1000�� ��:500�� ��:100�� ");	
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
		System.out.println("\n���� ���Ե� �ݾ� : "+ totalMoney);
		
		//�׽�Ʈ(Ȯ��) ���Ǳ⿡ ���� ȭ�� ���� Ȯ��
		/*
		System.out.println("[���� ������ ȭ��]");
		System.out.printf(" %-5d(��) : %d\n",50000,+_50000won);
		System.out.printf(" %-5d(��) : %d\n",10000,+_10000won);
		System.out.printf(" %-5d(��) : %d\n",5000,+_5000won);
		System.out.printf(" %-5d(��) : %d\n",1000,+_1000won);
		System.out.printf(" %-5d(��) : %d\n",500,+_500won);
		System.out.printf(" %-5d(��) : %d\n",100,+_100won);
		*/

	}
	
	//����� ȭ�� ���� �� (���ǱⰡ �������ִ� �ݾ�)
	void discCoins() 
	{
		coins[0] += _50000won;
		coins[1] += _10000won;
		coins[2] += _5000won;
		coins[3] += _1000won;
		coins[4] += _500won;
		coins[5] += _100won;

		System.out.println("\n [ ���Ǳ� ���� Ȯ�� ]");
		System.out.printf("[ �� �� ]     [ �ż� ]\n");
		for (int i=0;i<coins.length ;i++ )
		{
			System.out.printf(" %-6d(��)  |",value[i]);
			System.out.printf("%4d\n",coins[i]);
		}
	}

	//����ڿ��� �Ž����� ��ȯ�ϴ� �޼ҵ�
	/*int change (int balance)// �ܱ�
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
                System.out.println(coins[i]+"�� : "+price/coins[i]+" �� ");
                price%=coins[i];
            }
        }System.out.println();
	*/
		
	

	//�� ȭ���� max�� ��ŭ ȭ�� �߰� ���(�Ž����� ä���)
	void maxCoins()
	{
		System.out.println("\n [���Ǳ� ���� ä���]");
		System.out.printf("[ �� �� ]     [ �ż� ]\n");
		for (int i=0; i<coins.length ;i++ )
		{
			for (int j=1;j<=max ;j++ )
			{
				coins[i]+=1;
			}
				
				System.out.printf(" %-6d(��)  |",value[i]);
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

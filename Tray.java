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
		System.out.println("������ �����ϼ���. : ");
		
		while(flag)
		{
			System.out.print("��:10000�� ��:5000�� ��:1000�� ��:500�� ��:500��");
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
		System.out.println("���� ���Ե� �ݾ� : "+ money);
	}

/*
	_50000won = �ܱ� /50000;
	_10000won = �ܱ� %50000/10000;
	_5000won = �ܱ� %50000%10000/5000;
	_1000won = �ܱ� %50000%10000%5000/1000;
	_500won = �ܱ� %50000%10000%5000%1000%500;
	_100won = �ܱ�  %50000%10000%5000%1000%500%100;
*/

	public static void main(String[] args)
	{
		Tray mc = new Tray();
		mc.insert_coin();
	}
}
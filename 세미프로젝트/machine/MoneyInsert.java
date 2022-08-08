import java.util.ArrayList;
import java.util.Scanner;
public class MoneyInsert {
	// �켱 �������� ����� ��������
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
			System.out.println("������ �����ϼ���. : ");
			System.out.println("��:50000�� ��:10000�� ��:5000�� ��:1000�� ��:500�� ��:100�� ");
			coin = sc.nextInt();
			money_list.get(coin - 1).setAmount(1); // ���Ǳ� ���� ȭ�� ����
			int now_coin = money_list.get(coin - 1).getValue();
			sum_coin += now_coin;
			System.out.println("�������Ե� �ݾ��� : " + sum_coin);
			
			System.out.println("�� �����ðڽ��ϱ�? : Y/N ");
			String check = sc.next() ;
			if (check.equals("N") || check.equals("n") ) {
				flag = false;
			}
		}
		return sum_coin ;
	}
	public void Display()
	{
		System.out.println(" ���� ����      ���� ����");
		System.out.println("===================================================");
		for (Money money : money_list)
			System.out.printf(" %-5d (��)      %2d\n",money.getValue(),money.getAmount());
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
		System.out.println(remain + "�� �� ��ȯ�մϴ�");
		System.out.println();
		System.out.println("�̿��� �ּż� �����մϴ�.");
		System.out.println();
		/*
		System.out.println("50000�� �� :" + _50000won + "�� �Դϴ�.");
		System.out.println("10000�� �� :" + _10000won + "�� �Դϴ�.");
		System.out.println("5000�� �� :" + _5000won+ "�� �Դϴ�.");
		System.out.println("1000�� �� :" + _1000won +"�� �Դϴ�.");
		System.out.println("500�� �� :" + _500won +"�� �Դϴ�.");
		System.out.println("100�� �� :" + _100won+ "�� �Դϴ�.");
		*/
		//�Ž����� ��ȯ ���� ���ǱⰡ ������ �ִ� �Ž����� �뿡�� ����
	}


			
}



















		
		//�׽�Ʈ(Ȯ��) ���Ǳ⿡ ���� ȭ�� ���� Ȯ��
		/*
		System.out.println(" ������ :"+_50000won);
		System.out.println(" ��  �� :"+_10000won);
		System.out.println(" ��õ�� :"+_5000won);
		System.out.println(" õ  �� :"+_1000won);
		System.out.println(" ����� :"+_500won);
		System.out.println(" ��  �� :"+_100won);
		*/


/*
	_50000won = �ܱ� /50000;
   _10000won = �ܱ� %50000/10000;
   _5000won = �ܱ� %50000%10000/5000;
   _1000won = �ܱ� %50000%10000%5000/1000;
   _500won = �ܱ� %50000%10000%5000%1000%500;
   _100won = �ܱ�  %50000%10000%5000%1000%500%100;
*/
/*
	public void showCoinCount ( )
	{
		//�Ž����� ��ȯ ���� ���ǱⰡ ������ �ִ� �Ž����� �뿡�� ����
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

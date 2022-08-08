import java.util.List;
import java.util.Scanner;
public class UserMode implements Mode
{
	List<Items> items;
	VendingMachine vendingmachine;
	RpsGame ob;
	Scanner sc = new Scanner(System.in);
	String anykey ;
	int coin = 0;
	int remain = 0;
	int[] shoppingcart = new int[15] ;

	public UserMode(VendingMachine vendingmachine) { // ����ִ� ��ü�� ��Ʈ�� �ϱ����� �Ѱ��ְ� �ް� ��
		this.vendingmachine = vendingmachine;
		items = vendingmachine.getItems();			//	VendingMachine�� �ִ� Items�� �����´�  ����ִ� ��ü�� ��Ʈ�� �ϱ����� �Ѱ��ְ� �ް� ��
	} // ������
	public int display() { //�޴����� ������� �Ѵ�
		System.out.println("==============================================================================================================================");
		System.out.println("�Ƿ���ȭ ���Ǳ� �Դϴ�. (��ȣ:��ǰ(���))");
		System.out.println("\t\t\t\t\t\t[����]");
		for (int i = 0; i < 5; i++) {
			/*System.out.println((i+1)+"."+items.get(i).getName()+"      "+"("+items.get(i).getPrice()+")"+"  - "
			+"(S:"+items.get(i).getSize(0)+" M:"+items.get(i).getSize(1)+" L:"+items.get(i).getSize(2)+")");*/
			Clothes item = (Clothes) items.get(i); //�ٿ� ĳ����
			//������ Size�� ������ Clothes���� �����ͼ� ���
			System.out.printf("%2d. %s(%d) - (S:%d M:%d L:%d)", (i + 1), item.getName(), item.getPrice(), item.getSize(0), item.getSize(1), item.getSize(2));
			if (i == 2) {
				System.out.println();
				continue;
			} else if (i == 4) {
				continue;
			}
			System.out.print("         >> ");
		}
		System.out.println();

		System.out.println();
		System.out.println("\t\t\t\t\t\t[����]");
		for (int i = 5; i < 10; i++) {
			Clothes item = (Clothes) items.get(i);
			System.out.printf("%2d. %s(%d) - (S:%d M:%d L:%d)", (i + 1), item.getName(), item.getPrice(), item.getSize(0), item.getSize(1), item.getSize(2));
			if (i == 7) {
				System.out.println();
				continue;
			} else if (i == 9) {
				continue;
			} else if (i == 5) {
				System.out.print("       >> ");
				continue;
			} else if (i == 6) {
				System.out.print("        >> ");
				continue;
			}

			System.out.print("   >> ");
		}
		System.out.println();

		System.out.println();
		System.out.println("\t\t\t\t\t\t[��ȭ]");
		for (int i = 10; i < 15; i++) {
			//��ȭ�� �ִ� ģ�����̱� ������ ���� �ٿ�ĳ�����ؼ� �ҷ��� �ʿ䰡 ����
			System.out.printf("%2d. %s(%d) - (%d)", (i + 1), items.get(i).getName(), items.get(i).getPrice(), items.get(i).getAmount());
			if (i == 12) {
				System.out.println();
				continue;
			} else if (i == 11) {
				System.out.print("                    >> ");
				continue;
			} else if (i == 14) {
				continue;
			}
			System.out.print("			>> ");
		}
		System.out.println();
		System.out.println("==============================================================================================================================");
		System.out.print("������ �����Ͻðڽ��ϱ�?");
		String check = sc.next();
		if (check.equals("java006$")) {
			return 99;
		} else {
			int itemId = Integer.parseInt(check);
			return itemId;
		}
	}
	public boolean process(int sel) { //������ ��� �������� Ŭ���� �ؾ� Ż�� ����
		int itemId = sel - 1;
		boolean switch1 = false;
		boolean switch2 = true;
		boolean switch3 = true;
		ob = new RpsGame(vendingmachine.getSales());
		int cnt = 0;
		do {

			while (switch2) {
				if (cnt > 0) {
					itemId = -1 + display() ;
				}

				if (sel == 99) {
					System.out.println("�����ڸ�� ��ȯ");
					return true;
				}
				if (coin == 0) {
					System.out.println("���� �ݾ��� �����ϴ�. �ݾ��� �������ּ���.");
					coin += vendingmachine.getInsert();
				}

				if (itemId >= 0 && itemId < 15) {

					remain += items.get(itemId).getPrice();

					while (coin < remain) {
						System.out.println("�ݾ��� �����մϴ�. �ݾ��� �� �������ּ���.");
						coin += vendingmachine.getInsert();
					}
					boolean result = vendingmachine.buy(itemId);
					if (result){
						shoppingcart[itemId] += 1;
					} else {
						System.out.println("�ٽ� �Է��ϼ���.");
						remain -= items.get(itemId).getPrice();
						cnt += 1;
					}

					System.out.println("�߰� �ֹ��Ͻðڽ��ϱ�? (Y|N)");
					String cmd = sc.next();
					if (cmd.equals("N") || cmd.equals("n")) {
						switch2 = false;
						switch3 = true ;
					} else {
						cnt += 1;
					}

				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					cnt += 1;
				}

			}

			// ���� �ý���
			while (switch3) {
				String user;

				System.out.printf(">>> ������ �����Ͻ� ��ǰ�� �� �ݾ��� %d �Դϴ�.", remain);
				System.out.print(">>> ������ �����Ͻ� ��ǰ�� : ");
				// ���� ��ǰ ���
				int index = 0 ;
				for (int itemnum : shoppingcart) {
					if (itemnum > 0){
						System.out.printf((index + 1) + "." + items.get(index).getName() + "\n");
					}
					index += 1 ;
				}

				// ���� �ݾ� �ذ��ϱ�
				System.out.println();
				System.out.print("���� �Ͻðڽ��ϱ�? (Y/N) : ");
				user = sc.next();
				// y �Է½� �̺�Ʈ�� �Ѿ��
				if (user.equals("y") || user.equals("Y")) {
					int discount = 0;
					boolean start = ob.gameStart(remain);        // ���� ���� �޼� �� �̺�Ʈ ���
					if (start) {
						ob.input();
						ob.middleCalc();
						discount = ob.resultCalc();
					}

					System.out.printf("���� ���� �ݾ��� : %d�Դϴ�.\n", remain - discount);
					// ����
					index = 0 ;
					for (int itemnum : shoppingcart) {
						if (itemnum > 0){
							for(int j = 0 ;j < itemnum ; j++ ){
								vendingmachine.getSales().countId(index);
							}
						}
						index += 1 ;
					}
					coin = coin - (remain - discount);
					vendingmachine.returnRemainMoney(coin);
					// �ʱ�ȭ
					remain = 0 ;
					coin = 0 ;
					shoppingcart = new int[15] ;
					System.out.print("����ȭ������ ���ư����� �ƹ�Ű�� �Է��ϼ���.......");
					anykey = sc.next();
					return true;

				} else if (user.equals("n") || user.equals("N")) {

					cnt += 1 ;
					switch1 = true;
					switch3 = false;
					switch2 = true ;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.print("����ȭ������ ���ư����� �ƹ�Ű�� �Է��ϼ���.......");
					anykey = sc.nextLine();
				}
			}
		} while (switch1);

	return true ;
	}


}
	


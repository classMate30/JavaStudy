import java.util.Scanner;
public class AdminMode implements Mode
{
	VendingMachine vendingmachine ;
	Scanner sc = new Scanner(System.in);

	public AdminMode(VendingMachine vendingmachine) {
		this.vendingmachine = vendingmachine;
	}
	@Override
	public int display() {
		System.out.println("===================[������ ���]===================");
		System.out.println("1.��� �߰�");
		System.out.println("2.���� Ȯ��"); 
		System.out.println("3.��ŷ");
		System.out.println("4.ȭ�� ����");
		System.out.println("5.�Ǹ� ��� ����");
		System.out.println("6.����");
		System.out.println("===================================================");
		System.out.print("�ʿ��� �۾��� �Է����ּ���(1~6) : ");
		int sel = sc.nextInt() ;
		return sel ;
	}
	@Override
	public boolean process(int sel) {
		boolean flag ;
		UserMode user = new UserMode(vendingmachine);
		if (sel == 6){return false;}
		if (sel == 5){return true;}
		switch (sel) {
			case 1:
				vendingmachine.ItemsDisplay();
				System.out.print("��� �߰��� �׸��� ������: ");
				int itemId = sc.nextInt();
				vendingmachine.stockUp(itemId-1);
				break;
			case 2: ///2. (���� ���� ��� ȣ��)
				int salesAll = vendingmachine.getSalesAll();
				System.out.println("���� �� ������� " + salesAll + "�� �Դϴ�");
				break ;
			case 3: //3. (��ŷ ���� ��� ȣ��)
				vendingmachine.getRanking();
				break ;
			case 4: //4. (ȭ�� ���� �����ִ� ��� ȣ��)
				vendingmachine.moneyDisplay();
				break ;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		System.out.print("����ȭ������ ���ư����� �ƹ�Ű�� �Է��ϼ���.......");
		String anyKey = sc.next();;
		return true ;
	}
}


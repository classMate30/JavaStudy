import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		VendingMachine2 vm = new VendingMachine2();
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� ������ �ּ��� : ");
		int price = scan.nextInt();		
		vm.insertPrice(price);		
		
		while(true) {
			vm.displayProductList();
			System.out.print("������ ��ǰ��ȣ�� �Է��� �ּ���(����: 0) :");
			int choice = scan.nextInt();
			
			if(choice == 0) {
				vm.displayChange();
				break;
			} else if(choice > Can.PRODUCT_CNT || choice < 0) {
				System.out.println("�� �� �����ϼ̽��ϴ�.");
				continue;
			}
			//true: ���ſϷ�, false: ��� ����
			boolean result = vm.puchase(choice-1);
			if(result == false) {
				System.out.println("��� �����ϴ�.");
			}
			
			vm.displayChange();
		}
		
		scan.close();
		
	}

}
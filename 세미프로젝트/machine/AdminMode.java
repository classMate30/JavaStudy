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
		System.out.println("===================[관리자 모드]===================");
		System.out.println("1.재고 추가");
		System.out.println("2.매출 확인"); 
		System.out.println("3.랭킹");
		System.out.println("4.화폐 수량");
		System.out.println("5.판매 모드 변경");
		System.out.println("6.종료");
		System.out.println("===================================================");
		System.out.print("필요한 작업을 입력해주세요(1~6) : ");
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
				System.out.print("재고 추가할 항목을 고르세요: ");
				int itemId = sc.nextInt();
				vendingmachine.stockUp(itemId-1);
				break;
			case 2: ///2. (매출 관련 기능 호출)
				int salesAll = vendingmachine.getSalesAll();
				System.out.println("현재 총 매출액은 " + salesAll + "원 입니다");
				break ;
			case 3: //3. (랭킹 관련 기능 호출)
				vendingmachine.getRanking();
				break ;
			case 4: //4. (화폐 수량 보여주는 기능 호출)
				vendingmachine.moneyDisplay();
				break ;
			default:
				System.out.println("잘못 입력하셨습니다.");
		}
		System.out.print("이전화면으로 돌아가려면 아무키나 입력하세요.......");
		String anyKey = sc.next();;
		return true ;
	}
}


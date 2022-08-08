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

	public UserMode(VendingMachine vendingmachine) { // 살아있는 객체를 컨트롤 하기위해 넘겨주고 받고 함
		this.vendingmachine = vendingmachine;
		items = vendingmachine.getItems();			//	VendingMachine에 있는 Items를 가져온다  살아있는 객체를 컨트롤 하기위해 넘겨주고 받고 함
	} // 생성자
	public int display() { //메뉴판을 보여줘야 한다
		System.out.println("==============================================================================================================================");
		System.out.println("의류잡화 자판기 입니다. (번호:상품(재고))");
		System.out.println("\t\t\t\t\t\t[상의]");
		for (int i = 0; i < 5; i++) {
			/*System.out.println((i+1)+"."+items.get(i).getName()+"      "+"("+items.get(i).getPrice()+")"+"  - "
			+"(S:"+items.get(i).getSize(0)+" M:"+items.get(i).getSize(1)+" L:"+items.get(i).getSize(2)+")");*/
			Clothes item = (Clothes) items.get(i); //다운 캐스팅
			//설정된 Size값 때문에 Clothes에서 가져와서 사용
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
		System.out.println("\t\t\t\t\t\t[하의]");
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
		System.out.println("\t\t\t\t\t\t[잡화]");
		for (int i = 10; i < 15; i++) {
			//잡화에 있는 친구들이기 때문에 굳이 다운캐스팅해서 불러올 필요가 없음
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
		System.out.print("무엇을 구매하시겠습니까?");
		String check = sc.next();
		if (check.equals("java006$")) {
			return 99;
		} else {
			int itemId = Integer.parseInt(check);
			return itemId;
		}
	}
	public boolean process(int sel) { //물건을 사고 결제까지 클리어 해야 탈출 가능
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
					System.out.println("관리자모드 전환");
					return true;
				}
				if (coin == 0) {
					System.out.println("투입 금액이 없습니다. 금액을 투입해주세요.");
					coin += vendingmachine.getInsert();
				}

				if (itemId >= 0 && itemId < 15) {

					remain += items.get(itemId).getPrice();

					while (coin < remain) {
						System.out.println("금액이 부족합니다. 금액을 더 투입해주세요.");
						coin += vendingmachine.getInsert();
					}
					boolean result = vendingmachine.buy(itemId);
					if (result){
						shoppingcart[itemId] += 1;
					} else {
						System.out.println("다시 입력하세요.");
						remain -= items.get(itemId).getPrice();
						cnt += 1;
					}

					System.out.println("추가 주문하시겠습니까? (Y|N)");
					String cmd = sc.next();
					if (cmd.equals("N") || cmd.equals("n")) {
						switch2 = false;
						switch3 = true ;
					} else {
						cnt += 1;
					}

				} else {
					System.out.println("잘못 입력하셨습니다.");
					cnt += 1;
				}

			}

			// 결제 시스템
			while (switch3) {
				String user;

				System.out.printf(">>> 고객님이 구매하신 상품의 총 금액은 %d 입니다.", remain);
				System.out.print(">>> 고객님이 구매하신 상품은 : ");
				// 구매 상품 찍기
				int index = 0 ;
				for (int itemnum : shoppingcart) {
					if (itemnum > 0){
						System.out.printf((index + 1) + "." + items.get(index).getName() + "\n");
					}
					index += 1 ;
				}

				// 누적 금액 해결하기
				System.out.println();
				System.out.print("결제 하시겠습니까? (Y/N) : ");
				user = sc.next();
				// y 입력시 이벤트로 넘어가기
				if (user.equals("y") || user.equals("Y")) {
					int discount = 0;
					boolean start = ob.gameStart(remain);        // 일정 매출 달성 시 이벤트 출력
					if (start) {
						ob.input();
						ob.middleCalc();
						discount = ob.resultCalc();
					}

					System.out.printf("최종 결제 금액은 : %d입니다.\n", remain - discount);
					// 구매
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
					// 초기화
					remain = 0 ;
					coin = 0 ;
					shoppingcart = new int[15] ;
					System.out.print("이전화면으로 돌아가려면 아무키나 입력하세요.......");
					anykey = sc.next();
					return true;

				} else if (user.equals("n") || user.equals("N")) {

					cnt += 1 ;
					switch1 = true;
					switch3 = false;
					switch2 = true ;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					System.out.print("이전화면으로 돌아가려면 아무키나 입력하세요.......");
					anykey = sc.nextLine();
				}
			}
		} while (switch1);

	return true ;
	}


}
	


import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class UserMode implements Mode
{
	List<Items> items;
	//private VendingMachine machine;		//참고한 자료에서 private으로 선언 해놓은 이유가뭘까?
	VendingMachine machine;
	Scanner sc = new Scanner(System.in);
	int coin = 0;
	int remain = 0;
	RpsGame ob ;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public UserMode(VendingMachine vendingmachine) { // 살아있는 객체를 컨트롤 하기위해 넘겨주고 받고 함
		machine = vendingmachine;		//this.machine=vendingmachine; items = this.machine.getItems();
		items = machine.getItems();			//	VendingMachine에 있는 Items를 가져온다  살아있는 객체를 컨트롤 하기위해 넘겨주고 받고 함
	} // 생성자										이게 없으면 관리자 모드에서 넘길 수 가 없음  ← 관리자에서 받아 올 수가 없음
	

	public void display(){
		items = machine.getItems();	//	VendingMachine에 있는 Items를 가져온다	
		System.out.println("==============================================================================================================================");
		System.out.println("의류잡화 자판기 입니다. (번호:상품(재고))");
		System.out.println("\t\t\t\t\t\t[상의]");
		for (int i=0; i<5; i++)
			{
			//System.out.println((i+1)+"."+items.get(i).getName()+"      "+"("+items.get(i).getPrice()+")"+"  - "
			//+"(S:"+items.get(i).getSize(0)+" M:"+items.get(i).getSize(1)+" L:"+items.get(i).getSize(2)+")");
			
			Clothes item = (Clothes)items.get(i) ; //다운 캐스팅
			//-------------------------------------//
			//설정된 Size값 때문에 Clothes에서 가져와서 사용
			System.out.printf("%2d. %s(%d) - (S:%2d M:%2d L:%2d)", (i+1),  item.getName(), item.getPrice(), item.getSize(0), item.getSize(1), item.getSize(2));
			if (i==1)
			{
				System.out.print("          >> "); continue;
			}
			else if (i==2)
			{
				System.out.println(); continue;
			}
			else if (i==4)
			{
				continue;
			}
			System.out.print("        >> "); 
		}
		System.out.println();

		System.out.println();
		System.out.println("\t\t\t\t\t\t[하의]");
		for (int i=5; i<10; i++)
		{
			Clothes item = (Clothes)items.get(i) ;
			System.out.printf("%2d. %s(%d) - (S:%2d M:%2d L:%2d)", (i+1),  item.getName(), item.getPrice(), item.getSize(0), item.getSize(1), item.getSize(2));
			if (i==7)
			{
				System.out.println(); continue;
			}
			else if (i==9)
			{
				continue;
			}
			else if (i==5)
			{
				System.out.print("       >> "); continue;
			}

			else if (i==6)
			{
				System.out.print("        >> "); continue;
			}
			
			System.out.print("   >> "); 
		}
		System.out.println();
		
		System.out.println();
		System.out.println("\t\t\t\t\t\t[잡화]");
		for (int i=10; i<15; i++)
		{	
			//잡화에 있는 친구들이기 때문에 굳이 다운캐스팅해서 불러올 필요가 없음
			System.out.printf("%2d. %s(%d) - (%2d)", (i+1),  items.get(i).getName(), items.get(i).getPrice(), items.get(i).getAmount() );
			if (i==12)
			{
				System.out.println(); continue;
			}
			else if (i==11)
			{
				System.out.print("                    >> "); continue;
			}
			else if (i==14)
			{
				continue;
			}
			System.out.print("		  	   >> ");
		}
		System.out.println();
		System.out.println("==============================================================================================================================");
	}	//메뉴판을 보여줘야 한다
	public boolean select() throws IOException {
		ob = new RpsGame(this.machine.getSales());
		int itemId;
		boolean flag = true;	
		do {
			System.out.print("무엇을 구매하시겠습니까?");
			String check = sc.next();
			if (check.equals("java006$"))
			{
				return false;
			}
			else 
			{
				itemId = Integer.parseInt(check);
			}
			if (itemId > 0 && itemId <=15) {
				//int a = items.get(itemId).getAmount();		//S/M/L설정
				coin += machine.getInsert();
				while (coin < machine.getItemIdPrice(itemId-1)){
					System.out.println("금액이 부족합니다. 금액을 더 투입해주세요.");
					coin += machine.getInsert();
				}
				/*
				this.machine.buy(itemId - 1);
				this.machine.setTotal(this.machine.getItemIdPrice(itemId-1));	// 
				this.machine.getSales().countId(itemId-1);						//랭킹  
				*/
				//시도
				//int a = items.get(itemId).getAmount();
				//machine.buy(itemId - 1);
				//machine.setTotal(this.machine.getItemIdPrice(itemId-1));
				//machine.getSales().countId(itemId-1);
				//this.machine.buy(itemId - 1);
				System.out.println();
				System.out.print("추가 구매 하시겠습니까? (Y/N) : ");
				String check2 = sc.next();
				if (check2.equals("N") || check2.equals("n")) {
					
				//remain += receipt();
					String user ;
			
					System.out.printf(">>> 고객님이 구매하신 상품의 총 금액은 %d원 입니다.", machine.getItemIdPrice(itemId-1));
				// 누적 금액 해결하기1
					System.out.println();
					System.out.print("결제 하시겠습니까? (Y/N) : ");
			
					user = sc.next();
					if (user.equals("y") || user.equals("Y"))
					{
						machine.buy(itemId - 1);
						machine.setTotal(this.machine.getItemIdPrice(itemId-1));
						machine.getSales().countId(itemId-1);
						int discount = 0;
						boolean start = ob.gameStart(machine.totalReturn());		// 일정 매출 달성 시 이벤트 출력
						if (start)
						{
						ob.input();
						ob.middleCalc();
						discount = ob.resultCalc();
						}

					System.out.printf("최종 결제 금액은 : %d원 입니다.\n",machine.totalReturn()-discount);
					remain = machine.pay(machine.totalReturn()-discount);
					machine.returnRemainMoney(remain);
					System.out.print("이전화면으로 돌아가려면 아무키나 입력하세요.......");
					String anykey = br.readLine();
					return false;
					}
					else if (user.equals("n") || user.equals("N"))
					{
					remain += machine.totalReturn();
					System.out.print("이전화면으로 돌아가려면 아무키나 입력하세요.......");
					String anykey = br.readLine();
					return true;
					}
					if(remain > 0){	
						display();
					}else{
						flag = false;
					}
				} else {
					flag = true;
				}
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}while (flag) ;
		return true;
	} 
}
//입력을 받고 입력에 따른 내부적으로 기능 호출
/*
	public int receipt() throws IOException{
		//ob = new RpsGame(this.machine.getSales());
		while (true)
			{
			String user ;
			
			System.out.printf(">>> 고객님이 구매하신 상품의 총 금액은 %d원 입니다.", machine.totalReturn());
			// 누적 금액 해결하기
			System.out.println();
			System.out.print("결제 하시겠습니까? (Y/N) : ");
			
			user = sc.next();
			// y 입력시 이벤트로 넘어가기
			if (user.equals("y") || user.equals("Y"))
			{
				int discount = 0;
				boolean start = ob.gameStart(machine.totalReturn());		// 일정 매출 달성 시 이벤트 출력
				if (start)
				{
					ob.input();
					ob.middleCalc();
					discount = ob.resultCalc();
				}

				System.out.printf("최종 결제 금액은 : %d원 입니다.\n",machine.totalReturn()-discount);
				remain = machine.pay(machine.totalReturn()-discount);
				machine.returnRemainMoney(remain);
				System.out.print("이전화면으로 돌아가려면 아무키나 입력하세요.......");
				String anykey = br.readLine();
				return 0;
			}
			else if (user.equals("n") || user.equals("N"))
			{
				remain += machine.totalReturn();
				System.out.print("이전화면으로 돌아가려면 아무키나 입력하세요.......");
				String anykey = br.readLine();
				return remain;
			}
		
		 }
	   } // 추가 구매 , 합계 메소드

}
	

*/
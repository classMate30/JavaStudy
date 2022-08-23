import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//mport java.util.ArrayList;
//import java.util.Scanner;
public class AdminMode implements Mode
{
	VendingMachine vendingmachine = new VendingMachine();
	UserMode user = new UserMode(vendingmachine);
	//객체가 하나로 관리 해야하기때문에 다른객체가 생성되지 않게 하기 위해 한 데이터를 소지(?)하기 위해     (맞게 이해한건지 고민)
	//만들기 위해서 관리자에서 하나를 생성하고, 그 다음에 그 안으로 객체를 떠넘기는 형식으로 하는 것

	boolean isEnd = true;
	public static BufferedReader br;

	public AdminMode() 
	{
		//this.vendingmachine = vendingmachine;
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	@Override
	public void display()
	{
		System.out.println("===================[관리자 모드]===================");
		System.out.println("1.재고 추가");
		System.out.println("2.매출 확인"); 
		System.out.println("3.랭킹");
		System.out.println("4.화폐 수량");
		System.out.println("5.판매 모드 변경");
		System.out.println("6.종료");
		System.out.println("===================================================");
		System.out.print("필요한 작업을 입력해주세요(1~6) : ");

	}
	@Override
	public boolean select() throws IOException, NumberFormatException
	{
		boolean flag ;
		int sel = Integer.parseInt(br.readLine());
		if (sel<1 || sel>6)
		{
			System.out.println("잘못 입력 하셨습니다");
			System.out.println("다시 입력 해주십시오");
			System.out.println();
		}	
		else if (sel==1)
		{ //재고 관련 기능
			user.display();
			stockUp();
		}
		//1. (재고 클래스에서 재고 관련 기능 호출)
		//①관리자모드에서 재고를 추가하고 갈필요 없이 처음 세팅 값을 주고 시작한다.
		//②관리자모드에서 재고를 추가할 때는 (부족한 항목에 대해서) 한번에 맥스 값을 주도록 설정 ← 해결방법 못찾음
		//  → 한 항목당 5개씩 추가 해주는걸로 변경
		else if (sel==2)
		{
			///2. (매출 관련 기능 호출)
			int salesAll = vendingmachine.getSales().getsumAll();
			System.out.printf("현재 총 매출액은 %,d원 입니다%n", salesAll);
			System.out.print("이전화면으로 돌아가려면 아무키나 입력하세요.......");
			String anyKey = br.readLine();
		}
		else if (sel==3)
		{
			//3. (랭킹 관련 기능 호출)
			vendingmachine.getSales().ranking();
			System.out.print("이전화면으로 돌아가려면 아무키나 입력하세요.......");
			String anyKey = br.readLine();
		}
		else if (sel==4)
		{
			//4. (화폐 수량 보여주는 기능 호출)
			vendingmachine.moneyinsert.Display();
			System.out.print	("이전화면으로 돌아가려면 아무키나 입력하세요.......");
			String anyKey = br.readLine();
		}
		//4. (잔돈 클래스에서 화폐 수량과 관련된 기능 호출)
		else if (sel==5)
		{	
			do
			{
				user.display();
				isEnd = user.select();
				
			}
			while (isEnd);
		}
		//5.  판매 모드 변경
		//(UserMode();)
		else if (sel==6)
		{	
			exit();
		}
		//6.  시스템 종료(System.exit(-1);)
		return true;	
	}
	public void stockUp() throws IOException 
	{
		//Scanner sc = new Scanner(System.in);
		boolean flag = true;
		//boolean flag = false;
		do
		{
			System.out.print("재고 추가할 항목을 고르세요: ");
			int itemId = Integer.parseInt(br.readLine());//sc.nextInt();
			if (itemId > 0 && itemId <= 15)
			{
				this.vendingmachine.stock(itemId - 1);
				System.out.println(vendingmachine.getName(itemId-1) + " 이(가) 5개 추가되었습니다.");
			} 
			else 
			{
				System.out.print("잘못 입력하셨습니다.");
			}
			System.out.print("재고를 더 추가하시겠습니까? (Y/N): ");
			String check = br.readLine();
			if (check.equals("N") || check.equals("n") ) {
				flag = false;
			}
			/*
			실패했던 것
			if (!(check.equals("Y")&&check.equals("y")))
			{
				flag = true;
			}
			*/
		}
		while(flag);
	} //현하 추가

	public void exit()
	{
		System.out.println("프로그램을 종료합니다.");
		System.exit(-1);
	}

}


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AdminMode implements Mode
{	
	public static BufferedReader br;
	public static Integer sel;
	VendingMachine vendingmachine = new VendingMachine();
	UserMode user = new UserMode(vendingmachine);
	
	//static
	public AdminMode()
	{ 	
		this.vendingmachine = vendingmachine;
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
	public void select() throws IOException, NumberFormatException
	{	
		sel = Integer.parseInt(br.readLine());
		if (sel<1 || sel>6)
		{
			System.out.println("잘못 입력 하셨습니다");
			System.out.println("다시 입력 해주십시오");
			System.out.println();
		}
		else if (sel==1)
		{
			
			//재고 관련 기능
		}

		else if (sel==2)
		{
			//매출 확인 기능
		}

		else if (sel==3)
		{
			//
		}

		else if (sel==4)
		{
			//
		}

		else if (sel==5)
		{

			//판매자 모드 UserMode.display()
			//UserMode.select()
			/*do
			{

			}
			while ();	//판매자 모드도 돌고 계속 돌아야함...?
			*/
			user.display();
			user.select();
			user.display();
		}
		else if (sel==6)
		{
			exit();
		}
	}

	

	public static void exit()
	{	
		System.out.println("프로그램을 종료합니다.");
		System.exit(-1);		
	}

}
	
	//재고와 잔돈의 기능을 해당하는 클래스를 불러오겠다
	
//1. (재고 클래스에서 재고 관련 기능 호출)
	 //①관리자모드에서 재고를 추가하고 갈필요 없이 처음 세팅 값을 주고 시작한다.
	 //②관리자모드에서 재고를 추가할 때는 (부족한 항목에 대해서) 한번에 맥스 값을 주도록 설정

	
//2. (매출 클래스에서                  매출 관련 기능 호출)


//3. (랭킹 클래스에서 매출 관련 기능 호출)


//4. (잔돈 클래스에서 화폐 수량과 관련된 기능 호출)


//5.  판매 모드 변경
	 //(UserMode();)



//6.  시스템 종료(System.exit(-1);)
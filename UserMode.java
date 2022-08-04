import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UserMode implements Mode
{	
	Scanner sc = new Scanner(System.in);

	private VendingMachine machine;
	List<Items> items;

	public UserMode(VendingMachine vendingmachine)
	{
		this.machine = vendingmachine;
		items = this.machine.getItems();
	}

	public void display()							//메뉴판을 보여줘야 한다 
	{	
		items = this.machine.getItems();
		System.out.println("==============================================================================================================================");
		System.out.println("의류잡화 자판기 입니다. (번호:상품(재고))");
		System.out.println("\t\t\t\t\t\t[상의]");
		for (int i=0; i<5; i++)
		{
			/*System.out.println((i+1)+"."+items.get(i).getName()+"      "+"("+items.get(i).getPrice()+")"+"  - "
			+"(S:"+items.get(i).getSize(0)+" M:"+items.get(i).getSize(1)+" L:"+items.get(i).getSize(2)+")");*/

			System.out.printf("%2d. %s(%d) - (S:%s M:%s L:%s)", (i+1),  items.get(i).getName(), items.get(i).getPrice(), items.get(i).getSize(0), items.get(i).getSize(1), items.get(i).getSize(2));
			if (i==2)
			{
				System.out.println(); continue;
			}
			else if (i==4)
			{
				continue;
			}
			System.out.print("         >> "); 
		}
		System.out.println();

		
		System.out.println();
		System.out.println("\t\t\t\t\t\t[하의]");
		for (int i=5; i<10; i++)
		{


			System.out.printf("%2d. %s(%d) - (S:%s M:%s L:%s)", (i+1),  items.get(i).getName(), items.get(i).getPrice(), items.get(i).getSize(0), items.get(i).getSize(1), items.get(i).getSize(2));
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
			System.out.printf("%2d. %s(%d)      %d개", (i+1),  items.get(i).getName(), items.get(i).getPrice(), items.get(i).getAmount());
			if (i==12)
			{
				System.out.println(); continue;
			}
			else if (i==11)
			{
				System.out.print("			    >> "); continue;
			}
			else if (i==14)
			{
				continue;
			}
			System.out.print("			       >> ");
		}
		System.out.println();
		System.out.println("==============================================================================================================================");
	};	


	public void select() throws IOException		//입력을 받고 입력에 따른 내부적으로 기능 호출
	{	
		System.out.print("무엇을 구매하시겠습니까?");
		String size = null;
		int itemId = sc.nextInt();
		if (itemId>0 && itemId<=10)
		{	
			System.out.print("사이즈를 입력해주세요(S/M/L) : ");
			size = sc.next();
		}
		boolean valid = this.machine.offer(itemId-1, size);
		//1~10번까지는 사이즈도 물어봐줘서 입력받을 수 있게 해줌

		//11~15번까지는 물어볼 필요 없이 바로 진행
		
		//vendingmachine.buy(int n ←1~15번에 해당하는 번호);


	};												
	

}
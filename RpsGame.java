
import java.util.Scanner;
import java.util.Random;

public class RpsGame 
{	
	private Sales sales;
	private int user;
	private int admin = 0;
	private int price = 0;
	//int i = 0;
	public RpsGame(Sales sales)
	{
		this.sales = sales;
	}

	// ���� �޼��� �� ���� ���� �����ϱ�
	public boolean gameStart(int price)
	{
		int total = price + sales.getsumAll(); //+ ���� ���� sales.getsumAll()
		//while (true)
		//{
			if (price >= 70000)	
			//
			{
				
			System.out.println("���� 7���� �̻� ���Ž� ���� ������ �̺�Ʈ~!! ����");
			System.out.println();
			//i++;
			return true;
			//break;
			}
			//else 
				//System.out.printf("���� ���� �ݾ��� : %d\n", price);
			//����â ȣ��();
			
			//System.exit(-1);
			//}
			
		//}
		return false;
	}

	// ��ǻ���� ����������
	private void runCom()
	{
		Random rd = new Random();
		admin = rd.nextInt(3)+1;			//- (3)�̸� 012 �̴ϱ� +1�� �ؼ� 123 ������ �����.
	}

	// ������ ����������
	public void input()
	{
		// ������ ���������� �ϱ� ����... ��ǻ��(������) ���� ����������
		runCom();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("(1)���� (2)���� (3)�� �� ���ڸ� �Է��ϼ���(1~3) : ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);

	}

	// �߰� ��� ���
	public void middleCalc()
	{
		String[] str = {"����","����","��"};

		System.out.println();
		System.out.println(" �ڱ����� : " + str[user-1]);
		System.out.println(" �ڰ����� : " + str[admin-1]);
		System.out.println();
	}

	// �ºο� ���� ���� ��� ����
	public int resultCalc()
	{
		//int local_admin;
		// (����=="����"&& ��ǻ��=="����")||(����=="����"&& ��ǻ��=="����")||(����=="��"&& ��ǻ��=="��")

		if ((user==1&& admin==3)||(user==2&& admin==1)||(user==3&& admin==2))
		{
		   System.out.println("�º� ��� : ����� �¸��߽��ϴ�~!!\n");
		   int result = RandomBox();

		   if (result == 1)
		   {
			   System.out.println("���� �ݾ��� : 1000�� �Դϴ�");
			   return 1000;
			  
		   }
		   else if (result == 2)
		   {
			   System.out.println("���� �ݾ��� : 3000�� �Դϴ�");
				return 3000;
		   }
		   else if (result == 3)
		   {
			   System.out.println("���� �ݾ��� : 5000�� �Դϴ�");
				return 5000;
		   }
	 
		   /*
		   local_admin = RandomBox();
		   System.out.printf(">> ����� : %d",local_admin);
			*/
		}

		else if ((user==1&& admin==2)||(user==2&& admin==3)||(user==3&& admin==1))
		{
			System.out.println("�º� ��� : ����� �����ϴ�. �ƽ����� ������ȸ��~!!\n");
			System.out.println();
		}
		
		else if (user==admin)
		{
			System.out.println("�º� ��� : ���º��Դϴ�. �ƽ����� ������ȸ��~!!\n");
			System.out.println();

		}
		return 0;
	}

	// �̰��� �� �����ڽ� ���� �޼ҵ�
	public int RandomBox()
	{ 
		runCom();
		Scanner sc;
		//= new Scanner(System.in);
		
		while (true)
		{
			sc = new Scanner(System.in);
			System.out.println(">> �����ڽ��� �����ּ��� : [1]  [2]  [3] \n");
			user = sc.nextInt();
			System.out.println();

			if (user >= 1 && user <= 3)
			{
				break;
			}
			else 
			{
				System.out.println("�ٽ� �����ּ��� (1~3)");
			}
		}
		
		
		/*
		String[] discount = {"1000", "3000","5000"};
		double random = Math.random();
		int num = (int)Math.round(random *(discount.length-1));
		 return();

		//System.out.println(discount[num]);
		System.out.printf("%s�� ���α� ��÷ !!", discount[num]);
		System.out.println();
		*/
	

		if (admin == 1)
			  System.out.print("1000�� ���α� ��÷ !!!\n");
			//System.out.println();
		
		else if (admin == 2)
			System.out.print("3000�� ���α� ��÷ !!!\n");
			//System.out.println();
	
		else if (admin == 3)
			System.out.print("5000�� ���α� ��÷ !!!\n");		
		else
			System.out.print("�ٽ� �Է����ּ���.\n");
			 System.out.println();
		// 3 �̻� �Է½� �Ȱ��� ����
		return admin;

	}
			

}

/*
public class EventGame
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();
		
	ob.gameStart();
	ob.input();
	ob.middleCalc();
	ob.resultCalc();
		

		}
	}
*/


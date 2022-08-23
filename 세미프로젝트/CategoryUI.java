import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CategoryUI
{
	public static final int coffee = 1;
	public static final int nonCoffee = 2;
	public static final int juice = 3;
	public static final int smoothie = 4;
	public static final int tea = 5;
	public static final int ade = 6;
	public static final int cart = 7;
	public static final int back = 8;
	public static int sel = 1;
	
	// ���� ī�װ� ��� �޼ҵ�
	public static void categoryDisp()
	{
		System.out.println("������������������������������������������������������������������������������������������������������������");
		if (InitialUI.sel == InitialUI.forHere)
			System.out.println("��                       [����]                       ��");
		else if (InitialUI.sel == InitialUI.takeOut)
			System.out.println("��                       [����]                       ��");
		else if (InitialUI.sel == InitialUI.couponUse)
			System.out.println("��                    [����  ���]                    ��");
		System.out.println("��                                                    ��");		
		System.out.println("��                      1. coffee                     ��");
		System.out.println("��                      2. non-coffee                 ��");
		System.out.println("��                      3. juice                      ��");
		System.out.println("��                      4. smoothie                   ��");
		System.out.println("��                      5. tea                        ��");
		System.out.println("��                      6. ade                        ��");
		System.out.println("��                      7. ��ٱ���                   ��");
		System.out.println("��                      8. �ڷΰ���                   ��");
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.print("\n>> ī�װ��� �����ϼ��� (1 ~ 8) : ");
	}
	
	// ����ڷκ��� ���ð� �Է¹޴� �޼ҵ�
	public static void categorySelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			sel = Integer.parseInt(br.readLine());
			
			// 1 ~ 6 ���̸� �Է¹����� �ش� ���� �޴������� ����
			// 7�� �Է¹����� ��ٱ��� ����
			// 8�� �Է¹����� �ڷΰ���. �� ���� ��ȣ�� ���ѷ���
			if (sel >= coffee && sel <= ade)
				DrinkUI.drinkRun();
			else if (sel != cart && sel != back)
				System.out.println("\n�ٽ� �Է��ϼ���.\n");
			else if (sel == cart)
				Cart.printVC(); // ��ٱ��� ǥ�����ִ� CartŬ������ �޼ҵ�
			
			if (sel == back)
			{
				Cart.vc.clear();
				Cart.totalSum = 0;
				Cafe.operate();
			}

			if (sel == cart || sel == back)
				break;
			
			categoryDisp();

		}
		while (sel != cart || sel != back);
	}
	// ī�װ� ��� �� ����� �Է°� �ޱ� �޼ҵ� ����
	public static void categoryRun() throws IOException
	{
		categoryDisp();
		categorySelect();
	}
}
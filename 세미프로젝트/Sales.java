import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sales
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String str;
	public static int totalSale;						// �� ����
	public static int totalCard;						// ī�� ����
	public static int totalCash;						// ���� ����
	public static int totalCoupon;						// ���� �Ǹ� �ݾ�(���� ������� ������ �ݾ�)
	public static int totalOrder;						// �� �ֹ� �Ǽ�(����) EX)�Ƹ޸�ī�� 3�� �̸� + 3
	public static int profit;							// ������
	public static int[] categoryOrder = new int[6];		// ī�װ� �� �ֹ��Ǽ�(����)�� ���� �迭 EX) {Ŀ���ֹ��Ǽ� , ��Ŀ�� �ֹ��Ǽ� ...}
	public static int[][] drinkOrder = new int[6][6];	// �޴��� �ֹ��Ǽ�(����)�� �����迭 [ī�װ�][�޴� �ֹ��Ǽ�] EX) {[Ŀ��]{�Ƹ޸�ī�� �ֹ��Ǽ�,ī����ֹ��Ǽ�...}
	public static final int[] COST = {1000, 2000, 1500, 2500, 1000, 1500};	// ī�װ��� ���� ������ ��꿡 Ȱ��

	public static void salesDisp() throws IOException
	{
		do
		{
			System.out.println("\n������������������������������������������������������������������������������������������������������������");
			System.out.println("��                    [�Ǹ�  ���]                    ��");
			System.out.println("������������������������������������������������������������������������������������������������������������");
			System.out.println(" �� �Ѹ���(ī�� + ����)      : " + totalSale); 
			System.out.println(" �� ī�� ���� ����           : " + totalCard);
			System.out.println(" �� ���� ���� ����           : " + totalCash);
			System.out.println(" �� �����Ǹűݾ�(�����Ѿ�)   : " + totalCoupon);
			System.out.println(" �� ������                   : " + profit);
			System.out.println("������������������������������������������������������������������������������������������������������������");
			System.out.println("                                     �ڷΰ��� [ctrl+z]");
			str = br.readLine();

			if (str != null)
				System.out.println("�ٽ� �Է����ּ���.");
		}
		while (str != null);
		System.out.println();
	}

	// �� ī�װ��� �Ǹź��� �޼ҵ�
	public static void drinkDisp() throws IOException
	{
		if (totalOrder == 0)
		{
			System.out.println("������������������������������������������������������������������������������������������������������������");
			System.out.println("��             ���� �Ǹŵ� ���ᰡ �����ϴ�.           ��");
			System.out.println("������������������������������������������������������������������������������������������������������������");
			return;
		}
		else
		{
			System.out.println("\n������������������������������������������������������������������������������������������������������������");
			System.out.println("��               [ī�װ���  �Ǹź���]               ��");
			System.out.println("������������������������������������������������������������������������������������������������������������");
			// ī�װ� �ֹ��Ǽ� / �� �ֹ� �Ǽ�
			System.out.printf("%n1. [Ŀ��] %20.1f%%", ((double)categoryOrder[0] / totalOrder) * 100);
			System.out.printf("%n2. [��Ŀ��] %20.1f%%", ((double)categoryOrder[1] / totalOrder) * 100);    
			System.out.printf("%n3. [�ֽ�] %20.1f%%", ((double)categoryOrder[2] / totalOrder) * 100);
			System.out.printf("%n4. [������] %20.1f%%", ((double)categoryOrder[3] / totalOrder) * 100);
			System.out.printf("%n5. [Ƽ] %20.1f%%", ((double)categoryOrder[4] / totalOrder) * 100);
			System.out.printf("%n6. [���̵�] %20.1f%%", ((double)categoryOrder[5] / totalOrder) * 100);
			System.out.println("\n������������������������������������������������������������������������������������������������������������");
			System.out.printf("7. �ڷ� ����%n");
			System.out.print(">> �� �׸� ��ȸ (1 ~ 6) : ");

			AdminUI.sel = Integer.parseInt(br.readLine());
			System.out.println();
			if (AdminUI.sel == 7)
				return;
			sales();
		}
	}

	// ���׸� ��ȸ�� �� �޴��� ��� �޼ҵ�
	public static void sales() throws IOException
	{
		if (categoryOrder[AdminUI.sel - 1] == 0)
		{
			System.out.println("������������������������������������������������������������������������������������������������������������");
			System.out.println("��    ���� �ش� ī�װ� �� �Ǹŵ� ���ᰡ �����ϴ�.   ��");
			System.out.println("������������������������������������������������������������������������������������������������������������");
			drinkDisp();
		}		
		else
		{
			System.out.println("\n������������������������������������������������������������������������������������������������������������");
			System.out.println("��                 [�޴���  �Ǹź���]                 ��");
			System.out.println("������������������������������������������������������������������������������������������������������������");
			// �ش�ī�װ��� �޴� �ֹ��Ǽ� / ī�װ� �ֹ��Ǽ�
			for (int i = 0; i < Coffee.drinkName.length; i++)
			{
				if (AdminUI.sel == 1)
						System.out.printf(" �� %s : %.1f%%%n", Coffee.drinkName[i], (((double)drinkOrder[0][i] / categoryOrder[0]) * 100)); 
				else if (AdminUI.sel == 2)
						System.out.printf(" �� %s : %.1f%%%n",NonCoffee.drinkName[i], (((double)drinkOrder[1][i] / categoryOrder[1]) *100));
				else if (AdminUI.sel == 3)
						System.out.printf(" �� %s : %.1f%%%n",Juice.drinkName[i],(((double)drinkOrder[2][i] / categoryOrder[2]) *100));
				else if (AdminUI.sel == 4)
						System.out.printf(" �� %s : %.1f%%%n",Smoothie.drinkName[i],(((double)drinkOrder[3][i] / categoryOrder[3]) *100));
				else if (AdminUI.sel == 5)
						System.out.printf(" �� %s : %.1f%%%n",Tea.drinkName[i],(((double)drinkOrder[4][i] / categoryOrder[4]) *100));
				else if (AdminUI.sel == 6)
						System.out.printf(" �� %s : %.1f%%%n",Ade.drinkName[i],(((double)drinkOrder[5][i] / categoryOrder[5]) *100));
			}
			System.out.println("������������������������������������������������������������������������������������������������������������");
			System.out.println("                                     �ڷΰ��� [ctrl+z]");
			str = br.readLine();

			if (str == null)
				drinkDisp();
		}
	}

	public static void addSales() // ���� �Ϸ��� ���� �ֹ���Ͽ��� Sales Ŭ���� �� ������ �ʱ�ȭ �����ֱ� ���� �޼ҵ� 
	{
		for (int i = 0; i < Cart.vc.size(); i++)
		{
			drinkOrder[Cart.vc.get(i).getCategoryNumber()][Cart.vc.get(i).getDrinkNumber()] += Cart.vc.get(i).getCount(); // �޴��� �ֹ����� �ʱ�ȭ
			categoryOrder[Cart.vc.get(i).getCategoryNumber()] += Cart.vc.get(i).getCount();                               // ī�װ��� �ֹ����� �ʱ�ȭ
			totalOrder += Cart.vc.get(i).getCount();																	  // �� �ֹ����� �ʱ�ȭ
			profit += Cart.vc.get(i).getCount() * (Cart.vc.get(i).getPrice() - COST[Cart.vc.get(i).getCategoryNumber()]); // ������ �ʱ�ȭ �ֹ����� (���� - ����)
		}
	}
}
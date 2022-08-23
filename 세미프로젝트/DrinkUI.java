import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DrinkUI
{
	public static int sel = 1;
	
	static String[] category = {"[coffee]", "[non-coffee]", "[juice]", "[smoothie]", "[tea]", "[ade]"};
	
	// �� ī�װ��� �ش��ϴ� ���Ḧ �����س��� 2���� �迭
	static String[][] drink = {{"1. �Ƹ޸�ī�� : 1500��", "2. ī���   : 2000��", "3. �ٴҶ�� : 2500��", "4. ī���ī   : 2500��", "5. ��ü��   : 3500��", "6. ����Ŀ��   : 2000��", "7. �ڷΰ���"},
		{"1. ������   : 3000��", "2. ���ڶ�   : 3500��", "3. ������ : 4000��", "4. ���   : 4000��", "5. �����   : 4500��", "6. ������   : 3500��", "7. �ڷΰ���"},
		{"1. ����ֽ�   : 3000��", "2. �������ֽ� : 3500��", "3. �����ֽ�   : 3500��", "4. �����ֽ�   : 4000��", "5. �����ֽ�   : 4000��", "6. �����ֽ�   : 3500��","7. �ڷΰ���"},
		{"1. ������������ : 4000��", "2. û���������� : 4000��", "3. ��������   : 4500��", "4. ���⽺����   : 4500��", "5. ���Ʈ������ : 5000��", "6. ����������   : 4000��", "7. �ڷΰ���"},
		{"1. �׸�Ƽ     : 2000��", "2. ��׷���Ƽ : 2500��", "3. ���۹�ƮƼ : 2500��", "4. ������Ƽ   : 3000��", "5. ĳ����Ƽ : 3000��", "6. ����Ƽ     : 2500��", "7. �ڷΰ���"},
		{"1. �����̵�   : 3000��", "2. ���ڿ��̵�   : 3000��", "3. �����̵�   : 4000��", "4. �ڸ����̵�   : 4000��", "5. û�������̵� : 4000��", "6. �������̵�   : 3500��", "7. �ڷΰ���"}};
	
	public static void drinkRun() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.println("\n                      " + category[CategoryUI.sel - 1]);
			System.out.println("������������������������������������������������������������������������������������������������������������");
			// �����ð��� ��� 2���� �迭 ��� ����ϱ� ��� Ȱ��
			// CategoryUI���� �Է¹��� sel�� Ȱ���Ͽ� ó��.
			// ex) 1�� �Է¹޾����� drink[0][i] ����� �Ƹ޸�ī��~ ����Ŀ�ǰ� ��µǰ���
			for (int i = 0; i < drink[CategoryUI.sel-1].length; i++)
				System.out.printf(" - %s%n", drink[CategoryUI.sel - 1][i]);
			System.out.println("������������������������������������������������������������������������������������������������������������");


			System.out.print("\n>> ���Ḧ �����ϼ��� : ");
			sel = Integer.parseInt(br.readLine()); 
			
			if (sel >= 1 && sel <= 6)
				switch (CategoryUI.sel)
				{
					// �Է¹��� ���ð����� �ش� ����ī�װ� Ŭ������ set()�޼��� ȣ��
					// ex) Ŀ�Ǹ� �Է������� Coffe.set() ȣ��
					// �Ƹ޸�ī�븦 ����ٰ� �����ϸ� sel = 1 �� ��
					case CategoryUI.coffee		: new Coffee().set(Coffee.drinkName[sel - 1], Coffee.drinkPrice[sel - 1]);			break;
					case CategoryUI.nonCoffee	: new NonCoffee().set(NonCoffee.drinkName[sel - 1], NonCoffee.drinkPrice[sel - 1]);	break;
					case CategoryUI.juice		: new Juice().set(Juice.drinkName[sel - 1], Juice.drinkPrice[sel - 1]);				break;
					case CategoryUI.smoothie	: new Smoothie().set(Smoothie.drinkName[sel - 1], Smoothie.drinkPrice[sel - 1]);	break;
					case CategoryUI.tea			: new Tea().set(Tea.drinkName[sel - 1], Tea.drinkPrice[sel - 1]);					break;
					case CategoryUI.ade			: new Ade().set(Ade.drinkName[sel - 1], Ade.drinkPrice[sel - 1]);					break;
				}
			else if (sel != 7)
				System.out.println("\n�ٽ� �Է��ϼ���\n");
		}
		while(sel != 7);
	}
}

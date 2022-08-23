import java.io.IOException;

public class ReturnChange
{
	// �Һ��ڰ� ������ �ݾ�
	static int pay; 
	// �Һ��ڰ� ������ �Ѿ�
	static int drink;
	// pay - drink = �Ž�������� �ܵ�
	static int change;
	
	// �մԿ��� �ǳ��� �ܵ��� ���� ����
	private static int returnChangeSum = 0;
	private static int returnChange500 = 0;
	private static int returnChange1000 = 0;
	private static int returnChange5000 = 0;
	private static int returnChange10000 = 0;
	
	// �� ȭ������� �մԿ��� �ǳ��� Ƚ��
	private static int count10000 = 0;
	private static int count5000 = 0;
	private static int count1000 = 0;
	private static int count500 = 0;

	public static void changeCal()	// �ܵ� ���
	{
		// ���� ���� ���� 10000¥�� ���� �Һ��ڰ� �� ������ ���ٸ� true
		// �׷��� ������ false ��ȯ
		boolean change10000Flag = 10000 * Change.change.get(10000) >= change;

		if (change10000Flag)
		{
			// ����¥���� �Ž�������� �ܵ����� ���ٸ� �Ž����ֱ� ����
			// ���� �մԿ��� 500���� �Ž������ �Ѵٸ�?
			// returnChange10000 += 0
			// count10000 += 0
			// change -= 0
			// ==> �ƹ��� ��ȭ�� ���� ���� Flag������ �̵���
			returnChange10000 += (10000 * (change/10000));
			count10000 += change/10000;
			change -= returnChange10000;
		}
		// ���� ����¥�� �Ѿ��� �Ž�������� ������ ���ڶ�ٸ�.
		// ���ÿ� �ܵ��� 10000�������� ũ�� 10000�� �������� 0�� �ƴ϶��
		// �ܵ��� 45000��, 10000�� �������� 4����� �����غ�.
		else if (change / 10000 != 0 && Change.change.get(10000) != 0)
		{
			// returnChange10000 += 40000
			// count10000 += 4
			// change -= 40000
			// => ����¥�� 4�常ŭ �ܵ��� ���������ְ�
			// returnChange10000 ������ 4���� ���Խ�Ŵ
			// ���� �ܵ������� ������ �� count10000 ����ŭ 10000�� ������ �谨.
			returnChange10000 += (10000 * Change.change.get(10000));
			count10000 += Change.change.get(10000);
			change -= returnChange10000;
		}
		
		// ������ �Ž����� 45000�� ���̽��� ����ؼ� �����غ�.
		// 4������ �Ž��������Ƿ� 5000���� �� �Ž����ָ� �Ǵ� ��Ȳ.
		// �� change = 5000 �̰� 5000�� �������� 1 �̻��̸�
		// ���� �Ȱ��� ������ ������ �ܵ��� 0���� �������.
		boolean change5000Flag = 5000 * Change.change.get(5000) >= change;
		
		// 5000��¥�� �������� change(5000)���� ũ�ٰ� ����
		if (change5000Flag)
		{
			// returnChange 5000 += 5000
			// count5000 += 1
			// change -= 5000
			// => change = 0�� ��
			// ���� if�������� 10000��¥�� ���̽�ó�� ����
			// �ƹ��� ��ȭ�� ���� �����
			returnChange5000 += (5000 * (change/5000));
			count5000 += change/5000;
			change -= returnChange5000;
		}
		else if (change/5000 != 0 && Change.change.get(5000)!= 0)
		{
			returnChange5000 += (5000 * Change.change.get(5000));
			count5000 += Change.change.get(5000);
			change -= returnChange5000;
		}
		
		boolean change1000Flag = 1000 * Change.change.get(1000) >= change;

		if (change1000Flag)
		{
			returnChange1000 += (1000 * (change/1000));
			count1000 += change/1000;
			change -= returnChange1000;
		}
		else if (change/1000 != 0 && Change.change.get(1000) != 0) // 3
		{
			returnChange1000 += (1000 * Change.change.get(1000));
			count1000 += Change.change.get(1000);
			change -= returnChange1000;
		}
		
		boolean change500Flag = 500 * Change.change.get(500) >= change;

		if (change500Flag)
		{
			returnChange500 += (500 * (change/500));
			count500 += change/500;
			change -= returnChange500;
		}
		else if (change/500 != 0 && Change.change.get(500)!= 0) // 1
		{
			returnChange500 += (500 * Change.change.get(500));
			count500 += Change.change.get(500);
			change -= returnChange500; // 500
		}
	}

	public static void changePrint() throws IOException	// �ܵ� ��ȯ ��� ���
	{
		// ��� �޼ҵ忡�� �ܵ���� �޼ҵ� ����
		changeCal();
		// returnChange10000 = 40000
		// returnChange5000 = 5000 �̹Ƿ� �� 45000���� �Ž�����
		// returnChange1000, 500�� �̹� change�� 0�� �����Ƿ� 0��
		returnChangeSum = returnChange10000+returnChange5000+returnChange1000+returnChange500;
		// change�� 0�̶�� ���� �Ž�������� �ܵ��� ���� �Ž�����ٴ� �ǹ�
		if (change == 0)
		{
			System.out.println("������������������������������������������������������������������������������������������������������������");
			if (count10000 != 0)
				System.out.printf(" �� 10000��  %d��%n", count10000);
			
			if (count5000 != 0)
				System.out.printf(" ��  5000��  %d��%n", count5000);

			if (count1000 != 0)
				System.out.printf(" ��  1000��  %d��%n", count1000);

			if (count500 != 0)
				System.out.printf(" ��   500��  %d��%n", count500);

			System.out.printf("%n ==> �� �Ž����� %d�� �Դϴ�.%n", returnChangeSum);
			System.out.println("������������������������������������������������������������������������������������������������������������");
		}
		// change�� 0�� �ƴ϶�� �ܵ� �������� �����ϴٴ� �ǹ��̹Ƿ�
		// ī���Ϳ� �����ش޶�� �޼����� ���
		else
		{
			System.out.println("������������������������������������������������������������������������������������������������������������");
			System.out.println("       �ܵ��� �����ϴ� ī���ͷ� �������ּ���.");
			System.out.println("������������������������������������������������������������������������������������������������������������");
			
			Cart.vc.clear();
			Cart.totalSum = 0;

			// �ܵ��� �����ϸ� �ٽ� ùȭ������ ���ư�
			Cafe.operate();
		}
		// �ܵ��� ������ �Ž������ٸ�
		// �ܵ� ������ ���� �޼ҵ��� changeReNew() �޼��� ����
		changeReNew();
		// �ܵ� ������ �ʱ�ȭ���ִ� �޼ҵ�
		changeReset();
	}
	
	public static void changeReNew() // �ܵ� ������ ����
	{
		// �ؽ��� put�޼ҵ带 Ȱ���� �ܵ� ������ - count�׼� ����
		// ����� ������ ������� �� ȭ�� ���� ������� ���Խ�����
		Change.change.put(10000, Change.change.get(10000) - count10000);
		Change.change.put(5000, Change.change.get(5000) - count5000);
		Change.change.put(1000, Change.change.get(1000) - count1000);
		Change.change.put(500, Change.change.get(500) - count500);
	}

	public static int getChangeSum()
	{
		return returnChangeSum;
	}

	public static void changeReset()
	{
		count10000 = 0;
		count5000 = 0;
		count1000 = 0;
		count500 = 0;	
		returnChange500 = 0;
		returnChange1000 = 0;
		returnChange5000 = 0;
		returnChange10000 = 0;
	}
}
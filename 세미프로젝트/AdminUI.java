import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AdminUI
{
	public static final int salesManage = 1;
	public static final int salesRatio = 2;
	public static final int checkChange = 3;
	public static final int addChange = 4;
	public static final int cafeClose = 5;
	public static final int back = 6;
	public static int sel = 1;
	
	public static void adminDisp() // �޴� ��� �޼ҵ�
	{
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.printf("��                 [ȯ���մϴ�, %s ��]                ��\n", AdminLogin.getId());
		System.out.println("��                                                    ��");
		System.out.println("��               1. ����� ��� ����                  ��");
		System.out.println("��               2. �޴��� �Ǹ� ����                  ��");
		System.out.println("��               3. �ܵ� ������ Ȯ��                  ��");
		System.out.println("��               4. �ܵ�    �߰��ϱ�                  ��");
		System.out.println("��               5. ī��    �����ϱ�                  ��");
		System.out.println("��               6. �����ڸ޴�  ����                  ��");
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.print("\n>> �޴� ���� (1 ~ 6) : ");
	}

	public static void adminSelect() throws IOException, NumberFormatException     // �޴����� �޼ҵ�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			sel = Integer.parseInt(br.readLine());
			if (sel < salesManage || sel > back)
			{
				System.out.println("\n�Է°��� ������ϴ�.\n");
				adminDisp();								// �Է°� ������� �޴� �ٽ����
			}
		}
		while (sel < salesManage || sel > back);
	}

	public static void adminRun() throws IOException		// ������ �޴����࿡ ���� ��� ȣ�� �޼ҵ�
	{
		switch (sel)
		{
			case salesManage:	Sales.salesDisp(); break;
			case salesRatio:	Sales.drinkDisp(); break;
			case checkChange:	ChangeUI.checkChange(); break;
			case addChange:		ChangeUI.addChange(); break;
			case cafeClose:		Cat.close(); break;
			case back:			break;
		}
	}
}
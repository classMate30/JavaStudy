import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Options
{
	public String hotOrColdOption; 
	public String iceOption; 
	public String hoc;
	public int iceAmount;
	public int drinkCountOption;
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void option1() throws IOException
	{
		do
		{
			System.out.print(">> Hot �Ǵ� Cold �� �����ϼ���. (h(H) or c(C)) �Է� : ");
			hoc = br.readLine();
			// Hot Ȥ�� Cold ����
			if (!((hoc.equals("c") || hoc.equals("C") || hoc.equals("h") || hoc.equals("H"))))
			{
				System.out.println("\n�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n");
				continue;
			}
			else if (hoc.equals("c") || hoc.equals("C"))
			{	
				hotOrColdOption = "cold";
				// Cold�� ������� ������ ���� �޼ҵ� ����
				iceSelect();
			}
			else if (hoc.equals("h") || hoc.equals("H"))
			{
				hotOrColdOption = "hot";
				iceOption = "         ";
			}
			// ���� ���� ���ϴ� �޼ҵ�
			cupsCount();

			
		}
		while (!((hoc.equals("c") || hoc.equals("C") || hoc.equals("h") || hoc.equals("H"))));
	}

	public void option2() throws IOException
	{
		iceSelect();
		cupsCount();
	}

	public void iceSelect() throws IOException
	{		
		do
		{
			System.out.print(">> �������� ������ �ּ���. (1 : ����, 2 : ����, 3 : ����) �Է� : ");
			iceAmount = Integer.parseInt(br.readLine());
			if (iceAmount < 1 || iceAmount > 3)
				System.out.println("\n�������� �ٽ� ������ �ּ���.\n");
		}
		while (iceAmount < 1 || iceAmount > 3);
		
		switch (iceAmount)
		{
			case 1: iceOption = "���� ����" ; break;
			case 2: iceOption = "���� ����" ; break;
			case 3: iceOption = "���� ����" ; break;
		}
	}

	public void cupsCount() throws IOException
	{
		// DrinkUI���� 6�� �Է��ϸ� ���������̹Ƿ� ������ 1���� ����
		if (DrinkUI.sel == 6)
		{
			drinkCountOption = 1;
			return;
		}

		drinkCountOption = 0;
		
		// �� ���� ����� 1ȸ �ֹ��� �ִ� 30������ �Է� ����
		do
		{
			System.out.println(">> �����Ͻ� ������ ������ �����ϼ���.");
			System.out.print(">> �Է� ������ �ִ� ���� ������ �� ���� 30���Դϴ�. : ");
			// �Է¹��� ������ drinkCountOption ������ ����
			drinkCountOption = Integer.parseInt(br.readLine());

			if (drinkCountOption < 1 || drinkCountOption > 30)
				System.out.println("\n������ ������ �ٽ� �Է����ּ���.\n");
		}
		while (drinkCountOption < 1 || drinkCountOption > 30);
	}
}
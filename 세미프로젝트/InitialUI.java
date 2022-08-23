import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InitialUI
{
	public static final int forHere = 1;
	public static final int takeOut = 2;
	public static final int couponUse = 3;
	public static final int adminLogin = 4;
	public static int sel = 1;
	
	// �ʱ�ȭ�� ��� �޼ҵ�
	public static void initialDisp()
	{
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.println("��                      [Service]                     ��");
		System.out.println("��                                                    ��");
		System.out.println("��                   1. ����  �̿�                    ��");
		System.out.println("��                   2. ��      ��                    ��");
		System.out.println("��                   3. ����  ���                    ��");
		System.out.println("��                   4. �����ڸ��                    ��");
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.print("\n>> ���Ͻô� ���񽺸� �����ϼ��� (1 ~ 4) : ");
	}
	
	// ����ڷκ��� �̿��ϰ��� �ϴ� �޴��� ��ȣ�� �Է¹޴� �޼ҵ�
	public static void initialSelect() throws IOException, NumberFormatException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			sel = Integer.parseInt(br.readLine());

			if (sel >= forHere && sel <= adminLogin)
				break;
			else
			{
				System.out.println("\n�ٽ� �Է����ּ���.\n");
				initialDisp();
			}
		}
		while (true);
	}
	
	// ����ڷκ��� �Է¹޴� ���� �´� �޴��� �����ϴ� �޼���
	public static void initialRun() throws IOException
	{
		switch (sel)
		{
			case forHere:
			case takeOut:		CategoryUI.categoryRun(); break;	
			case couponUse:		CouponUse.couponRun(); break;
			case adminLogin:	Admin.open(); break;
		}
	}
}
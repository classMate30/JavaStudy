import java.io.IOException;

public class Admin
{
	// ������ ��带 �����ϸ� ����Ǵ� open() �޼ҵ�
	public static void open() throws IOException
	{
		// �����ڸ�带 ���� ���� �α��� ����
		AdminLogin.login();
		// �α��� �����ϸ� AdminUI�� ������ִ� operate() �޼ҵ� ����
		operate();
	}

	public static void operate() throws IOException
	{		
		do
		{
			AdminUI.adminDisp();
			AdminUI.adminSelect();
			AdminUI.adminRun();
			
			// �ܵ��� 0���̸� �ܵ��� �߰��ϱ� ������ �����ڸ�� ������ �Ұ���
			if (AdminUI.sel == AdminUI.back && Change.sum() == 0)
				System.out.println("�ܵ��� �߰����ּ���!\n");
			else if (AdminUI.sel == AdminUI.back && Change.sum() != 0)
				break;
		}
		while (true);
	}
}
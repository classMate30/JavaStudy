import java.io.IOException;

public class Cafe
{
	
	// ó�� ���α׷��� �����ϸ� ����Ǵ� �޼ҵ�
	public static void open() throws IOException
	{	
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.println("��                                                    ��");
		System.out.println("��  <---- Random Cafe ���� �غ� �����մϴ�!! ---->  ��");
		System.out.println("��                                                    ��");
		System.out.println("��                                                    ��");
		System.out.println("�� - �����ڸ��� �α��� �� �ܵ��� �־��ּ���.        ��");
		System.out.println("�� - �ܵ��� ���� ���, ī�� ������ �Ұ��մϴ�.        ��");
		System.out.println("�� - �����ϱ� ������, ������ ���θ� �̵��� �����ϸ� ��");
		System.out.println("��   ����, ����, ���� ��� ������ �Ұ��մϴ�.         ��");
		System.out.println("������������������������������������������������������������������������������������������������������������");

		do
		{
			InitialUI.initialDisp();
			InitialUI.initialSelect();
			if (InitialUI.sel != InitialUI.adminLogin)
			{
				// ù ���¿����� ������ �ܵ��� �߰��ؾ� �ϹǷ�
				// �����ڸ�忡�� ������ �����
				System.out.println("\n4���� ������ ������ ���� ���ּ���!\n");
				continue;
			}
			InitialUI.initialRun();
		}
		while (InitialUI.sel != InitialUI.adminLogin);

		Cat.open();
	}
	
	// open()�޼ҵ尡 ���� ���� �ʱ�ȭ�� ������ִ� �޼ҵ�
	public static void operate() throws IOException
	{
		do
		{
			InitialUI.initialDisp();
			InitialUI.initialSelect();
			InitialUI.initialRun();
		}
		while (true);
	}
}

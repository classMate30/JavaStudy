import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AdminLogin
{
	private static String id;
	private static String pw;

	public static String getId()
	{
		return id;
	}
	
	// ������ �α��� �޼ҵ�
	public static void login() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n������������������������������������ [������  �α���] ������������������������������������");
		
		// private static final String[] ID = {"��", "��", "��", "��"};
		// private static final String[] PW = {"1", "2", "3", "4"};	
		// �����ڵ��� id�� ��й�ȣ�� �ؽ��� �ڷᱸ���� ��������Ƿ� �̸� ��ȸ��

		do
		{
			System.out.print(">> ID �Է� : ");
			id = br.readLine();
			// �Է¹��� ���ڿ��� �ؽ����� Ű(id)�� ��ġ���� ������ �ȳ��޼��� ���
			if (!AdminList.account.containsKey(id))
				System.out.println("\n�ش� �ϴ� ID�� �����ϴ�.");
		}
		while (!AdminList.account.containsKey(id));

		do
		{
			// �Է¹��� ���ڿ��� �ؽ����� value(pw)�� ��ġ���� ������ �ȳ��޼��� ���
			System.out.print(">> PW �Է� : ");
			pw = br.readLine();
			if (!AdminList.account.get(id).equals(pw))
				System.out.println("\n��� ��ȣ�� �ùٸ��� �ʽ��ϴ�.");
		}
		while (!AdminList.account.get(id).equals(pw));

		System.out.println("\n            ������ �α��ο� �����߽��ϴ�!!            ");
		System.out.println("������������������������������������������������������������������������������������������������������������\n");
	}
}
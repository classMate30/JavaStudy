import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AdminMode
{	
	public static BufferedReader br;
	public static Integer sel;

	static
	{ 	
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	


	public static void adminDisp()
	{
		System.out.println("===================[������ ���]===================");
		System.out.println("1.��� �߰�");
		System.out.println("2.���� Ȯ��");
		System.out.println("3.��ŷ");
		System.out.println("4.ȭ�� ����");
		System.out.println("5.�Ǹ� ��� ����");
		System.out.println("6.����");
		System.out.println("===================================================");
		System.out.print("�ʿ��� �۾��� �Է����ּ���(1~6) : ");
	}

	public static void adminSelect() throws IOException, NumberFormatException
	{	

		sel = Integer.parseInt(br.readLine());
		if (sel<1 || sel>6)
		{

			exit();
		}

	if (sel==6)
	{
		exit();
	}
	}
	

	public static void exit()
	{	
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(-1);		
	}

}
	
	//���� �ܵ��� ����� �ش��ϴ� Ŭ������ �ҷ����ڴ�
	
//1. (��� Ŭ�������� ��� ���� ��� ȣ��)
	 //������ڸ�忡�� ��� �߰��ϰ� ���ʿ� ���� ó�� ���� ���� �ְ� �����Ѵ�.
	 //������ڸ�忡�� ��� �߰��� ���� (������ �׸� ���ؼ�) �ѹ��� �ƽ� ���� �ֵ��� ����

	
//2. (���� Ŭ��������                  ���� ���� ��� ȣ��)


//3. (��ŷ Ŭ�������� ���� ���� ��� ȣ��)


//4. (�ܵ� Ŭ�������� ȭ�� ������ ���õ� ��� ȣ��)


//5.  �Ǹ� ��� ����
	 //(UserMode();)



//6.  �ý��� ����(System.exit(-1);)
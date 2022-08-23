import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ChangeUI
{
	public static void checkChange()					// �ܵ� ������Ȯ�� �޼ҵ�
	{
		System.out.println("\n������������������������������������������������������������������������������������������������������������");
		System.out.println("��                 [���� �ܵ� ������]                 ��");
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.printf(" ��    500�� : %3d�� = %8d��\n", Change.change.get(500), 500 * Change.change.get(500));
		System.out.printf(" ��   1000�� : %3d�� = %8d��\n", Change.change.get(1000), 1000 * Change.change.get(1000));
		System.out.printf(" ��   5000�� : %3d�� = %8d��\n", Change.change.get(5000), 5000 * Change.change.get(5000));
		System.out.printf(" ��  10000�� : %3d�� = %8d��\n", Change.change.get(10000), 10000 * Change.change.get(10000));
		System.out.println("������������������������������������������������������������������������������������������������������������");
		System.out.printf(" ==> �Ѿ��� %d���Դϴ�.\n\n", Change.sum());
	}

	public static void addChange() throws IOException	// �ܵ� �߰� �޼ҵ�
	{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		System.out.println("\n������������������������������������������������������������������������������������������������������������");
		System.out.println("��                    [�ܵ�  �߰�]                    ��");
		System.out.println("��                                                    ��");
		System.out.println("��          (500��, 1000��, 5000��, 10000��)          ��");
		System.out.println("������������������������������������������������������������������������������������������������������������");

		do
		{
			System.out.print("\n>> �ݾ� ������ ������ �Է��� �ּ���.(���� ����) : ");
			
			// �߰� ����ϴ� �׼��� ���� unit 
			// ������ ���� count�� ����
			int unit = sc.nextInt();
			int count = sc.nextInt();

			if ((unit != 500) && (unit != 1000) && (unit != 5000) && (unit != 10000))
				System.out.println("�߸��� �ݾ� ���� �Դϴ�. �ٽ� �Է����ּ���." + "\n");
			else if ((unit == 500 && count + Change.change.get(unit) > 100) || (unit != 500 && count + Change.change.get(unit) > 50))
				System.out.println("�߰��Ϸ��� �ܵ��� ������ �ʹ� �����ϴ�. �ٽ� �Է����ּ���." + "\n");
			else
			{
				System.out.printf("\n==> %d���� %d�� �߰� �Ͽ����ϴ�.\n\n",unit, count);
				// �߰� ����� ������ ������ �ܵ� ���� ������ �����ְ�
				count += Change.change.get(unit);
				// �ش��ϴ� �׼��� �ؽ��� ����� count�� ���� (���� ������ + ���ο� �߰���)
				Change.change.put(unit, count);
			}
			System.out.print(">> �ܵ� �߰� : Y or y, �ڷ� ���� : Ctrl+z : ");
		}
		while ((str=br.readLine()) != null);
	}
}
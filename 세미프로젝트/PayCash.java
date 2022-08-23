import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PayCash 
{
	public static void cashInsert() throws IOException
	{
		// ���� ���ÿ��� pay �޼��� �Ű������� "cash" ����.
		Pay.insert();
		// ������ �׼��� �Է¹ް� �ܵ��� ��ȯ����� �ϹǷ�
		// ���� cashCheck() �޼��带 �� �� �� ����
		cashCheck();
		Pay.pay("cash");
	}

	public static void cashCheck() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cash;

		do
		{
			System.out.print(">> ���� �󸶸� �����Ͻðڽ��ϱ�? : ");
			cash = Integer.parseInt(br.readLine());
			
			// ���ᰡ 500�� ������ ��������
			// �ܵ��� �ּ� �׼��� 500���̹Ƿ� 100�� ������ ���� ����.
			// �׼��� 500�� ������ ������ �������� ������ 
			// �ٽ� �Է��ش޶�� �ȳ� �޼��� ���
			if (cash % 500 != 0)
			{
				System.out.println("\n�ٽ� �Է��� �ֽʽÿ�.\n");
				continue;
			}
			
			// ��ٱ��� �Ѿ׺��� ������ ������ �����ϸ�
			// �ٽ� �Է��ش޶�� �ȳ����� ���.
			if (cash < Cart.totalSum)
			{
				System.out.println("\n�߸��� ���Աݾ��Դϴ�. �ٽ� �Է��� �ֽʽÿ�.\n");
				continue;
			}
			
			// �ܵ� ��ȯ�� ���� ReturnChage.pay ���� 
			// �Һ��ڰ� ������ �ݾ��� ����
			ReturnChange.pay = cash;
			// ReturnChange.drink ���� ���� �Ѿ��� ����
			ReturnChange.drink = Cart.totalSum;
			// change �������� pay - drink. �� �� �� - �����Ѿ��� ����
			ReturnChange.change = ReturnChange.pay - ReturnChange.drink;
			ReturnChange.changePrint();				// �ܵ� ��ȯ ���
		}
		while (cash % 500 != 0 || cash < Cart.totalSum);
	}
}

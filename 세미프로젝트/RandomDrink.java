import java.util.Random;

public class RandomDrink
{
	// ���� ���� �޼���
	public static int roll()
	{
		int n;

		Random rd = new Random();
		n = rd.nextInt(5);
		return n;
	}

	public static void detectRandom()
	{
		for (int i = 0; i < Cart.vc.size(); i++)
		{	
			// ���� �������� ������ ����ٸ�?
			// ��ٱ��Ͽ� �ִ� ���� �̸��� Ȱ���� case�� ����
			// �ش� ī�װ��� �����̸��� �������� �ҷ��ͼ� ��� ���Խ�Ŵ
			switch (Cart.vc.get(i).getName())
			{
				case "����Ŀ��"   : Cart.vc.get(i).setName("(R)" + Coffee.drinkName[roll()]);		break;
				case "������"   : Cart.vc.get(i).setName("(R)" + NonCoffee.drinkName[roll()]);	break;
				case "�����ֽ�"   : Cart.vc.get(i).setName("(R)" + Juice.drinkName[roll()]);		break;
				case "����������" : Cart.vc.get(i).setName("(R)" + Smoothie.drinkName[roll()]);		break;
				case "����Ƽ"     : Cart.vc.get(i).setName("(R)" + Tea.drinkName[roll()]);			break;
				case "�������̵�" : Cart.vc.get(i).setName("(R)" + Ade.drinkName[roll()]);			break;
			}
		}
	}
}
import java.io.IOException;

public class Coffee extends Options
{	
	// Ŀ�� ī�װ��� ���� ���
	public static String drinkName[] = {"�Ƹ޸�ī��", "ī���", "�ٴҶ��", "ī���ī", "��ü��", "����Ŀ��"};
	// Ŀ�� ī�װ� �� ������ ���� ��� 
	public static int drinkPrice[] = {1500, 2000, 2500, 2500, 3500, 2000};

	public void set(String drinkName, int drinkPrice) throws IOException
	{
		// DrinkUI���� �Է¹��� ���� ���ð��� sel�� �޾ƿ�
		// �� drinkName[] drinkPrice[] �迭���� �ش��ϴ� ������
		// �Ʒ� Drink ��ü�� ����
		System.out.println("\n" + Coffee.drinkName[DrinkUI.sel - 1] + " ��(��) �����ϼ̽��ϴ�.\n");
		// ���ῡ ���� option1(), option2() �޼ҵ� ȣ��
		option1();
		
		//�ɼ� Ŭ�������� ������ �ɼǵ��� Ȱ���� DrinkŸ�� ��ü ����
		Drink dr = new Drink(hotOrColdOption, iceOption, drinkCountOption);
		
		// new Coffee().set(Coffee.drinkName[sel - 1], Coffee.drinkPrice[sel - 1]);
		// ���ÿ��� Ŀ�� -> �Ƹ޸�ī�븦 ������Ƿ� �Ʒ��� �����غ���
		// drinkName = Coffe.drinkName[0] = �Ƹ޸�ī��
		// drinkPrice = Coffe.drinkPrice[0] = 1500�� ���Ե�.
		dr.setName(drinkName);
		dr.setPrice(drinkPrice);
		// �׷��� �ɼ�, �̸�, ����, ������ ���Ե� Drink ��ü��
		// ��ٱ��� ������ vc�� ����
		Cart.vc.add(dr);
		
		// �ɼ�,�̸�,����,������ ������ �Ȱ��� Drink ��ü�� �ִٸ�
		// �ش��ϴ� �޴��� ������ ������Ű���� ��ø��Ŵ
		if (DrinkUI.sel != 6)
			Cart.overLap(dr);
		
		// ��ٱ��� ���
		Cart.printVC();
	}
}
import java.io.IOException;

public class NonCoffee extends Options
{
	public static String drinkName[] = {"������", "���ڶ�", "������", "���", "�����", "������"};
	public static int drinkPrice[] = {3000, 3500, 4000, 4000, 4500, 3500};

	public void set(String drinkName, int drinkPrice) throws IOException
	{	
		System.out.println("\n" + NonCoffee.drinkName[DrinkUI.sel - 1] + " ��(��) �����ϼ̽��ϴ�.\n");
		option1();

		Drink dr = new Drink(hotOrColdOption, iceOption, drinkCountOption);

		dr.setName(drinkName);
		dr.setPrice(drinkPrice);
		Cart.vc.add(dr);

		if (DrinkUI.sel != 6)
			Cart.overLap(dr);

		Cart.printVC();
	}
}
import java.io.IOException;

public class Juice extends Options
{
	public static String drinkName[] = {"����ֽ�", "�������ֽ�", "�����ֽ�", "�����ֽ�", "�����ֽ�", "�����ֽ�"};
	public static int drinkPrice[] = {3000, 3500, 3500, 4000, 4000, 3500};

	public void set(String drinkName, int drinkPrice) throws IOException
	{
		System.out.println("\n" + Juice.drinkName[DrinkUI.sel - 1] + " ��(��) �����ϼ̽��ϴ�.\n");
		option2();

		Drink dr = new Drink("cold", iceOption, drinkCountOption);

		dr.setName(drinkName);
		dr.setPrice(drinkPrice);
		Cart.vc.add(dr);

		if (DrinkUI.sel != 6)
			Cart.overLap(dr);

		Cart.printVC();
	}
}
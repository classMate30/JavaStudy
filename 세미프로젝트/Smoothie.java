import java.io.IOException;

public class Smoothie extends Options
{
	public static String drinkName[] = {"������������", "û����������", "��������", "���⽺����", "���Ʈ������", "����������"};
	public static int drinkPrice[] = {4000, 4000, 4500, 4500, 5000, 4000};
	
	public void set(String drinkName, int drinkPrice) throws IOException
	{
		System.out.println("\n" + Smoothie.drinkName[DrinkUI.sel - 1] + " ��(��) �����ϼ̽��ϴ�.\n");
		cupsCount();

		Drink dr = new Drink("cold", " ", drinkCountOption);

		dr.setName(drinkName);
		dr.setPrice(drinkPrice);
		Cart.vc.add(dr);

		if (DrinkUI.sel != 6)
			Cart.overLap(dr);

		Cart.printVC();
	}
}
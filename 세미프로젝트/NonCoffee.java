import java.io.IOException;

public class NonCoffee extends Options
{
	public static String drinkName[] = {"³ìÂ÷¶ó¶¼", "ÃÊÄÚ¶ó¶¼", "°í±¸¸¶¶ó¶¼", "°î¹°¶ó¶¼", "µþ±â¶ó¶¼", "·£´ý¶ó¶¼"};
	public static int drinkPrice[] = {3000, 3500, 4000, 4000, 4500, 3500};

	public void set(String drinkName, int drinkPrice) throws IOException
	{	
		System.out.println("\n" + NonCoffee.drinkName[DrinkUI.sel - 1] + " À»(¸¦) ¼±ÅÃÇÏ¼Ì½À´Ï´Ù.\n");
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
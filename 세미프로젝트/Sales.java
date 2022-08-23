import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sales
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String str;
	public static int totalSale;						// ÃÑ ¸ÅÃâ
	public static int totalCard;						// Ä«µå ¸ÅÃâ
	public static int totalCash;						// Çö±Ý ¸ÅÃâ
	public static int totalCoupon;						// ¹«»ó ÆÇ¸Å ±Ý¾×(ÄíÆù »ç¿ëÀ¸·Î ÇÒÀÎÇÑ ±Ý¾×)
	public static int totalOrder;						// ÃÑ ÁÖ¹® °Ç¼ö(°¹¼ö) EX)¾Æ¸Þ¸®Ä«³ë 3ÀÜ ÀÌ¸é + 3
	public static int profit;							// ¼øÀÌÀÍ
	public static int[] categoryOrder = new int[6];		// Ä«Å×°í¸® º° ÁÖ¹®°Ç¼ö(°³¼ö)¸¦ ´ãÀ» ¹è¿­ EX) {Ä¿ÇÇÁÖ¹®°Ç¼ö , ³íÄ¿ÇÇ ÁÖ¹®°Ç¼ö ...}
	public static int[][] drinkOrder = new int[6][6];	// ¸Þ´ºº° ÁÖ¹®°Ç¼ö(°³¼ö)¸¦ ´ãÀ»¹è¿­ [Ä«Å×°í¸®][¸Þ´º ÁÖ¹®°Ç¼ö] EX) {[Ä¿ÇÇ]{¾Æ¸Þ¸®Ä«³ë ÁÖ¹®°Ç¼ö,Ä«Æä¶ó¶¼ÁÖ¹®°Ç¼ö...}
	public static final int[] COST = {1000, 2000, 1500, 2500, 1000, 1500};	// Ä«Å×°í¸®º° ¿ø°¡ ¼ø¼öÀÍ °è»ê¿¡ È°¿ë

	public static void salesDisp() throws IOException
	{
		do
		{
			System.out.println("\n¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
			System.out.println("¦¢                    [ÆÇ¸Å  Åë°è]                    ¦¢");
			System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
			System.out.println(" ¢º ÃÑ¸ÅÃâ(Ä«µå + Çö±Ý)      : " + totalSale); 
			System.out.println(" ¢º Ä«µå °áÁ¦ ¸ÅÃâ           : " + totalCard);
			System.out.println(" ¢º Çö±Ý °áÁ¦ ¸ÅÃâ           : " + totalCash);
			System.out.println(" ¢º ¹«»óÆÇ¸Å±Ý¾×(ÇÒÀÎÃÑ¾×)   : " + totalCoupon);
			System.out.println(" ¢º ¼øÀÌÀÍ                   : " + profit);
			System.out.println("¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡");
			System.out.println("                                     µÚ·Î°¡±â [ctrl+z]");
			str = br.readLine();

			if (str != null)
				System.out.println("´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
		}
		while (str != null);
		System.out.println();
	}

	// °¢ Ä«Å×°í¸®º° ÆÇ¸ÅºñÀ² ¸Þ¼Òµå
	public static void drinkDisp() throws IOException
	{
		if (totalOrder == 0)
		{
			System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
			System.out.println("¦¢             ÇöÀç ÆÇ¸ÅµÈ À½·á°¡ ¾ø½À´Ï´Ù.           ¦¢");
			System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
			return;
		}
		else
		{
			System.out.println("\n¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
			System.out.println("¦¢               [Ä«Å×°í¸®º°  ÆÇ¸ÅºñÀ²]               ¦¢");
			System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
			// Ä«Å×°í¸® ÁÖ¹®°Ç¼ö / ÃÑ ÁÖ¹® °Ç¼ö
			System.out.printf("%n1. [Ä¿ÇÇ] %20.1f%%", ((double)categoryOrder[0] / totalOrder) * 100);
			System.out.printf("%n2. [³íÄ¿ÇÇ] %20.1f%%", ((double)categoryOrder[1] / totalOrder) * 100);    
			System.out.printf("%n3. [ÁÖ½º] %20.1f%%", ((double)categoryOrder[2] / totalOrder) * 100);
			System.out.printf("%n4. [½º¹«µð] %20.1f%%", ((double)categoryOrder[3] / totalOrder) * 100);
			System.out.printf("%n5. [Æ¼] %20.1f%%", ((double)categoryOrder[4] / totalOrder) * 100);
			System.out.printf("%n6. [¿¡ÀÌµå] %20.1f%%", ((double)categoryOrder[5] / totalOrder) * 100);
			System.out.println("\n¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡");
			System.out.printf("7. µÚ·Î °¡±â%n");
			System.out.print(">> »ó¼¼ Ç×¸ñ Á¶È¸ (1 ~ 6) : ");

			AdminUI.sel = Integer.parseInt(br.readLine());
			System.out.println();
			if (AdminUI.sel == 7)
				return;
			sales();
		}
	}

	// »ó¼¼Ç×¸ñ Á¶È¸½Ã °¢ ¸Þ´ºµé Ãâ·Â ¸Þ¼Òµå
	public static void sales() throws IOException
	{
		if (categoryOrder[AdminUI.sel - 1] == 0)
		{
			System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
			System.out.println("¦¢    ÇöÀç ÇØ´ç Ä«Å×°í¸® ³» ÆÇ¸ÅµÈ À½·á°¡ ¾ø½À´Ï´Ù.   ¦¢");
			System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
			drinkDisp();
		}		
		else
		{
			System.out.println("\n¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
			System.out.println("¦¢                 [¸Þ´ºº°  ÆÇ¸ÅºñÀ²]                 ¦¢");
			System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
			// ÇØ´çÄ«Å×°í¸®ÀÇ ¸Þ´º ÁÖ¹®°Ç¼ö / Ä«Å×°í¸® ÁÖ¹®°Ç¼ö
			for (int i = 0; i < Coffee.drinkName.length; i++)
			{
				if (AdminUI.sel == 1)
						System.out.printf(" ¢º %s : %.1f%%%n", Coffee.drinkName[i], (((double)drinkOrder[0][i] / categoryOrder[0]) * 100)); 
				else if (AdminUI.sel == 2)
						System.out.printf(" ¢º %s : %.1f%%%n",NonCoffee.drinkName[i], (((double)drinkOrder[1][i] / categoryOrder[1]) *100));
				else if (AdminUI.sel == 3)
						System.out.printf(" ¢º %s : %.1f%%%n",Juice.drinkName[i],(((double)drinkOrder[2][i] / categoryOrder[2]) *100));
				else if (AdminUI.sel == 4)
						System.out.printf(" ¢º %s : %.1f%%%n",Smoothie.drinkName[i],(((double)drinkOrder[3][i] / categoryOrder[3]) *100));
				else if (AdminUI.sel == 5)
						System.out.printf(" ¢º %s : %.1f%%%n",Tea.drinkName[i],(((double)drinkOrder[4][i] / categoryOrder[4]) *100));
				else if (AdminUI.sel == 6)
						System.out.printf(" ¢º %s : %.1f%%%n",Ade.drinkName[i],(((double)drinkOrder[5][i] / categoryOrder[5]) *100));
			}
			System.out.println("¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡");
			System.out.println("                                     µÚ·Î°¡±â [ctrl+z]");
			str = br.readLine();

			if (str == null)
				drinkDisp();
		}
	}

	public static void addSales() // °áÁ¦ ¿Ï·áÈÄ ÃÖÁ¾ ÁÖ¹®¸ñ·Ï¿¡¼­ Sales Å¬·¡½º ³» º¯¼öµé ÃÊ±âÈ­ ½ÃÄÑÁÖ±â À§ÇÑ ¸Þ¼Òµå 
	{
		for (int i = 0; i < Cart.vc.size(); i++)
		{
			drinkOrder[Cart.vc.get(i).getCategoryNumber()][Cart.vc.get(i).getDrinkNumber()] += Cart.vc.get(i).getCount(); // ¸Þ´ºº° ÁÖ¹®°¹¼ö ÃÊ±âÈ­
			categoryOrder[Cart.vc.get(i).getCategoryNumber()] += Cart.vc.get(i).getCount();                               // Ä«Å×°í¸®º° ÁÖ¹®°¹¼ö ÃÊ±âÈ­
			totalOrder += Cart.vc.get(i).getCount();																	  // ÃÑ ÁÖ¹®°¹¼ö ÃÊ±âÈ­
			profit += Cart.vc.get(i).getCount() * (Cart.vc.get(i).getPrice() - COST[Cart.vc.get(i).getCategoryNumber()]); // ¼øÀÌÀÍ ÃÊ±âÈ­ ÁÖ¹®°¹¼ö (°¡°Ý - ¿ø°¡)
		}
	}
}
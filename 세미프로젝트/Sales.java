import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sales
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String str;
	public static int totalSale;						// 識 衙轎
	public static int totalCard;						// 蘋萄 衙轎
	public static int totalCash;						// ⑷旎 衙轎
	public static int totalCoupon;						// 鼠鼻 っ衙 旎擋(瓔ア 餌辨戲煎 й檣и 旎擋)
	public static int totalOrder;						// 識 輿僥 勒熱(偎熱) EX)嬴詭葬蘋喻 3濤 檜賊 + 3
	public static int profit;							// 牖檜櫛
	public static int[] categoryOrder = new int[6];		// 蘋纔堅葬 滌 輿僥勒熱(偃熱)蒂 氬擊 寡翮 EX) {醴Я輿僥勒熱 , 喱醴Я 輿僥勒熱 ...}
	public static int[][] drinkOrder = new int[6][6];	// 詭景滌 輿僥勒熱(偃熱)蒂 氬擊寡翮 [蘋纔堅葬][詭景 輿僥勒熱] EX) {[醴Я]{嬴詭葬蘋喻 輿僥勒熱,蘋む塭飲輿僥勒熱...}
	public static final int[] COST = {1000, 2000, 1500, 2500, 1000, 1500};	// 蘋纔堅葬滌 錳陛 牖熱櫛 啗骯縑 �倏�

	public static void salesDisp() throws IOException
	{
		do
		{
			System.out.println("\n忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			System.out.println("弛                    [っ衙  鱔啗]                    弛");
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
			System.out.println(" Ⅱ 識衙轎(蘋萄 + ⑷旎)      : " + totalSale); 
			System.out.println(" Ⅱ 蘋萄 唸薯 衙轎           : " + totalCard);
			System.out.println(" Ⅱ ⑷旎 唸薯 衙轎           : " + totalCash);
			System.out.println(" Ⅱ 鼠鼻っ衙旎擋(й檣識擋)   : " + totalCoupon);
			System.out.println(" Ⅱ 牖檜櫛                   : " + profit);
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
			System.out.println("                                     菴煎陛晦 [ctrl+z]");
			str = br.readLine();

			if (str != null)
				System.out.println("棻衛 殮溘п輿撮蹂.");
		}
		while (str != null);
		System.out.println();
	}

	// 陝 蘋纔堅葬滌 っ衙綠徽 詭模萄
	public static void drinkDisp() throws IOException
	{
		if (totalOrder == 0)
		{
			System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			System.out.println("弛             ⑷營 っ衙脹 擠猿陛 橈蝗棲棻.           弛");
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
			return;
		}
		else
		{
			System.out.println("\n忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			System.out.println("弛               [蘋纔堅葬滌  っ衙綠徽]               弛");
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
			// 蘋纔堅葬 輿僥勒熱 / 識 輿僥 勒熱
			System.out.printf("%n1. [醴Я] %20.1f%%", ((double)categoryOrder[0] / totalOrder) * 100);
			System.out.printf("%n2. [喱醴Я] %20.1f%%", ((double)categoryOrder[1] / totalOrder) * 100);    
			System.out.printf("%n3. [輿蝶] %20.1f%%", ((double)categoryOrder[2] / totalOrder) * 100);
			System.out.printf("%n4. [蝶鼠蛤] %20.1f%%", ((double)categoryOrder[3] / totalOrder) * 100);
			System.out.printf("%n5. [じ] %20.1f%%", ((double)categoryOrder[4] / totalOrder) * 100);
			System.out.printf("%n6. [縑檜萄] %20.1f%%", ((double)categoryOrder[5] / totalOrder) * 100);
			System.out.println("\n式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
			System.out.printf("7. 菴煎 陛晦%n");
			System.out.print(">> 鼻撮 о跡 褻�� (1 ~ 6) : ");

			AdminUI.sel = Integer.parseInt(br.readLine());
			System.out.println();
			if (AdminUI.sel == 7)
				return;
			sales();
		}
	}

	// 鼻撮о跡 褻�蜇� 陝 詭景菟 轎溘 詭模萄
	public static void sales() throws IOException
	{
		if (categoryOrder[AdminUI.sel - 1] == 0)
		{
			System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			System.out.println("弛    ⑷營 п渡 蘋纔堅葬 頂 っ衙脹 擠猿陛 橈蝗棲棻.   弛");
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
			drinkDisp();
		}		
		else
		{
			System.out.println("\n忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			System.out.println("弛                 [詭景滌  っ衙綠徽]                 弛");
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
			// п渡蘋纔堅葬曖 詭景 輿僥勒熱 / 蘋纔堅葬 輿僥勒熱
			for (int i = 0; i < Coffee.drinkName.length; i++)
			{
				if (AdminUI.sel == 1)
						System.out.printf(" Ⅱ %s : %.1f%%%n", Coffee.drinkName[i], (((double)drinkOrder[0][i] / categoryOrder[0]) * 100)); 
				else if (AdminUI.sel == 2)
						System.out.printf(" Ⅱ %s : %.1f%%%n",NonCoffee.drinkName[i], (((double)drinkOrder[1][i] / categoryOrder[1]) *100));
				else if (AdminUI.sel == 3)
						System.out.printf(" Ⅱ %s : %.1f%%%n",Juice.drinkName[i],(((double)drinkOrder[2][i] / categoryOrder[2]) *100));
				else if (AdminUI.sel == 4)
						System.out.printf(" Ⅱ %s : %.1f%%%n",Smoothie.drinkName[i],(((double)drinkOrder[3][i] / categoryOrder[3]) *100));
				else if (AdminUI.sel == 5)
						System.out.printf(" Ⅱ %s : %.1f%%%n",Tea.drinkName[i],(((double)drinkOrder[4][i] / categoryOrder[4]) *100));
				else if (AdminUI.sel == 6)
						System.out.printf(" Ⅱ %s : %.1f%%%n",Ade.drinkName[i],(((double)drinkOrder[5][i] / categoryOrder[5]) *100));
			}
			System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
			System.out.println("                                     菴煎陛晦 [ctrl+z]");
			str = br.readLine();

			if (str == null)
				drinkDisp();
		}
	}

	public static void addSales() // 唸薯 諫猿�� 譆謙 輿僥跡煙縑憮 Sales 贗楚蝶 頂 滲熱菟 蟾晦�� 衛麵輿晦 嬪и 詭模萄 
	{
		for (int i = 0; i < Cart.vc.size(); i++)
		{
			drinkOrder[Cart.vc.get(i).getCategoryNumber()][Cart.vc.get(i).getDrinkNumber()] += Cart.vc.get(i).getCount(); // 詭景滌 輿僥偎熱 蟾晦��
			categoryOrder[Cart.vc.get(i).getCategoryNumber()] += Cart.vc.get(i).getCount();                               // 蘋纔堅葬滌 輿僥偎熱 蟾晦��
			totalOrder += Cart.vc.get(i).getCount();																	  // 識 輿僥偎熱 蟾晦��
			profit += Cart.vc.get(i).getCount() * (Cart.vc.get(i).getPrice() - COST[Cart.vc.get(i).getCategoryNumber()]); // 牖檜櫛 蟾晦�� 輿僥偎熱 (陛問 - 錳陛)
		}
	}
}
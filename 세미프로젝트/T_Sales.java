import java.util.List;
public class Sales
{
	List<Items> items;			
	int[] countItemList = new int[15];
	
	public Sales(List<Items> items)	// 날라오는 Items가 리스트기 때문에, List자료구조의 Items를 받아옴	
	{
		this.items = items;
	}

	public int getsumAll()
	{	
		int sumAll=0;

		for (int i=0; i<countItemList.length; i++)
		{
			int cnt = countItemList[i];
			sumAll += cnt * items.get(i).getPrice();
			
		}
		return sumAll;
	}
	

	public void countId(int itemId)
	{
		countItemList[itemId] += 1;
	}

	public void ranking()
	{	
		int max=0;

		for (int i=0; i<countItemList.length; i++)
		{
			if (max < countItemList[i])
			{
				max = countItemList[i];
			}	
		}
		for (int j=0; j<countItemList.length; j++)
		{
			if (max == 0)
			{
				System.out.printf("현재 팔린 상품이 없습니다.%n");
				break;
			}
			else if (max == countItemList[j])
			{
				System.out.printf("현재 1위는 %s입니다 %n", items.get(j).getName());
			}
		}
	}
}
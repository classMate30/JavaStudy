import java.util.List;
public class Sales
{
	List<Items> items;			
	int[] countItemList = new int[15];
	
	public Sales(List<Items> items)	//List자료구조의 Items를 받아옴				//날라오는 Items가 List라는 뜻
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
	
	public void ranking()						//상품 판매 랭킹을 매길 것
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
			if (max == countItemList[j])
			{	
				
				System.out.printf("현재 1위는 %s 입니다 %n", items.get(j).getName());
			}
		}

	}

	


}


/*
		for (int i=0; i<countItemList.length; i++)		
		{
			for (int j=0; j<countItemList.length; j++)	
			{
				if (countItemList[i] > countItemList[j])
				{
			
					countItemList[j]++;
				}	
				
				else if(countItemList[i] > countItemList[j]) 
				{
					countItemList[i]++;
				}
			}
		System.out.printf("현재 %d 위는 %s 입니다%n",(i+1) ,items.get(i).getName());
		
*/
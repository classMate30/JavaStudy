/*
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

*/
/*
1.랜덤으로 1~6까지의 수를 3번 발생시킨다.
2.3번의 횟수중 중복이 일어난다면, 횟수에 따라 상금을 나눈다
	①같은 눈이 3개가 나오면 → 10,000원+(같은 눈)×1,000원
	②같은 눈이 2개만 나오면 → 1,000원+(같은 눈)×100원
	③모두 다른 눈이 나오면  → (그 중 가장 큰 눈)×100원
*/

import java.util.Scanner;
public class Boj2480
{
	public static void main(String[] args)
	{
		int x, y, z, result;
		
		/*Random rd = new Random();
		x = rd.nextInt(6)+1;
		y = rd.nextInt(6)+1;
		z = rd.nextInt(6)+1;
		*/
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		

		if (x==y && x==z)
		{
			result = 10000 + x * 1000; 
		}
		else if (x==y || x==z)
		{
			result = 1000 + x * 100;
		}
		else if (y==z)
		{
			result = 1000 + y * 100;
		}
		else
		{	
			int[] arr = {x,y,z};
			for (int i=1; i<arr.length; i++)
			{	
				int j;
				int tmp = arr[i];
				for (j=i; j>0 && arr[j-1]>tmp; j--)
				{
					arr[j] = arr[j-1];
				}
				arr[j] = tmp;
			}
			result = arr[2] * 100;
		}
		
		
		System.out.println(result);
	}
}
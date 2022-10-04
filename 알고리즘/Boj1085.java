/*
한수는 지금 (x, y)에 있다. 
직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
*/

/*
6 2 10 3  > 1

1 1 5 5   > 1

653 375 1000 1000 > 347



161 181 762 375 >  161

*/
import java.util.Scanner;
public class Boj1085
{
	public static void main(String[] args)
	{	
		//스캐너로 입력 값 받아 올 것 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//거리의 최솟 값은 직선이기 때문에, (x-0),(y-0),(w-x),(h-y) 이 네 점 중에 존재
		//가장 작은 값을 출력 해주면 되기에 배열에 담아서 정렬 후 최솟값만 출력
		int[] arr = {(x-0),(y-0),(w-x),(h-y)};
		for (int i=1; i<arr.length; i++)
		{
			int j;
			int tmp =arr[i];
			for (j=i; j>0&&arr[j-1]>tmp; j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=tmp;
		}

		System.out.println(arr[0]);
	}
}
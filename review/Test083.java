/*==========================================
   ■■■ 배열 ■■■
   - 배열의 선언과 초기화
   - 배열의 기본적 활용
=========================================*/
// ○ 과제
//	  사용자로부터 임의의 정수를 임의의 개수만큼 입력받아
//	  입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다.
//	  단, 배열을 활용하여 구현할 수 있도록 한다.


//	실행 예)
//	입력할 데이터의 갯수  : 12
//	데이터 입력(공백 구분): 74 65 13 91 54 22 86 45 13 99 11 38
//  >> 가장 큰 수 → 99
//  계속하려면 아무 키나 누르세요...

import java.util.Scanner;
public class Test083
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int n, max=0;

		System.out.print("입력할 데이터의 갯수 : ");
		n = sc.nextInt();

		int[] arr = new int[n];
		
		System.out.print("데이터 입력(공백 구분) : ");
		for (int i=0; i<n; i++)
		{	
			arr[i]= sc.nextInt();
			if (arr[i]>max)
				max = arr[i];
		}

		System.out.println("가장 큰 수 → " + max);

	
	}
}

//실행 결과
/*
입력할 데이터의 갯수 : 12
데이터 입력(공백 구분) : 90 80 70 50 60 100 110 130 120 80 40 50
가장 큰 수 → 130
계속하려면 아무 키나 누르십시오 . . .
*/
		
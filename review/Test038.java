/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- if 문
- if ~ else 문 실습
==========================================*/
//사용자로부터 임의의 정수 5개를 입력받아
//짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
//단, Scanner를 활용하여 데이터를 입력받을 수 있도록 한다.

//실행 예)
//임의의 정수 5개 입력(공백 구분) : 1 2 3 4 5

// >> 짝수의 합은 6 이고, 홀수의 합은 9입니다.
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
public class Test038
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int evenSum=0, oddSum=0;

		System.out.print("임의의 정수 5개 입력 : ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			
			if (arr[i]%2==0)
				evenSum += arr[i];
			else if (arr[i]%2!=0)
				oddSum += arr[i];
		}
		
		System.out.printf(">> 짝수의 합은 %d이고, 홀수의 합은 %d입니다.%n", evenSum, oddSum);

	}
}
/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- 반복문(while문) 실습
==========================================*/

//○ 과제
//	 사용자로부터 임의의 정수를 입력받아
//	 1부터 입력받은 그 정수까지의
//	 전체 합과, 짝수의 합과, 홀수의 합을
//	 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 284
// >> 1 ~ 284 까지 정수의 합 : xxxx
// >> 1 ~ 284 까지 짝수의 합 : xxxx
// >> 1 ~ 284 까지 홀수의 합 : xxxx
// 계속하려면 아무키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		int i=1, sum=0, oddSum=0, evenSum=0;
		while (i<=n)
		{
			sum += i;
			if (i%2!=0)
				oddSum+=i;
			else if (i%2==0)
				evenSum+=i;
			
			i++;
		}
		System.out.printf(" >> 1 ~ %d 까지 정수의 합 : %d%n", n, sum);
		System.out.printf(" >> 1 ~ %d 까지 홀수의 합 : %d%n", n, oddSum);
		System.out.printf(" >> 1 ~ %d 까지 짝수의 합 : %d%n", n, evenSum);
	}
}

//실행 결과
/*
임의의 정수 입력 : 10
 >> 1 ~ 10 까지 정수의 합 : 55
 >> 1 ~ 10 까지 홀수의 합 : 25
 >> 1 ~ 10 까지 짝수의 합 : 30
계속하려면 아무 키나 누르십시오 . . .


임의의 정수 입력 : 100
 >> 1 ~ 100 까지 정수의 합 : 5050
 >> 1 ~ 100 까지 홀수의 합 : 2500
 >> 1 ~ 100 까지 짝수의 합 : 2550
계속하려면 아무 키나 누르십시오 . . .
*/
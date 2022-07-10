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
		//주요 변수 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;						//사용자에게 입력받아와 값을 저장할 변수 num을 선언한다.
		int i=1;						//반복문을 돌릴 루프 변수i를 선언하고 초기값을 1로 초기화한다.
		int sum=0, evenSum=0, oddSum=0;	//정수의 합,짝수의 합, 홀수의 합을 담을 변수를 선언하고 초기화한다.
		//사용자에게 임의의 정수를 입력 받게 세팅한다.
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		while (i<=num)					//초기값 1부터 사용자 입력값이 나올때까지 반복문 수행
		{
			sum += i;					//정수의 누적 합을 구한다
			if (i%2==0)					
				evenSum += i;			//짝수의 누적 합을 구한다
			else if(i%2==1)
				oddSum +=i;				//홀수의 누적 합을 구한다.

			i ++;					
		}
		System.out.printf("1 ~ %d 까지 정수의 합 : %d%n", num, sum);
		System.out.printf("1 ~ %d 까지 짝수의 합 : %d%n", num, evenSum);
		System.out.printf("1 ~ %d 까지 홀수의 합 : %d%n", num, oddSum);
	}
}

//실행 결과
/*

임의의 정수 입력 : 284
1 ~ 284 까지 정수의 합 : 40470
1 ~ 284 까지 짝수의 합 : 20306
1 ~ 284 까지 홀수의 합 : 20164
계속하려면 아무 키나 누르십시오 . . .
*/

/*
의의 정수 입력 : 100
1 ~ 100 까지 정수의 합 : 5050
1 ~ 100 까지 짝수의 합 : 2550
1 ~ 100 까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/
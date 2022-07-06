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
		//주요 변수 선언
		Scanner sc = new Scanner(System.in);
		
		//값 초기화 필요한거 check~!!!
		// 누적합을 담을 변수 0으로 초기화!
		int evenSum=0;	//-- 짝수의 합을 담아낼 변수 선언
		int oddSum=0;		//-- 홀수의 합을 담아낼 변수 선언
		int num1, num2, num3, num4, num5;
		//--사용자로부터 입력받은 다섯 개의 정수를 담아낼 변수 선언
				

		//연산 및 처리
		System.out.print("임의의 정수 5개 입력(공백 구분) : "); // 1 2 3 4 5
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if(num1%2==0)		//--num1이 짝수일 때
			//evenSum을 num1만큼 증가시켜라
			evenSum += num1;
		else				//--num1이 홀수일 때 
			//oddSum을 num1만큼 증가시켜라
			oddSum += num1;

		if(num2%2==0)		//--num2이 짝수일 때
			//evenSum을 num2만큼 증가시켜라
			evenSum += num2;
		else				//--num2이 홀수일 때 
			//oddSum을 num2만큼 증가시켜라
			oddSum += num2;

		if(num3%2==0)		//--num3이 짝수일 때
			//evenSum을 num3만큼 증가시켜라
			evenSum += num3;
		else				//--num3이 홀수일 때 
			//oddSum을 num3만큼 증가시켜라
			oddSum += num3;

		if(num4%2==0)		//--num4이 짝수일 때
			//evenSum을 num4만큼 증가시켜라
			evenSum += num4;
		else				//--num4이 홀수일 때 
			//oddSum을 num4만큼 증가시켜라
			oddSum += num4;

		if(num5%2==0)		//--num5이 짝수일 때
			//evenSum을 num5만큼 증가시켜라
			evenSum += num5;
		else				//--num5이 홀수일 때 
			//oddSum을 num5만큼 증가시켜라
			oddSum += num5;

		//결과 출력
		System.out.printf("\n>> 짝수의 합은	%d 이고, 홀수의 합은 %d입니다.\n", evenSum, oddSum);
	}
}

/*
임의의 정수 5개 입력(공백 구분) : 2 4 6 8 10

>> 짝수의 합은  30 이고, 홀수의 합은 0입니다.
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 5개 입력(공백 구분) : 22 23 24 25 26

>> 짝수의 합은  72 이고, 홀수의 합은 48입니다.
계속하려면 아무 키나 누르십시오 . . .


*/



/*
임의의 정수 5개 입력(공백 구분) : 11 13 15 17 19

>> 짝수의 합은  0 이고, 홀수의 합은 75입니다.
계속하려면 아무 키나 누르십시오 . . .


*/

/*
import java.util.Scanner;
public class Test038
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,oddSum = 0,evenSum = 0;

		System.out.print("임의의 정수 5개 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		if (a % 2 ==0)
		{
			evenSum += a;
		}
		else if (a % 2 != 0)
		{
			oddSum += a;
		}

		if (b % 2 ==0)
		{
			evenSum += b;
		}
		else if (b % 2 != 0)
		{
			oddSum += b;
		}		

		if (c % 2 ==0)
		{
			evenSum += c;
		}
		else if (c % 2 != 0)
		{
			oddSum += c;
		}

		if (d % 2 ==0)
		{
			evenSum += d;
		}
		else if (d % 2 != 0)
		{
			oddSum += d;
		}

		if (e % 2 ==0)
		{
			evenSum += e;
		}
		else if (e % 2 != 0)
		{
			oddSum += e;
		}

		System.out.printf("짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.%n",evenSum ,oddSum);
	}	
}
*/
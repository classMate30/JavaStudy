/*=======================================
■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- if 문
- if ~ else 문 실습
==========================================*/
// 1. 프로그램을 작성할 때 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//    if 문, if ~ else문, 조건 연산자, 복합 if 문(if문 중첩)
//    , switch 문이 있다.

// 2. if 문은 if 다음의 조건이 참일 경우
//    특정 문장을 수행하고자 할 때 사용되는 구문이다.

// 사용자로부터 임의의 정수를 입력받아
// 홀수 / 짝수를 판별하는 프로그램을 구현한다.
// 단, 단일 if 구문을 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : 20
// >> 20은(는) 짝수입니다.
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 47
// >> 47은(는) 홀수입니다.
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		if (num%2==0)
		{
			System.out.printf(">>%d(은)는 짝수입니다.%n", num);
			return;
		}
		else if (num%2!=0)
		{
			System.out.printf(">>%d(은)는 홀수입니다.%n", num);
			return;
		}
		

	}
}

//실행결과
/*
임의의 정수 입력 : 20
>>20(은)는 짝수입니다.
계속하려면 아무 키나 누르십시오 . . .



임의의 정수 입력 : 47
>>47(은)는 홀수입니다.
계속하려면 아무 키나 누르십시오 . . .







*/
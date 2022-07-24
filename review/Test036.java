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


//사용자로부터 임의의 두 정수와 연산자를 입력받아
//해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
//단, if 조건문을 활용하여 처리 할 수 있도록 하며,
//연산 결과는 편의상 정수 기반으로 처리될 수 있도록 한다.


//실행 예)
//첫 번째 정수 입력 : 10
//두 번째 정수 입력 : 3
//연산자 입력 [ + - * /]

// >> 10 + 3 = 13
// 계속하려면 아무키나 누르세요...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 [ + - * /]");
		op = (char)System.in.read();

		if (op == '+')
			System.out.printf("%d + %d = %d%n",num1,num2,num1+num2);
		else if (op =='-')
			System.out.printf("%d - %d = %d%n",num1,num2,num1-num2);
		else if (op == '*')
			System.out.printf("%d * %d = %d%n",num1,num2,num1*num2);
		else if (op == '/')
			System.out.printf("%d / %d = %d%n",num1,num2,num1/num2);
		else 
			System.out.print("판정 불가~!!!%n");
		
		
	}
}

//실행 결과

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 3
연산자 입력 [ + - * /]+
10 + 3 = 13
계속하려면 아무 키나 누르십시오 . . .

*/
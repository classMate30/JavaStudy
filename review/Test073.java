/*==========================================
■■■■ 클래스와 인스턴스■■■■■
==========================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.
// (Calculate 클래스 설계)

// 실행 예)
// 임의의 두 정수 입력(공백 구분): 10 5
// 임의의 연산자(+ - * /)		:  +
// >> 10 + 5 = 15
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;
class Calculate
{
	int su1, su2;
	char op;

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("임의의 연산자( + - * /) : ");
		op = (char)System.in.read();
	}

	int cal()
	{
		int result =-1;
		switch (op)
		{

		case '+': result = su1 + su2; break;
		case '-': result = su1 - su2; break;
		case '*': result = su1 * su2; break;		
		case '/': result = su1 / su2; break;
		}
		return result;
	}
	
	void print(int a)
	{
		System.out.printf(">> %d %c %d = %d%n", su1, op, su2, a);
	}
}
public class Test073
{
	public static void main(String[] args) throws IOException
	{
		Calculate cal = new Calculate();
		cal.input();
		cal.print(cal.cal());
	
	}
}
/*
임의의 두 정수 입력(공백 구분) : 10 5
임의의 연산자( + - * /) : +
>> 10 + 5 = 15
계속하려면 아무 키나 누르십시오 . . .
/*
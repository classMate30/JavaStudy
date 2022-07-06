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
		//③방법	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result = 0;
		char op;
		
		System.out.print("첫 번째 정수 입력		:");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력		:");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /]	:");
		op = (char)System.in.read();

		if (op == '+') //스테이트먼트 하나일때 {}생략 가능 이하와 같이
			result = a + b;
		else if (op == '-')
			result = a - b;
		else if (op == '*')
			result = a * b;
		else if (op == '/')
			result = a / b;

		System.out.printf("\n>> %d %c %d = %d%n", a, op, b, result); 
	}
}

		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, op;			//-- 첫 번째, 두 번째 정수, 연산자 check~!!!
		System.out.print("첫 번째 정수 입력 : "); 
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		//Integer.parseInt()
		//"1234" → Integer.parseInt() → 1234
		//"abdc" → Integer.parseInt() → (X) 에러 발생(numberformatException)

		// System.in.read()는 인트형으로 아스키코드 값을 반환

		System.out.print("연산자 [+ - * /] : ");
		// op = (char)Integer.parseInt(br.readLine()); 사용 불가 "+" 숫자열 형태x
		
		op =System.in.read();

		if (op == 43) //사용자가 입력한 연산자가 덧셈이라면
		{
			//a 와 b의 덧셈 연산 수행하여 출력
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == 45)
		{
			//a 와 b의 뺄셈 연산 수행하여 출력
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == 42)
		{
			//a 와 b의 곱셈 연산 수행하여 출력
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == 47)
		{
			//a 와 b의 나눗셈 연산 수행하여 출력
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else 
		{
			System.out.println("\n>> 입력 과정에 오류가 존재합니다.");
		}
	}
}
*/
		
		//②방법
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, op;			//-- 첫 번째, 두 번째 정수, 연산자 check~!!!
		System.out.print("첫 번째 정수 입력 : "); 
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		//Integer.parseInt()
		//"1234" → Integer.parseInt() → 1234
		//"abdc" → Integer.parseInt() → (X) 에러 발생(numberformatException)

		// System.in.read()는 인트형으로 아스키코드 값을 반환

		System.out.print("연산자 [+ - * /] : ");
		// op = (char)Integer.parseInt(br.readLine()); 사용 불가 "+" 숫자열 형태x
		
		op =System.in.read();

		if (op == 43) //사용자가 입력한 연산자가 덧셈이라면
		{
			//a 와 b의 덧셈 연산 수행하여 출력
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == 45)
		{
			//a 와 b의 뺄셈 연산 수행하여 출력
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == 42)
		{
			//a 와 b의 곱셈 연산 수행하여 출력
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == 47)
		{
			//a 와 b의 나눗셈 연산 수행하여 출력
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else 
		{
			System.out.println("\n>> 입력 과정에 오류가 존재합니다.");
		}
	}
}
*/


/*
첫 번째 정수 입력 : 45
두 번째 정수 입력 : 1
연산자 [+ - * /] : +

>> 45 + 1 = 46
계속하려면 아무 키나 누르십시오 . . .

	
*/


		//①방법
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;			//-- 첫 번째, 두 번째 정수
		char op;			//-- 연산자

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		//Integer.parseInt()
		//"1234" → Integer.parseInt() → 1234
		//"abdc" → Integer.parseInt() → (X) 에러 발생(numberformatException)

		// System.in.read()는 인트형으로 아스키코드 값을 반환

		System.out.print("연산자 [+ - * /] : ");
		// op = (char)Integer.parseInt(br.readLine()); 사용 불가 "+" 숫자열 형태x
		
		op =(char)System.in.read();

		if (op == '+')
		{
			//a 와 b의 덧셈 연산 수행하여 출력
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == '-')
		{
			//a 와 b의 뺄셈 연산 수행하여 출력
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == '*')
		{
			//a 와 b의 곱셈 연산 수행하여 출력
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == '/')
		{
			//a 와 b의 나눗셈 연산 수행하여 출력
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else 
		{
			System.out.println("\n>> 입력 과정에 오류가 존재합니다.");
		}


		//연산자 잘 나오는지 테스트 확인
		//System.out.println("입력한 연산자 : " +op);
		
		//사용자가 입력한 연산자가 '+'라면
		//a 와 b의 덧셈 연산 수행하여 출력

		//사용자가 입력한 연산자가 '-'라면
		//a 와 b의 뺄셈 연산 수행하여 출력
		
		//사용자가 입력한 연산자가 '*'라면
		//a 와 b의 곱셈 연산 수행하여 출력

		//사용자가 입력한 연산자가 '/'라면
		//a 와 b의 나눗셈 연산 수행하여 출력


		
	}
}
*/

/*
 내가 한 풀이
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test036
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, numResult = 0;
		char mark =	' ' ;

		//사용자한테 입력 받아옴
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 [+ - * /] ");
		mark = (char)System.in.read();

		//연산 및 처리
		if (mark == '+')
		{
			numResult = num1 + num2;
		}
		else if (mark == '-')
		{
			numResult = num1 - num2;
		}
		else if (mark == '*')
		{
			numResult = num1 * num2;
		}
		else if (mark == '/')
		{
			numResult = num1 / num2;
		}
		System.out.println();
		System.out.printf(">> %d %c %d = %d%n", num1, mark, num2, numResult);

	}
}
*/
/*

		//사용자한테 입력 받아옴
		System.out.print("첫 번째 정수 입력 : ");
		num1 = System.in.read();
		System.in.skip(2);

		System.out.print("두 번째 정수 입력 : ");
		num2 = System.in.read();
		System.in.skip(2);

		System.out.print("연산자 입력 : ");
		mark = (char)System.in.read();

*/
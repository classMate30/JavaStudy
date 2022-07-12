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
	//주요 변수 선언
	int su1, su2;			//-- 사용자로부터 입력받은 두 정수를 담아낼 변수
	char op;				//-- 사용자로부터 입력받은 연산자를 담아낼 변수


	//메소드 정의(기능 : 입력)
	void input() throws IOException	//값을 받아내는 것 뿐이니 반환할 게 없음 → void
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("임의의 연산자(+ - * /)		    : ");
		op = (char)System.in.read();
	}

	//메소드 정의(기능 : 연산) → 나눗셈 연산도 정수 기반으로 처리 (아직 오버로딩,오버라이딩 배우지 않았기 때문에)
	//반환 자료형 int~!!!
	int cal()
	{
		//int result = -1; // default를 밑에처럼 주나 이렇게 주나 똑같음
		int result = 0;
		switch (op)
		{
			case '+' :result = su1 + su2; break;
			case '-' :result = su1 - su2; break;
			case '*' :result = su1 * su2; break;
			case '/' :result = su1 / su2; break;
			//default  :result = -1;
		}

		return result;
	}
	

	//메소드 정의(기능 : 출력)
	void print(int s)		//입력받은 값으로 su1,op,su2다 가지고 있으니 결과만 주면되겠다
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s);
	}

}


public class Test073
{
	public static void main(String[] args) throws IOException
	{
		Calculate cal = new Calculate();

		cal.input();			//-- 생성한 인스턴스를 통한 입력 메소드 호출
		int r= cal.cal();		//-- 생성한 인스턴스를 통한 연산 메소드 호출
		cal.print(r);			//-- 생성한 인스턴스를 통한 출력 메소드 호출

	}
}
/*import java.util.Scanner;
import java.io.IOException;
class Calculate
{	
	//주요 변수 선언
	int a, b;
	char o;
	double num;
	
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분)");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("임의의 연산자[+ - * /] : ");
		o = (char)System.in.read();
	}

	double calculate()
	{
		if (o=='+')
			num = a + b;
		else if(o=='-')
			num = a - b;
		else if (o=='*')
			num = a * b;
		else if (o=='/')
			num = (double)a / b;

		return num;
	}

	void print(double num)
	{
		System.out.printf("%d %c %d = %.2f\n", a, o, b, num);
	}	
}


public class Test073
{
	public static void main(String[] args) throws IOException
	{

		Calculate ob = new Calculate();
		ob.input();
		
		double num = ob.calculate();

		ob.print(num);
	}
}
*/

// 실행 결과

/*
임의의 두 정수 입력(공백 구분) : 10 5
임의의 연산자(+ - * /)              : +
>> 10 + 5 = 15
계속하려면 아무 키나 누르십시오 . . .
*/
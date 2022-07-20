/*======================================
   ■■■ 클래스 고급 ■■■
   -상속(Inheritance)
=======================================*/

//다음과 같은 프로그램을 구현한다
//단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5
// 계속하려면 아무 키나 누르세요...

//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}
class Bclass extends Aclass
{
	/* 상속으로 가져오는 것들
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/
	Bclass()
	{
		//super(); 생성자 호출시 자동으로 부모의 생성자 이렇게 호출해옴
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		String temp = br.readLine();			//문자열을 통째로 받아오는 형식  "20 15"
		
		//※문자열. ←기능 사용가능	여태까지 temp.length / temp.substring 배움
		//  문자열.split("구분자")
		//  문자열.split("\\s");			//--구분자 →공백
		//	ex) "10 20 30 40 50".split("\\s");
		//		→ 반환 → {"10", "20", "30", "40", "50"}
		
		//	ex) "010-1234-4567".split("-");
		//		→ 반환 → {"010", "1234", "4567"}

		String[] strArr = temp.split("\\s");	//문자열의 배열을 반환
		
		if(strArr.length != 2)
			return false;
		//-- false를 반환하며 input() 메소드 종료
		//	 이 조건을 만족하여 if문을 수행하게 될 경우
		//	 아래 수행해야 할 코드가 남아있더라도
		//	 결과값(false)을 반환하며 메소드는 종료된다
		
		x =	Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		
		if (op!='+' && op!='-' && op!='*' && op!='/')	//or 아님 check~!!
		{
			return false;
		}
		
		return true;
		/*
		if(op=='+' || op=='-' || op=='*' || op=='/')	//위에랑 같은 말임
		{
			return true;
		}
		
		
		return false;
		*/
	}	//close input()


	double calc()
	{
		double result = 0;
		
		switch (op)
		{
		case '+': result = x+y; break;
		case '-': result = x-y; break;
		case '*': result = x*y; break;
		case '/': result = (double)x/y;
		
		}
		
		return result;

	}//end calc()


}//close class Bclass


public class Test113
{
	public static void main(String[] args) throws IOException
	{	
		Bclass ob = new Bclass();
		
		//ob.input()
		if (ob.input()==false)
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();
		ob.write(result);
		
		
		/*
		ob.input();
		double result = ob.cal();
		ob.write(result);
		*/
	}
}


/*
class Bclass extends Aclass 
{	
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
	}
	public double cal()
	{	
		double result=0;
		
		switch (op)
		{
		case '+' : result = x+y; break;
		case '-' : result = x-y; break;
		case '*' : result = x*y; break;
		case '/' : result = (double)x/y; break;
		}
		return result;
	}

}
		/*
		if (op=='+')
			result = x + y;
		else if (op=='-')
			result = x - y;
		else if (op=='*')
			result = x * y;
		else if (op=='/')
			result = (double)x / y;
		return
			result;
		*/



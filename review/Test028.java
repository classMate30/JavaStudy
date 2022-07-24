/*=======================================
■■■■연산자(Operator)■■■■■
- 조건 연산자 == 삼항 연산자
==========================================*/
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 양수인지, 음수인지, 0인지를 구분하여
// 이 결과를 출력하는 프로그램을 구현한다.
// 단, 입력 데이터는 BufferedReader를 활용하고
// 조건 연산자(삼항 연산자)를 활용하여 기능을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : -12
// -12 → 음수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 257
// 257 → 양수
// 계속하려면 아무 키나 누르세요...

//임의의 정수 입력 : 0
// 0 → 영
// 계속하려면 아무 키나 누르세요...

//힌트 : 조건연산자 중첩

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n;
		String strResult;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		strResult = n==0 ? "영" : (n>0)? "양수" : "음수";

		System.out.printf("%d → %s%n", n, strResult);
	
	}
}

//실행 결과
/*
임의의 정수 입력 : -12
-12 → 음수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 257
257 → 양수
계속하려면 아무 키나 누르십시오 . . .


임의의 정수 입력 : 0
0 → 영
계속하려면 아무 키나 누르십시오 . . .




*/
/*=======================================
■■■■연산자(Operator)■■■■■
- 조건 연산자 == 삼항 연산자
==========================================*/
/*

				┌──────┐
	피연산자 연산자 피연산자 연산자 피연산자
	--------		-------		   --------
		1항			  2항			  3항

	피연산자 ? 피연산자 : 피연산자
	--------   -------	 --------
		1항	     2항			3항

	1항의 연산 결과	→ true		→ 2항 수행(치환)
					→ false		→ 3항 수행(치환)
*/
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 짝수인지 홀수인지 판별하는 프로그램을 구현한다
// 단, 조건연산자(삼항연산자)를 활용하여 문제를 해결 할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 251

// ===[판별 결과]===
// 251 → 홀수
// =================
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test027
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String even = "짝수" , odd = "홀수";
		String strResult;
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		strResult = n%2!=0 ? odd : even;
		
		System.out.println("===[판별 결과]===");
		System.out.printf("%d → %s%n", n, strResult);
		System.out.println("=================");
	}
}

//실행 결과
/*
임의의 정수 입력 : 250
===[판별 결과]===
250 → 짝수
=================
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 251
===[판별 결과]===
251 → 홀수
=================
계속하려면 아무 키나 누르십시오 . . .


*/
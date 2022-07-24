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


//사용자로부터 임의의 정수 세개를 입력 받아
//작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다

//실행 예)
//첫 번째 정수 입력 : 753
//두 번째 정수 입력 : 42
//세 번째 정수 입력 : 127

//>> 정렬 결과 : 42 127 753
//계속하려면 아무 키나 누르세요...
/* 정렬 : 비교하는 과정 /자리바꾸는 과정이 복합적으로 이루어진 것

		8		20		75			123		87		65
		----------					---		---
									87		123		65
		--				--			----			---
				----------			65		123		87
											---		---
									65		87		123


*/

// ① 첫 번째 정수 vs 두 번째 정수 크기 비교
//	  →첫 번째 정수가 두 번째 정수보다 클 경우... 자리 바꿈

// ② 첫 번째 정수 vs 세 번째 정수 크기 비교
//	  →첫 번째 정수가 두 번째 정수보다 클 경우... 자리 바꿈

// ③ 두 번째 정수 vs 세 번째 정수 크기 비교
//	  →두 번째 정수가 세 번째 정수보다 클 경우... 자리 바꿈

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test037
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());
		if (a>b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}
		if (a>c)
		{
			a = a^c;
			c = c^a;
			a = a^c;
		}
		if (b>c)
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}
		
		System.out.printf(">> 정렬 결과 %d %d %d%n", a, b, c);
		
	}
}
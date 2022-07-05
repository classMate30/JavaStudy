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
// 홀수 , 짝수 → 단일 if구문 

// 홀수 , 짝수 , 영 → if 문 중첩
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		String result = "판정 불가";
		if (num==0)
		{
			result = "영";
		}
		else if (num%2==0)
		{
			result = "짝수";
		}
		else if (num%2!=0)
		{
			result = "홀수";
		}
		//else
		//{
		//	result = "판정불가"
		//}
		
		System.out.println(num+ " →" + result);


		/*if (num % 2 !=0)
		{
			System.out.println(num + " → 홀수");
		}
		else if (num ==0)
		{
			System.out.println(num + " → 영");
		}
		else if (num % 2 ==0)
		{
			System.out.println(num + " → 짝수");
		}
	*/
		/*
		if (num % 2 == 0)
		{
			System.out.printf(">> %d은(는) 짝수입니다.%n", num);
		}
		else if(num % 2 != 0) 
		{
			System.out.printf(">> %d은(는) 홀수입니다.%n", num);
		}
		else
		{
			System.out.println(n+ "은(는) 영입니다.");
		}
		*/
	
	}
}
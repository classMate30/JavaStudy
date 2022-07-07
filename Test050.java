/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- 반복문(while문) 실습
==========================================*/

//반복문을 활용하여 누적곱 연산 수행
//cf.           누적합

// 1 * 2 * 3 * ... * 9 * 10

// 실행 예)
// 연산 결과 : xxx
// 계속하려면 아무 키나 누르세요...

public class Test050
{
	public static void main(String[] args)
	{
		//주요 변수 선언 및 초기화
		int n=0;			//-- 루프 변수
		int result=1;		//-- 누적곱을 담아낼 변수

		//연산 및 처리(반복문 구성)
		while (n<10)
		{
			n++;
			result *= n;

		}
		System.out.println("연산 결과 : " +result);
		System.out.println(n);
		/*
		int n=1, mul=1;

		while (n <=10)
		{
			mul *= n;
			n++;

		}
		System.out.println("연산 결과 : " + mul);
		*/
	}

}

/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- 반복문(for) 실습
==========================================*/

// 1부터 100까지의 정수 중에서
// 4의 배수만 출력하는 프로그램을 구현한다.
// 단, for문을 활용해야 하며
// 한 줄에 5개씩만 출력할 수 있도록 한다.

// 실행 예);
//	4	8	12	16	20
//	24	28	32	36	40
//			:
//계속하려면 아무 키나 누르세요...

public class Test058
{
	public static void main(String[] args)
	{
		for (int i=4; i<=100; i+=4)
		{
			System.out.printf("%4d",i);
			if (i%(4*5)==0)
				System.out.println();
		}
	}
}

//실행 결과
/*
   4   8  12  16  20
  24  28  32  36  40
  44  48  52  56  60
  64  68  72  76  80
  84  88  92  96 100
계속하려면 아무 키나 누르십시오 . . .

*/
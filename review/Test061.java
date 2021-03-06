/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- 반복문(for) 실습
- 별찍기
==========================================*/
// 다중	for문(반복문의 중첩)을 활용한 별찍기 실습
//○ 과제
//	 다음과 같은 내용이 출력될 수 있도록
//	 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

//	실행 예)
/*

	*
   **
  ***
 ****
*****

*/

public class Test061
{
	public static void main(String[] args)
	{
		for (int i=0; i<5; i++)
		{	
			for (int j=0; j<4-i; j++)
			{
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

//실행 결과
/*
    *
   **
  ***
 ****
*****
계속하려면 아무 키나 누르십시오 . . .
*/
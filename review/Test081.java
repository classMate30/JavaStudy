/*=======================================
   ■■■ 배열 ■■■
   - 배열의 선언과 초기화
   - 배열의 기본적 활용
=========================================*/

//『char』자료형의 배열을 만들어
//그 배열의 각 방에 알파벳 대문자를 채우고
//채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다.
//단, 채우는 구문과 출력하는 구문은 따로 분리하여 처리할 수 있도록 한다.

// 실행 예)
// A B C D E F G H I J K ... V W X Y Z
// 계속하려면 아무 키나 누르세요...



public class Test081
{
	public static void main(String[] args)
	{
		char[] chArr = new char[26];
		char ch = 'A';

		for (int i=0; i<chArr.length; i++)
		{
			chArr[i] = ch;
			ch++;
			System.out.print(chArr[i] + " ");
		}
		System.out.println();
		/*
		for (int i=0; i<chArr.length; i++)
		{
			System.out.print(chArr[i] + " ");
		}
		System.out.println();
		*/
	}
}
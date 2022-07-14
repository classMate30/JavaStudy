/*==========================================
   ■■■ 배열 ■■■
   - 배열의 배열(2차원 배열)
============================================*/
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
	A
	B	C
	D	E	F
	G	H	I	J
	K	L	M	N	O

계속하려면 아무 키나 누르세요...
*/

public class Test093
{
	public static void main(String[] args)
	{
		//캐릭터 타입의 배열의 배열을 5x5형태로 만들 것
		//주요 변수 선언 및 초기화
		char[][] arr = new char[5][5];
		char ch = 'A';

		//쑝이 웅~의 갯수에 맞춰서 반복문을 돌게 이중포문 구성
		//웅~은 총 5번 할 것이고 웅~쑝, 웅~쑝쑝, 웅~쑝쑝쑝, 웅~쑝쑝쑝쑝, 웅~쑝쑝쑝쑝쑝 형태로 구성
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<=i; j++)
			{
				arr[i][j] = ch;
				ch++;
			}
		}
		//결과 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}
	}
}

//실행 결과
/*
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .

*/
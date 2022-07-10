/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- 반복문(for) 실습
- 다중 for문(반복문의 중첩)을 활용한 구구단 출력 실습
==========================================*/

//실행 예)
/*
[2단]
2 * 1 =2
2 * 2 =4
  :

[3단]
3 * 1 =3
3 * 2 =6
  :
  :
  :
9 * 9 =81
계속하려면 아무키나 누르세요...

*/



public class Test059
{
	public static void main(String[] args)
	{
		int i, j;		//--루프 변수 두개 선언(루프를 두개 돌릴것이기 때문)
		for (i=2; i<=9 ; i++) // 웅~~~~웅~~~~~웅~~~~~ (단 처리)
		{					  // 단 처리 → 2 3 4 5 6 7 8 9						
			// 테스트(확인)
			//System.out.println("[ i : " + i + " ]");
			System.out.printf("\n===[%d단]===\n",i);
			
			for (j=1; j<=9 ; j++) //쑝쑝쑝쑝쑝		   (곱해지는 수 처리)
			{
				//System.out.printf("%d * %d = %d\n", i, j, i*j);
				System.out.println("j : "+j);
				//System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			
		}
		System.out.println(i+ " "+j);
	}
}

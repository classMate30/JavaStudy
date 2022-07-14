
/*==========================================
   ■■■ 배열 ■■■
   - 배열의 배열
============================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*

	1  8  9   16  17		
	2  7  10  15  18	
	3  6  11  14  19	
	4  5  12  13  20	

//웅~
     0  0  0  0      1  1  1  1			2				3			4	
	 i  i  i  i      i  i  i  i
 	00 10 20 30		31 21 11 01		02 12 22 32		33 23 13 03		04 14 24 34 
    j  j  j  j      j  j  j  j
    0  1  2  3      3  2  1  0			
     	→					← 
		0				1				2				3				4
//쑝쑝


계속하려면 아무 키나 누르세요...

*/
public class Test089
{
	public static void main(String[] args)
	{
		//배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[4][5];
		
		int n=0;
		
		for (int i=0; i<5; i++)		// outer 웅 i → 0 1 2 3 4
		{
			for (int j=0; j<4; j++)	// inner 쑝 j → 0 1 2 3
			{
				//테스트(확인)
				//System.out.print(j+ "" + i + " ");
				n++;
				if (i%2==0)			// i가 짝수 → 0 2 4 
					arr[j][i] = n;	// j를 0123→ 00 10 20 30		 02 12 22 32	 04 14 24 34
				else				// i가 홀수 → 1 3	
					arr[3-j][i] = n;// j를 0123을 3210으로 → 31 21 11 01	33 23 13 03
			}
			//System.out.println();

		}
		
		// 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d",arr[i][j]);
			System.out.println();
		}


	}
}

//실행 결과
/*
  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
계속하려면 아무 키나 누르십시오 . . .
*/


/*
		int n=1;
		int[][] arr = new int[4][5];
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<4; j++)
			{
				arr[j][i] = n;
				n++;
				

			}
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	1  8  9   16  17		
	2  7  10  15  18	
	3  6  11  14  19	
	4  5  12  13  20
*/
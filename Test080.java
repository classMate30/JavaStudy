/*==========================================
   ■■■ 배열 ■■■
   - 배열의 기본적 활용
=========================================*/

// 임의의 정수들이 들어있는 배열의 숫자 데이터들 중
// 짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는
// 프로그램을 구현한다.

// ※ 배열을 구성하는 임의의 정수 = 4 7 9 1 3 2 5 6 8

// 실행 예)
// 배열 요소 전체 출력
// 4 7 9 1 3 2 5 6 8
// 짝수 선택적 출력
// 4 2 6 8
// 3의 배수 선택적 출력
// 9 3 6
// 계속하려면 아무 키나 누르세요...

public class Test080
{
	public static void main(String[] args)
	{	

		// 배열 선언 및 초기화
		// 방법 ①
		/*
		int[] arr = new int[9];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/

		// 방법 ②
		int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8}; //배열의 요소를 구별하는 구별자는 『,』임

		//System.out.println(arr);
		//--==>>[I@15db9742
		
		// ※ 일반적인 변수에 담긴 내용을 출력하는 형식(방법)으로는
		//	  배열에 담긴 데이터들을 출력할 수 없다.
		
		System.out.println("배열 요소 전체 출력");
		for (int i=0; i<9; i++)
		{
			System.out.print(arr[i] + " " );
		}
		System.out.println();
		//--==>>
		/*
		배열 요소 전체 출력
		4 7 9 1 3 2 5 6 8
		*/
		
		//앞에 등장한게 배열이기만 하면 .length(점찍고 length) 배열의 길이를 알 수 있음

		int[] arr2= {4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8, 4, 7, 9, 1, 3, 2, 5, 6, 8};
		
		//System.out.println(arr2.length);
		//--==>> 108

		//System.out.println(arr.length);
		//--==>> 9
		System.out.println();
		System.out.println("배열 요소 전체 출력");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " " );
		}
		System.out.println();

		System.out.println("짝수 선택적 출력");
		for (int i=0; i<arr.length; i++)
		{	/*
			if (i%2==0)			//짝수라면... ←이 구문은 짝수 번째에 해당하는 요소라면
			{
				//출력해~!!!	← 해당 인덱스를 출력하게 되버림
				System.out.print(i + " " );
				//출력해~!!!	← 해당 인덱스의 값을 출력
				System.out.print(arr[i] + " " );
			}
			*/
			
			if (arr[i]%2==0)				// i번째 요소의 값이 짝수라면...
			{
				//출력해~!!!   ← 해당 인덱스의 값을 출력
				System.out.print(arr[i] + " " );
			}
		}
		System.out.println();
		//--==>>
		/*
		짝수 선택적 출력
		4 2 6 8
		*/


		System.out.println("3의 배수 선택적 출력");
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]%3==0)
			{
				System.out.print(arr[i] + " " );
			}
		}
		System.out.println();
		//--==>>
		/*
		3의 배수 선택적 출력
		9 3 6
		*/


		/*int i;

		int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};
		System.out.println("배열 요소 전체 출력");
		for (i=0; i<9; i++)
		{
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		System.out.println("짝수 선택적 출력");
		for (i=0; i<9; i++)
		{
			if (arr[i]%2==0)
			{
				System.out.printf("arr[%d] : %d\n", i, arr[i]);
			}
		}
		System.out.println("3의 배수 선택적 출력");
		for (i=0; i<9; i++)
		{
			if (arr[i]%3==0)
			{
				System.out.printf("arr[%d] : %d%n", i, arr[i]);
			}
		}

		*/
	}
}

//실행 결과
/*
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8

배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8
3의 배수 선택적 출력
9 3 6
계속하려면 아무 키나 누르십시오 . . .
*/
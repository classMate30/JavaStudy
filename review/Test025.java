/*=======================================
■■■■연산자(Operator)■■■■■
- 비트 단위 연산자 (비트 shift 연산자)[속도가 가장 빠름]
==========================================*/

public class Test025
{
	public static void main(String[] args)
	{
		int x = 128;
		System.out.printf("x << 3 : %d%n", x << 3);
		System.out.printf("x * 8 : %d%n", x	* 8);

		System.out.printf("x << 24 : %d%n", x<<24);

		System.out.printf("x << 25 : %d%n", x <<25);
		System.out.printf("x << 26 : %d%n", x <<26);
		System.out.printf("x << 27 : %d%n", x <<27);
		System.out.printf("x << 28 : %d%n", x <<28);
		System.out.printf("x << 29 : %d%n", x <<29);
		System.out.printf("x << 30 : %d%n", x <<30);
		System.out.printf("x << 31 : %d%n", x <<31);
		System.out.printf("x << 32 : %d%n", x <<32);


	}
}

//실행 결과
/*
x << 3 : 1024
x * 8 : 1024
x << 24 : -2147483648
x << 25 : 0
x << 26 : 0
x << 27 : 0
x << 28 : 0
x << 29 : 0
x << 30 : 0
x << 31 : 0
x << 32 : 128
계속하려면 아무 키나 누르십시오 . . .
*/
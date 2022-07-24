/*=======================================
■■■■자바 기본 프로그래밍 ■■■■■
-변수와 자료형
-실수형 데이터타입의 정밀도 테스트 실습
==========================================*/
public class Test020
{
	public static void main(String[] args)
	{
		float a = 0;
		double b = 0;

		for (int i=1; i<=100000; i++)
		{
			a += 100000;
			b += 100000;

		}

		System.out.println("float a : " + (a/100000));
		System.out.println("double b : " + (b/100000));
	}
}


//실행 결과
/*
float a : 99996.055
double b : 100000.0
계속하려면 아무 키나 누르십시오 . . .

*/
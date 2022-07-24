/*=====================================================
 ■■■■■ 자바의 개요 및 특징 ■■■■■
 -변수와 자료형
 -자바 기본 입출력 : BufferedReader 클래스 (뒤에 배울 내용 가불해서 먼저 배움)
=======================================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test012
{
	public static void main(String[] args) throws IOException
	{	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r;
		final double PI = 3.141592;
		double a,b;

		System.out.print("원의 반지름 입력 : ");
		r = Integer.parseInt(br.readLine());

		a = r * r * PI;
		b = r * 2 * PI;

		System.out.printf(">> 반지름이 %d인 원의 넓이는 %.2f이며%n", r, a);
		System.out.printf(">> 반지름이 %d인 원의 둘레는 %.2f이다%n", r, b);


	}

}

//실행 결과


/*
원의 반지름 입력 : 45
>> 반지름이 45인 원의 넓이는 6361.72이며
>> 반지름이 45인 원의 둘레는 282.74이다
계속하려면 아무 키나 누르십시오 . . .

*/
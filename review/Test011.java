/*=====================================================
 ■■■■■ 자바의 개요 및 특징 ■■■■■
 -변수와 자료형
 -변수와 자료형 실습 및 테스트: Quiz
=======================================================*/
/*
	직사각형의 넓이와 둘레를 구하는 프로그램 작성
	가로 : 10, 세로 : 20

//실행 예)
	넓이 :???
	둘레 :???
	계속하려면 아무 키나 누르세요...
*/
public class Test011
{
	public static void main(String[] args)
	{
		int a =10, b=20;

		int area, length;

		area = a * b;
		length = 2 * (a+b);

		System.out.println("넓이 : " +area);
		System.out.println("둘레 : " +length);
	}
}
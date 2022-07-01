/*=====================================================
 ■■■■■ 자바의 개요 및 특징 ■■■■■
 -변수와 자료형
 -변수와 자료형 실습 및 테스트: Quiz
=======================================================*/
//○퀴즈
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
		/*내가 풀이 한 것
		int a = 10, b = 20;
		int area,length;
		area = a*b;
		length = 2*(a+b);
		
		System.out.println("넓이 :" +area);
		System.out.println("둘레 :" +length);
		*/

		// 쌤이랑 같이 푼 것.

		//주요 변수 선언 및 초기화
		int a=10, b=20;				//--가로,세로
		int x, y;					//--넓이,둘레
		
		//연산 및 처리
		//넓이= 가로*세로
		x = a*b;
		y = (a+b)*2;

		//결과 출력
		//System.out.println("넓이 : " +x);
		//System.out.println("둘레 : " +y);
		System.out.printf("넓이 : %d\n",x);
		System.out.printf("둘레 : %d\n",y);
	}

}

/*실행 결과
넓이 : 200
둘레 : 60
계속하려면 아무 키나 누르십시오 . . .
*/
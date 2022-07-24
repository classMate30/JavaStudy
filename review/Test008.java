/*=====================================================
 ■■■■■ 자바의 개요 및 특징 ■■■■■
 -변수와 자료형
 -변수와 자료형 실습 및 테스트: char
=======================================================*/
public class Test008
{
	public static void main(String[] ars)
	{
		//주요 변수 선언
		char ch1,ch2,ch3,ch4;
		int a;

		//연산 및 처리
		ch1 = 'A';
		ch2 = '\n'; 
		ch3 = '대';
		ch4 = '\\';

		a= ch1; //ch1은 char타입 a는 int타입 ,char타입은 int에 담김 그러므로 자동형변환 일어남
		//a= (int)ch1; 명시적 형변환 2번째 유형 의도한 것이라는 것을 알려줄때

		//결과출력
		System.out.println("ch1 : " +ch1);
		System.out.println("ch2 : " +ch2);
		System.out.println("ch3 : " +ch3);
		System.out.println("ch4 : " +ch4);
		System.out.println("a : " +a);//선언만 하고 초기화 안하면 에러남
		System.out.printf("%c,%c,%c,%c,%d%n",ch1,ch2,ch3,ch4,a);


	}
}

/*
ch1 : A
ch2 :

ch3 : 대
ch4 : \
a : 65
A,
,대,\,65
계속하려면 아무 키나 누르십시오 . . .

*/
/*=======================================
	■■■■변수와 자료형■■■■
   -형 변환/ 접미사 활용
==========================================*/
public class Test006
{
	public static void main(String[] args)
	{
		int a;
		a=10;
		System.out.println("a의 결과 : "+a);
		int b;
		b=20;
		System.out.println("b의 결과 : "+b);
		
		short c; //이렇게 선언은 에러 안남, 이전의 에러는 println(c)하다가 난 컴파일 에러였음 헷갈리지말자
		
		//연산 및 처리(대입 연산)
		//c=a;
		//--==>>기본적으로 자료형이 작은 것에 큰 것을 담아내지 못한다.
		//(자동 형 변환 규칙 위반)
		//자동 형 변환 규칙에는 위반되지만
		//값이 그릇에 담길 수 있다면 명시적 형변환(강제 형 변환) 가능
		
		c=(short)a;
		//--a가 가지고 있는 데이터를 short형으로 형 변환을 수행한후 
		//변수 c에 대입한다
		//00000000 00000000 00000000 00001010 →int형 a 변수 10
		//					↓
		//00000000 00001010 →short형으로 형변환해서 c에 저장

		//int d=10000000000; //백억
		//--==>>에러 발생(컴파일 에러) int형 변수 d는 ±21억까지만 담을 수 있음

		//long d=10000000000; //백억
		//--==>>에러 발생(컴파일 에러)
		long d=10000000000l;
		System.out.println(d);
		/*접미사 『L,l』이 중요하다
			long형은 숫자(상수)뒤에 『L』또는 『l』을 붙여
			상수를 표현해야한다
			즉, 약 21억 이상 되는 정수 형태의 상수에는
			데이터 뒤에 접미사를 꼭 붙여줄 수 있도록 해야한다.
		*/
		
		//결과 출력
		//System.out.println("c의 결과 : "+c);
		

		int e = 030;
		System.out.println("e의 결과:" +e);
		//--==>> e의 결과 : 24	
		//자바에서 정수형 숫자에서 맨앞에 0이 붙어있으면 8진수로 인식해버림
		//접두사 『0』 → 8진수

		//변수 선언 및 초기화
		int f = 0xa6; //정수형태는 맞음
		System.out.println("f의 결과 :"+f);
		//결과 :166
		//접두사 『0x』→ 16진수
		//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
							// a  b  c  d  e  f

		//변수 선언 및 초기화
		//float g=0; 0을 정수int형으로 메모리 준비하는데 g는 실수형이고 그릇이 더크니 담김
		//float g=0.0; 0.0은 기본 double로 잡히는데 g는 float이면 더큰거에서 작은그릇으로 옮기는거라 안됨
		float g=0.0f;
		//결과 출력
		System.out.println("g의 결과 : " +g);
/*
a의 결과 : 10
b의 결과 : 20
10000000000
e의 결과:24
f의 결과 :166
g의 결과 : 0.0
계속하려면 아무 키나 누르십시오 . . .

*/
	}
}

/*=====================================================
 ■■■■■ 자바의 개요 및 특징 ■■■■■
 -변수와 자료형
 -변수와 자료형 실습 및 테스트:double
=======================================================*/
public class Test009
{
	public static void main(String[] args)
	{
		//정수와 정수의 나눗셈
		double a = 1 / 2; //나눗셈 연산자 /는 정수와 정수의 나눗셈에선 몫만 취한다.
		// double a=0; 0은 double 형으로 자동형변환됨. 그래서 a의 결과값은 0.0이 나옴
		System.out.println("double a :" +a);
		//--==>> double a: 0.0

		double b =(double)1/2;
		System.out.println("double b: " +b);
		//--==>> double b: 0.5
		/*얼핏 double b= (double)0;이 된다고 생각 할 수 있지만
		  나눗셈의 연산순위보다 ()의 연산순위가 높기에
		  double b= 1.0/2;이라고 봐야함
		  그러므로 답은 double b:0.5가 되는 것!
		*/
		
		double c= 1/2+1/2;
		System.out.println("double c: " +c);


		
		//피 연산자로 실수가 포함되어 있는 나눗셈 연산
		double d= 1/2.0;
		System.out.println("double d: " +d);
		//--==>> double d:0.5
		//--나눗셈 연산과 관련하여
		//	피 연산자 중 실수가 하나라도 포함되어 있다면
		//	연산은 실수 기반의 연산이 수행되며
		//	결과값 또한 실수 형태로 반환된다.

		double e= 3/2 + 1/2;
		System.out.println("double e : " +e);
		//double e= 1 + 1/2;
		//double e= 1 + 0;
		//double e= 1;
		//--==>>double e= 1.0

		double f= 3/2 + 1/2.0;
		System.out.println("double f : " +f);
		//double f = 1 +1/2.0;
		//double f = 1 +0.5;
		//double f = 1.5;
		//--==>>double f: 1.5

		double g= 3.0/2 + 1.0/2;
		System.out.println("double g : " +g);
	}
}
/*
double a :0.0
double b: 0.5
double c: 0.0
double d: 0.5
double e : 1.0
double f : 1.5
double g : 2.0
계속하려면 아무 키나 누르십시오 . . .
*/
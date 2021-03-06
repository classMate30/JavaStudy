/*=============================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
 	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Math 클래스
=============================================*/	

/*
○  java.lang.Math 클래스는
	
	수학(Mathmatics)과 관련된 유용한 속성과 함수들을 제공하는 클래스로
	생성자가 있긴 하지만...『private』으로 선언되어 있기 때문에
	외부에서 객체(인스턴스)를 생성할 수 없다
	단, 모든 메소드가 『static』으로 정의되어 있으므로
	객체를 생성하지 않고 바로 접근하여 사용하는 것이 가능하다

○  java.lang.Math 클래스의 주요 상수 및 메소드
	
	- public static final double E = 2.71.....;
	  : 자연 로그 상수

	- public static fianl double PI 3.141502
	  : 원주율(π)

	- public static double sin(double a)
	- public static double cos(double a)
	- public static double tan(double a)
	  : sin(a), cos(a), tan(a)의 값을 반환한다. (삼각 함수)

	- public static double asin(double a)
	- public static double acos(double a)
	- public static double atan(double a)
	  : asin(a), acos(a), atan(a)의 값을 반환한다. (삼각 함수의 역함수)

	- public static double toRadians(double angdeg)
      : 각도(angdeg)를 라디안(radian)으로 바꾸어 반환한다

	- public static double toRadians(double angrad)
      : 라디안(radian)을 각도(degree)로 바꾸어 반환한다

	- public static double exp(double a)
      : e의 a승을 구하여 반환한다

	- public static double log(double a)
      : 로그 값(log)을 구하여 반환한다

	- public static double sqrt(double a)
      : a의 제곱근을 구하여 반환한다

	- public static double ceil(double a)
      : e의 a승을 구하여 반환한다


*/
public class Test145
{
	public static void main(String[] args)
	{
		System.out.println("원주율		: " +Math.PI);
		System.out.println("2의 제곱근	: " +Math.sqrt(2));
		//--==>>원주율          : 3.141592653589793
		//		2의 제곱근      : 1.4142135623730951

		System.out.println("파이에대한 Degree	: " +Math.toDegrees(Math.PI));
		System.out.println("2파이에대한 Degree	: " +Math.toDegrees(2.0*Math.PI));
		//--==>>파이에대한 Degree       : 180.0
		//		2파이에대한 Degree      : 360.0

		
		//각도를 라디안으로 변환~!!
		double radian45 = Math.toRadians(45);

		System.out.println("각도 45 : " + radian45);
		System.out.println("싸인 45 : " + Math.sin(radian45));
		System.out.println("코싸인 45 : " + Math.cos(radian45));
		System.out.println("탄젠트 45 : " + Math.tan(radian45));
		//--==>>각도 45 : 0.7853981633974483
		//		싸인 45 : 0.7071067811865475
		//		코싸인 45 : 0.7071067811865476
		//		탄젠트 45 : 0.9999999999999999

		System.out.println("로그	  25 : " + Math.log(25));
		//--==>>로그 25 : 3.2188758248682006
		
		System.out.println("2의 4승 : " +Math.pow(2,4));
		//--==>>2의 4승 : 16.0
		System.out.println("0.0 ~ 1.0 사이의 난수 : " + Math.random());
		//--==>>0.0 ~ 1.0 사이의 난수 : 0.25448092036444425
		//		0.0 ~ 1.0 사이의 난수 : 0.9904371985308436
		//		0.0 ~ 1.0 사이의 난수 : 0.17408008230471894
	}
}
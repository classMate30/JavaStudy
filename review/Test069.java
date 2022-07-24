/*==========================================
■■■■ 지역변수와 전역변수 ■■■■■
	-지역 변수의 초기화 테스트
==========================================*/
//Test068.java와 비교~~!!!


public class Test069
{
	//클래스의 영역

	//전역 변수 a 선언 클래스 전역에서 다보임
	int a;		//설계도만으로는 안됨 , 인스턴스를 생성해서 실체화 해줘야함
	//--자동으로  0으로 초기화 지원

	boolean b;
	char c;
	double d;

	public static void main(String[] args)
	{
		//메소드의 영역
		//System.out.println("a : " +a);
		//--==>> 에러 발생(컴파일 에러)
		//		non-static variable a cannot be referenced from a static context
		Test069 ob = new Test069();	
		System.out.println("ob.a : " +ob.a);
		//--==>>ob.a : 0
		System.out.println("ob.b : " +ob.b);
		System.out.println("ob.c : " +ob.c);
		System.out.println("ob.d : " +ob.d);
		//--==>>ob.b : false
		//--==>>ob.c :
		//--==>>ob.d : 0.0
	}
}
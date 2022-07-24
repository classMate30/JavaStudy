/*==========================================
   ■■■ 클래스와 인스턴스 ■■■
   - 생성자(constructor)
=========================================*/
public class Test076
{

	// ※ 생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야 하며
	//	  필요할 경우 인수를 받아들이는 것도 가능하고,
	//	  같은 이름의 메소드를 정의하는 중복정의가 가능하지만
	//	  리턴값(반환값)은 가질 수 없다.

	// ※ 생성자는 다른 일반 메소드 처럼 호출 될 수 없고
	//	  『new』 연산자를 이용하여 객체를 생성하기 위해 호출되며,
	//	  각 클래스의 인스턴스인 객체를 생성한 후에
	//	  생성된	 객체의 멤버를 초기화 시키는 작업을 수행하게 된다.

	int x;
	Test076()
	{	//★Test076() 에서 Test076(int x) 생성자 호출 가능?★
		//생성자 내부에서 다른 생성자를 호출하는 것은 가능하다. 다른 메소드들처럼...
		//하지만, ★생성자 내부에서 가장 먼저 실행되어야 한다★. check~!!!!
		
		//생성자 내부에서 또다른 생성자를 호출하는 구문
		//Test076(100);
		this(100);

		x=10;
		
		System.out.println("인자 없는 생성자");
		//System.out.println("Test076이 갖고 있는 x : " +this.x);
		System.out.println("Test076이 갖고 있는 x : " +x);
	}
	
	//Test076(int num) //Test076() /Test076()은 안됨 Test076()/Test076(int num)
	Test076(int x)
	{	
		//x = num;
		//x = x;				// 둘 다 지역변수 x임 틀린 것임
		
		//『this』키워드
		// Test076.x= x; 문법적으로 선점했기때문에 이구문을 못쓰고 this.으로써야함
		//Test076.x =x; 논리적인 해석
		this.x=x;
		//this를 보게되면 이게 포함되어있는 클래스를 찾을 것

		System.out.println("인자가 하나인 생성자");
		System.out.println("Test076이 갖고있는 x : " + this.x);
	}



	public static void main(String[] args)
	{
		Test076 ob1 = new Test076();		//생성자 호출 구문
											//사용자 정의 Test076() 생성자 호출
		Test076 ob2 = new Test076(100);
		//System.out.println(ob2.x);

		System.out.println();
		System.out.println("main 에서 ob1.x : " + ob1.x);
		System.out.println("main 에서 ob2.x : " + ob2.x);
	}
}

//실행 결과
/*
인자가 하나인 생성자				//line 26번에 두줄 출력			//line55에 4줄 출력
Test076이 갖고있는 x : 100		//line 26번에 두줄 출력
인자 없는 생성자					//
Test076이 갖고 있는 x : 10		//
인자가 하나인 생성자				//line 59번에 의해 두줄 출력
Test076이 갖고있는 x : 100		//line 59번에 의해 두줄 출력

main 에서 ob1.x : 10
main 에서 ob2.x : 100

계속하려면 아무 키나 누르십시오 . . .
*/
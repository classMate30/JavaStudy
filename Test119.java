/*=============================================
 	■■	■클래스 고급■■■
 	- 인터페이스(Interface)
 =============================================*/


//인터페이스 
interface Demo
{
	public void write();
	public void print();

}



abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() 메소드 재정의...");
	}

	//public void print();
	//프린트를 갖고있기 때문에 추상 꼬리표 뗄수 없음
}


//추상클래스를 상속받는 추상 클래스
class DemoImplSub extends DemoImpl
{
	@Override
	public void print()
	{
		System.out.println("print() 메소드 재정의...");
	}
}


public class Test119
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();
		//-- 인스턴스 생성 불가 → 인터페이스

		//DemoImpl ob2 = new DemoImpl();
		//-- 인스턴스 생성 불가 → 추상 클래스

		DemoImplSub ob3 = new DemoImplSub();
		

		ob3.write();
		ob3.print();

		//--==>> write() 메소드 재정의...
		//--==>> print() 메소드 재정의....



		//DemoImpl에서는 print()재정의 안해서 객체 생성이 안되고
		//DemoImpl에서 재정의한 write()를 물려받고 print()를 재정의한 DemoImplSub로 객체 생성이 가능하다.
	}
}
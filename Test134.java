/*=============================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
 	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Wrapper 클래스
=============================================*/	
public class Test134
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;
		float f = 1.2f;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		Float f2 = new Float(f);

		System.out.println(b2);
		System.out.println(i2);
		//--==>>3
		//		256

		print(b2);
		print(i2);
		print(f2);

	}	
		
		//print(3);
		//3이라는 정수를 객체로 담아주는 오토 박싱이 일어나고 
		//그게 업캐스팅이 일어나서 처리가 되는형식

		//java.lang.Number 클래스(추상 클래스)는
		//모든 숫자형 Wrapper 클래스의 부모 클래스
		// (슈퍼 클래스, 상위 클래스)이다
		//b2, i2자료형이 Number에 넘어오면서
		//업캐스팅이 일어나게 된다

		public static void print(Number nb)
		{	
			System.out.println(nb);
			if (n instanceof Integer)
			{
				System.out.println(n.intValue());
			}

		}

		/*

		public static void print(Byte b)
		{
		}
		public static void print(Short s)
		{
		}
		public static void print(Integer i)
		{
			Systemtn.out.println(i);
		}
		public static void print(Long l)
		{
		}
		public static void print(Float f)
		{
		}
		public static void print(Double d)
		{
		}

		*/

}
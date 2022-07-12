/*==========================================
■■■■ 클래스와 인스턴스■■■■■
==========================================*/
// ※ CircleTest.java 파일과 세트
// ※ Test071.java와 세트

//원의 넓이와 둘레 구하기
//원의 넓이와 둘레를 구할 수 있는 클레스를 설계한다
// (클래스명 : CircleTest) → CircleTest.java
// BufferedReader의 readLine();

//원의 넓이 = 반지름 * 반지름 * 3.141592
//원의 둘레 = 반지름 * 2 * 3.141592

//실행 예)
//반지름 입력 : xxx

// >> 반지름이 xxx인 원의 
// >> 넓이 : xxxx.xx
// >> 둘레 : xxxx.xx
//계속하려면 아무 키나 누르세요...

import java.io.IOException;
public class Test071
{
	public static void main(String[] args) throws IOException
	{	
		// CircleTest 클래스 기반 인스턴스 생성
		// CircleTest 인스턴스 생성
		// CircleTest 객체 생성

		CircleTest ob = new CircleTest();
		// new CircleTest();로 메모리에 퍼올려줘서 실체화 시키며
		// ob라는 참조변수로 주소를 참조하게 한다
		// ob.~~~~로 클래스 안의 메소드 사용가능

		ob.input();

		double num1 = ob.calArea();
		
		double num2 = ob.calLength();

		ob.print(num1,num2);

	}
}
		

		



		/*
		CircleTest circle = new CircleTest();
		circle.input();
		double length = circle.calLength();
		double area = circle.calArea();

		circle.print(area, length);
		*/

/*

반지름 입력 : 25
>> 반지름이 25인 원의
>> 넓이 : 1963.495000
>> 둘레 : 157.079600
계속하려면 아무 키나 누르십시오 . . .

*/

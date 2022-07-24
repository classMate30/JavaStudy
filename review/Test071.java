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
		CircleTest ct = new CircleTest();
		
		ct.input();
		double area = ct.calArea();
		double length = ct.calLength();
		ct.print(area, length);

	}
}


//실행 결과

/*
반지름 입력 : 25
>> 반지름이 25인 원의
>> 넓이 : 1963.495000
>> 둘레 : 157.079600
계속하려면 아무 키나 누르십시오 . . .


*/
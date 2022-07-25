/*=============================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
 	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Calendar 클래스
=============================================*/	

/*
※  Calendar 클래스는 추상 클래스이기 때문에 객체를 생성할 수 없다
	(추상 클래스 : 미완성된 클래스)
	
	Calendar ob = new Calendar();  [X]
	→ 이와 같은 구문을 통해 인스턴스 생성 불가
	
○ Calendar 클래스 객체(인스턴스)를 생성할 수 있는 방법
	
	(정적 메소드/클래스 메소드)
	1. Calendar ob1 = Calendar.getInstance();

	2. Calendar ob2 = new GregorianCalendar();
	(상속관계이며, 업캐스팅이다.)
	
	3. GregorianCalendar ob3 = new GreogorianCalendar();

	(※ GregorianCalendar : Calendar 클래스의 하위 클래스)
	
*/
// 연, 월, 일, 요일을 Calendar 객체로부터 가져와서 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test142
{
	public static void main(String[] args)
	{	
		//Calendar클래스는 추상클래스 이므로 Calendar기반으로 인스턴스 생성 불가
		//Calendar ob = new Calendar();

		Calendar rightNow = Calendar.getInstance();

		// 생성된 달력(Calendar) 인스턴스를 통해
		// 날짜 관련 정보를 얻어낼 수 있는 메소드 → 『get()』

		int y = rightNow.get(Calendar.YEAR); //()안은 static final이 붙은 것을 유추할 수 있음
		System.out.println("y : " + y);
		//--==>> y : 2022

		int m = rightNow.get(Calendar.MONTH) + 1;	//-- 『+1』 check~!! 배열 형태로 구성되어있기 때문
		System.out.println("m : " + m);				// 얻을 때는 +1, 집어 넣을때는 -1
		//--==>> m : 7

		int d = rightNow.get(Calendar.DATE);
		System.out.println("d : " + d);
		//--==>> d : 25
		
		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("w : " + w);
		//--==>>>w : 2

		//테스트
		/*
		System.out.println(Calendar.SUNDAY);			//--==>> 1   → 일요일
		System.out.println(Calendar.MONDAY);			//--==>> 2   → 월요일
		System.out.println(Calendar.TUESDAY);			//--==>> 3   → 화요일
		System.out.println(Calendar.WEDNESDAY);			//--==>> 4   → 수요일	
		System.out.println(Calendar.THURSDAY);			//--==>> 5   → 목요일
		System.out.println(Calendar.FRIDAY);			//--==>> 6   → 금요일
		System.out.println(Calendar.SATURDAY);			//--==>> 7   → 토요일
		*/

		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--==>>2022-7-25 2

		String week = "";
		switch (w)
		{
			/*
		case Calendar.SUNDAY: week="일요일"; break;
		case Calendar.MONDAY: week="월요일"; break;
		case Calendar.TUESDAY: week="화요일"; break;
		case Calendar.WEDNESDAY: week="수요일"; break;
		case Calendar.THURSDAY: week="목요일"; break;
		case Calendar.FRIDAY: week="금요일"; break;
		case Calendar.SATURDAY: week="토요일"; break;
		*/

		case 1: week="일요일"; break;
		case 2: week="월요일"; break;
		case 3: week="화요일"; break;
		case 4: week="수요일"; break;
		case 5: week="목요일"; break;
		case 6: week="금요일"; break;
		case 7: week="토요일"; break;
		}

		System.out.println(y + "-" + m + "-" + d +" " +week);

		System.out.println("///////////////////////////////////////////");

		// Calendar 클래스 기반 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		//달력의 날짜 세팅 → 『set()』 메소드 활용
		rightNow2.set(2023, 1, 16);		//2023년 2월 16일
		
		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>>5

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>>목요일

	}
}
/*=============================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
 	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Calendar 클래스
=============================================*/	
/*
	○ 실습 문제
	   오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
	   확인하여 결과를 출력하는 프로그램을 구현한다

실행 예)
오늘 날짜 : 2022-07-26 화요일
며칠 후의 날짜를 확인하고자 하십니까? : 200

=========[확인 결과]===========
200일 후 : xxxx-xx-xx x요일
==============================
계속하려면 아무키나 누르세요...

※ Calendar와 관련한 API Document 참조~!!
	add()확인 할 것
	:현재 날짜를 기준으로 날 수 더하는 연산 메소드
	→ 『객체.add(Calendar.DATE, 날 수);』

*/
import java.util.Scanner;
import java.util.Calendar;
public class Test144
{
	public static void main(String[] args) 
	{	
		//Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		//Calendar 클래스 기반 인스턴스 생성
		//Calendar now = new Calendar(); [X]
		Calendar now = Calendar.getInstance();
		
		//주요 변수 선언
		int nalsu;					//-- 사용자로부터 입력받은 날 수
		int y, m, d, w;				//-- 연, 월, 일, 요일
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		//현재의 연,월,일,요일 확인 (→가져오기 : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		//현재의 연,월,일,요일 확인결과 출력
		System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d +" " +week[w-1] + "요일");
		
		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();

		}
		while (nalsu<1);
		
		// check~!!!
		now.add(Calendar.DATE,nalsu);

		System.out.println();
		System.out.println("==========[확인 결과]==========");
		System.out.printf("%d일 후 : %tF %tA%n", nalsu, now, now);	
	
		// String.format("%tF", 달력객체);
		// → 년-월-일 형태의 문자열 반환

		// String.format("%tA", 달력객체);
		// →요일 형태의 문자열 반환

	
	}
}

/*
import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test144
{
	public static void main(String[] args) throws IOException
	{	
		Calendar cal = Calendar.getInstance();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y, m, d, w, n;				//y-년 m-월 d-일 w-요일 n-입력값
		y = cal.get(Calendar.YEAR);		
		m = cal.get(Calendar.MONTH);
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		String week = "";
		switch (w)
		{
		case 1: week="일요일";break;
		case 2: week="월요일";break;
		case 3: week="화요일";break;
		case 4: week="수요일";break;
		case 5: week="목요일";break;
		case 6: week="금요일";break;
		case 7: week="토요일";break;
		}
		System.out.printf("오늘 날짜 : %d-%d-%d %s%n", y, m+1, d, week);
		System.out.print("며칠 후의 날짜를 확인하고자 하십니까? : ");
		n = Integer.parseInt(br.readLine());


		//연산 및 처리 과정
		//입력 받은 n값을 더해서 날짜를 계산 해야 한다
		cal.add(Calendar.DAY_OF_MONTH,n);
		

		//출력
		System.out.println();
		System.out.println("==========[확인 결과]==========");
		System.out.println(n + "일 후 : " +cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+1)+ "월 "
		+ cal.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println("===============================");	
	}
}
*/
import java.io.IOException;
public class Test001
{
	public static void main(String[] args) throws IOException
	{	/*
		char temp,temp1;
		System.out.print("한 문자 입력 : ");
		temp = (char)System.in.read();
		//대문자이냐? 소문자로변환 : (소문자 이느냐 ? 대문자로변환 : 있는그대로)
		temp1 = (temp >= 65 && temp <= 90) ? (char)(temp+32) : ((temp >= 97 && temp <=122) ? (char)(temp-32): temp);
	
		System.out.println(temp+ "→" +temp1);
		*/
		
		
		System.out.println("Welcome to Java");
		System.out.println("First Java Program");

		//char ch = 65;			//왜 자동형변환이 일어났을까?
		//System.out.println(ch);

		//int n = 0.0;			//이건 안되는데
		//System.out.println(n);
		int[][] arr= new int[4][5];
		int n=0;
		
		for (int i=0; i<5; i++)
		{
			for (int j=0;j<4; j++)
			{
				n++;
				arr[j][i] = n;
			}
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d",arr[i][j]);
			System.out.println();
		}
	}
}

// - class의 이름은 『Test001』
// - 자바 프로그램의 클래스 이름은 첫글자를 『대문자』로 시작해야함(必)
/* - 자바 프로그램 시작할때 클래스(class)와 main()메소드를 기본적으로 작성할 것*/
// - 소스코드 저장 시 클래스 이름과 동일한 파일 이름으로 저장 이때 확장자는 『.java』



/*===============================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스 설계
   - 배열의 활용
   - 접근제어지시자와 정보은닉
================================*/

// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(Calendar)는 사용하지 않는다.
// 또한 클래스의 개념을 활용하여 작성할 수 있도록 한다. (→ WeekDay 클래스 설계)
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
// 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
// 최종적으로...
// WeekDay 클래스 설계를 통해
// Test099 클래스의 main() 메소드가 정상적으로 프로그램 실행 될 수 있도록 한다.

// 실행 예)
// 년 월 일 입력(공백 구분) : 2022 7 15
// >> 2022년 7월 15일 → 금요일
// 계속하려면 아무 키나 누르세요...

// ※ Hint
//	  - 1년 1월 1일 → "월요일"
//	  - 1년은 365일이 아니다.
//	  - 2월의 마지막 날짜가 29일 → 윤년
//	  - 2월의 마지막 날짜가 28일 → 평년
//	  - 윤년의 판별 조건
//	    → 년도가 4의 배수이면서 100의 배수가 아니거나.
//		   400의 배수이면 윤년, 그 이외의 년도는 평년


/*
1. input 으로 값을 받아와서 올해가 윤년인지 평년인지 판별한다.
2. 받아온 해의 전까지 모든 날들을 더해준다. ex) 2022년이면 2021년까지의 모든 날들을 더해준다.
3. 받아온 달의 전까지 모든 날들을 더해준다. 윤년 평년에따라 2월의 숫자는 다르며 다른 달은 같다.
4. 받아온 날까지 날들을 더해준다.
5. 받아온 모든 날들을 7로 나눠 나머지를 구한다.
6. 나머지를 통해서 요일을 조립한다.


*/
/*
import java.util.Scanner;
class WeekDay
{
	//년,월,일을 초기값으로 1년 1월 1일으로 잡고, "월요일"로 설정해줘야하는데,
	private int year=1, month=1, date=1, calSum=0, calYear=0, calDate=0;
	String type
	

	void input()
	{
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		month = sc.nextInt();
		date = sc.nextInt();

		if ()
		{
		}
	}

	int calD(int date)
	{ 
		calDate +=(date-1);
		return calDate;
	}

	int calY(int year)
	{
		

	}

	int calM(int month)
	{
		
	}
		

}
	



public class Test099
{
	public static void main(String[] args)
	{
		
	}
}*/
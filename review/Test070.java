/*==========================================
■■■■ 클래스와 인스턴스■■■■■
	-직사각형 클래스 설계 실습
==========================================*/
/*
직사각형의 넓이와 둘레 계산 → 클래스로 표현

클래스의 정체성 → 직사각형의 설계도
클래스의 속성   → 가로, 세로, (넓이, 둘레, 부피, 무게, 재질, 색깔,.......)
클래스의 기능   → 넓이 계산, 둘레 계산, 가로 세로 입력, 결과 출력,( .....)

객체를 구성     → 데이터(속성,  상태)  + 기능(동작,  행위)
	↓					 ↓					↓
클래스 설계     →		변수            + 메소드

class 직사각형
{
	//데이터(속성,상태)		→ 변수 (순서 의미 없음)
	int 가로, 세로;

	//기능(동작, 행위)		→ 메소드(순서 의미 없음)
	가로세로입력()
	{
	}

	둘레계산
	{
	}
	
	넓이계산
	{
	}

	결과출력
	{
	}
}

*/
import java.util.Scanner;
class Rect
{	
	int w, h;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 입력 : ");
		w = sc.nextInt();
		System.out.print("세로 입력 : ");
		h = sc.nextInt();
	}

	int calLength()
	{
		int result;
		result = (w + h)*2;
		return result;
	}

	int calArea()
	{
		return w * h;
	}
	
	void print(int a, int l)
	{
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);
	}
}

public class Test070
{
	public static void main(String[] args)
	{
		//Rect 클래스 기반의 인스턴스 생성
		Rect ob = new Rect();

		// 입력 메소드 호출
		ob.input();

		//넓이 연산 메소드 호출
		int area = ob.calArea();
		
		//둘레 연산 메소드 호출
		int length = ob.calLength();

		//출력 메소드 호출
		ob.print(area, length); //위의 a와 l 키티 area와 length는 이눔시끼로 이해하면됨
	
	}
}

// 실행 결과

/*
가로 입력 : 500
세로 입력 : 60
가로 : 500
세로 : 60
넓이 : 30000
둘레 : 1120
계속하려면 아무 키나 누르십시오 . . .
*/
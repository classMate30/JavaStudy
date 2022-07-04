/*=======================================
■■■■자바 기본 프로그래밍 ■■■■■
-변수와 자료형
-실수형 데이터타입의 정밀도 테스트 실습
==========================================*/
public class Test020
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		//float a = 0.0;
		//자동형변환 문법에 위배됨 뒤의 0.0은 double로 잡히는데 float로 자동형변환 규칙에 위반
		float a = 0;
		double b = 0;


		//연산 및 처리
		for (int i=1;i<=100000 ; i++)
		{
			//System.out.println("반복출력"); // 십만 번 출력
			a += 100000; //--a를 100000만큼 증가시켜라~	
			b += 100000; //--b를 100000만큼 증가시켜라~
		}

		//결과 출력
		System.out.println("float a : " +(a/100000));
		System.out.println("double b : " +(b/100000));
	}
}

/*
float a : 99996.055
double b : 100000.0
계속하려면 아무 키나 누르십시오 . . .

실수 사용시에는 double권장


*/

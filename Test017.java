/*=======================================
■■■■자바 기본 프로그래밍 ■■■■■
-변수와 자료형
-자바의 기본 입출력 : System.util.Scanner
==========================================*/
/* ※java.util.Scanner
	단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
	디폴트(default)로 사용되는 단락문자는 공백이다.
	작성된 다음 토큰은 『next()』메소드를 사용
	다른 형태(자료형)의 값으로 변환 할 수 있다.
*/
import java.util.Scanner;
public class Test017
{
	public static void main(String[] args)
	{
		//Scanner 클래스 기반의 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		//주요 변수 선언
		String name;		//--이름
		int kor, eng, mat;	//--국어, 영어, 수학

		//연산 및 처리
		System.out.print("이름을 입력하세요: ");
		name = sc.next();

		//테스트(확인)
		System.out.println("입력한 이름 : " +name);
		
		System.out.print("국어 점수 입력 : ");
		//kor =Integer.parseInt(br.readLine));BufferedReader에서 쓰던 방식
		//kor =Integer.parseInt(sc.next()); 사용 가능 그러나 쓸 필요 없음
		kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();

		//최종 결과 출력
		System.out.println();
		System.out.println(">> 이름 : "+name);
		//System.out.println(">> 총점 : "+ kor + eng + mat);  //문자열 결합 연산
		System.out.println(">> 총점 : " +(kor + eng + mat));
	
	}

}

/*실행결과
이름을 입력하세요: 김태민
입력한 이름 : 김태민
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

>> 이름 : 김태민
>> 총점 : 240
계속하려면 아무 키나 누르십시오 . . .




*/
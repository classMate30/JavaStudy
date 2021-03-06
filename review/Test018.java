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

public class Test018
{
	public static void main(String[] args)
	{
		java.util.Scanner sc =  new java.util.Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		System.out.print("이름 국어 영어 수학 입력(공백 구분) : ");
		// - 사용자가 입력한 데이터를 각 변수에 한 번에 담아내기
		//String클래스를 배우게 되면 문자열을 다양하게 처리 가능하지만
		//지금 시점에선 BufferedReader에선 담아낼수 없지만 스캐너에선 가능하다.

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		System.out.println();
		System.out.println(">> 이름 : " + name);
		System.out.println(">> 총점 : " + tot);


	}
}

//실행 결과

/*
이름 국어 영어 수학 입력(공백 구분) : 김보경 90 80 70

>> 이름 : 김보경
>> 총점 : 240
계속하려면 아무 키나 누르십시오 . . .

*/
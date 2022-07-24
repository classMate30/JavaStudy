/*=======================================
■■■■자바 기본 프로그래밍 ■■■■■
-변수와 자료형
-자바의 기본 입출력 : System.in.read();
==========================================*/
/*
『System.in.read()』메소드는 (입력 대기열로부터) 한 문자만 가져온다
단, 입력 받은 하나의 문자를 문자 그대로 가져오는 것이 아니라
ASCII Code 값으로 반환한다.
*/

//실행 예)
//한 문자 입력		: A
//한 자리 정수 입력	: 9

// >> 입력한 문자 : A
// >> 입력한 정수 : 9
// 계속하려면 아무 키나 누르세요...
import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		char ch;
		int n;

		char temp;

		System.out.print("한 문자 입력       : ");
		ch = (char)System.in.read();

		System.in.skip(2);	
		System.out.print("한 자리 정수 입력  : ");
		n= System.in.read();

		n -= 48;
		
		
		System.out.println();
		System.out.println("입력한 문자 : " + ch);
		System.out.println("입력한 정수 : " + n);
		
	
	}
}
/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- if ~ else 구문
==========================================*/

//○과제
//	사용자로부터 임의의 문자를 하나 입력받아
//	대문자이면 소문자로, 소문자이면 대문자로
//	알파벳이 아닌 기타 문자이면 입력오류 처리하는
//	프로그램을 구현한다.


// 실행 예)
// 한 문자 입력 : A
// >> A → a
// 계속하려면 아무키나 누르세요...

// 한 문자 입력 : b
// >> b → B
// 계속하려면 아무키나 누르세요...

// 한 문자 입력 : 3
// >> 입력 오류~!!!
// 계속하려면 아무키나 누르세요...
import java.io.IOException;
public class Test040
{
	public static void main(String[] args) throws IOException
	{	
		char ch;
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();
		if (ch>='A' && ch<='Z')
			System.out.printf("%c → %c%n",ch, (char)ch+32);
		else if (ch>='a' && ch<='z')
			System.out.printf("%c → %c%n",ch, (char)ch-32);
		else
			System.out.println("입력 오류~!!!");

	}
}

//실행 결과

/*
한 문자 입력 : A
A → a
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : b
b → B
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : 3
입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .


*/
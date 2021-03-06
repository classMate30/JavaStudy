/*=======================================
■■■■연산자(Operator)■■■■■
- 조건 연산자 == 삼항 연산자
==========================================*/

// 사용자로부터 임의의 문자 하나 입력받아서 
// 대문자이면 소문자로, 소문자이면 대문자로
// 알파벳이 아닌 기타 문자이면 그 문자 그대로 출력하는
// 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A → a 
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : b
// b → B
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : 7
// 7 → 7
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;
public class Test029
{
	public static void main(String[] args) throws IOException
	{
		char temp;
		char result;
		System.out.print("한 문자 입력 : ");
		temp = (char)System.in.read();
		
		result = temp>='A' && temp<='Z'? (char)(temp+32) : temp>='a' && temp<='z' ? (char)(temp-32) : temp;
		System.out.printf("%c → %c%n", temp, result);
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


한 문자 입력 : 7
7 → 7
계속하려면 아무 키나 누르십시오 . . .





*/
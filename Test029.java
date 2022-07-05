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

/*
알파벳대문자 ? 알파벳소문자로변환 : (알파벳소문자 ? 알파벳대문자로변환 : 있는그대로); 
									-------------	------------------	-----------
										1				2					3
------------   -----------------    ------------------------------------------------
	1				2								3

result




*/

//System.in.read()로 얻어오는 것은 4바이트 인트형

import java.io.IOException;
public class Test029
{
	public static void main(String[] args) throws IOException
	{
		//선생님 풀이
		//char temp;
		//System.out.print("한 문자 입력 : ");
		//temp = (char)System.in.read();

		//System.out.println("입력받은 값 확인  " +temp);
		
		//대문자? 대문자아님?
		//temp == 'A'
		//temp == 'B'

		//String result = temp >= 65 && temp <=90 ? "대문자" : "대문자아님";
		//System.out.println("결과 : "+ result);

		//String result temp >= 'A' && temp <= 'Z' ? "대문자" : "대문자아님";
		//System.out.println("결과 : " + result);
		// 연산할때 인트형으로 바뀌는 것임 
	
		// 대문자 → 소문자
		// 'A'(65) → 'a'(97) ==> +32
		// 'B'(66) → 'b'(98) ==> +32
		// 'C'(67) → 'c'(99) ==> +32
		//			:

	
		// 소문자 → 대문자
		//'a'(97) → 'A'(65) ==> -32
		//'b'(98) → 'B'(66) ==> -32
		//'c'(99) → 'B'(67) ==> -32
		//			:

		char ch, result;
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();

		//result = () ? () : ();
		//result = (입력값대문자) ? (소문자로 변환) : ((입력값소문자? 대문자로 변환 : 그대로반환));
		result = (ch >= 'A' && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
		System.out.println(ch + " →" + result);
		//사용자가 대문자 'Q(81)'
//		result = (81 >= 65 && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && ch <= 90) ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && true) ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = true ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && true) ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && true) ? ((char)(81+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && true) ? ((char)(113)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && true) ? ('q') : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = 'q';

		//사용자가 소문자 'm(109)'
//		result = (109 >= 65 && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && 109 <= 90) ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && false) ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = false ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((109 >= 97 && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((true && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((true && 109 <= 122) ? (char)(ch-32) :ch);
//		result = ((true && true) ? (char)(ch-32) :ch);
//		result = (char)(ch-32);
//		result = (char)(109-32);
//		result = (char)(77);
//		result = 'M';


		//사용자가 '8(56)'
//		result = (8 >= 65 && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (false && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((56 >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((56 >= 97 && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((false && ch <= 'z') ? (char)(ch-32) :ch);
//		result = false ? (char)(ch-32) :ch);
//		result = ch;
//		result = '8';




		/* 내가 푼 풀이   Test001에 완성해 놨음.
		char ch1, ch2;
		int n;

		System.out.print("한 문자 입력 : ");
		ch1 = (char)System.in.read();
		
		ch2 = (ch1 <= 65 && ch1 >= 90) ? (char)(ch1 + 32) : ch1 ;

		System.out.println(ch1 + "→" +ch2);
		*/

		/* 연수님 풀이
		char ch1, ch2;
		int n;

		System.out.print("한 문자 입력 : ");
		n = System.in.read();
		
		ch2 = (n < 60) ? ((char)n) : ((n < 91) ? (char)(n + 32) : (char)(n - 32));
		ch1 = (char)n;
		System.out.println();
		System.out.printf("%c → %c%n", ch1, ch2);
*/
	}
}

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,a,b;
		char ch1;
		String strResult;
		System.out.print("한 문자 입력 : ");
		n = Integer.parseInt(br.readLine());

		a = (n >= 65 && n <=90) ? (n += 32) :(char)n;
		
		//b = (char)a;
		
		System.out.println(a);


		// 교집합 and
		// 모두 필요하면 or


		*/
		//주요 변수 선언



//실행결과

/*
한 문자 입력 : A
A →a
계속하려면 아무 키나 누르십시오 . . .


한 문자 입력 : b
b →B
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : 7
7 →7
계속하려면 아무 키나 누르십시오 . . .

*/
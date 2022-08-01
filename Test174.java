/*=============================================
       ■■■ 자바의 기본 입출력(I/O) ■■■
=============================================*/	
// Test172.java와 비교~!

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test174
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		//System.in			: 자바 표준 입력 스트림 → 바이트 기반 스트림 
		//InputStreamReader	: 바이트 기반 스트림을 → 문자 기반 스트림으로 변환해주는 역할 수행
		//Reader			: 문자 기반 스트림 객체
		Reader rd =	new InputStreamReader(System.in);

		System.out.println("문자열 입력(종료:Ctrl+z)");

		while ((data = rd.read()) != -1)
		{
			ch = (char)data;
			//문자기반 스트림으로 읽어와서 문자 기반으로 출력하니 안깨짐
			//System.out.print(ch);
			/*
			문자열 입력(종료:Ctrl+z)
			1234
			1234
			ABCD
			ABCD
			가나다라
			가나다라
			^Z
			계속하려면 아무 키나 누르십시오 . . .
			*/

			System.out.write(ch);
			//문자기반 스트림으로 읽어와서 바이트 기반으로 출력하니 깨짐
			/*
			문자열 입력(종료:Ctrl+z)
			1234
			1234
			ABCD
			ABCD
			가나다라
			 섆|
			^Z
			계속하려면 아무 키나 누르십시오 . . .
			*/

		}
		
	}
}
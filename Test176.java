/*=============================================
       ■■■ 자바의 기본 입출력(I/O) ■■■
=============================================*/	

// Reader Writer 실습

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Test176
{

	public void process(InputStream is)	throws IOException	// System.in을 매개변수로 전달
	{
		int data;

		System.out.println("문자열 입력(종료:Ctrl+z)");

		try
		{	
			//매개변수 is라는 바이트 기반 객체(InputStream)를
			//문자 스트림으로 변환하여
			//(→ InputStreamReader 가 수행)
			//Reader 타입의 rd에서 참조 할 수 있도록 처리
			Reader rd = new InputStreamReader(is);	//System.in
			//==>> 문자 기반 입력 스트림 rd~!!!
			

			//바이트 기반 스트림인 자바 기본 출력 스트림(System.out)을
			//문자 스트림으로 변환하여
			//(→ OutputStreamWriter가 수행)
			//Writer 타입의 wt에서 참조 할 수 있도록 처리
			Writer wt =	new OutputStreamWriter(System.out);
			//==>> 문자 기반 출력 스트림 wt~!!!
			while ((data = rd.read()) !=-1)
			{
				wt.write(data);				//-- 내보내는 스트림(물줄기)에 data를 기록
				wt.flush();					//-- 기록한 스트림(물줄기)를 밀어내어 내보냄
			}

		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) throws IOException
	{
		Test176 ob = new Test176();
		ob.process(System.in);
	}
}

// 실행 결과
/*
문자열 입력(종료:Ctrl+z)
123456
123456
abcdef
abcdef
가나다라마바
가나다라마바
^Z
계속하려면 아무 키나 누르십시오 . . .
*/
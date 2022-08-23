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
		Reader rd = new InputStreamReader(System.in);
		System.out.println("문자열 입력(종료:Ctrl+z)");
		while ((data=rd.read()) != -1)
		{
			ch = (char)data;
			System.out.write(ch);
		}
	
	
	}
}
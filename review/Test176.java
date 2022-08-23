/*=============================================
       ■■■ 자바의 기본 입출력(I/O) ■■■
=============================================*/	
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Test176
{
	public void process(InputStream is) throws IOException
	{
		int data;
		System.out.println("문자열 입력(종료:Ctrl+z)");
		try
		{
			Reader rd = new InputStreamReader(is);
			Writer wt = new OutputStreamWriter(System.out);
			while ((data=rd.read()) != -1)
			{
				wt.write(data);
				wt.flush();
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

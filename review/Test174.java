/*=============================================
       ���� �ڹ��� �⺻ �����(I/O) ����
=============================================*/	
// Test172.java�� ��~!

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
		System.out.println("���ڿ� �Է�(����:Ctrl+z)");
		while ((data=rd.read()) != -1)
		{
			ch = (char)data;
			System.out.write(ch);
		}
	
	
	}
}
/*=============================================
       ���� �ڹ��� �⺻ �����(I/O) ����
=============================================*/	
import java.io.OutputStream;
import java.io.IOException;
public class Test173
{
	public static void main(String[] args) throws IOException
	{	
		OutputStream out = System.out;
		byte[] ch = new byte[3];
		ch[0] = 65;
		ch[1] = 97;
		ch[2] = 122;
		out.write(ch);
		out.close();
		System.out.println("�ȳ�");
	}
}
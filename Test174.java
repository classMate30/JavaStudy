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
		
		//System.in			: �ڹ� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ�� 
		//InputStreamReader	: ����Ʈ ��� ��Ʈ���� �� ���� ��� ��Ʈ������ ��ȯ���ִ� ���� ����
		//Reader			: ���� ��� ��Ʈ�� ��ü
		Reader rd =	new InputStreamReader(System.in);

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		while ((data = rd.read()) != -1)
		{
			ch = (char)data;
			//���ڱ�� ��Ʈ������ �о�ͼ� ���� ������� ����ϴ� �ȱ���
			//System.out.print(ch);
			/*
			���ڿ� �Է�(����:Ctrl+z)
			1234
			1234
			ABCD
			ABCD
			�����ٶ�
			�����ٶ�
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/

			System.out.write(ch);
			//���ڱ�� ��Ʈ������ �о�ͼ� ����Ʈ ������� ����ϴ� ����
			/*
			���ڿ� �Է�(����:Ctrl+z)
			1234
			1234
			ABCD
			ABCD
			�����ٶ�
			 ��|
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/

		}
		
	}
}
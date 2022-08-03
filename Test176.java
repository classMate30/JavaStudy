/*=============================================
       ���� �ڹ��� �⺻ �����(I/O) ����
=============================================*/	

// Reader Writer �ǽ�

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Test176
{

	public void process(InputStream is)	throws IOException	// System.in�� �Ű������� ����
	{
		int data;

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		try
		{	
			//�Ű����� is��� ����Ʈ ��� ��ü(InputStream)��
			//���� ��Ʈ������ ��ȯ�Ͽ�
			//(�� InputStreamReader �� ����)
			//Reader Ÿ���� rd���� ���� �� �� �ֵ��� ó��
			Reader rd = new InputStreamReader(is);	//System.in
			//==>> ���� ��� �Է� ��Ʈ�� rd~!!!
			

			//����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��� ��Ʈ��(System.out)��
			//���� ��Ʈ������ ��ȯ�Ͽ�
			//(�� OutputStreamWriter�� ����)
			//Writer Ÿ���� wt���� ���� �� �� �ֵ��� ó��
			Writer wt =	new OutputStreamWriter(System.out);
			//==>> ���� ��� ��� ��Ʈ�� wt~!!!
			while ((data = rd.read()) !=-1)
			{
				wt.write(data);				//-- �������� ��Ʈ��(���ٱ�)�� data�� ���
				wt.flush();					//-- ����� ��Ʈ��(���ٱ�)�� �о�� ������
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

// ���� ���
/*
���ڿ� �Է�(����:Ctrl+z)
123456
123456
abcdef
abcdef
�����ٶ󸶹�
�����ٶ󸶹�
^Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
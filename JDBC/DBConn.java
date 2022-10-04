//�� �̱���(singleton) ������ ������ �̿��� Database ���� ��ü ���� ���� Ŭ����
//		�� DB ���� ������ ���� ���ϰ� ũ�� ������
//		   ������ �ʿ��� �� ���� ��ü�� �����ϴ� ���� �ƴ϶�
//		   �� �� ����� ��ü�� ����� �� �ֵ��� ó��

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn
{
	private static Connection dbConn;

	public static Connection getConnection()
	{
		//if���� �ǹ�....
		//�� �� ����� ��ü�� ��� ���...(Ŀ�ؼ� ��ü�� ����Ǿ� ���� ��������...) (Ŀ�ؼ� ��ü�� ���϶�)
		//��, ������� ���� ��쿡�� ������ �õ��ϰڴٴ� �ǹ�
		// �� singleton(������ ����)
		if (dbConn==null)
		{
			try
			{
				String url ="jdbc:oracle:thin:@211.138.142.51:1521:xe";
				String user = "scott";
				String pwd = "tiger";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				dbConn = DriverManager.getConnection(url,user,pwd);
	
			}
			catch (Exception e)
			{
				System.out.println(e.toString());
			}
			
		}
		return dbConn;
	}

	public static Connection getConnection(String url,String user,String pwd)
	{
		if (dbConn==null)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				dbConn = DriverManager.getConnection(url,user,pwd);
			}
			catch (Exception e)
			{
				System.out.println(e.toString());
			}

		}
		return dbConn;
	}

	public static void close()
	{
		try
		{
			if (dbConn!= null)
			{
				if (!dbConn.isClosed())
				{
					dbConn.close();
				}
				
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

	dbConn = null;
	}

}
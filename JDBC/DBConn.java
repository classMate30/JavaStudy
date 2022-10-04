//※ 싱글톤(singleton) 디자인 패턴을 이용한 Database 연결 객체 생성 전용 클래스
//		→ DB 연결 과정이 가장 부하가 크기 때문에
//		   연결이 필요할 때 마다 객체를 생성하는 것이 아니라
//		   한 번 연결된 객체를 사용할 수 있도록 처리

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn
{
	private static Connection dbConn;

	public static Connection getConnection()
	{
		//if문의 의미....
		//한 번 연결된 객체를 계속 사용...(커넥션 객체가 연결되어 있지 않을때만...) (커넥션 객체가 널일때)
		//즉, 연결되지 않은 경우에만 연결을 시도하겠다는 의미
		// → singleton(디자인 패턴)
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
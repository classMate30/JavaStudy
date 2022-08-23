import java.io.IOException;
public class ThirdTeam
{
	public static void main(String[] args) throws IOException, NumberFormatException
	{	
		boolean flag = true;

		AdminMode am = new AdminMode();
		do
		{	
			am.display();
			flag = am.select();
		}
		while (flag);

	}
}



import java.io.IOException;
public class ThirdTeam
{
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		AdminMode am = new AdminMode();
		do
		{
			am.display();
			am.select();
		}
		while (true);

	}

}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj14681
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x , y;
		do
		{
			x=Integer.parseInt(br.readLine());
			y=Integer.parseInt(br.readLine());
		}
		while ((x==0||(-1000>x||x>1000))||(y==0||(-1000>y||y>1000)));

		if (x>0 && y>0)
		{
			System.out.println("1");
		}
		else if (x<0 && y>0)
		{
			System.out.println("2");
		}
		else if (x<0 && y<0)
		{
			System.out.println("3");
		}
		else if (x>0 && y<0)
		{
			System.out.println("4");
		}
		else 
			System.out.println("잘못 입력 하셨습니다.");
	}
}


/*
1사분면 : x 양수 , y양수
2사분면 : x 음수 , y양수
3사분면 : x 음수 , y음수
4사분면 : x 양수 , y음수

*/
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
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
	}
}


/*
1��и� : x ��� , y���
2��и� : x ���� , y���
3��и� : x ���� , y����
4��и� : x ��� , y����

*/
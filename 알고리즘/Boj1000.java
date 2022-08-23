import java.util.Scanner;
public class Boj1000
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		do
		{
			a= sc.nextInt();
			b= sc.nextInt();
		}
		while (a>10 || b>10);
		c=a+b;
		System.out.println(c);
	}

}
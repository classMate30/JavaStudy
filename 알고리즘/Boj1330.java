import java.util.Scanner;
public class Boj1330
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		do
		{	a = sc.nextInt();
			b = sc.nextInt();
	
		}
		while ((-10000<a && a>10000) || (-10000<b && b>10000 ));
		
		if (a>b)
		{
			System.out.println(">");
		}
		else if (a<b)
		{	
			System.out.println("<");
		}
		else 
			System.out.println("==");

	}
}

//Scanner를 사용해서 문제 해결을 했지만
//Scanner는 BufferedReader에 비해 성능이 떨어지는 것으로 알고있는데,
//Scanner를 이용하는 방법 외에 다른 방법으로 문제를 해결할 수 없을까......?
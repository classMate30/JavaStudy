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

//Scanner�� ����ؼ� ���� �ذ��� ������
//Scanner�� BufferedReader�� ���� ������ �������� ������ �˰��ִµ�,
//Scanner�� �̿��ϴ� ��� �ܿ� �ٸ� ������� ������ �ذ��� �� ������......?
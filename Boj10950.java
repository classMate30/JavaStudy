import java.util.Scanner;
public class Boj10950
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		/*int n =sc.nextInt();

		for (int i=0; i<n; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		*/

		System.out.print("대소문자 : ");
		String name = sc.next();


		if (name.equalsIgnoreCase("Y"))
		{
			System.out.println("정상 입력되었습니다.");
		}
		
		else 
		{
			System.out.println("y/Y가 아닙니다.");
		}
	}
}
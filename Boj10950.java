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

		System.out.print("��ҹ��� : ");
		String name = sc.next();


		if (name.equalsIgnoreCase("Y"))
		{
			System.out.println("���� �ԷµǾ����ϴ�.");
		}
		
		else 
		{
			System.out.println("y/Y�� �ƴմϴ�.");
		}
	}
}
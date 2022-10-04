
//문자열로 저장해서 하나씩 잘라와서 더해야함.
//charAt()으로 가져오는 값은 아스키 코드임
//아스키 코드를 숫자형식으로 바꾸려면 48을 빼줘야함

import java.util.Scanner;
public class Boj11720
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		int sum=0;

		for (int i=0; i<n; i++)
		{
			sum += s.charAt(i) -48;
		}
		System.out.println(sum);

	}
}
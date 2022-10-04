/*
소수판별
ex)	
13이라는 숫자를 입력받았다면?

2부터 시작해서 13이라는 숫자가 나올때까지 나눴는데 나뉘지 않는다면 소수

코드
1. for 문을 2부터 n(자신)까지 1씩 증가시키면서 나눠보는데 나뉘지 않는다면 소수

*/
/*
import java.util.Scanner;
public class Boj1978
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int cnt =0;
		for (int i=0; i<n; i++)
		{
			nums[i]=sc.nextInt();
		}

		for (int i=0; i<nums.length; i++)
		{
			for (int j=2; j<=nums[i]; j++)
			{
				if (j==nums[i])
				{
					cnt++;
				}
				if (nums[i]%j==0)
				{
					break;
				}
			}

		}
		System.out.println(cnt);
		
	}
}
*/
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj1978
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[] intarr = new int[cnt];
		int primecnt = 0;
		String[] strarr = br.readLine().split(" ");
		
		for (int i=0; i<cnt; i++)
		{
			intarr[i] = Integer.parseInt(strarr[i]);
			//테스트
			//System.out.println(intarr[i]);
		}
		for (int i=0; i<cnt; i++)
		{
		
			for (int j=2; j<=intarr[i]; j++)
			{
				if (intarr[i]%j==0)
				{
					primecnt++;
					break;
				}
				else 
				{
					primecnt = primecnt;
				}
			}			
		}

		System.out.println(primecnt);
	}
}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj1978
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[] intarr = new int[cnt];
		int primecnt = 0;
		String[] strarr = br.readLine().split(" ");
		
		for (int i=0; i<cnt; i++)
		{
			intarr[i] = Integer.parseInt(strarr[i]);
			//테스트
			//System.out.println(intarr[i]);
			
			for (int j=2; j<=intarr[i]; j++)
			{	
				
				if (intarr[i]%j==0)
				{
					primecnt++;
					break;
				}
				else 
				{
					primecnt = primecnt;
				}

/*
				if (j==intarr[i])
				{
					primecnt++;
				}
				if (intarr[i]%j==0)
				{
					break;
				}
				*/
			}			
		}

		System.out.println(primecnt);
	}
}

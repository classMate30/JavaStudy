/*
�Ҽ��Ǻ�
ex)	
13�̶�� ���ڸ� �Է¹޾Ҵٸ�?

2���� �����ؼ� 13�̶�� ���ڰ� ���ö����� �����µ� ������ �ʴ´ٸ� �Ҽ�

�ڵ�
1. for ���� 2���� n(�ڽ�)���� 1�� ������Ű�鼭 �������µ� ������ �ʴ´ٸ� �Ҽ�

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
			//�׽�Ʈ
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
			//�׽�Ʈ
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

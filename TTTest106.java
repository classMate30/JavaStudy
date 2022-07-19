import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TTTest106
{
	public static void main(String[] args) throws IOException
	{	
		String str;
		//int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13;
		int sum = 0;
		int check,result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("주민번호입력 (xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if (str.length()<14)
		{
			System.out.println("입력 오류~!!!");	
			return;
		}
		else if (str.length()>14)
		{
			System.out.println("입력 오류~!!!");
			return;		
		}
		else if (str.length()==14)
		{
			//주민등록번호가 유효한지 연산
			//System.out.println(str.substring(0,1));
			//한개 출력
			//System.out.println(str.substring(0,6));
			//주민등록번호 앞자리
			//System.out.println(str.substring(7,14));
			//주민등록번호 뒷자리
			
		

			int[] num1 = new int[6];
			for (int i=0; i<6; i++)
			{
				num1[i] = Integer.parseInt(str.substring(i,i+1));
			}

			int[] num2 = new int[7];
			for (int i=0; i<7; i++)
			{
				num2[i] = Integer.parseInt(str.substring(i+7,i+8));
			}

			//234567 892345

			int[] mularr1 = {2,3,4,5,6,7};
			int[] mularr2 = {8,9,2,3,4,5};

			for (int i=0; i<6; i++)
			{
				sum += num1[i]*mularr1[i];
				sum += num2[i]*mularr2[i];
			}

			
			check = (sum%11);	//나머지 연산 
			if (check == 0)
				check =1;
			else if (check ==1)
				check =0;
			
			result = 11 - check;

			if (result == num2[6])
			{
				System.out.println("정확한 주민번호~!!!");
			}
			else if (result != num2[6])
			{
				System.out.println("잘못된 주민번호~!!!");
			}

			
		}




	}
}
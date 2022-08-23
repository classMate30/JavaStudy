import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class SortingTest
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, min_value, idx,temp;
		
		n= Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		for (int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
//삽입정렬(insertion sort)
//두번째에서 부터 보기 시작해서 거꾸로 확인
		for (int i=1; i<arr.length; i++)
		{
			int j;
			int tmp = arr[i];
			for (j=i; j>0 && arr[j-1] > tmp; j--)
			{
				arr[j] = arr[j-1];
			}
			arr[j] = tmp;
		}

		for (int a : arr)
		{
			System.out.print(a + " ");
		}
	}
}


		
/*
//				arr[i]=arr[i]^arr[idx];
//				arr[idx]=arr[idx]^arr[i];
//				arr[i]=arr[i]^arr[idx];


//				System.out.println( "min_value : "+min_value);
//				System.out.println( "idx : " +idx);

*/
		/*
		for (int i=0; i<n-1; i++)
		{
			for (int j=i+1;j<arr.length ; j++)
			{
				//arr[i]보다 작기만 하면 바뀜
				
				if (arr[i]>arr[j])
				{
					arr[i] = arr[i]^arr[j];
					arr[j] = arr[j]^arr[i];
					arr[i] = arr[i]^arr[j];
				}
				


			}
		}	

		/*
		for (int i=1; i<arr.length; i++)
		{
			for (int j=0; j<arr.length-i; j++)
			{
				if (arr[j]>arr[j+1])
				{	
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j+1]^arr[j];
					arr[j]=arr[j]^arr[j+1];
				}

			}
		}
		*/

		/*
		for (int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
*/





/*

		boolean flag;
		int pass = 0;

		do
		{
			flag = false;
			pass++;
			
			for (int i=1; i<arr.length; i++)
			{
				for (int j=0; j<arr.length-pass; j++)
				{
					if (arr[j]>arr[j+1])
					{
						arr[j] = arr[j]^arr[j+1];
						arr[j+1] = arr[j+1]^arr[j];
						arr[j] = arr[j]^arr[j+1];

						flag = true;
					}
				}
				
			}

		}
		while (flag);

		for (int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}

*/


//선택정렬(selection sort)
/*
		for (int i=0; i<arr.length-1; i++)
		{	
			min_value = arr[i];
			idx = i;
			for (int j=i+1; j<arr.length; j++)
			{
				if (min_value > arr[j])
				{
					min_value = arr[j];
					idx = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		System.out.println();
		for (int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
*/

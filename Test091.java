/*==========================================
   ���� �迭 ����
   - �迭�� �迭(2���� �迭)
============================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
	1	2	3	4	10	
	5	6	7	8	26
	9	10	11	12	42
	13	14	15	16	58
	28	32	36	40	136

	00 01 02 03 04
	10 11 12 13 14
	20 21 22 23 24
	30 31 32 33 34
	40 41 42 43 44

	04 = 00 + 01 + 02 + 03

����Ϸ��� �ƹ� Ű�� ��������...
*/
public class Test091
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n=0;
		//�׽�Ʈ ����
		int sum=0;

		for (int i=0; i<arr.length-1; i++)			//��~ 0 1 2 3
		{

			for (int j=0; j<arr[i].length-1; j++)  //��~ 0 1 2 3
			{	
				n++;
				arr[i][j] = n;						//1 2 3 .... 14 15 16
				
				arr[i][arr[i].length-1] += arr[i][j];
				//arr[0][4] += arr[0][0]
				//			+= arr[0][1]
				//			+= arr[0][2]
				//			+= arr[0][3]
				//			:
				//			:
				//	  1
				//	  2
				//	  3

				arr[arr.length-1][j] += arr[i][j];
				//arr[4][0] += arr[0][0]
				//			+= arr[1][0]
				//			+= arr[2][0]
				//			+= arr[3][0]
				//			:
				//			:
				//	     1
				//		 2
				//       3
				/*
				arr[i][4] += arr[i][j];
				arr[4][j] += arr[i][j];
				*/
				arr[arr.length-1][arr[i].length-1] += arr[i][j];
				//arr[4][4]	+= arr[0][0]
				//			+= arr[0][1]
				//			+= arr[0][2]
				//			+= arr[0][3]
				//			:
				//			:
			

				//arr[i][4] += arr[i][j]
				//arr[4][j] += arr[i][j]
				//arr[4][4] += arr[i][j]
			
			}
		}
		
		
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}

	}
}

/*		int[][] arr = new int[5][5];
		int n=1,sum=0;
		for (int i=0; i<arr.length; i++)
		{

			for (int j=0; j<arr[i].length; j++)
			{	
				
				arr[i][j] = n++;
				if (i ==4 || j==4)
					arr[i][j] += arr[i][j];
				

					arr[i][j] = n++;
			
				
			}
		}
*/		


//������ 

/*
   1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  28  32  36  40 136
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
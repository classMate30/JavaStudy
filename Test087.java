/*==========================================
   ���� �迭 ����
   - �迭�� �迭
============================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
    n
   ��
	1  2  3  4  5		i=0
	2  3  4  5  6		i=1
	3  4  5  6  7		i=2
	4  5  6  7  8		i=3
	5  6  7  8  9		i=4
����Ϸ��� �ƹ� Ű�� ��������...


00 01 02 03 04
10 11 12 13 14
20 21 22 23 24
30 31 32 33 34
40 41 42 43 44

*/


public class Test087
{
	public static void main(String[] args)
	{
		//�迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];

		//�ֿ� ���� ����
		int n;

		for (int i=0; i<arr.length; i++)		//��~~~
		{
			n=1+i;
			for (int j=0; j<arr[i].length; j++)
			{
				//�׽�Ʈ(Ȯ��)
				
				//System.out.print("i : "+ i + ",j : " + j + " - ");
				//System.out.print("[" + n + "]");
				//n++;
				
				arr[i][j] = n;
				n++;
			}
		}

		// �迭�� �迭 ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}
}

//���� ���
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

		/*int[][] arr = new int[5][5];
		int n =1;// �����
		for (int i=0; i<arr.length; i++)
		{
			//int n =i+1; ������
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n++;


				//arr[i][j] = i + j +1;			//������ ��� n�� ����!!!!!!
			}

			n -= 4;
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		*/
/*==========================================
   ���� �迭 ����
   - �迭�� �迭
============================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
	E  J  O  T	Y	00 01 02 03 04  04 14 24 34 44
	D  I  N  S  X	10 11 12 13 14  03 13 23 33 43
	C  H  M  R  W	20 21 22 23 24	02 12 22 32 42
	B  G  L  Q  V	30 31 32 33 34	01 11 21 31 41
	A  F  K  P  U	40 41 42 43 44	00 10 20 30 40
����Ϸ��� �ƹ� Ű�� ��������...
*/
public class Test090
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];
		char start = 'A';		//65
		for (int i=0; i<5; i++)			//��~ i �� 0 1 2 3 4
		{
			for (int j=4; j>=0; j--)	//��~ j �� 4 3 2 1 0
			{
				arr[j][i] = start++;

			}
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c",arr[i][j]);
			}
			System.out.println();
		}



	}
}

/*
		char ch = 'A';
		char charArr[][] = new char[5][5];
		for (int i=0; i<charArr.length; i++)
		{
			for (int j=0; j<charArr[i].length; j++)
			{	

				charArr[4-j][i] = ch;
				ch++;

				//charArr[i][j] = ch;���ϸ�
				/*
					A  B  C  D  E	00 01 02 03 04
					F  G  H  I  J	10 11 12 13 14
					K  L  M  N  O	20 21 22 23 24
					P  Q  R  S  T	30 31 32 33 34
					U  V  W  X  Y	40 41 42 43 44
				*/

				//charArr[j][i] = ch;���ϸ�
				/*
				    A  F  K  P  U	00 10 20 30 40
					B  G  L  Q  V	01 11 21 31 41
					C  H  M  R  W	02 12 22 32 42
					D  I  N  S  X	03 13 23 33 43
					E  J  O  T  Y	04 14 24 34 44
				}*/
					
				//charArr[4-j][i] = ch;���ϸ�
/* 
					E  J  O  T  Y	04 14 24 34 44
					D  I  N  S  X	03 13 23 33 43
					C  H  M  R  W	02 12 22 32 42
					B  G  L  Q  V	01 11 21 31 41 
					A  F  K  P  U	00 10 20 30 40
*/
				//charArr[4-j][4-i] = ch;���ϸ�
				/*
				    Y  T  O  J  E
				    X  S  N  I  D
				    W  R  M  H  C
				    V  Q  L  G  B
				    U  P  K  F  A
				*/
/*
			}
		}

		for (int i=0; i<charArr.length; i++)
		{
			for (int j=0; j<charArr[i].length; j++)
			{
				System.out.printf("%3c", charArr[i][j]);
			}
			System.out.println();
		}
		*/
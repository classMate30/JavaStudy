/*����� ���� �帧�� ��Ʈ��(���) ������
- �ݺ���(for) �ǽ�
- ���� for��(�ݺ����� ��ø)�� Ȱ���� ������ ��� �ǽ�
==========================================*/
//2��ø 2�� 2������ 2��
//3��ø 1�� 3������ 1��

//���� ��)
/*
2 * 1= 2   3 * 1 = 3   4 * 1 = 4   5 * 1 =5
2 * 2= 4   3 * 2 = 6   4 * 2 = 8   5 * 2 =10
2 * 3= 6   3 * 3 = 9   4 * 3 = 12  5 * 3 =15
2 * 4= 8   3 * 4 = 12  4 * 4 = 16  5 * 4 =20
2 * 5= 10  3 * 5 = 15  4 * 5 = 20  5 * 5 =25
					:
					:
2 * 9= 18  3 * 9 = 27  4 * 9 = 36  5 * 9 =45


6 * 1= 6   7 * 1 = 7   8 * 1 = 8   9 * 1 =1
					:
					:
					:
6 * 9= 54   7 * 9 = 63   8 * 9 =72    9 * 9 =81
*/
public class Test060
{
	public static void main(String[] args)
	{
		//��	 Test059�� ���Ͽ�
		//	 ��¹���(����)�� �ٸ��⶧����
		//	 �ݺ����� �����帧�� �޶������Ѵ�.
		//	 (�ܼ� ��� ��� ȯ���̱� ������)

		//�� (1)������
		//	 �ܰ� �������� ���� ��ġ��
		//	 �޶��� ���¿����� �ݺ��� ����
	/*
		for (int i=1; i<=9; i++)		// ��		�� �������� ��
		{
			for (int j=2; j<=5; j++)	// ��		�� ��
			{
				System.out.printf("%4d * %d =%2d", j, i, (j*i));
			}
			System.out.println();		// ����
		}
		System.out.println();

		for (int i=1; i<=9; i++)		// ��		�� �������� ��
		{
			for (int j=6; j<=9; j++)	// ��		�� ��
			{
				System.out.printf("%4d * %d =%2d", j, i, (j*i));
	q		}
			System.out.println();		// ����
		}
		System.out.println();
		
		//�� (2)���� ó���� �����
		//	 �� �������� �ݺ��ϴ� �ݺ��� ����
		//	 (check~!! �ݺ����� (2)�� ����� ����)
		//����� Type A �����
		*/
		for (int h=0; h<=1; h++)			//���� ����
		{
			for (int i=1; i<=9; i++)		// ��		�� �������� ��
			{
				for (int j=2; j<=5; j++)	// ��		�� ��
				{
					System.out.printf("%4d * %d = %2d", j+(h*4), i, ((j+(h*4))*i));
				}
				System.out.println();
			}
			System.out.println();
		}
		
		/*
		char star='*';
		for (int m=0; m<=1; m++)
		{
			for (int i=0; i<4; i++)
			{
				for (int j=0; j<=2-i; j++)
					System.out.print(" ");
				for (int k=0; k<=(2*i); k++)
					System.out.printf("%c",star);
				System.out.println();
			}
		}
		*/

		//����� Type B �����
		/*
		int a, b, c;
		for (a=2; a<=6; a+=4)		//2 6
		{
			for (b=1; b<=9; b++)	//1 2 3 4 5 6 7 8 9
			{
				for (c=a; c<=(a+3); c++)	// a�� 2�϶� �� 2 3 4 5
				{							// a�� 6�϶� �� 6 7 8 9
					System.out.printf("%4d * %d = %2d", c, b, (c*b));
				}
				System.out.println();
			}
			System.out.println();
		}

		//�� ���� ������
		//	 �� �������� ������ ó���ϴ� ��������
		//	 ���ܿ� ���� �ٸ��� �־����� ȯ��(h�� ��)�� Ȱ���ϴ� �������
		//	 ���� �ݺ��� 3��ø ����
		*/
	}
}


/* �ٽ� Ǯ���� ����
public class Test060
{
	public static void main(String[] args)
	{	
		int i,j,m;
		for (m=1 ; m<=2; m++)
		{				
			if (m==1)
			{
				for (i=1; i<=9; i++)
				{
				for (j=2; j<=5; j++)
					{
					System.out.printf("%d * %d = %d\t", j, i, j*i);
					}
				}
				System.out.println();
			}

		}
	}
}
*/
/*
public class Test060
{
	public static void main(String[] args)
	{	
		int i,j;
		for (i=1; i<=9; i++)
		{	
			for (j=2; j<=5; j++)
			{
				System.out.printf("%d * %d = %d\t", j, i, i*j);
			}
			System.out.println();
		}

		System.out.println();
		
		int n,m;
		for (n=1; n<=9; n++)
		{
			for (m=6; m<=9; m++)
			{
				System.out.printf("%d * %d = %d\t", m, n, n*m);
			}
			System.out.println();

		}
	}
}

*/


/*
public class Test060
{
	public static void main(String[] args)
	{	int i,n,m;
		int a=4;
	
		for (i=0; i<2; i++)
		{
			for (n=1; n<=9; n++)
			{
				for (m= 2+a; m<=5+a; m++)
				{
					System.out.printf("%d * %d = %d  ", m, n, m*n);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
*/
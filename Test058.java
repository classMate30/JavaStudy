/*����� ���� �帧�� ��Ʈ��(���) ������
- �ݺ���(for) �ǽ�
==========================================*/

// 1���� 100������ ���� �߿���
// 4�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, for���� Ȱ���ؾ� �ϸ�
// �� �ٿ� 5������ ����� �� �ֵ��� �Ѵ�.

// ���� ��);
//	4	8	12	16	20
//	24	28	32	36	40
//			:
//����Ϸ��� �ƹ� Ű�� ��������...

public class Test058
{
	public static void main(String[] args)
	{
		for (int i=4; i<=100;i+=4)
		{	
			System.	out.printf("%4d", i);
			if(i%(4*5)==0)				//--��±����� 5���� ����������
				System.out.println();	//-- ����
		}
	}
}


/*
public class Test058
{
	public static void main(String[] args)
	{
		int i;
		
		for (i=1; i<=100 ;i++)
		{
			if (i%4==0)
			{
				System.out.printf("%d\t",i);
					if (i%20==0)
					{
						System.out.println();
					}
			}
		}
	}
}
*/
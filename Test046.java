/*����� ���� �帧�� ��Ʈ��(���) ������
- �ݺ��� �ǽ� �� ����
==========================================*/

// 1���� 100������ ���� �߿���
// ¦������ �հ� Ȧ������ ���� ���� �����Ͽ� ����Ѵ�.
// �׸���, ������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �ݺ����� while ���� ����� �� �ֵ��� �ϸ�,
// ���� ������ if���ǹ��� ����Ͽ� �ۼ� �� �� �ֵ��� �Ѵ�.

//���� ��)
//1���� 100������ ������ 
//¦���� �� : 2550
//Ȧ���� �� : 2500
//����Ϸ��� �ƹ�Ű�� ��������...

public class Test046
{
	public static void main(String[] args)
	{

		//�ֿ� ���� ���� �� �ʱ�ȭ
		int n=1;				//--1���� 100���� 1�� ������ ����
		int even=0;				//--¦������ �������� ��Ƴ� ����
		int odd=0;				//--Ȧ������ �������� ��Ƴ� ����

		//���� �� ó��
		while (n<=100)
		{
			n++;

			if (n%2==0)
			{
				even += n;
			}
			else if (n%2!=0)
			{
				odd += n;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ� ������");
				return;			//-- �޼ҵ� ���� �� main()�޼ҵ� ���� �� ���α׷� ����
			}
		}

		//��� ���
		System.out.println("1���� 100������ ���� ��");
		System.out.println("¦���� �� : " +even);
		System.out.println("Ȧ���� �� : " +odd);
		
	}
}

		
		/*int n=1, oddSum=0, evenSum=0;
		
		while (n<=100)
		{
			if (n%2==0)
			{
				evenSum += n;
			}
			else if (n%2!=0)
			{
				oddSum += n;
			}
			n++;
		}
		System.out.println("¦���� �� : " + evenSum);
		System.out.println("Ȧ���� �� : " + oddSum);
		*/
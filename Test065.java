/*==========================================
����� ���� �帧�� ��Ʈ��(���) ������
==========================================*/

// break �ǽ�

//�� break Ű���尡 ���ϴ� �ǹ�
//	 ����� + (�׸��� ����������)

//������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
//��, �Է¹޴� ������ 1 ~ 100 �����ȿ����� 
//�����ϵ��� �ۼ��Ѵ�.

//���� ��)

//������ ���� �Է� : -10

//������ ���� �Է� : 0

//������ ���� �Է� : 2022

//������ ���� �Է� :10

//1~10������ �� : 55	
//��� �Ͻðڽ��ϱ�(Y/N) : y

//������ ���� �Է� : 100
//>> 1~100������ �� : 5050
//��� �Ͻðڽ��ϱ�(Y/N) : N
//����Ϸ��� �ƹ�Ű�� ��������...�� ���α׷� ����


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test065
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//check~!!
		int n, s, i;
		//-- n : ����� �Է°��� ��Ƴ� ����
		//	 s : ������ ���� ����� ��Ƴ� ����
		//	 i : 1���� 1�� ������� �Է°����� ������ ����

		char ch;
		//-- ���μ����� ��� �������� ������ ���θ� ��Ƶ� ����
		
		while (true)
		{
			do
			{
				System.out.print("\n������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			//�׽�Ʈ(Ȯ��)
			//System.out.println("��ȿ�� ���� �Է� �Ϸ�~!!!");
			//������ ������ �ʱ�ȭ ��ġ chec~k!!
			s=0;

			for (i=1; i<=n; i++)
			{
				s += i;
			}
			System.out.printf(">> 1 ~ %d������ �� : %d\n", n, s);

			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			ch = (char)System.in.read();
			//-- ������� ������ ���� ����(�ǻ�ǥ��)
			
			//�׸��ҷ�~ �� ��������
			if (ch!='Y' && ch!='y')
			{
				//�ݺ����� ���߰� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				//-- ���� ���� �ǻ�ǥ���� �ߴٸ�,
				//	 �׵��� �����ߴ� �ݺ����� ���߰� �����������Ѵ�.
				break;
				//-- ����� + (�׸��� ����������.) check~!!!
			}//end if

			//���Ͱ�(\r\n)ó��
			//
			System.in.skip(2);

		}//end while(true)
	}//end main()
}//end class

		/*
		int num, i=1, sum=0;
		int yn;
		
		do
		{
			System.out.print("������ ���� �Է� : ");
			num = Integer.parseInt(br.readLine());
			if (num<1 || num>100)
			{
				break;
			}
			else if(num>=1 && num<=100)
			{
				while (i <= num)
				{
					sum += i;	
					i++;
				}	
			}
			System.out.printf("1 ~ %d������ �� : %d\n", num, sum);
			System.out.printf("��� �Ͻðڽ��ϱ�?(Y/N)");
			yn = System.in.read();
			System.in.skip(2);
		}
		while ((yn != 78)&&(yn !=110) || (yn == 89)&&(yn ==121) );				//Y�� y�� ������ ��� , N�̳� n�� ������ ����
		// Y89 y121  N78  n110				//false�� ������ ����������.
											//n�� ������ ����������
		*/



//���� ���


/*

������ ���� �Է� : 20
>> 1 ~ 20������ �� : 210
����Ͻðڽ��ϱ�(Y/N)? : y

������ ���� �Է� : 30
>> 1 ~ 30������ �� : 465
����Ͻðڽ��ϱ�(Y/N)? : Y

������ ���� �Է� : 50
>> 1 ~ 50������ �� : 1275
����Ͻðڽ��ϱ�(Y/N)? : n
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/
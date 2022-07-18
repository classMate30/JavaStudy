/*===================================
�ֹε�Ϲ�ȣ ��ȿ�� �˻�
================================*/

/*
�ֹε�Ϲ�ȣ ���� ����

	1.������ �ڸ��� ������ ���ڸ��� ���� ��Ģ�� �°� ���Ѵ�.

	123456-1234567
	****** *******
	234567 892345 �ֹι�ȣ�� ���ڸ��� ���� ���� ���ϱ�

	2.��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

	3.������ ������� 11�� ������ �������� ���Ѵ�.


		11/217  = ���� 19�� �������� 8

	4.11���� ������ 8�� �� ������� ���Ѵ�.

		11-8 = 3 �̰������� �������� 0�� ���� ������� 11�̴�.
									1 �� ����            10
	
		���ڸ��� ���ð�� �ٽ� 10���� ������ �������� ���Ѵ�.

			11 -> 1��  10 -> 0���� �ٲ۴�.

	5.4�� ���� ����� �ֹι�ȣ�� ������ ���ڿ� ��ġ�ϴ����� ���Ͽ� Ȯ���Ѵ�.

	��ġ�ϸ� ��ȿ�� �ֹι�ȣ�� ����ġ �ϸ� �߸��� �ֹι�ȣ��.


	940601 102441   9

	234567 892345

//�Է°��� �ʰ� �̴� �Ѵ� �Է¿����� ���� ���α׷��� �����Ѵ�.

//��ȿ�� �ֹι�ȣ�� �߸��� �ֹι�ȣ�� ��������

//���� �ذ��� ���� �߰� ��
//�迭.length -> �迭���� ������ ��ȯ�ϴ� ���� �Ӽ����̰�

//���ڿ�.length() �޼ҵ带 ����� �� �ִ�. �̰� ���ڿ��� ���̸� �˷��ִ� ��

//���ڿ�.substring() -> ���ڿ��� �����ϴ� �Լ��� �Ű������� m n�� �ѱ��
// ���ڿ� m��° ��ġ���� n-1��ġ���� �����ϴµ� ������ 0����

���ڿ�.substring(0,6)
���ڿ�.substring(7,13)

���ڿ� �� �ʰ��ϸ� stringindexoutof boundexception ������
 �迭��            array

 �Ű������� �ϳ��� ������ �Ű������� ��ġ���� ���ڿ� ������ �����ϰ� �ȴ�.



1.���ڿ� �Է¹ޱ�

1.���ڿ�.length()�� 13���� �۰ų� ũ�� �߸��� �ֹι�ȣ��� �ϰ� ������


2.���ڿ�.substring(0,1)->(5,6)���� �迭�� ��������.

3.���Ұ͵� ���ڿ��� ���� �պκа� �޺κ��� ���� ������ �迭�� �����ϰ�

for���� ���� ���� �ϳ��� tot��� ���� �����ϰ�

11�� ������������ ���� ���� ���ڿ�.substring(13)�� ���Ѵ�.
		



*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test106
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� : ");
		String iD = br.readLine();
		
		if(iD.length() < 14)
		{
			System.out.print("�Է°��� �̴�.");	
			return;
		}
		else if(iD.length() > 14)
		{
			System.out.print("�Է°��� �ʰ�.");	
			return;
		}

		//int num = Integer.parseInt(iD.substring(0,6));
		//System.out.printf("%d",num); �ǳ�
		int[] numBefore = new int[6];
		
		for(int i=0;i<6;i++)
		{
			numBefore[i] = Integer.parseInt(iD.substring(i,i+1));
		}
		
		int[] numAfter = new int[7];

		for(int i=0;i<7;i++)
		{
			numAfter[i] = Integer.parseInt(iD.substring(i+7,i+8)); // 7~13����
		}


/*
		for(int i=0;i<6;i++)
		{
			System.out.println(numBefore[i]);
		}

		for(int i=0;i<7;i++)
		{
			System.out.println(numAfter[i]);
		}
*/	
		
		int[] gobBefore ={2,3,4,5,6,7}; //�տ� ���Ҽ�
		int[] gobAfter = {8,9,2,3,4,5}; //�ڿ� ���Ҽ�

		int tot=0;

		for(int i=0;i<numBefore.length;i++)
		{
			tot += numBefore[i]*gobBefore[i];
			tot += numAfter[i]*gobAfter[i];
		}
		//for(int i=0;i<numAfter.length-1;i++)
			
		
		//System.out.print(tot);
		

		int halfResult = tot%11;

		System.out.println(halfResult);


		if(halfResult>=10)
			halfResult = halfResult%10;

		
		int result = 11-halfResult;
		
		System.out.println(result);

		if(result == numAfter[6])
			System.out.println("��Ȯ�� �ֹι�ȣ~!!!!");
		else
			System.out.println("�߸��� �ֹι�ȣ~!!!!");

		

	}
}
/*======================================
   ���� �ֹε�Ϲ�ȣ ��ȿ�� �˻����
=======================================*/

/*
�� �ֹε�Ϲ�ȣ ���� ����
	
	�� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.
		123456-1234567(�ֹε�Ϲ�ȣ)
		****** ****** ----------------------�� �ڸ����� ���ϱ�
		234567 892345 (�� �ڸ��� ������ ��)
		
	�� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.
	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5

		=217

	�� ������ ������� 11�� ������ ������������ ���Ѵ�
		������ : 8    (217 % 11 = 8)
	
	�� 11���� ������ 8�� �� ������� ���Ѵ�.
		11 - 8 �� 3
	
		�� ���� ó�� �������� �������� 0�� ���	�� 11 - 0 ��11
							 �������� 1�� ���	�� 11 - 1 ��10

			�̸� �ٽ� 10���� ������ �������� ���Ѵ�.		11��1
														10��0

	�� ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� ��ġ�ϴ����� ���θ� 
		���Ͽ� Ȯ���Ѵ�.
		
		��ġ		�� ��ȿ�� �ֹι�ȣ
		����ġ  �� �߸��� �ֹι�ȣ

*/

// ���� ��)
// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-12345678	���Է� ���� �ʰ�
// >>�Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-123456		���Է� ���� �̴�
// >>�Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-123456		�� ��ȿ�� �ֹι�ȣ
// >>��Ȯ�� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-123456		�� �߸��� �ֹι�ȣ
// >>�߸��� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �ذ��� ���� �߰� ��~!!

//		�迭.length			(�Ӽ�)		�� �迭�� ����(�迭���� ����) ��ȯ
//		���ڿ�.length()		(�޼ҵ�)		�� ���ڿ��� ���� ��ȯ
//		���ڿ�.substring()				�� ���ڿ� ����
//		���ڿ�.substrint(m, n)			�� ���ڿ� m��° ��ġ���� n-1��° ��ġ���� ����(�ε�����0���� n-1����)
//		���ڿ�.substrint(m)				�� ���ڿ� m��° ��ġ���� ���ڿ��� ������ ����

		/*
		String strTemp;
		
		//�׽�Ʈ
		String strTemp = "���¹�";
		System.out.println(strTemp.length());
		//		--==>>3

		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		//		--==>>9 (���鵵 ������)

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//		--==>>10 

		

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		//		--==>>NOPQ

		//System.out.println(strTemp.substring(13, 57));
		//--==>> �����߻� (��Ÿ�� ����)
		//		 StringIndexOutOfBounds

		System.out.println(strTemp.substring(13));
		*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test106
{
	public static void main(String[] args) throws IOException
	{	
		String str;
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13;
		int sum = 0;
		int check,result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ֹι�ȣ�Է� (xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if (str.length()<14)
		{
			System.out.println("�Է� ����~!!!");	
			return;
		}
		else if (str.length()>14)
		{
			System.out.println("�Է� ����~!!!");
			return;		
		}
		else if (str.length()==14)
		{
			//�ֹε�Ϲ�ȣ�� ��ȿ���� ����
			//System.out.println(str.substring(0,1));
			//�Ѱ� ���
			//System.out.println(str.substring(0,6));
			//�ֹε�Ϲ�ȣ ���ڸ�
			//System.out.println(str.substring(7,14));
			//�ֹε�Ϲ�ȣ ���ڸ�
			/*for (int i=0; i<6; i++)
			{
				num1 = Integer.parseInt(str.substring(i));
			}
			*/
			num1 = Integer.parseInt(str.substring(0,1));
			num2 = Integer.parseInt(str.substring(1,2));
			num3 = Integer.parseInt(str.substring(2,3));
			num4 = Integer.parseInt(str.substring(3,4));
			num5 = Integer.parseInt(str.substring(4,5));
			num6 = Integer.parseInt(str.substring(5,6));
			num7 = Integer.parseInt(str.substring(7,8));
			num8 = Integer.parseInt(str.substring(8,9));
			num9 = Integer.parseInt(str.substring(9,10));
			num10= Integer.parseInt(str.substring(10,11));
			num11= Integer.parseInt(str.substring(11,12));
			num12= Integer.parseInt(str.substring(12,13));
			num13= Integer.parseInt(str.substring(13,14));	//�ֹε�Ϲ�ȣ ������ �ڸ�
			
			sum = (num1*2)+(num2*3)+(num3*4)+(num4*5)+(num5*6)+(num6*7)+(num7*8)+(num8*9)+(num9*2)+(num10*3)+(num11*4)+(num12*5);
			
			check = (sum%11);	//������ ���� 
			if (check == 0)
				check =1;
			else if (check ==1)
				check =0;
			
			result = 11 - check;

			if (result == num13)
			{
				System.out.println("��Ȯ�� �ֹι�ȣ~!!!");
			}
			else if (result != num13)
			{
				System.out.println("�߸��� �ֹι�ȣ~!!!");
			}

			
		}




	}
}


// 1.ó���� �ֹε�Ϲ�ȣ�� ����ڷκ��� �޾� �� ��
// 2. ��޾ƿ� ���ڿ��� 14�ڸ����� ������ �Է� ���� �̴�
//	  ��޾ƿ� ���ڿ��� 14�ڸ����� ������ �Է� ���� �ʰ�
// 3. �޾ƿ� �ֹε�Ϲ�ȣ�� 14�ڸ��� ������ �� ��
//    �� ���� ����� ���̸� ��ȿ�� �ֹι�ȣ
//	  �� ���� ����� �����̸� �߸��� �ֹι�ȣ

/*
�� �ֹε�Ϲ�ȣ ���� ����
	
	�� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.
		123456-1234567(�ֹε�Ϲ�ȣ)
		****** ****** ----------------------�� �ڸ����� ���ϱ�
		234567 892345 (�� �ڸ��� ������ ��)
		
	�� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.
	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5

		=217

	�� ������ ������� 11�� ������ ������������ ���Ѵ�
		������ : 8    (217 % 11 = 8)
	
	�� 11���� ������ 8�� �� ������� ���Ѵ�.
		11 - 8 �� 3
	
		�� ���� ó�� �������� �������� 0�� ���	�� 11 - 0 ��11
							 �������� 1�� ���	�� 11 - 1 ��10

			�̸� �ٽ� 10���� ������ �������� ���Ѵ�.		11��1
														10��0

	�� ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� ��ġ�ϴ����� ���θ� 
		���Ͽ� Ȯ���Ѵ�.
		
		��ġ		�� ��ȿ�� �ֹι�ȣ
		����ġ  �� �߸��� �ֹι�ȣ




/*
// ���� ��)
// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-12345678	���Է� ���� �ʰ�
// >>�Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-123456		���Է� ���� �̴�
// >>�Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-1234567		�� ��ȿ�� �ֹι�ȣ
// >>��Ȯ�� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-xxxxxxx) : 123456-1234567		�� �߸��� �ֹι�ȣ
// >>�߸��� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...
*/
/*==========================================
   ���� �迭 ����
   - �迭�� ����� �ʱ�ȭ
   - �迭�� �⺻�� Ȱ��
=========================================*/

// �� ����
//	  ����ڷκ��� ������ �л� ���� �Է¹ް�
//	  �׸�ŭ�� ����(���� ����)�� �Է¹޾�
//	  ��ü �л� ������ ��, ���, ������ ���ؼ� 
//	  ����� ����ϴ� ���α׷��� �����Ѵ�.

//	���� ��)
//	�л� �� �Է� : 5
//	1�� �л��� ���� �Է� : 90
//  2�� �л��� ���� �Է� : 82 
//	3�� �л��� ���� �Է� : 64
//	4�� �л��� ���� �Է� : 36
//	5�� �л��� ���� �Է� : 98

//	>> �� : 370
//	>> ��� : 74.0
//	>> ����
//	90 : -16.0
//	82 : -8.0
//	64 : 10.0
//	36 : 38.0
//	98 : -24.0
// ����Ϸ��� �ƹ� Ű�� ��������...

//Scanner Ȱ���ؼ� �ٽ� �ѹ� �غ� ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test084
{
	public static void main(String[] args)	throws IOException
	{
		//�ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int studentNum,sum=0;
		double avg;
		
		//����ڿ��� �Է��� �޾ƿ�
		System.out.print("�л� �� �Է� : ");
		studentNum = Integer.parseInt(br.readLine());
		

		//�Է� ���� �迭�� ����
		int[] scoresArr = new int[studentNum];
		for (int i=0; i<scoresArr.length; i++)
		{
			System.out.printf("%d�� �л��� ���� �Է� : ", i+1);
			scoresArr[i] = Integer.parseInt(br.readLine());
			//���� �� ���ϱ�
			sum += scoresArr[i];
		}
		
		avg = (double)sum / studentNum;
		
		//���� ���ϱ�
		double dev[] = new double[studentNum];
		for (int i=0; i<scoresArr.length; i++)
			dev[i] = avg - scoresArr[i];

		
		//��� ����ϱ�
		System.out.printf("\n >> �� : %d%n", sum);
		System.out.printf(" >> ��� : %f%n", avg);
		System.out.println(" >> ����");
		for (int i=0; i<scoresArr.length; i++)
			System.out.printf("%d : %f %n", scoresArr[i], dev[i]);
		
			
		


	}
}

//���� ��� 
/*
�л� �� �Է� : 5
1�� �л��� ���� �Է� : 90
2�� �л��� ���� �Է� : 82
3�� �л��� ���� �Է� : 64
4�� �л��� ���� �Է� : 36
5�� �л��� ���� �Է� : 98

 >> �� : 370
 >> ��� : 74.000000
 >> ����
90 : -16.000000
82 : -8.000000
64 : 10.000000
36 : 38.000000
98 : -24.000000
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*======================================
   ���� Ŭ������ �ν��Ͻ� ����
   - Ŭ������ �ν��Ͻ� Ȱ��
=======================================*/

//	2. Sungjuck Ŭ����
//	- �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
//	  �̸�, ��������, ��������, ���������� �Է¹ް�
//	  ������ ����� �����ϴ� Ŭ������ ������ ��~!!!
//	  - �Ӽ� : �ο���, Record Ÿ���� �迭
//	  - ��� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���


// 1. �Ӽ����� �ο��� ������ RecordŬ������ ��ü �迭�� �����ؾ��Ѵ�...?
// 2. �޼ҵ� ��ɵ��� ������ ��
//		���ο��� �Է� �޼ҵ�/������ �Է� �޼ҵ� (�Է� �޼ҵ�)
//		��														(������ �Է� �޼ҵ�)
//		������ �� ��� ���� �޼ҵ�
//		���� ��� �޼ҵ�

import java.util.Scanner;

public class Sungjuk
{
	int stuNum;
	Record[] recArr;
	

	void input()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�л� �� �Է� [1~100]");
			stuNum = sc.nextInt();
		}
		while (1>stuNum || stuNum >100);
		
		recArr = new Record[stuNum];
	}

	void score()
	{
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<stuNum; i++)
		{
			recArr[i] = new Record();
			System.out.printf("%d��° �л��� �̸� �Է� : ", i+1);
			recArr[i].name = sc.next();
			

			System.out.print("���� ���� : ");
			recArr[i].score[0] = sc.nextInt();

			System.out.print("���� ���� : ");
			recArr[i].score[1] = sc.nextInt();

			System.out.print("���� ���� : ");
			recArr[i].score[2] = sc.nextInt();


			recArr[i].tot = recArr[i].score[0] + recArr[i].score[1] + recArr[i].score[2];
			recArr[i].avg = recArr[i].tot / 3.0;

			System.out.println();
		}
	}

	void write()
	{
		for (int i = 0; i < num; i++)
			System.out.printf("%3s%4d%4d%4d%5d%8.2f%4d\n", recArr[i].name, recArr[i].score[0], recArr[i].score[1], recArr[i].score[2], recArr[i].tot, recArr[i].avg);
	}
	
}

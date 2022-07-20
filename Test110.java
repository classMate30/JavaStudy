/*======================================
   ���� ����(Sort) �˰��� ����
=======================================*/

//�� ���� 
//	 ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
//	 ������ ���� �л����� ���� ������ ����� �ο��Ͽ�
//	 ����� ����ϴ� ���α׷��� �����Ѵ�.
//	 ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ� �� �� �ֵ��� �Ѵ�.

//	���� ��)
//	�ο� �� �Է� : 5
//  �̸� ���� �Է�(1, ���� ����) : ������ 90
//  �̸� ���� �Է�(2, ���� ����) : ���̰� 80
//  �̸� ���� �Է�(3, ���� ����) : �ֵ��� 85
//  �̸� ���� �Է�(4, ���� ����) : ������ 75
//  �̸� ���� �Է�(5, ���� ����) : �ڿ��� 95

/*
--------------
1�� �ڿ��� 95 1
2�� ������ 90 2
3�� �ֵ��� 85 3
4�� ���̰� 80 4 
5�� ������ 75 5
--------------
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;
public class Test110
{	
	//�������� �ʿ��� ������ �̸� ����
	String[] name;
	int[] score;
	int[] rank;
	int n;

	//�Է� �޾ƿ� �޼ҵ� ����
	void input()
	{	
		//����ڷκ��� �Է��� �޾ƿͼ�, n������ �� �ο� �� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� �Է� : ");
		n = sc.nextInt();
		
		//n��ŭ�� ���̸� ���� name�� score�迭�� for���� ���ؼ� �� �̸��� ���ڸ� ��Ƴ�
		name = new String[n];
		score = new int[n];
		for (int i=0; i<n; i++)
		{
			System.out.printf("�̸�, ���� �Է�(%d, ���鱸��) : ", i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}
	
	}
	
	//���� ���� �޼ҵ� ����
	//������ (ū���ڿ��� ��������) ,������������ ���� �׸��� �̸��鵵 �׿� ���� ���� ����
	//����� (�������ڿ��� ū����) ,������������ ���� (1����� n�����)
	void ranking()
	{	
		//�̸� ���� �Ҷ� �ʿ��� �ӽ� ���� ���� ����
		String changeTemp;
		

		//���� ����

		for (int i=0; i<n-1; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				if (score[i]<score[j])
				{
					score[i]=score[i]^score[j];
					score[j]=score[j]^score[i];
					score[i]=score[i]^score[j];

					changeTemp = name[i];
					name[i]=name[j];
					name[j]=changeTemp;
					
				}
			}
		}
		//���� ����
		/*
		for (int i=1; i<n; i++)
		{
			for (int j=0; j<n-1; j++)
			{
				if (score[j]<score[j+1])
				{
					score[j] = score[j]^score[j+1];
					score[j+1]= score[j+1]^score[j];
					score[j] = score[j]^score[j+1];

					changeTemp = name[j];
					name[j] = name[j+1];
					name[j+1] = changeTemp;
				}
			}
		}

		*/

		//��ũ �迭 n���� ��ŭ �Ҵ� ���ְ�, ��� ������ 1�� �ʱ�ȭ
		//�� �ڸ� ���ذ��鼭 ���� ���� ��
		rank = new int[n];
		for (int i=0; i<n; i++)
			rank[i]=1;

		//���� ����
		for (int i=0; i<n-1; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				if (score[i]<score[j])
					rank[i]+=1;
				else if (score[i]>score[j])
					rank[j]+=1;
			}
		}
		
		/*
		//���� ����
		for (int i=1; i<n; i++)
		{
			for (int j=0; j<n-1; j++)
			{
				if (score[i]<score[j])
					rank[i]+=1;
			}
		}
		*/
		//����� �°� ������� �ϴµ�... �´°����� �𸣰���


	}
	
	//��� �޼ҵ� ����
	void print()
	{	
		System.out.println("--------------");
		for (int i=0; i<n; i++)
		{
			System.out.printf("%d�� %2s %2d \n",rank[i], name[i], score[i]);
		}
		System.out.println("--------------");
	}

	public static void main(String[] args)
	{	
		//Test110 Ŭ���� ������� �ν��Ͻ� ����
		Test110 ob = new Test110();
		//ob�� ���ؼ� �޼ҵ� ȣ��
		ob.input();
		ob.ranking();
		ob.print();
	}
}

//���� ���

/*

�ο� �� �Է� : 5
�̸�, ���� �Է�(1, ���鱸��) : ������ 90
�̸�, ���� �Է�(2, ���鱸��) : ���̰� 80
�̸�, ���� �Է�(3, ���鱸��) : �ֵ��� 85
�̸�, ���� �Է�(4, ���鱸��) : ������ 75
�̸�, ���� �Է�(5, ���鱸��) : �ڿ��� 95
--------------
1�� �ڿ��� 95
2�� ������ 90
3�� �ֵ��� 85
4�� ���̰� 80
5�� ������ 75
--------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
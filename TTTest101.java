/*=====================================================
�� Ŭ������ �ν��Ͻ�
- Ŭ������ �ν��Ͻ� Ȱ��
=======================================================*/

/*
�л����� ��������, ��������, �������� �Է¹޾�
���� �� ����� ����ϴ� ���α׷� ����
Ŭ������ ������ Ȱ���ϰ� �迭�� ���������� Ȱ���� ��.
Ŭ���� ����� �Ʒ��� ���̵� ������ ������.


���� ��)
�ο� �� �Է�(1~100) : 102
�ο� �� �Է�(1~100) : -1
�ο� �� �Է�(1~100) : 3

1��° �л��� �̸� �Է� : ��
���� ���� : ?
���� ���� : ?
���� ���� : ?

2��° �л��� �̸� �Է� : ��
���� ���� : ?
���� ���� : ?
���� ���� : ?

3��° �л��� �̸� �Է� : ��
���� ���� : ?
���� ���� : ?
���� ���� : ?

�� 10 20 30 60 xx.xx
�� 10 20 30 60 xx.xx
�� 30 20 10 60 xx.xx



[Ŭ���� ���̵����]
1. Record Ŭ����
- �Ӽ��� �����ϴ� Ŭ������ ����

2. Sungjuk Ŭ����
- �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
�̸�, ��������, ��������, ���������� �Է¹ް�
������ ����� �����ϴ� Ŭ������ ����
�Ӽ� : �ο���, ��Record Ÿ���� �迭��
��� : �ο��� �Է�, �� ������ �Է�(����), ���� �� ��� ����, ��� ���

3. Test101 Ŭ����
main �޼��带 ���� �ܺ� Ŭ������ �Ѱ�??
*/

import java.util.Scanner;

class Record
{
	int kor, eng, math, total;
	int[] rec = new int[3];
	double avg;
	String name;

	int rank;
}

class Sungjuk
{
	private int member;
	private Record[] rc;

	void inputMembers()
	{

		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է� : ");
			member = sc.nextInt();
		}
		while (member < 0 || member > 100);
		rc = new Record[member];
	}
	

	void inputInfo()
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 1, j = 0; i <= member; i++, j++)
		{
			rc[j] = new Record();
			System.out.printf("%d��° �л� �̸� �Է� : ", i);
			rc[j].name = sc.next();
			System.out.print("���� ����  : ");
			rc[j].rec[0] = sc.nextInt();
			System.out.print("���� ����  : ");
			rc[j].rec[1] = sc.nextInt();
			System.out.print("���� ����  : ");
			rc[j].rec[2] = sc.nextInt();
		}
	}

	void cal()
	{
		for(int i = 0; i < member; i++)
		{
			rc[i].total = rc[i].rec[0] + rc[i].rec[1] + rc[i].rec[2];
			rc[i].avg = rc[i].total/3.0;
		}
	}

	void print()
	{
		for(int i = 0; i < member; i++)
			System.out.printf("%s | %d | %d | %d | %d | %.2f%n", rc[i].name, rc[i].rec[0], 
													 rc[i].rec[1], rc[i].rec[2], rc[i].total, rc[i].avg);
	}

}
public class TTTest101
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();
		sj.inputMembers();
		sj.inputInfo();
		sj.cal();
		sj.print();
	}
}
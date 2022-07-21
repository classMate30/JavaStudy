/*=============================================
 	���	��Ŭ���� ��ޡ���
 	- �������̽�(Interface)
 =============================================*/

// ��   �ǽ�����
//		���� ó�� ���α׷��� �����Ѵ�
//		��, �������̽��� Ȱ�� �� �� �ֵ��� �Ѵ�


// ���� ��)
// �ο� �� �Է�(1~10) : 11
// �ο� �� �Է�(1~10) : 0
// �ο� �� �Է�(1~10) : 2

// 1��° �л��� �й� �̸� �Է�(���� ����) : 2207123 �ֵ���
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2208225 �ֳ���
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

// 2207123 �ֵ���   90 100 85	xxx xx.xx
//					��  �� ��
// 2208225 �ֳ���	80 70 65	xxx xx.xx
//					�� �� ��

//����Ϸ��� �ƹ� Ű�� ��������...


//�Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
import java.util.Scanner;
class Record_2
{
	String hak, name;		//--�й�, �̸�
	int kor, eng, mat;		//--����, ����, ���� ����
	int tot;				//--����
	double avg;				//--���

	//int score[] = new int[3];
}

// �������̽�
interface Sungjuk 
{
	public void set();		//--�ο� ����
	public void input();	//--������ �Է�
	public void print();	//--��� ���

}

//���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����

class SungjukImpl implements Sungjuk 
{	
	//�ֿ� ���� ����
	private int inwon;
	private Record_2[] rec;
	
	//�������̵��� ���ؼ� �߻�Ŭ���� ���� ���� ��ü ���� �����ϰ� ����� �� ��
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է� (1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);

		rec = new Record_2[inwon];
	}

	@Override
	public void input()
	{	
		Scanner sc = new Scanner(System.in);
		String[] sub = {"����", "����", "���� ����"};
		for (int i=0; i<inwon; i++)
		{
			rec[i] = new Record_2();
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", i+1);
			rec[i].hak = sc.next();
			rec[i].name= sc.next();

			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			/*
			for (int j=0 ; j<3; j++)
			{
				rec[i].score[j] = sc.nextInt();
			}
			*/

			
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot += rec[i].kor + rec[i].eng + rec[i].mat;

			

			rec[i].avg = rec[i].tot / 3.0;



		}
	}
	
	@Override
	public void print()
	{	
		for (int i=0; i<inwon; i++)
		{		
			System.out.printf("%10s",rec[i].hak);
			System.out.printf("%5s",rec[i].name);

			System.out.printf("%4d",rec[i].kor);
			System.out.printf("%4d",rec[i].eng);
			System.out.printf("%4d",rec[i].mat);
			/*
			for (int j=0; j<3; j++)
			{
				System.out.printf("%4d",rec[i].score[j]);
			}
			*/
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f",rec[i].avg);
			System.out.println();
			/*
			for (int k=0; k<3; k++)
			{
				System.out.printf("\t   %s",panjung(rec[i].score[k]));
			}
			*/

			System.out.printf("\t            %s",panjung(rec[i].kor));
			System.out.printf("%3s",panjung(rec[i].eng));
			System.out.printf("%3s",panjung(rec[i].mat));
			System.out.println();

		}

	}

	//���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score)
	{
		if (score>=90)
			return "��";
		else if(score>=80)
			return "��";
		else if (score>=70)
			return "��";
		else if (score>=60)
			return "��";
		else 
			return "��";
	}
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test121 extends SungjukImpl
{
	public static void main(String[] args)
	{
		
		/*��ĳ����
		SungjukImpl ob0 = new SungjukImpl();
		Sungjuk ob = (Sungjuk)ob0;
		Sungjuk ob = ob0;
		*/



		Sungjuk ob = new SungjukImpl();
		//SungjukImpl ob = new SungjukImpl();

		//���� �ذ� �������� �ۼ��ؾ� �� ob ���� �� ��ü ����

		ob.set();
		ob.input();
		ob.print();

	}
}
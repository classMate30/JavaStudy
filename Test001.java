import java.io.IOException;
public class Test001
{
	public static void main(String[] args) throws IOException
	{	/*
		char temp,temp1;
		System.out.print("�� ���� �Է� : ");
		temp = (char)System.in.read();
		//�빮���̳�? �ҹ��ڷκ�ȯ : (�ҹ��� �̴��� ? �빮�ڷκ�ȯ : �ִ±״��)
		temp1 = (temp >= 65 && temp <= 90) ? (char)(temp+32) : ((temp >= 97 && temp <=122) ? (char)(temp-32): temp);
	
		System.out.println(temp+ "��" +temp1);
		*/
		
		
		System.out.println("Welcome to Java");
		System.out.println("First Java Program");

		//char ch = 65;			//�� �ڵ�����ȯ�� �Ͼ����?
		//System.out.println(ch);

		//int n = 0.0;			//�̰� �ȵǴµ�
		//System.out.println(n);
		int[][] arr= new int[4][5];
		int n=0;
		
		for (int i=0; i<5; i++)
		{
			for (int j=0;j<4; j++)
			{
				n++;
				arr[j][i] = n;
			}
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d",arr[i][j]);
			System.out.println();
		}
	}
}

// - class�� �̸��� ��Test001��
// - �ڹ� ���α׷��� Ŭ���� �̸��� ù���ڸ� ���빮�ڡ��� �����ؾ���(��)
/* - �ڹ� ���α׷� �����Ҷ� Ŭ����(class)�� main()�޼ҵ带 �⺻������ �ۼ��� ��*/
// - �ҽ��ڵ� ���� �� Ŭ���� �̸��� ������ ���� �̸����� ���� �̶� Ȯ���ڴ� ��.java��



/*===============================
   ���� Ŭ������ �ν��Ͻ� ����
   - Ŭ���� ����
   - �迭�� Ȱ��
   - �������������ڿ� ��������
================================*/

// ����ڷκ��� ��, ��, ���� �Է¹޾�
// �ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
// ��, �޷� Ŭ����(Calendar)�� ������� �ʴ´�.
// ���� Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�. (�� WeekDay Ŭ���� ����)
// �׸���, �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�.
// ���������������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ����������...
// WeekDay Ŭ���� ���踦 ����
// Test099 Ŭ������ main() �޼ҵ尡 ���������� ���α׷� ���� �� �� �ֵ��� �Ѵ�.

// ���� ��)
// �� �� �� �Է�(���� ����) : 2022 7 15
// >> 2022�� 7�� 15�� �� �ݿ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� Hint
//	  - 1�� 1�� 1�� �� "������"
//	  - 1���� 365���� �ƴϴ�.
//	  - 2���� ������ ��¥�� 29�� �� ����
//	  - 2���� ������ ��¥�� 28�� �� ���
//	  - ������ �Ǻ� ����
//	    �� �⵵�� 4�� ����̸鼭 100�� ����� �ƴϰų�.
//		   400�� ����̸� ����, �� �̿��� �⵵�� ���


/*
1. input ���� ���� �޾ƿͼ� ���ذ� �������� ������� �Ǻ��Ѵ�.
2. �޾ƿ� ���� ������ ��� ������ �����ش�. ex) 2022���̸� 2021������� ��� ������ �����ش�.
3. �޾ƿ� ���� ������ ��� ������ �����ش�. ���� ��⿡���� 2���� ���ڴ� �ٸ��� �ٸ� ���� ����.
4. �޾ƿ� ������ ������ �����ش�.
5. �޾ƿ� ��� ������ 7�� ���� �������� ���Ѵ�.
6. �������� ���ؼ� ������ �����Ѵ�.


*/
/*
import java.util.Scanner;
class WeekDay
{
	//��,��,���� �ʱⰪ���� 1�� 1�� 1������ ���, "������"�� ����������ϴµ�,
	private int year=1, month=1, date=1, calSum=0, calYear=0, calDate=0;
	String type
	

	void input()
	{
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		month = sc.nextInt();
		date = sc.nextInt();

		if ()
		{
		}
	}

	int calD(int date)
	{ 
		calDate +=(date-1);
		return calDate;
	}

	int calY(int year)
	{
		

	}

	int calM(int month)
	{
		
	}
		

}
	



public class Test099
{
	public static void main(String[] args)
	{
		
	}
}*/
/*=============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
 	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Random Ŭ����
=============================================*/	
/*
��  java.util.Random Ŭ������
	
	���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�
	Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ�� ������ �����ϴ� �޼ҵ�������
	0.0 ~ 1.0������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
	�ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������ �����ؾ� �Ѵ�
	�׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
	���� Ŭ������ RandomŬ������ ������ �����ϰ� �ִ�

// �ζ� ��ȣ ����(���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ�
// 5���� �����ϴ� ���α׷��� �����Ѵ�


// ���� ��)
// 3 5 12 24 31 41
// 1 2 8  36 41 42
// 4 9 12 13 22 30
// 5 10 13 14 22 40
// 22 31 36 40 43 44

*/
import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num;
 

	// ������
	Lotto()
	{
		num = new int[6];

	}
	
	//getter
	public int[] getNum()
	{
		return num;
	}

	
	//���� Ǭ Ǯ��
	//6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		Random rd = new Random();
		int n;
		int cnt = 0;
		
		jump:

		while (cnt<6)					// 0 1 2 3 4 5
		{
			n = rd.nextInt(45) + 1;			// 0 ~ 44 �� ��+1�� �� 1 ~45
			
			for (int i=0; i<cnt; i++)	// cnt �� 4 / i �� 0123
			{
				if(num[i]==n)
					continue jump;
			}
			num[cnt++] = n;
		}
		sorting();
	}

	//���� �޼ҵ� ����
	private void sorting()
	{
		Arrays.sort(num);
	}

}

public class Test146
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();
		//�⺻ 5����
		for (int i=0; i<5; i++)
		{
			// �ζ� ���� ����
			lotto.start();
			for (int n: lotto.getNum())
			{
				System.out.printf("%4d", n);	
			}
			System.out.println();
		}
		
	}
}

/*
   3   9  11  21  23  25
   3   5  20  24  36  44
   4  13  19  23  24  30
   2  11  14  23  37  43
   7   8  13  18  24  29
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


/*
import java.util.Random;
class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num;
 

	// ������
	Lotto()
	{
		num = new int[6];

	}
	
	//getter
	public int[] getNum()
	{
		return num;
	}

	//6���� ������ �߻���Ű�� �޼ҵ� ����
	//�ߺ� �� ó���ϰ� , ���� ���������
	// �ߺ� ���� �������� �������� ����?

	public void start()
	{
		Random rd = new Random();
		for (int i=0; i<num.length; i++)
		{
			num[i] = rd.nextInt(45) + 1;	//
			for (int j=0; j<i; j++)
			{
				if (num[i] == num[j])
				{
					i--;					//���� �ߺ��̸� i������Ű�� �ѹ��� �ζ� ���� �ٽ� �� ��
				}
			}
		}
		
		// �ߺ� �� ó�� ������ ���� ���� ����
		// ���� ���� ���� Ȱ��
		int pass = 0;
		boolean flag;
		
		do
		{
			flag = false;
			pass++;
			for (int i=0; i<num.length-pass; i++)
			{
				if (num[i]>num[i+1])
				{
					num[i] = num[i]^num[i+1];
					num[i+1] = num[i+1]^num[i];
					num[i] = num[i]^num[i+1];

					flag = true;
				}
			}
		}
		while (flag);
	
		for (int j=0; j<num.length; j++)
		{
			System.out.printf("%3d",num[j]);
		}
			System.out.println();

	}


	
public class Test146
{
	public static void main(String[] args)
	{
		Lotto lt = new Lotto();
		for (int i=0; i<5; i++)
		{
			lt.start();
			lt.getNum();
		}
		
	}
}

*/
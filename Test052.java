/*����� ���� �帧�� ��Ʈ��(���) ������
- �ݺ���(while��) �ǽ�
==========================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// �Է¹��� �� ���� ��
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� :100
// �� ��° ���� �Է� :200
// >> 100 ~ 200������ �� : xxxx
// ����Ϸ��� �ƹ�Ű�� ��������...

// ù ��° ���� �Է� :1000
// �� ��° ���� �Է� : 2
// >> 2~1000 ������ �� : xxxx
// ����Ϸ��� �ƹ�Ű�� ��������...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ亯�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;				//-- ���������� Ȱ���� ����
		int su1, su2;		//-- ù��° �ι�° ����� �Է°��� ��Ƴ� ����
		int result=0;		//-- ������ ���� ����

		//���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());

		//�Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		//��, su1�� su2���� ū ��� �� ���� �ڸ��� �ٲܼ� �ֵ��� ó��
		if (su1 > su2)
		{
			//�ڸ��ٲ�
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		//�ݺ� ���� ����
		//�ݺ� ������ �����ϱ� ����
		//���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		// (��� ��� �������� �Է¹��� ���� ���� �ʿ��ѵ�...
		// �� ���� �ݺ� �������� ����ϰ� �Ǹ�...
		// ������ ���� Ȯ���� �� ���� ������...)

		n =su1;
		
		while (n <=su2)
		{
			result += n;
			n++;
		}
	
		//��� ���
		System.out.printf(">> %d ~ %d ������ �� : %d%n", su1, su2, result);
	}
}


//���� ���
/*
ù ��° ���� �Է� : 100
�� ��° ���� �Է� : 1
>> 1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
/*
ù ��° ���� �Է� : 100
�� ��° ���� �Է� : 2
>> 2 ~ 100 ������ �� : 5049
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, max=0, min=0;
		int sum=0;


		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		if (num1 >= num2)
		{
			max = num1;
			min = num2;
		}
		else if (num2 > num1) // else if ���� �ȵǰ� else�� �Ǵ�����??????????????????
		{						//else�� ������ �ʰ� else if�� ������ ������ �ʱ�ȭ����� �Ѵ�.
			max = num2;
			min = num1;
		}
		
		//�������� i�� ���� while���� ���� ��
		int i = min;
		while (i <= max)
		{
			sum += i;
			i++;
		}
		System.out.printf("%d ~ %d������ �� : %d%n", min, max, sum);

	}
}
*/

		//System.out.printf("%d ~ %d������ �� : %d%n", min, max, sum);

		//System.out.printf("%d ~ %d������ �� : ", 


		//System.out.printf("%d ~ %d������ �� : %d%n", num1, num2, sum);
		/*
		if (num1 > num2)
		{
			while (num2 <= num1)
			{
				sum += num2;
				num2 ++;
			}
		}
		
		if (num2 > num1)
		{
			num2 = num2^num1;
			num1 = num1^num2;
			num2 = num2^num1;
			
			while (num1 > num2)
			{
				while (num2 <= num1)
				{
					sum += num2;
					num2 ++;
				}
			}
		}
*/

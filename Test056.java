/*����� ���� �帧�� ��Ʈ��(���) ������
- �ݺ���(do~while��) �ǽ�
==========================================*/

// ����ڷκ��� ���� ���� ���� ������ �Է¹ް�,
// �� ���� ����Ͽ� ����ϴ� ���α׷��� �ۼ��Ѵ�
// ��, -1�� �ԷµǴ� ���� �Է� ������ �����ϰ�
// �׵��� �Էµ� ������ ���� ������ִ� ���α׷��� �����Ѵ�.
// ��, -1�� �Է� ���� Ŀ�ǵ�� Ȱ���Ѵ�.
// do~while ���� Ȱ���Ͽ� ������ �ذ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// 1��° ���� �Է�(-1 ����) : 10
// 2��° ���� �Է�(-1 ����) : 5
// 3��° ���� �Է�(-1 ����) : 8
// 4��° ���� �Է�(-1 ����) : 9
// 5��° ���� �Է�(-1 ����) : -1

// ������� �Էµ� ������ �� : 32
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, sum=0;
		int n=1;		//���� ������ Ȱ���ϸ� �� ��° �Է°������� ��Ƴ� ����
		
		//���� �� ó��
		do
		{
			System.out.printf("%d��° ���� �Է�(-1 ����) : ", n);
			num = Integer.parseInt(br.readLine());
			sum += num;			//sum�� num��ŭ ����
			
			n++;

		}
		while (num != -1);		//num�� -1�� �ƴ� ���(����ؼ� �ݺ�)
		

		//Ȯ��(�׽�Ʈ)
		//System.out.println("-1 �Է� Ȯ��");


		
		//��� ���
		System.out.printf("\n>> ������� �Էµ� ������ �� : %d\n", (sum+1));
	
	
	}
}

// ���� ���
/*
1��° ���� �Է�(-1 ����) : 10
2��° ���� �Է�(-1 ����) : 10
3��° ���� �Է�(-1 ����) : 10
4��° ���� �Է�(-1 ����) : -1

>> ������� �Էµ� ������ �� : 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/



/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ���� BufferedReader���� ��, �Է°� ���� ����, Ƚ�� ��Ÿ�� ����, ���� �� ��Ÿ�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2=1, sum=0;

		do
		{
			System.out.printf("%d��° ���� �Է�(-1 ����) :", num2);
			num2 ++;
			num1 = Integer.parseInt(br.readLine());
			sum += num1;
		}
		while (num1!=-1);
			sum += 1;

		System.out.println();
		System.out.println("������� �Էµ� ������ �� : " +sum);

	}
}

*/

/*
import java.util.Scanner;
public class Test056
{
1	public static void main(String[] args)
	{	
		int num1, num2=1, sum=0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.printf("%d��° ���� �Է�(-1 ����) :", num2);
			num1 = sc.nextInt();
			num2++;
			sum += num1;
		}
		while (num1!=-1);
			sum += 1;
		
		System.out.println();
		System.out.println("������� �Էµ� ������ �� : " + sum);
	}
}
*/
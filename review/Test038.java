/*����� ���� �帧�� ��Ʈ��(���) ������
- if ��
- if ~ else �� �ǽ�
==========================================*/
//����ڷκ��� ������ ���� 5���� �Է¹޾�
//¦����, Ȧ���� �հ踦 ����ϴ� ���α׷��� �����Ѵ�.
//��, Scanner�� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� 5�� �Է�(���� ����) : 1 2 3 4 5

// >> ¦���� ���� 6 �̰�, Ȧ���� ���� 9�Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
public class Test038
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int evenSum=0, oddSum=0;

		System.out.print("������ ���� 5�� �Է� : ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			
			if (arr[i]%2==0)
				evenSum += arr[i];
			else if (arr[i]%2!=0)
				oddSum += arr[i];
		}
		
		System.out.printf(">> ¦���� ���� %d�̰�, Ȧ���� ���� %d�Դϴ�.%n", evenSum, oddSum);

	}
}
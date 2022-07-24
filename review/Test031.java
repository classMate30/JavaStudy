/*=======================================
����� ���� �帧�� ��Ʈ��(���) ������
- if ��
- if ~ else �� �ǽ�
==========================================*/
// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//    if ��, if ~ else��, ���� ������, ���� if ��(if�� ��ø)
//    , switch ���� �ִ�.

// 2. if ���� if ������ ������ ���� ���
//    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ����� ��� ������ �������� ó���Ѵ�.

// 90�� �̻� : A
// 80�� �̻� 90�� �̸� : B
// 70�� �̻� 80�� �̸� : C
// 60�� �̻� 70�� �̸� : D
// 60�� �̸�		   : F

// ��, BufferedReader�� Ȱ���� �����͸� �Է¹��� �� �ֵ��� �ϸ�
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// �̸� �Է� : �ڿ���
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >>����� �̸��� �ڿ����Դϴ�.
// >>���� ������ 90,
// >>���� ������ 80,
// >>���� ������ 70,
// >>������ 240�̰�, ����� 80�Դϴ�.
// >>����� B�Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test031
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String name;
		char grade = 'F';
		int kor, eng, mat, tot;
		double avg;

		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3.0;
		if (avg>=90)
			grade = 'A';
		else if (avg>=80)
			grade = 'B';
		else if (avg>=70)
			grade = 'C';
		else if (avg>=60)
			grade = 'D';

		System.out.printf("%n>> ����� �̸��� %s�Դϴ�%n.",name);
		System.out.printf(">> ���� ������ %d%n", kor);
		System.out.printf(">> ���� ������ %d%n", eng);
		System.out.printf(">> ���� ������ %d%n", mat);
		System.out.printf(">> ������ %d , ����� %.2f%n", tot, avg);
		System.out.printf(">> ����� %c�Դϴ�%n", grade);
	}
}

//���� ���
/*
�̸� �Է� : ���¹�
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� ���¹��Դϴ�
.>> ���� ������ 90
>> ���� ������ 80
>> ���� ������ 70
>> ������ 240 , ����� 80.00
>> ����� B�Դϴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/
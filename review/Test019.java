/*=======================================
������ڹ� �⺻ ���α׷��� ������
-������ �ڷ���
-�ڹ��� �⺻ ����� : System.util.Scanner
==========================================*/
/* ��java.util.Scanner
	�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
	����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
	�ۼ��� ���� ��ū�� ��next()���޼ҵ带 ���
	�ٸ� ����(�ڷ���)�� ������ ��ȯ �� �� �ִ�.
*/

import java.util.Scanner;
public class Test019
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		System.out.print("�̸�,����,����,���� �Է�(��,������): ");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		System.out.println("\n>>�̸� : " + name);
		System.out.println(">> ���� : " + tot);

	}
}

//���� ���

/*
�̸�,����,����,���� �Է�(��,������): ���¹�,90,80,70

>>�̸� : ���¹�
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



*/
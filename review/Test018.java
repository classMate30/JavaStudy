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

public class Test018
{
	public static void main(String[] args)
	{
		java.util.Scanner sc =  new java.util.Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		System.out.print("�̸� ���� ���� ���� �Է�(���� ����) : ");
		// - ����ڰ� �Է��� �����͸� �� ������ �� ���� ��Ƴ���
		//StringŬ������ ���� �Ǹ� ���ڿ��� �پ��ϰ� ó�� ����������
		//���� �������� BufferedReader���� ��Ƴ��� ������ ��ĳ�ʿ��� �����ϴ�.

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + tot);


	}
}

//���� ���

/*
�̸� ���� ���� ���� �Է�(���� ����) : �躸�� 90 80 70

>> �̸� : �躸��
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
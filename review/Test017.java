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
public class Test017
{
	public static void main(String[] args)
	{	
		//Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat;

		System.out.print("�Է��� �̸� : " );
		name = sc.next();

		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();
		
		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();

		System.out.println();
		System.out.println(">> �̸� : " + name);
		//System.out.println(">> ���� : " + kor + eng + mat);
		//���ڿ� ���� ��
		System.out.println(">> ���� : " + (kor + eng + mat));
	
	}
}

//���� ���

/*
�Է��� �̸� : ���¹�
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

>> �̸� : ���¹�
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
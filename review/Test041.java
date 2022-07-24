/*����� ���� �帧�� ��Ʈ��(���) ������
- switch �� �ǽ�
==========================================*/
/*
��	���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
	���� ������ ���� �������� �б� �� �� ����ϴ� �����̴�.

��	���� �� ����
	switch(����)
	{
		case ���1 : ����1; [break;] //break�� �������� �������� �ִٴ� �ǹ���
		case ���2 : ����2; [break;] 
		case ���3 : ����3; [break;]
			:
		[default : ����n+1; [break;]
	}
	
	switch ���� �����ġ��� case�� ���������
	byte, short, int, long���̾�� �Ѵ�.

	case�� �ڿ� ��break;���� ���� ������ ���
	���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�.( �� �⺻ ��)
	��break;���� �����ϴ� ���
	�ش� �������� ������ ���� �� switch ���� ����������. ( �� �Ϲ� ��)

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test041
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, mat, tot;
		int avg;
		char grade = 'F';

		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("�������� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;

		avg = tot/3;

		switch (avg/10)
		{
		case 10: case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		}

		System.out.println();
		System.out.printf(">> ����� �̸��� %s�Դϴ�%n", name);
		System.out.printf(">> ������ %d, ����� %d�Դϴ�%n", tot, avg);
		System.out.printf(">> ����� %c�Դϴ�%n", grade);
	}
}

/*
�̸� �Է� : ���¹�
�������� �Է� : 50
�������� �Է� : 60
�������� �Է� : 1

>> ����� �̸��� ���¹��Դϴ�
>> ������ 111, ����� 37�Դϴ�
>> ����� F�Դϴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
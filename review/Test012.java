/*=====================================================
 ������ �ڹ��� ���� �� Ư¡ ������
 -������ �ڷ���
 -�ڹ� �⺻ ����� : BufferedReader Ŭ���� (�ڿ� ��� ���� �����ؼ� ���� ���)
=======================================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test012
{
	public static void main(String[] args) throws IOException
	{	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r;
		final double PI = 3.141592;
		double a,b;

		System.out.print("���� ������ �Է� : ");
		r = Integer.parseInt(br.readLine());

		a = r * r * PI;
		b = r * 2 * PI;

		System.out.printf(">> �������� %d�� ���� ���̴� %.2f�̸�%n", r, a);
		System.out.printf(">> �������� %d�� ���� �ѷ��� %.2f�̴�%n", r, b);


	}

}

//���� ���


/*
���� ������ �Է� : 45
>> �������� 45�� ���� ���̴� 6361.72�̸�
>> �������� 45�� ���� �ѷ��� 282.74�̴�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
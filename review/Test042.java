/*����� ���� �帧�� ��Ʈ��(���) ������
- switch �� �ǽ�
==========================================*/

//����ڷκ��� 1���� 3������ ���� �� �ϳ��� �Է¹޾�
//�Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
//��, �ΰ��� ������� ���� �� �� �ֵ��� �Ѵ�.

//�� switch���� �Ϲ� ���� ����Ͽ� �����Ѵ�.
//�� switch���� �⺻ ���� ����ϵ�,
//		��break���� �� �� ���� ����� �� �ֵ��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�
// ����Ϸ��� �ƹ�Ű�� ��������...

// ������ ���� �Է�(1~3) : 2
// �ڡ�
// ����Ϸ��� �ƹ�Ű�� ��������...

// ������ ���� �Է�(1~3) : 1
// ��
// ����Ϸ��� �ƹ�Ű�� ��������...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());
		
		switch (n)
		{
		case 3: System.out.print("��");
		case 2: System.out.print("��");
		case 1: System.out.print("��");break;
		default: System.out.print("�Է� ����~!!!");
		}
		System.out.println();
		
		/*
		switch(n)
		{
			case 3: System.out.println("�ڡڡ�");break;
			case 2: System.out.println("�ڡ�");break;
			case 1: System.out.println("��");break;
			default: System.out.println("�Է¿���~!!!"); // break;
		}
		*/
	}

}

//���� ���
/*
������ ���� �Է�(1~3) : 3
�ڡڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
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
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;

		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());

		switch(n)
		{
			case 1: System.out.println("��");break;
			case 2: System.out.println("�ڡ�");break;
			case 3: System.out.println("�ڡڡ�");break;
			default: System.out.println("�Է¿���~!!!"); // break;
		}
		//System.out.println("����ġ ���� ����");

		switch (n)
		{
			case 3: System.out.print("��");
			case 2: System.out.print("��");
			case 1: System.out.print("��\n");
				break;
			default: System.out.println("�Է¿���~!!!"); 
		
		}

	}
}
*/


import java.io.IOException;
public class Test042
{
	public static void main(String[] args) throws IOException
	{
		int num;
		String result= "�Ǻ� �Ұ�";

		System.out.print("������ ���� �Է�(1~3) : ");
		num = System.in.read();
		
		switch(num)
		{
		case 51: result = "�ڡڡ�"; break;
		case 50: result = "�ڡ�"; break;
		case 49: result = "��";
		}

		System.out.println(result);
	}
}

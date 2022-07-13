/*==========================================
   ���� �迭 ����
   - �迭�� ����� �ʱ�ȭ
   - �迭�� �⺻�� Ȱ��
=========================================*/

// ����ڷκ��� �ο����� �Է¹ް�
// �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
// �̷��� �Է¹��� �����͸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
// ����� ����� �� �ִ� ���α׷��� �����Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) :	27
// �Է� ó���� �л� �� �Է�(��, 1~10) : -5
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ���̰� 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ������ 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : �ֳ��� 010-3333-3333

//-------------------
// ��ü �л� �� : 3
//-------------------
// �̸�		��ȭ��ȣ
//���̰�    010-1111-1111
//������	010-2222-2222
//�ֳ���	010-3333-3333
//-------------------
//����Ϸ��� �ƹ� Ű�� ��������...


//�����м�
/*
1.�Է��� �޾ƿðǵ� ������ ���� �ʴٸ� �ݺ� ��ų �� (���۵帮��) / (do~while Ȱ��)

2.�ι�° �̸��� ���� �����ؼ� �Է��� �޾ƿ� ���̹Ƿ� (��ĳ�� Ȱ��)
	�޾ƿ��°� ���ڿ� Ÿ���ΰ�? �迭�� �����Ѵٸ� ��Ʈ�� �迭�� �ִ°ǰ�?

3.�޾ƿ� ���� ���� ��� ���� ��

*/
import java.util.Scanner;

public class Test082
{
	public static void main(String[] args)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		// ����ڰ� �Է��ϴ� �л� ���� ��Ƴ� ����
		int memberCount = 0;
		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memberCount = sc.nextInt();
		}
		while (memberCount<1 || memberCount>10);

		// �׽�Ʈ(Ȯ��)
		//System.out.println("����ڰ� �Է��� �ο� �� : " + memberCount);
		//--==>> ����ڰ� �Է��� �ο� �� : 5

		// ����ڰ� �Է��� �ο� ���� ����
		// �̸� �迭�� ��ȭ��ȣ �迭�� �����ؾ� �Ѵ�.

		// �ο� �� ��ŭ�� �̸� ���� �迭 ����
		String[] names = new String[memberCount];

		// �ο� �� ��ŭ�� ��ȭ��ȣ ���� �迭 ����
		String[] tels = new String[memberCount];
		//String[] tels = new String[names.length];

		// �ο� �� ��ŭ�� �ȳ� �޼��� ���
		for (int i=0; i<tels.length; i++)	//i<names.length�� ���� /    i<memberCount�� ����
		{
			System.out.printf("�̸� ��ȭ��ȣ ���[%d](���� ����) :", (i+1));
			//���� 010-1111-1111
			//------
			names[i] = sc.next();
			//���� 010-1111-1111
			//       -------------
			tels[i] = sc.next();

		}

		//���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println();
		System.out.println("-------------------");
		System.out.printf("��ü �л� �� : %d��\n", memberCount);
		//memberCount == names.length == tels.length
		System.out.println("-------------------");
		System.out.println("�̸� ��ȭ��ȣ");
		
		//�л� ����Ʈ �ݺ� ���
		for (int i=0; i<memberCount; i++)
		{
			System.out.printf("%3s %4s\n", names[i], tels[i]);
		}



		System.out.println("-------------------");

	


	}
}

//���� ���
/*

-------------------
��ü �л� �� : 4��
-------------------
�̸� ��ȭ��ȣ
������ 010-1111-2222
���¹� 010-2222-3333
�ڿ��� 010-4444-4444
������ 010-5555-5555
-------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/



/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Test082
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		//�޾ƿ��� ��(٣)
		int n;		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : " );
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>10);
		
		String[] arr1 = new String[n];
		String[] arr2 = new String[n];

		for (int i=0; i<arr1.length; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", i);
			arr1[i] = sc.next();
			arr2[i] = sc.next();
		}

		System.out.println();
		System.out.println("------------------");
		System.out.printf("��ü �л��� : %d%n", n);
		System.out.println("------------------");
		System.out.println(" �̸�	��ȭ��ȣ");
		for (int i=0; i<arr1.length; i++)
		{
			System.out.printf("%s \t %s\n",arr1[i],arr2[i]);
		}
		System.out.println("------------------");

	}
	
}

//-------------------
// ��ü �л� �� : 3
//-------------------
// �̸�		��ȭ��ȣ
//���̰�    010-1111-1111
//������	010-2222-2222
//�ֳ���	010-3333-3333
//-------------------
//����Ϸ��� �ƹ� Ű�� ��������...

*/
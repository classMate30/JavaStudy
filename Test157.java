/*=============================================
       ���� �÷��� (Collection) ����
=============================================*/	
import java.util.Queue;
import java.util.LinkedList;
public class Test157
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors =
		{"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{	
		//Queue �ڷᱸ�� ����
		//Queue<String> qu = new LinkedList<String>();
		//-- Queue �������̽� ����� �ν��Ͻ��� �����ϱ� ���ؼ���
		//	 new �����ڸ� �̿��Ͽ� Queue �������̽��� implements ��
		//	 ���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�
		Queue<String> qu = new LinkedList<String>();
		//qu ��� Queue �ڷᱸ���� 
		//colors �迭�� ������ �Է�	
		for (String color : colors)
			qu.offer(color);
		
		//qu ��� Queue �ڷᱸ���� ��� ������ ��ü ���
		while (qu.peek() != null)
			System.out.print(qu.poll()+ " ");
		System.out.println();
	}
}
//���� ���
/*
���� ��� �ʷ� �Ķ� ���� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
		
		
//	}
//}






/*
import java.util.Queue;
import java.util.LinkedList;
public class Test157
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors =
		{"����", "���", "�ʷ�", "�Ķ�", "����", "����"};
	String val;
	Test157()
	{
		
		Queue<String> qu = new LinkedList<String>();
		for (int i=0; i<colors.length; i++)
		{
			qu.offer(colors[i]);
		}

		while (!qu.isEmpty())
		{
			val =(String)qu.poll();
			System.out.println("��� : " + val);
		}

	}

	public static void main(String[] args)
	{
		//Queue �ڷᱸ�� ����
		//Queue<String> qu = new LinkedList<String>();
		//-- Queue �������̽� ����� �ν��Ͻ��� �����ϱ� ���ؼ���
		//	 new �����ڸ� �̿��Ͽ� Queue �������̽��� implements ��
		//	 ���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�

		//qu ��� Queue �ڷᱸ���� 
		//colors �迭�� ������ �Է�
		/*
		for (int i=0; i<colors.length; i++)
		{
			qu.offer(colors[i]);
		}
		*/

		//qu ��� Queue �ڷᱸ���� ��� ������ ��ü ���
		//new Test157();

		
//	}
//}

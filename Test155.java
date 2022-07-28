/*=============================================
       ���� �÷��� (Collection) ����
=============================================*/	
import java.util.Stack;

public class Test155
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors =
		{"����", "���", "�ʷ�", "�Ķ�", "����", "����"};
	
	//������
	public Test155()
	{	
		//st��� Stack �ڷᱸ�� ����
		//���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� �� ��<String>��
		Stack<String> st = new Stack<String>();
		
		//st��� Stack �ڷᱸ���� ������(colors) ���
		//st = colors; //(X)
		
		//st.push(colors[0])			//st.add(colors[0])
		//st.push(colors[1])			//st.add(colors[1])
		//st.push(colors[2])			//st.add(colors[2])
		//st.push(colors[3])			//st.add(colors[3])
		//st.push(colors[4])			//st.add(colors[4])
		//st.push(colors[5])			//st.add(colors[5])
		
		/*
		for (int i=0; i<colors.length; i++)
		{
			st.push(colors[i]);		//st.add(colors[i]);
		}
		*/

		for (String color : colors)
		{
			st.push(color);		//st.add(color);
		}
		st.push("����");

		//st.push(10);
		//st.push(10.0);
		//���׸� ǥ���� ������ �ȵǴ� ����
		//--==>> ���� �߻�(������ ����)
		//-- ���׸� ǥ������ ���� �����ϰ� �ִ�
		//	 String�� �ƴ� �ٸ� �ڷ���(int�� double)��
		//	 ���� �ڷᱸ�� st�� push()�Ϸ��� �߱� ������...


		//��� �޼ҵ� ȣ��
		popStack(st);
		

	}

	//��¸޼ҵ�
	private void popStack(Stack<String> st)			//Check~!!!!!! ó������ϴ� �����̴� ��Ȯ��
	{
		System.out.print("pop : ");
		while(!st.empty())		//isEmpty()
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		new Test155();

	}
}

//���� ���

/*
pop : ���� ���� �Ķ� �ʷ� ��� ����
*/

/*
pop : ���� ���� ���� �Ķ� �ʷ� ��� ����
*/

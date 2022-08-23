import java.util.Scanner;
public class Boj17478
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recursive(n,cnt);
	}

	public static void recursive(int n, int cnt)
	{
		StringBuilder undBar = new StringBuilder();
		for (int i=0; i<cnt * 4; i++)
		{
			undBar.append("_");
		}
		if (n==0)
		{
			System.out.println(undBar + "\"����Լ��� ������?\"");
			System.out.println(undBar + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(undBar + "��� �亯�Ͽ���.");
			return;
		}
		System.out.println(undBar +"\"����Լ��� ������?\"");
		System.out.println(undBar +"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(undBar +"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(undBar +"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
//		System.out.println("��� �亯�Ͽ���.");
//		undBar += "____";
		recursive(n-1,++cnt);  //cnt++ �ȵ�
		System.out.println(undBar +"��� �亯�Ͽ���.");

	
	}
}

/*
��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.
"����Լ��� ������?"
"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.
���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.
���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������."
____"����Լ��� ������?"
____"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.
____���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.
____���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������."
________"����Լ��� ������?"
________"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����"
________��� �亯�Ͽ���.
____��� �亯�Ͽ���.
��� �亯�Ͽ���.
*/
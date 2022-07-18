/*======================================
   ���� Ŭ������ �ν��Ͻ� ����
   - Ŭ������ �ν��Ͻ� Ȱ��
=======================================*/

// 1 ~ 3 ������ ������ �߻����Ѽ�
// ����, ����, �� ���α׷��� �����Ѵ�
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���� �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

// �� ���ص����� �� 1:���� 2:���� 3:��


// ���� ��)
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 4
// 1:����, 2:����, 3:�� �� �Է�(1~3) : -2
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 2

// - ����	: ����
// - ��ǻ�� : ��

// >> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~~!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ����(1)�϶�
//	���� - ��ǻ��
// ��ǻ�͹���(2) �� -1 (��ǻ�Ͱ� �̱�) / ��ǻ�ͺ�(3) �� -2 (��ǻ�Ͱ� ��) / 0 ���

// ������ ����(2)�϶�
// ���� - ��ǻ��
// ��ǻ�Ͱ���(1) �� 1 (��ǻ�Ͱ� ��) / ��ǻ�ͺ�(3) �� -1 (��ǻ�Ͱ� �̱�) / 0 ���

// ������ ��(3)�϶�
// ���� - ��ǻ��
// ��ǻ�Ͱ���(1) �� -2(��ǻ�Ͱ� �̱�) / ��ǻ�͹���(2) �� (��ǻ�Ͱ� ��) / 0 ���

import java.util.Scanner;
import java.util.Random;
class RspGame
{
	private int user;
	private int com;

	// ��ǻ���� ����������
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;
	}

	public void input()
	{
		//������ ���������� �ϱ� ����... ��ǻ��(������) ���� ����������
		runCom();

		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
		
	}

	//�߰� ��� ���
	public void middleCalc()
	{
		String[] str = {"����", "����", "��"};

		System.out.println();
		System.out.println(" - ����		:" +str[user-1]);
		System.out.println(" - ��ǻ��	:" +str[com-1]);
	}
	
	//�ºο� ���� ���� ��� ����
	public String resultCalc()
	{
		String result = "���º� ��Ȳ�Դϴ�~!!!";

		//(����=="����" && ��=="��") || (����=="����" && �� =="����") || (����=="��" && ��=="����")
		if ((user==1 && com==3) || (user==2 && com ==1) || (user==3 && com==2))
		{
			result = "����� �¸��߽��ϴ�~!!!!";		
		}
		
		//(����=="����" && ��=="����") || (����=="����" && �� =="��") || (����=="��" && ��=="����")
		else if ((user==1 && com==2) || (user==2 && com ==3) || (user==3 && com==1))
		{
			result = "��ǻ�Ͱ� �¸��߽��ϴ�~!!!";
		}
		
		return result;

	}

	//��� ���
	void print(String str)
	{
		System.out.printf("\n>> �º� ���� ��� : %s\n", str);
	}
}

public class Test102
{
	public static void main(String[] args)
	{
	RspGame ob = new RspGame();

	ob.input();
	ob.middleCalc();
	String result = ob.resultCalc();
	ob.print(result);
	}
}



/*
import java.util.Scanner;
import java.util.Random;
public class Test102
{	
	int user;
	int com;

	String result[] = {"��ǻ�Ͱ� �̰���ϴ�~!!!" , "��ǻ�Ͱ� �����ϴ�~!!!", "�����ϴ�~!!!"};
	
	//����� ����,����,�� �� �Ѱ��� �Է� �޾ƿ´�
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}

		while (user <1 || user >3);
	}

	//������ �߻����Ѽ� ������ ��ǻ�� ������ �ºθ� ����Ѵ�

	String rspGame()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;
		// ������ ����(1)�϶�
		//	���� - ��ǻ��
		// ��ǻ�͹���(2) �� -1 (��ǻ�Ͱ� �̱�) / ��ǻ�ͺ�(3) �� -2 (��ǻ�Ͱ� ��) / 0 ���
		if (user==1)
		{
			if (user - com == -1)
				return result[0];
			else if (user - com == -2)
				return result[1];
			else 
				return result[2];
		}

		// ������ ����(2)�϶�
		// ���� - ��ǻ��
		// ��ǻ�Ͱ���(1) �� 1 (��ǻ�Ͱ� ��) / ��ǻ�ͺ�(3) �� -1 (��ǻ�Ͱ� �̱�) / 0 ���
		else if (user==2)
		{
			if (user - com == -1)
				return result[0];
			else if (user - com == 1)
				return result[1];
			else 
				return result[2];
		}
		

		// ������ ��(3)�϶�
		// ���� - ��ǻ��
		// ��ǻ�Ͱ���(1) �� 2(��ǻ�Ͱ� �̱�) / ��ǻ�͹���(2) �� 1(��ǻ�Ͱ� ��) / 0 ���

		else if (user==3)
		{
			if (user - com == 2)
				return result[0];
			else if (user - com == 1)
				return result[1];
			else 
				return result[2];
		}
	}

	void print(String[] rsp)
	{
		System.out.println();
		System.out.printf(">> �º� ���� ��� : %s", rspGame);
	}



	public static void main(String[] args)
	{
		
	}
}
*/
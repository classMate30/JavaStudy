
import java.util.Scanner;
import java.util.Random;
class Rsp
{	
	int user;
	int com;
	
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
		String result[] = {"��ǻ�Ͱ� �̰���ϴ�~!!!" , "��ǻ�Ͱ� �����ϴ�~!!!", "�����ϴ�~!!!"};
		String result1 = "�߸� �Է� ";
		Random rd = new Random();
		com = rd.nextInt(3)+1;
		// ������ ����(1)�϶�
		//	���� - ��ǻ��
		// ��ǻ�͹���(2) �� -1 (��ǻ�Ͱ� �̱�) / ��ǻ�ͺ�(3) �� -2 (��ǻ�Ͱ� ��) / 0 ���
		if (user==1)
		{
			if (user - com == -1)
				result1 = result[0];
			else if (user - com == -2)
				result1= result[1];
			else 
				result1= result[2];
			return result1;
		}

		// ������ ����(2)�϶�
		// ���� - ��ǻ��
		// ��ǻ�Ͱ���(1) �� 1 (��ǻ�Ͱ� ��) / ��ǻ�ͺ�(3) �� -1 (��ǻ�Ͱ� �̱�) / 0 ���
		else if (user==2)
		{
			if (user - com == -1)
				result1= result[0];
			else if (user - com == 1)
				result1= result[1];
			else 
				result1= result[2];
			return result1;
		}
		

		// ������ ��(3)�϶�
		// ���� - ��ǻ��
		// ��ǻ�Ͱ���(1) �� 2(��ǻ�Ͱ� �̱�) / ��ǻ�͹���(2) �� 1(��ǻ�Ͱ� ��) / 0 ���

		else if (user==3)
		{
			if (user - com == 2)
				result1= result[0];
			else if (user - com == 1)
				result1= result[1];
			else 
				result1= result[2];
		return result1;
		}

	return result1;
	}

	
	public void print(String str)
	{
		System.out.println();
		System.out.printf(">> �º� ���� ��� : %s", str);
		System.out.println();
	}


}
public class TTest102
{
	public static void main(String[] args)
	{
		Rsp rsp = new Rsp();
		rsp.input();
		String result1 =rsp.rspGame();
		rsp.print(result1);

	}
}
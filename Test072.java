/*==========================================
����� Ŭ������ �ν��Ͻ�������
==========================================*/
//����ڷκ��� ������ ������ �Է¹޾�
//1���� �Է¹��� �� ������ ���� �����Ͽ�
//������� ����ϴ� ���α׷��� �����Ѵ�.

//��, ���ݱ���ó�� main() �޼ҵ忡 ��� ����� �����ϴ� ���� �ƴ϶�
//Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
//(Hap Ŭ���� ����)
//����, ������ �Է� ó�� �������� BufferedReader�� readLine()�� ����ϸ�,
//�Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
//�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� �Է�(1~1000): 1050
//������ ���� �Է�(1~1000): -45
//������ ���� �Է�(1~1000): 100
// >> 1 ~ 100������ �� : 5050
//����Ϸ��� �ƹ� Ű�� ��������...




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap 
{
	//�ֿ� ���� ����
	int n, i=1, s=0;
			//i�� while�Ϸ��� ���� ��������
	//�Է� �޾ƿ� �޼ҵ�
	void input() throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>1000);
		
	}
	// ���� ó�� �޼ҵ� ����
	int calculate()
	{
		int result = 0;
		
		for (int i=1; i<=n; i++)
			result += i;
		
		return result;
	}
	/*
	int sum()
	{
		while (i!=(n+1))
		{
			s += i;
			i++;			
		}
		return s;
		
	}
	*/
	void print(int a)
	{
		System.out.printf(">> 1 ~ %d������ �� : %d%n ", n, a);
	}


}


public class Test072
{
	public static void main(String[] args) throws IOException
	{	
		// Hap �ν��Ͻ� ����
		Hap ob = new Hap();
		
		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� input()
		// -----------------
		//	 �������� Ȱ��
		// Ŭ������ �̸����� �ٸ� �޼ҵ带 ȣ���ؿ��� ������ �����߱⿡
		// ���������� ���ؼ� �޼ҵ� ȣ��

		ob.input();			//-- new Hap().input();	
		
		//������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� �� calculate()
		//int s = ob.calculate();

		//int sum = ob.calculate();

		//������ �ν��Ͻ�(ob)�� ���� ��� �޼ҵ� ȣ�� �� print()
		//ob.print(s);
		
		ob.print(ob.calculate());
		//���� ó�� �ص� ������ �̷��� �ص���!

		//ob.print(sum);
		
	}
}

/*
������ ���� �Է�(1~1000) : 1050
������ ���� �Է�(1~1000) : -45
������ ���� �Է�(1~1000) : 200
>> 1 ~ 200������ �� : 20100
 ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
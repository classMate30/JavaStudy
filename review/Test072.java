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
	int n, result=0;
			//i�� while�Ϸ��� ���� ��������
	//�Է� �޾ƿ� �޼ҵ�
	void input() throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("������ ���� �Է� : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>1000);
	}

	int cal()
	{	
		//int result = 0; // �̷��� ���̴� ���� ���������� �ǹ����ǰ�? ���� ��� 0�̳���
		for (int i=1; i<=n; i++)
			result += i;
		return result;
	}
	
	void print(int a)
	{
		System.out.printf("1 ~ %d ������ �� : %d%n", n, result);
	}
}


public class Test072
{
	public static void main(String[] args) throws IOException
	{
		Hap h = new Hap();
		h.input();
		//int sum = h.cal();
		//h.print(sum);
		h.print(h.cal());
	}
}
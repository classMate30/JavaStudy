import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	int r;
	final double PI = 3.141592;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}

	double calArea()
	{
		return r * r * PI;
	}
	
	double calLength()
	{
		double result;
		result = r * 2 * PI;
		return result;
	}

	void print(double a, double b)
	{
		System.out.printf(">> �������� %d�� ����\n", r);
		System.out.printf(">> ���� : %f\n", a);
		System.out.printf(">> �ѷ� : %f\n", b);
	}

}
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
		System.out.print("반지름 입력 : ");
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
		System.out.printf(">> 반지름이 %d인 원의\n", r);
		System.out.printf(">> 넓이 : %f\n", a);
		System.out.printf(">> 둘레 : %f\n", b);
	}

}
/*==========================================
■■■■ 클래스와 인스턴스■■■■■
==========================================*/
//사용자로부터 임의의 정수를 입력받아
//1부터 입력받은 수 까지의 합을 연산하여
//결과값을 출력하는 프로그램을 구현한다.

//단, 지금까지처럼 main() 메소드에 모든 기능을 적용하는 것이 아니라
//클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
//(Hap 클래스 설계)
//또한, 데이터 입력 처리 과정에서 BufferedReader의 readLine()을 사용하며,
//입력 데이터가 1보다 작거나 1000보다 큰 경우
//다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

//실행 예)
//임의의 정수 입력(1~1000): 1050
//임의의 정수 입력(1~1000): -45
//임의의 정수 입력(1~1000): 100
// >> 1 ~ 100까지의 합 : 5050
//계속하려면 아무 키나 누르세요...




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap 
{
	//주요 변수 선언
	int n, result=0;
			//i는 while하려고 돌린 루프변수
	//입력 받아올 메소드
	void input() throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("임의의 정수 입력 : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>1000);
	}

	int cal()
	{	
		//int result = 0; // 이렇게 붙이는 순간 지역변수가 되버린건가? 값이 계속 0이나옴
		for (int i=1; i<=n; i++)
			result += i;
		return result;
	}
	
	void print(int a)
	{
		System.out.printf("1 ~ %d 까지의 합 : %d%n", n, result);
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
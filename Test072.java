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
	int n, i=1, s=0;
			//i는 while하려고 돌린 루프변수
	//입력 받아올 메소드
	void input() throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>1000);
		
	}
	// 연산 처리 메소드 정의
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
		System.out.printf(">> 1 ~ %d까지의 합 : %d%n ", n, a);
	}


}


public class Test072
{
	public static void main(String[] args) throws IOException
	{	
		// Hap 인스턴스 생성
		Hap ob = new Hap();
		
		// 생성한 인스턴스를 통해 입력 메소드 호출 → input()
		// -----------------
		//	 참조변수 활용
		// 클래스의 이름으로 다른 메소드를 호출해오는 문법을 선점했기에
		// 참조변수를 통해서 메소드 호출

		ob.input();			//-- new Hap().input();	
		
		//생성한 인스턴스를 통해 연산 처리 메소드 호출 → calculate()
		//int s = ob.calculate();

		//int sum = ob.calculate();

		//생성한 인스턴스(ob)를 통해 출력 메소드 호출 → print()
		//ob.print(s);
		
		ob.print(ob.calculate());
		//위에 처럼 해도 되지만 이렇게 해도됨!

		//ob.print(sum);
		
	}
}

/*
임의의 정수 입력(1~1000) : 1050
임의의 정수 입력(1~1000) : -45
임의의 정수 입력(1~1000) : 200
>> 1 ~ 200까지의 합 : 20100
 계속하려면 아무 키나 누르십시오 . . .
*/
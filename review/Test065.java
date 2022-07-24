/*==========================================
■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
==========================================*/

// break 실습

//※ break 키워드가 지니는 의미
//	 멈춘다 + (그리고 빠져나간다)

//다음과 같은 처리가 이루어지는 프로그램을 구현한다.
//단, 입력받는 정수는 1 ~ 100 범위안에서만 
//가능하도록 작성한다.

//실행 예)

//임의의 정수 입력 : -10

//임의의 정수 입력 : 0

//임의의 정수 입력 : 2022

//임의의 정수 입력 :10

//1~10까지의 합 : 55	
//계속 하시겠습니까(Y/N) : y

//임의의 정수 입력 : 100
//>> 1~100까지의 합 : 5050
//계속 하시겠습니까(Y/N) : N
//계속하려면 아무키나 누르세요...→ 프로그램 종료


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test065
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,s=0;
		char ch;
		while (true)
		{
			do
			{
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			for (int i=1; i<=n; i++)
			{
				s += i;
			}
			System.out.printf(">> 1 ~ %d까지의 합 : %d%n", n, s);

			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch = (char)System.in.read();

			if (ch!='Y' && ch!='y')
			{
				break;
			}
			
			System.in.skip(2);


		}

	}
}

//실행 결과
/*
임의의 정수 입력 : 20
>> 1 ~ 20까지의 합 : 210
계속하시겠습니까(Y/N)? : y
임의의 정수 입력 : 30
>> 1 ~ 30까지의 합 : 675
계속하시겠습니까(Y/N)? : Y
임의의 정수 입력 : 50
>> 1 ~ 50까지의 합 : 1950
계속하시겠습니까(Y/N)? : N
계속하려면 아무 키나 누르십시오 . . .
*/
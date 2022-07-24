/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- 반복문(while문) 실습
==========================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// ※ 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도
//			 나누어 떨어지지 않는 수
//			 단, 1은 소수 아님

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수아님
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 11
// 11 → 소수
// 계속하려면 아무 키나 누르세요...

// 소수의 정의 : 1과 자신만을 인수로 가진 수


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=2;
		int num;
		boolean flag = true;

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		while (n<num)
		{
			if (num%n==0)
			{
				flag = false;
				break;
			}
			n++;

		}
		
		if (flag && num!=1)
			System.out.printf("%d → 소수%n", num);
		else
			System.out.printf("%d → 소수 아님%n", num);

	}
}

/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- 반복문(while문) 실습
==========================================*/

// 사용자로부터 임의의 두 정수를 입력받아
// 입력받은 두 정수 중
// 작은 수 부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 :100
// 두 번째 정수 입력 :200
// >> 100 ~ 200까지의 합 : xxxx
// 계속하려면 아무키나 누르세요...

// 첫 번째 정수 입력 :1000
// 두 번째 정수 입력 : 2
// >> 2~1000 까지의 합 : xxxx
// 계속하려면 아무키나 누르세요...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		int su1, su2;
		int result=0;

		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());

		if (su1>su2)
		{
			su1 = su1 ^ su2;
			su2 = su2 ^ su1;
			su1 = su1 ^ su2;
		}
		
		n = su1;
		while (n<=su2)
		{
			result += n;
			n++;
		}

		System.out.printf("%d ~ %d까지의 합 : %d%n", su1, su2, result);
	}
}


//실행 결과

/*

첫 번째 정수 입력 : 1
두 번째 정수 입력 : 100
1 ~ 100까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .



첫 번째 정수 입력 : 200
두 번째 정수 입력 : 100
100 ~ 200까지의 합 : 15150
계속하려면 아무 키나 누르십시오 . . .


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, max=0, min=0;
		int sum=0;


		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		if (num1 >= num2)
		{
			max = num1;
			min = num2;
		}
		else if (num2 > num1) // else if 쓰면 안되고 else는 되는이유??????????????????
		{						//else로 끝나지 않고 else if로 끝나면 변수를 초기화해줘야 한다.
			max = num2;
			min = num1;
		}
		
		//루프변수 i를 통해 while문을 돌릴 것
		int i = min;
		while (i <= max)
		{
			sum += i;
			i++;
		}
		System.out.printf("%d ~ %d까지의 합 : %d%n", min, max, sum);

	}
}

*/
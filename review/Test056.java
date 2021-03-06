/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- 반복문(do~while문) 실습
==========================================*/

// 사용자로부터 여러 개의 양의 정수를 입력받고,
// 그 합을 계산하여 출력하는 프로그램을 작성한다
// 단, -1이 입력되는 순간 입력 행위를 중지하고
// 그동안 입력된 정수의 합을 출력해주는 프로그램을 구현한다.
// 즉, -1이 입력 중지 커맨드로 활용한다.
// do~while 문을 활용하여 문제를 해결할 수 있도록 한다.

// 실행 예)
// 1번째 정수 입력(-1 종료) : 10
// 2번째 정수 입력(-1 종료) : 5
// 3번째 정수 입력(-1 종료) : 8
// 4번째 정수 입력(-1 종료) : 9
// 5번째 정수 입력(-1 종료) : -1

// 현재까지 입력된 정수의 합 : 32
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,i=1, sum=0;
		
		do
		{
			System.out.printf("%d 번째 정수 입력(-1 종료) : ",i);
			n = Integer.parseInt(br.readLine());
			sum += n;
			i++;
		}
		while (n!=-1);

		sum += 1;

		System.out.println("현재까지 입력된 정수의 합 : " + sum);
	}

}

//실행 결과

/*
1 번째 정수 입력(-1 종료) : 10
2 번째 정수 입력(-1 종료) : 10
3 번째 정수 입력(-1 종료) : 10
4 번째 정수 입력(-1 종료) : -1
현재까지 입력된 정수의 합 : 30
계속하려면 아무 키나 누르십시오 . . .
*/
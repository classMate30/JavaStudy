/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- 반복문 실습 및 관찰
==========================================*/

/*
○	반복문의 개요

	주어진 조건이 『참』일 경우
	일정한 영역의 문장을 반복 수행하다가 
	조건식이 거짓이 되는 순간이 오면,
	반복 수행을 중단하는 문장이다.
	이러한 반복문에는 『while』,『do~while』,『for』문 등이 있으며
	반복의 제어를 위해 『break』,『continue』문을
	사용하는 경우가 있다

○	while 문
	조건식을 먼저 비교하여
	조건식의 처리 결과가 참인 경우, 특정 영역을 반복 수행하는 문장으로
	반복 횟수가 정해져 있지 않은 경우나
	반복 횟수가 많은 경우 주로 사용한다.
	while 문은 조건이 맞지 않은 경우
	반복은 커녕 단 한 번도 실행되지 않을 수 있다

○	while 문의 형식 및 구조

	while(조건식)
	{
		실행문;
	}

*/


public class Test044
{
	public static void main(String[] args)
	{
		int n=0;
		
		while (n<=10)
		{
			System.out.println("n=" +n);
			n++;
		}


		
		int a=0;
		
		while (a<=10)
		{
			a++;
			System.out.println("a=" +a);
			
		}

		int b=0;
		
		while (b++<=10)
		{
			System.out.println("b="+ ++b);
		}

		int c=1;
		while (c<10)
		{
			System.out.println("c=" +c);
			c++;
		}

		int h = 1, sum=0;
		while (h<=100)
		{
			sum += h;
			h++;
		}
		System.out.println("1부터 100까지의 합은 : " +sum);
	
	}
}
//실행결과 
/*
n=0
n=1
n=2
n=3
n=4
n=5
n=6
n=7
n=8
n=9
n=10
a=1
a=2
a=3
a=4
a=5
a=6
a=7
a=8
a=9
a=10
a=11
b=2
b=4
b=6
b=8
b=10
b=12
c=1
c=2
c=3
c=4
c=5
c=6
c=7
c=8
c=9
1부터 100까지의 합은 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/
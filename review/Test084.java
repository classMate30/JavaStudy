/*==========================================
   ■■■ 배열 ■■■
   - 배열의 선언과 초기화
   - 배열의 기본적 활용
=========================================*/

// ○ 과제
//	  사용자로부터 임의의 학생 수를 입력받고
//	  그만큼의 점수(정수 형태)를 입력받아
//	  전체 학생 점수의 합, 평균, 편차를 구해서 
//	  결과를 출력하는 프로그램을 구현한다.

//	실행 예)
//	학생 수 입력 : 5
//	1번 학생의 점수 입력 : 90
//  2번 학생의 점수 입력 : 82 
//	3번 학생의 점수 입력 : 64
//	4번 학생의 점수 입력 : 36
//	5번 학생의 점수 입력 : 98

//	>> 합 : 370
//	>> 평균 : 74.0
//	>> 편차
//	90 : -16.0
//	82 : -8.0
//	64 : 10.0
//	36 : 38.0
//	98 : -24.0
// 계속하려면 아무 키나 누르세요...

//Scanner 활용해서 다시 한번 해볼 것

import java.util.Scanner;
public class Test084
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n;
		int sum=0;
		double avg;
		System.out.print("학생 수 입력 : ");
		n = sc.nextInt();

		int[] arr = new int[n];
		for (int i=0; i<n; i++)
		{
			System.out.print((i+1) + "번 학생의 점수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		avg = (double)sum / n;

		double dev[] = new double[n];
		for (int i=0; i<arr.length; i++)
			dev[i] = avg - arr[i];

		System.out.printf("%n >> 합 : %d%n", sum);
		System.out.printf(" >> 평균 : %f%n", avg);
		System.out.printf(" >> 편차 : %n");
		for (int i=0 ; i<arr.length; i++)
		{
			System.out.printf("%d : %f%n",arr[i], dev[i]);
		}


	}
}

//실행 결과
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 80
3번 학생의 점수 입력 : 70
4번 학생의 점수 입력 : 60
5번 학생의 점수 입력 : 50

 >> 합 : 350
 >> 평균 : 70.000000
 >> 편차 :
90 : -20.000000
80 : -10.000000
70 : 0.000000
60 : 10.000000
50 : 20.000000
계속하려면 아무 키나 누르십시오 . . .
*/
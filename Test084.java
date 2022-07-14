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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test084
{
	public static void main(String[] args)	throws IOException
	{
		//주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int studentNum,sum=0;
		double avg;
		
		//사용자에게 입력을 받아옴
		System.out.print("학생 수 입력 : ");
		studentNum = Integer.parseInt(br.readLine());
		

		//입력 값을 배열에 저장
		int[] scoresArr = new int[studentNum];
		for (int i=0; i<scoresArr.length; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", i+1);
			scoresArr[i] = Integer.parseInt(br.readLine());
			//누적 합 구하기
			sum += scoresArr[i];
		}
		
		avg = (double)sum / studentNum;
		
		//편차 구하기
		double dev[] = new double[studentNum];
		for (int i=0; i<scoresArr.length; i++)
			dev[i] = avg - scoresArr[i];

		
		//결과 출력하기
		System.out.printf("\n >> 합 : %d%n", sum);
		System.out.printf(" >> 평균 : %f%n", avg);
		System.out.println(" >> 편차");
		for (int i=0; i<scoresArr.length; i++)
			System.out.printf("%d : %f %n", scoresArr[i], dev[i]);
		
			
		


	}
}

//실행 결과 
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

 >> 합 : 370
 >> 평균 : 74.000000
 >> 편차
90 : -16.000000
82 : -8.000000
64 : 10.000000
36 : 38.000000
98 : -24.000000
계속하려면 아무 키나 누르십시오 . . .
*/
/*======================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스와 인스턴스 활용
=======================================*/

//	2. Sungjuck 클래스
//	- 인원 수를 입력받아, 입력받은 인원 수 만큼
//	  이름, 국어점수, 영어점수, 수학점수를 입력받고
//	  총점과 평균을 산출하는 클래스로 설계할 것~!!!
//	  - 속성 : 인원수, Record 타입의 배열
//	  - 기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력


// 1. 속성으로 인원수 변수와 Record클래스의 객체 배열을 생성해야한다...?
// 2. 메소드 기능들을 구현할 것
//		→인원수 입력 메소드/데이터 입력 메소드 (입력 메소드)
//		→														(데이터 입력 메소드)
//		→총점 및 평균 연산 메소드
//		→결과 출력 메소드

import java.util.Scanner;

public class Sungjuk
{
	int stuNum;
	Record[] recArr;
	

	void input()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("학생 수 입력 [1~100]");
			stuNum = sc.nextInt();
		}
		while (1>stuNum || stuNum >100);
		
		recArr = new Record[stuNum];
	}

	void score()
	{
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<stuNum; i++)
		{
			recArr[i] = new Record();
			System.out.printf("%d번째 학생의 이름 입력 : ", i+1);
			recArr[i].name = sc.next();
			

			System.out.print("국어 점수 : ");
			recArr[i].score[0] = sc.nextInt();

			System.out.print("영어 점수 : ");
			recArr[i].score[1] = sc.nextInt();

			System.out.print("수학 점수 : ");
			recArr[i].score[2] = sc.nextInt();


			recArr[i].tot = recArr[i].score[0] + recArr[i].score[1] + recArr[i].score[2];
			recArr[i].avg = recArr[i].tot / 3.0;

			System.out.println();
		}
	}

	void write()
	{
		for (int i = 0; i < num; i++)
			System.out.printf("%3s%4d%4d%4d%5d%8.2f%4d\n", recArr[i].name, recArr[i].score[0], recArr[i].score[1], recArr[i].score[2], recArr[i].tot, recArr[i].avg);
	}
	
}

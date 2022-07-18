/*=====================================================
■ 클래스와 인스턴스
- 클래스와 인스턴스 활용
=======================================================*/

/*
학생별로 국어점수, 영어점수, 수학점수 입력받아
총점 및 평균을 계산하는 프로그램 구현
클래스의 개념을 활용하고 배열을 적극적으로 활용할 것.
클래스 설계는 아래의 가이드 라인을 따른다.


실행 예)
인원 수 입력(1~100) : 102
인원 수 입력(1~100) : -1
인원 수 입력(1~100) : 3

1번째 학생의 이름 입력 : 일
국어 점수 : ?
영어 점수 : ?
수학 점수 : ?

2번째 학생의 이름 입력 : 이
국어 점수 : ?
영어 점수 : ?
수학 점수 : ?

3번째 학생의 이름 입력 : 삼
국어 점수 : ?
영어 점수 : ?
수학 점수 : ?

일 10 20 30 60 xx.xx
이 10 20 30 60 xx.xx
삼 30 20 10 60 xx.xx



[클래스 가이드라인]
1. Record 클래스
- 속성만 존재하는 클래스로 설계

2. Sungjuk 클래스
- 인원 수를 입력받아, 입력받은 인원 수 만큼
이름, 국어점수, 영어점수, 수학점수를 입력받고
총점과 평균을 산출하는 클래스로 설계
속성 : 인원수, ★Record 타입의 배열★
기능 : 인원수 입력, 상세 데이터 입력(점수), 총점 및 평균 연산, 결과 출력

3. Test101 클래스
main 메서드를 가진 외부 클래스로 둘것??
*/

import java.util.Scanner;

class Record
{
	int kor, eng, math, total;
	int[] rec = new int[3];
	double avg;
	String name;

	int rank;
}

class Sungjuk
{
	private int member;
	private Record[] rc;

	void inputMembers()
	{

		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("인원 수 입력 : ");
			member = sc.nextInt();
		}
		while (member < 0 || member > 100);
		rc = new Record[member];
	}
	

	void inputInfo()
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 1, j = 0; i <= member; i++, j++)
		{
			rc[j] = new Record();
			System.out.printf("%d번째 학생 이름 입력 : ", i);
			rc[j].name = sc.next();
			System.out.print("국어 점수  : ");
			rc[j].rec[0] = sc.nextInt();
			System.out.print("영어 점수  : ");
			rc[j].rec[1] = sc.nextInt();
			System.out.print("수학 점수  : ");
			rc[j].rec[2] = sc.nextInt();
		}
	}

	void cal()
	{
		for(int i = 0; i < member; i++)
		{
			rc[i].total = rc[i].rec[0] + rc[i].rec[1] + rc[i].rec[2];
			rc[i].avg = rc[i].total/3.0;
		}
	}

	void print()
	{
		for(int i = 0; i < member; i++)
			System.out.printf("%s | %d | %d | %d | %d | %.2f%n", rc[i].name, rc[i].rec[0], 
													 rc[i].rec[1], rc[i].rec[2], rc[i].total, rc[i].avg);
	}

}
public class TTTest101
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();
		sj.inputMembers();
		sj.inputInfo();
		sj.cal();
		sj.print();
	}
}
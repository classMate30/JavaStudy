/*======================================
   ■■■ 정렬(Sort) 알고리즘 ■■■
=======================================*/

//○ 과제 
//	 사용자로부터 여러 학생의 성적 데이터를 입력받아
//	 점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//	 결과를 출력하는 프로그램을 구현한다.
//	 단, 배열과 정렬 알고리즘을 활용하여 작성 할 수 있도록 한다.

//	실행 예)
//	인원 수 입력 : 5
//  이름 점수 입력(1, 공백 구분) : 장현성 90
//  이름 점수 입력(2, 공백 구분) : 정미경 80
//  이름 점수 입력(3, 공백 구분) : 최동현 85
//  이름 점수 입력(4, 공백 구분) : 조현하 75
//  이름 점수 입력(5, 공백 구분) : 박원석 95

/*
--------------
1등 박원석 95 1
2등 장현성 90 2
3등 최동현 85 3
4등 정미경 80 4 
5등 조현하 75 5
--------------
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;
public class Test110
{	
	//과정에서 필요한 변수들 미리 선언
	String[] name;
	int[] score;
	int[] rank;
	int n;

	//입력 받아올 메소드 정의
	void input()
	{	
		//사용자로부터 입력을 받아와서, n변수에 그 인원 수 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 입력 : ");
		n = sc.nextInt();
		
		//n만큼의 길이를 가진 name과 score배열에 for문을 통해서 각 이름과 숫자를 담아냄
		name = new String[n];
		score = new int[n];
		for (int i=0; i<n; i++)
		{
			System.out.printf("이름, 점수 입력(%d, 공백구분) : ", i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}
	
	}
	
	//정렬 해줄 메소드 정의
	//성적은 (큰숫자에서 작은숫자) ,내림차순으로 정렬 그리고 이름들도 그에 맞춰 같이 정렬
	//등수는 (작은숫자에서 큰숫자) ,오름차순으로 정렬 (1등부터 n등까지)
	void ranking()
	{	
		//이름 정렬 할때 필요한 임시 저장 변수 선언
		String changeTemp;
		

		//선택 정렬

		for (int i=0; i<n-1; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				if (score[i]<score[j])
				{
					score[i]=score[i]^score[j];
					score[j]=score[j]^score[i];
					score[i]=score[i]^score[j];

					changeTemp = name[i];
					name[i]=name[j];
					name[j]=changeTemp;
					
				}
			}
		}
		//버블 정렬
		/*
		for (int i=1; i<n; i++)
		{
			for (int j=0; j<n-1; j++)
			{
				if (score[j]<score[j+1])
				{
					score[j] = score[j]^score[j+1];
					score[j+1]= score[j+1]^score[j];
					score[j] = score[j]^score[j+1];

					changeTemp = name[j];
					name[j] = name[j+1];
					name[j+1] = changeTemp;
				}
			}
		}

		*/

		//랭크 배열 n길이 만큼 할당 해주고, 모든 순위를 1로 초기화
		//각 자리 비교해가면서 정렬 해줄 것
		rank = new int[n];
		for (int i=0; i<n; i++)
			rank[i]=1;

		//선택 정렬
		for (int i=0; i<n-1; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				if (score[i]<score[j])
					rank[i]+=1;
				else if (score[i]>score[j])
					rank[j]+=1;
			}
		}
		
		/*
		//버블 정렬
		for (int i=1; i<n; i++)
		{
			for (int j=0; j<n-1; j++)
			{
				if (score[i]<score[j])
					rank[i]+=1;
			}
		}
		*/
		//결과가 맞게 나오기는 하는데... 맞는건지는 모르겠음


	}
	
	//출력 메소드 정의
	void print()
	{	
		System.out.println("--------------");
		for (int i=0; i<n; i++)
		{
			System.out.printf("%d등 %2s %2d \n",rank[i], name[i], score[i]);
		}
		System.out.println("--------------");
	}

	public static void main(String[] args)
	{	
		//Test110 클래스 기반으로 인스턴스 생성
		Test110 ob = new Test110();
		//ob를 통해서 메소드 호출
		ob.input();
		ob.ranking();
		ob.print();
	}
}

//실행 결과

/*

인원 수 입력 : 5
이름, 점수 입력(1, 공백구분) : 장현성 90
이름, 점수 입력(2, 공백구분) : 정미경 80
이름, 점수 입력(3, 공백구분) : 최동현 85
이름, 점수 입력(4, 공백구분) : 조현하 75
이름, 점수 입력(5, 공백구분) : 박원석 95
--------------
1등 박원석 95
2등 장현성 90
3등 최동현 85
4등 정미경 80
5등 조현하 75
--------------
계속하려면 아무 키나 누르십시오 . . .
*/
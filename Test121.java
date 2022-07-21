/*=============================================
 	■■	■클래스 고급■■■
 	- 인터페이스(Interface)
 =============================================*/

// ○   실습문제
//		성적 처리 프로그램을 구현한다
//		단, 인터페이스를 활용 할 수 있도록 한다


// 실행 예)
// 인원 수 입력(1~10) : 11
// 인원 수 입력(1~10) : 0
// 인원 수 입력(1~10) : 2

// 1번째 학생의 학번 이름 입력(공백 구분) : 2207123 최동현
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2208225 최나윤
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

// 2207123 최동현   90 100 85	xxx xx.xx
//					수  수 우
// 2208225 최나윤	80 70 65	xxx xx.xx
//					우 미 양

//계속하려면 아무 키나 누르세요...


//속성만 존재하는 클래스 → 자료형 활용
import java.util.Scanner;
class Record_2
{
	String hak, name;		//--학번, 이름
	int kor, eng, mat;		//--국어, 영어, 수학 점수
	int tot;				//--총점
	double avg;				//--평균

	//int score[] = new int[3];
}

// 인터페이스
interface Sungjuk 
{
	public void set();		//--인원 세팅
	public void input();	//--데이터 입력
	public void print();	//--결과 출력

}

//문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스

class SungjukImpl implements Sungjuk 
{	
	//주요 변수 선언
	private int inwon;
	private Record_2[] rec;
	
	//오버라이딩을 통해서 추상클래스 낙인 떼고 객체 생성 가능하게 만들어 줄 것
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("인원 수 입력 (1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);

		rec = new Record_2[inwon];
	}

	@Override
	public void input()
	{	
		Scanner sc = new Scanner(System.in);
		String[] sub = {"국어", "영어", "수학 점수"};
		for (int i=0; i<inwon; i++)
		{
			rec[i] = new Record_2();
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i+1);
			rec[i].hak = sc.next();
			rec[i].name= sc.next();

			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			/*
			for (int j=0 ; j<3; j++)
			{
				rec[i].score[j] = sc.nextInt();
			}
			*/

			
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot += rec[i].kor + rec[i].eng + rec[i].mat;

			

			rec[i].avg = rec[i].tot / 3.0;



		}
	}
	
	@Override
	public void print()
	{	
		for (int i=0; i<inwon; i++)
		{		
			System.out.printf("%10s",rec[i].hak);
			System.out.printf("%5s",rec[i].name);

			System.out.printf("%4d",rec[i].kor);
			System.out.printf("%4d",rec[i].eng);
			System.out.printf("%4d",rec[i].mat);
			/*
			for (int j=0; j<3; j++)
			{
				System.out.printf("%4d",rec[i].score[j]);
			}
			*/
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f",rec[i].avg);
			System.out.println();
			/*
			for (int k=0; k<3; k++)
			{
				System.out.printf("\t   %s",panjung(rec[i].score[k]));
			}
			*/

			System.out.printf("\t            %s",panjung(rec[i].kor));
			System.out.printf("%3s",panjung(rec[i].eng));
			System.out.printf("%3s",panjung(rec[i].mat));
			System.out.println();

		}

	}

	//내부적으로 등급에 대한 판정을 수행할 메소드
	private String panjung(int score)
	{
		if (score>=90)
			return "수";
		else if(score>=80)
			return "우";
		else if (score>=70)
			return "미";
		else if (score>=60)
			return "양";
		else 
			return "가";
	}
}


// main() 메소드를 포함하는 외부의 다른 클래스
public class Test121 extends SungjukImpl
{
	public static void main(String[] args)
	{
		
		/*업캐스팅
		SungjukImpl ob0 = new SungjukImpl();
		Sungjuk ob = (Sungjuk)ob0;
		Sungjuk ob = ob0;
		*/



		Sungjuk ob = new SungjukImpl();
		//SungjukImpl ob = new SungjukImpl();

		//문제 해결 과정에서 작성해야 할 ob 구성 및 객체 생성

		ob.set();
		ob.input();
		ob.print();

	}
}
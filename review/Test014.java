/*=======================================
■■■■자바 기본 프로그래밍 ■■■■■
-변수와 자료형
-자바의 기본 입출력 : BufferedReader 클래스
==========================================*/
//사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
//이름과 총점을 출력하는 프로그램을 구현한다

//실행 예)
// 이름을 입력하세요 : 한은영
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70


//===========[결과]=========
// 이름: 한은영
// 총점 : 240
//계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test014
{ 
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strName;
		int nKor, nEng, nMat;
		int nTot;
		String strTemp;

		System.out.print("이름을 입력하세요 : ");
		strName = br.readLine();

		System.out.print("국어 점수 입력 : ");
		strTemp = br.readLine();
		nKor = Integer.parseInt(strTemp);

		System.out.print("영어 점수 입력 : ");
		strTemp = br.readLine();
		nEng = Integer.parseInt(strTemp);

		System.out.print("수학 점수 입력 : ");
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);

		nTot = nKor + nEng + nMat;

		System.out.println("\n=====결과=====");
		//System.out.println("이름 : " + strName);
		System.out.printf("이름 : %s%n", strName);
		System.out.printf("총점 : %d%n", nTot);
	}
}

//실행 결과

/*
이름을 입력하세요 : 한은영
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

=====결과=====
이름 : 한은영
총점 : 240
계속하려면 아무 키나 누르십시오 . . .

*/
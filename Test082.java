/*==========================================
   ■■■ 배열 ■■■
   - 배열의 선언과 초기화
   - 배열의 기본적 활용
=========================================*/

// 사용자로부터 인원수를 입력받고
// 입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받고
// 이렇게 입력받은 데이터를 이름 배열과 전화번호 배열로 구성하여
// 결과를 출력할 수 있는 프로그램을 구현한다.

// 실행 예)
// 입력 처리할 학생 수 입력(명, 1~10) :	27
// 입력 처리할 학생 수 입력(명, 1~10) : -5
// 입력 처리할 학생 수 입력(명, 1~10) : 3
// 이름 전화번호 입력[1](공백 구분) : 정미경 010-1111-1111
// 이름 전화번호 입력[2](공백 구분) : 조영관 010-2222-2222
// 이름 전화번호 입력[3](공백 구분) : 최나윤 010-3333-3333

//-------------------
// 전체 학생 수 : 3
//-------------------
// 이름		전화번호
//정미경    010-1111-1111
//조영관	010-2222-2222
//최나윤	010-3333-3333
//-------------------
//계속하려면 아무 키나 누르세요...


//문제분석
/*
1.입력을 받아올건데 범위에 맞지 않다면 반복 시킬 것 (버퍼드리더) / (do~while 활용)

2.두번째 이름은 공백 구분해서 입력을 받아올 것이므로 (스캐너 활용)
	받아오는게 문자열 타입인가? 배열로 구성한다면 스트링 배열이 있는건가?

3.받아온 값을 토대로 출력 해줄 것

*/
import java.util.Scanner;

public class Test082
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력하는 학생 수를 담아낼 변수
		int memberCount = 0;
		
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memberCount = sc.nextInt();
		}
		while (memberCount<1 || memberCount>10);

		// 테스트(확인)
		//System.out.println("사용자가 입력한 인원 수 : " + memberCount);
		//--==>> 사용자가 입력한 인원 수 : 5

		// 사용자가 입력한 인원 수를 토대로
		// 이름 배열과 전화번호 배열을 생성해야 한다.

		// 인원 수 만큼의 이름 저장 배열 구성
		String[] names = new String[memberCount];

		// 인원 수 만큼의 전화번호 저장 배열 구성
		String[] tels = new String[memberCount];
		//String[] tels = new String[names.length];

		// 인원 수 만큼의 안내 메세지 출력
		for (int i=0; i<tels.length; i++)	//i<names.length도 가능 /    i<memberCount도 가능
		{
			System.out.printf("이름 전화번호 출력[%d](공백 구분) :", (i+1));
			//고연수 010-1111-1111
			//------
			names[i] = sc.next();
			//고연수 010-1111-1111
			//       -------------
			tels[i] = sc.next();

		}

		//최종 결과(이름, 전화번호) 출력
		System.out.println();
		System.out.println("-------------------");
		System.out.printf("전체 학생 수 : %d명\n", memberCount);
		//memberCount == names.length == tels.length
		System.out.println("-------------------");
		System.out.println("이름 전화번호");
		
		//학생 리스트 반복 출력
		for (int i=0; i<memberCount; i++)
		{
			System.out.printf("%3s %4s\n", names[i], tels[i]);
		}



		System.out.println("-------------------");

	


	}
}

//실행 결과
/*

-------------------
전체 학생 수 : 4명
-------------------
이름 전화번호
장현성 010-1111-2222
김태민 010-2222-3333
박원석 010-4444-4444
조영관 010-5555-5555
-------------------
계속하려면 아무 키나 누르십시오 . . .
*/



/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Test082
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		//받아오는 수(名)
		int n;		
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : " );
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>10);
		
		String[] arr1 = new String[n];
		String[] arr2 = new String[n];

		for (int i=0; i<arr1.length; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", i);
			arr1[i] = sc.next();
			arr2[i] = sc.next();
		}

		System.out.println();
		System.out.println("------------------");
		System.out.printf("전체 학생수 : %d%n", n);
		System.out.println("------------------");
		System.out.println(" 이름	전화번호");
		for (int i=0; i<arr1.length; i++)
		{
			System.out.printf("%s \t %s\n",arr1[i],arr2[i]);
		}
		System.out.println("------------------");

	}
	
}

//-------------------
// 전체 학생 수 : 3
//-------------------
// 이름		전화번호
//정미경    010-1111-1111
//조영관	010-2222-2222
//최나윤	010-3333-3333
//-------------------
//계속하려면 아무 키나 누르세요...

*/
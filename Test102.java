/*======================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스와 인스턴스 활용
=======================================*/

// 1 ~ 3 사이의 난수를 발생시켜서
// 가위, 바위, 보 프로그램을 구현한다
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한 배열을 활용하여 처리할 수 있도록 한다.
// 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

// ※ 기준데이터 → 1:가위 2:바위 3:보


// 실행 예)
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 4
// 1:가위, 2:바위, 3:보 중 입력(1~3) : -2
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 2

// - 유저	: 바위
// - 컴퓨터 : 보

// >> 승부 최종 결과 : 컴퓨터가 이겼습니다~~!!
// 계속하려면 아무 키나 누르세요...

// 유저가 가위(1)일때
//	유저 - 컴퓨터
// 컴퓨터바위(2) → -1 (컴퓨터가 이김) / 컴퓨터보(3) → -2 (컴퓨터가 짐) / 0 비김

// 유저가 바위(2)일때
// 유저 - 컴퓨터
// 컴퓨터가위(1) → 1 (컴퓨터가 짐) / 컴퓨터보(3) → -1 (컴퓨터가 이김) / 0 비김

// 유저가 보(3)일때
// 유저 - 컴퓨터
// 컴퓨터가위(1) → -2(컴퓨터가 이김) / 컴퓨터바위(2) → (컴퓨터가 짐) / 0 비김

import java.util.Scanner;
import java.util.Random;
class RspGame
{
	private int user;
	private int com;

	// 컴퓨터의 가위바위보
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;
	}

	public void input()
	{
		//유저가 가위바위보 하기 전에... 컴퓨터(주최측) 먼저 가위바위보
		runCom();

		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
		
	}

	//중간 결과 출력
	public void middleCalc()
	{
		String[] str = {"가위", "바위", "보"};

		System.out.println();
		System.out.println(" - 유저		:" +str[user-1]);
		System.out.println(" - 컴퓨터	:" +str[com-1]);
	}
	
	//승부에 대한 최종 결과 연산
	public String resultCalc()
	{
		String result = "무승부 상황입니다~!!!";

		//(유저=="가위" && 컴=="보") || (유저=="바위" && 컴 =="가위") || (유저=="보" && 컴=="바위")
		if ((user==1 && com==3) || (user==2 && com ==1) || (user==3 && com==2))
		{
			result = "당신이 승리했습니다~!!!!";		
		}
		
		//(유저=="가위" && 컴=="바위") || (유저=="바위" && 컴 =="보") || (유저=="보" && 컴=="가위")
		else if ((user==1 && com==2) || (user==2 && com ==3) || (user==3 && com==1))
		{
			result = "컴퓨터가 승리했습니다~!!!";
		}
		
		return result;

	}

	//결과 출력
	void print(String str)
	{
		System.out.printf("\n>> 승부 최종 결과 : %s\n", str);
	}
}

public class Test102
{
	public static void main(String[] args)
	{
	RspGame ob = new RspGame();

	ob.input();
	ob.middleCalc();
	String result = ob.resultCalc();
	ob.print(result);
	}
}



/*
import java.util.Scanner;
import java.util.Random;
public class Test102
{	
	int user;
	int com;

	String result[] = {"컴퓨터가 이겼습니다~!!!" , "컴퓨터가 졌습니다~!!!", "비겼습니다~!!!"};
	
	//사용자 가위,바위,보 중 한개를 입력 받아온다
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}

		while (user <1 || user >3);
	}

	//난수를 발생시켜서 유저와 컴퓨터 사이의 승부를 계산한다

	String rspGame()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;
		// 유저가 가위(1)일때
		//	유저 - 컴퓨터
		// 컴퓨터바위(2) → -1 (컴퓨터가 이김) / 컴퓨터보(3) → -2 (컴퓨터가 짐) / 0 비김
		if (user==1)
		{
			if (user - com == -1)
				return result[0];
			else if (user - com == -2)
				return result[1];
			else 
				return result[2];
		}

		// 유저가 바위(2)일때
		// 유저 - 컴퓨터
		// 컴퓨터가위(1) → 1 (컴퓨터가 짐) / 컴퓨터보(3) → -1 (컴퓨터가 이김) / 0 비김
		else if (user==2)
		{
			if (user - com == -1)
				return result[0];
			else if (user - com == 1)
				return result[1];
			else 
				return result[2];
		}
		

		// 유저가 보(3)일때
		// 유저 - 컴퓨터
		// 컴퓨터가위(1) → 2(컴퓨터가 이김) / 컴퓨터바위(2) → 1(컴퓨터가 짐) / 0 비김

		else if (user==3)
		{
			if (user - com == 2)
				return result[0];
			else if (user - com == 1)
				return result[1];
			else 
				return result[2];
		}
	}

	void print(String[] rsp)
	{
		System.out.println();
		System.out.printf(">> 승부 최종 결과 : %s", rspGame);
	}



	public static void main(String[] args)
	{
		
	}
}
*/

import java.util.Scanner;
import java.util.Random;
class Rsp
{	
	int user;
	int com;
	
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
		String result[] = {"컴퓨터가 이겼습니다~!!!" , "컴퓨터가 졌습니다~!!!", "비겼습니다~!!!"};
		String result1 = "잘못 입력 ";
		Random rd = new Random();
		com = rd.nextInt(3)+1;
		// 유저가 가위(1)일때
		//	유저 - 컴퓨터
		// 컴퓨터바위(2) → -1 (컴퓨터가 이김) / 컴퓨터보(3) → -2 (컴퓨터가 짐) / 0 비김
		if (user==1)
		{
			if (user - com == -1)
				result1 = result[0];
			else if (user - com == -2)
				result1= result[1];
			else 
				result1= result[2];
			return result1;
		}

		// 유저가 바위(2)일때
		// 유저 - 컴퓨터
		// 컴퓨터가위(1) → 1 (컴퓨터가 짐) / 컴퓨터보(3) → -1 (컴퓨터가 이김) / 0 비김
		else if (user==2)
		{
			if (user - com == -1)
				result1= result[0];
			else if (user - com == 1)
				result1= result[1];
			else 
				result1= result[2];
			return result1;
		}
		

		// 유저가 보(3)일때
		// 유저 - 컴퓨터
		// 컴퓨터가위(1) → 2(컴퓨터가 이김) / 컴퓨터바위(2) → 1(컴퓨터가 짐) / 0 비김

		else if (user==3)
		{
			if (user - com == 2)
				result1= result[0];
			else if (user - com == 1)
				result1= result[1];
			else 
				result1= result[2];
		return result1;
		}

	return result1;
	}

	
	public void print(String str)
	{
		System.out.println();
		System.out.printf(">> 승부 최종 결과 : %s", str);
		System.out.println();
	}


}
public class TTest102
{
	public static void main(String[] args)
	{
		Rsp rsp = new Rsp();
		rsp.input();
		String result1 =rsp.rspGame();
		rsp.print(result1);

	}
}
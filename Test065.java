/*==========================================
■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
==========================================*/

// break 실습

//※ break 키워드가 지니는 의미
//	 멈춘다 + (그리고 빠져나간다)

//다음과 같은 처리가 이루어지는 프로그램을 구현한다.
//단, 입력받는 정수는 1 ~ 100 범위안에서만 
//가능하도록 작성한다.

//실행 예)

//임의의 정수 입력 : -10

//임의의 정수 입력 : 0

//임의의 정수 입력 : 2022

//임의의 정수 입력 :10

//1~10까지의 합 : 55	
//계속 하시겠습니까(Y/N) : y

//임의의 정수 입력 : 100
//>> 1~100까지의 합 : 5050
//계속 하시겠습니까(Y/N) : N
//계속하려면 아무키나 누르세요...→ 프로그램 종료


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test065
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//check~!!
		int n, s, i;
		//-- n : 사용자 입력값을 담아낼 변수
		//	 s : 누적합 연산 결과를 담아낼 변수
		//	 i : 1부터 1씩 사용자의 입력값까지 증가할 변수

		char ch;
		//-- 프로세스를 계속 진행할지 말지의 여부를 담아둘 변수
		
		while (true)
		{
			do
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			//테스트(확인)
			//System.out.println("유효한 정수 입력 완료~!!!");
			//누적합 변수의 초기화 위치 chec~k!!
			s=0;

			for (i=1; i<=n; i++)
			{
				s += i;
			}
			System.out.printf(">> 1 ~ %d까지의 합 : %d\n", n, s);

			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch = (char)System.in.read();
			//-- 계속할지 말지에 대한 여부(의사표현)
			
			//그만할래~ → 빠져나감
			if (ch!='Y' && ch!='y')
			{
				//반복문을 멈추고 빠져나갈 수 있는 코드 작성 필요
				//-- 위와 같은 의사표현을 했다면,
				//	 그동안 수행했던 반복문을 멈추고 빠져나가야한다.
				break;
				//-- 멈춘다 + (그리고 빠져나간다.) check~!!!
			}//end if

			//엔터값(\r\n)처리
			//
			System.in.skip(2);

		}//end while(true)
	}//end main()
}//end class

		/*
		int num, i=1, sum=0;
		int yn;
		
		do
		{
			System.out.print("임의의 정수 입력 : ");
			num = Integer.parseInt(br.readLine());
			if (num<1 || num>100)
			{
				break;
			}
			else if(num>=1 && num<=100)
			{
				while (i <= num)
				{
					sum += i;	
					i++;
				}	
			}
			System.out.printf("1 ~ %d까지의 합 : %d\n", num, sum);
			System.out.printf("계속 하시겠습니까?(Y/N)");
			yn = System.in.read();
			System.in.skip(2);
		}
		while ((yn != 78)&&(yn !=110) || (yn == 89)&&(yn ==121) );				//Y나 y가 나오면 계속 , N이나 n이 나오면 멈춤
		// Y89 y121  N78  n110				//false가 나오면 빠져나간다.
											//n이 나오면 빠져나간다
		*/



//실행 결과


/*

임의의 정수 입력 : 20
>> 1 ~ 20까지의 합 : 210
계속하시겠습니까(Y/N)? : y

임의의 정수 입력 : 30
>> 1 ~ 30까지의 합 : 465
계속하시겠습니까(Y/N)? : Y

임의의 정수 입력 : 50
>> 1 ~ 50까지의 합 : 1275
계속하시겠습니까(Y/N)? : n
계속하려면 아무 키나 누르십시오 . . .


*/
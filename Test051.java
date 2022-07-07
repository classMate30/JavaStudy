/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- 반복문(while문) 실습
==========================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// ※ 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도
//			 나누어 떨어지지 않는 수
//			 단, 1은 소수 아님

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수아님
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 11
// 11 → 소수
// 계속하려면 아무 키나 누르세요...

// 소수의 정의 : 1과 자신만을 인수로 가진 수


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;		//-- 사용자의 입력값을 담아낼 변수
		int n=2;		//-- 입력값을 대사으로 나눗셈 연산을 수행할 변수
						//	 2부터 시작해서 1씩 증가
						//	 ex) 입력값 27 → n : 2 3 4 5 6 7 8....26

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		boolean flag = true;
		while (n<num)
		{
			if (num%n==0)
			{
				flag = false;
				break;
			}
			n++;
		}
		if (flag && num!=0)
			System.out.printf("%d → 소수\n",num);
		else
			System.out.printf("%d → 소수아님\n",num);

		/*
		//어떤 값을 입력받은 상태인지 알 수 없지만
		//이 입력 값을 소수라고 간주한다.
		
		//String result = "소수다";
		boolean flag = true;		//num(사용자 입력값)은 소수 일 것이다~!!!


		while (n<num)
		{
			//테스트
			//System.out.println("반복문 수행");
			//확인 연산 수행
			//-- n으로 num이 나누어 떨어지는지 확인
			if(num%n==0)	//즉, 나누어 떨어지는 상황
			{
				//앗~ 난 너를 소수라 생각했는데...ㅠㅠㅠ
				//넌...소수가 아니었어 
				flag = false;
				break;			//-- 멈춘다(+그리고 빠져나간다.)
								//	→break를 감싸는 가장 가까운 반복문
			}
			n++;

		}
		
		//결과 출력(출력 전에 수행해야 할 추가 확인 → 1인지 아닌지에 대한 추가 검토)

		if (flag && num!=1)
		{
			//최종적으로 소수
			System.out.printf("%d → 소수\n",num);
		}
		else
		{
			//최종적으로 소수 아님 
			System.out.printf("%d → 소수아님\n",num);
		}
	*/
	}

}

/*
임의의 정수 입력 : 1
1 → 소수아님
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력 : 13
13 → 소수
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력 : 33
33 → 소수아님
계속하려면 아무 키나 누르십시오 . . .
*/
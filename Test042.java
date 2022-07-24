/*■■■■ 실행 흐름의 컨트롤(제어문) ■■■■■
- switch 문 실습
==========================================*/

//사용자로부터 1부터 3까지의 정수 중 하나를 입력받아
//입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
//단, 두가지 방법으로 구현 할 수 있도록 한다.

//① switch문의 일반 모델을 사용하여 구현한다.
//② switch문의 기본 모델을 사용하되,
//		『break』를 딱 한 번만 사용할 수 있도록 구현한다.

// 실행 예)
// 임의의 정수 입력(1~3) : 3
// ★★★
// 계속하려면 아무키나 누르세요...

// 임의의 정수 입력(1~3) : 2
// ★★
// 계속하려면 아무키나 누르세요...

// 임의의 정수 입력(1~3) : 1
// ★
// 계속하려면 아무키나 누르세요...
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;

		System.out.print("임의의 정수 입력(1~3) : ");
		n = Integer.parseInt(br.readLine());

		switch(n)
		{
			case 1: System.out.println("★");break;
			case 2: System.out.println("★★");break;
			case 3: System.out.println("★★★");break;
			default: System.out.println("입력오류~!!!"); // break;
		}
		//System.out.println("스위치 구문 종료");

		switch (n)
		{
			case 3: System.out.print("★");
			case 2: System.out.print("★");
			case 1: System.out.print("★\n");
				break;
			default: System.out.println("입력오류~!!!"); 
		
		}

	}
}
*/


import java.io.IOException;
public class Test042
{
	public static void main(String[] args) throws IOException
	{
		int num;
		String result= "판별 불가";

		System.out.print("임의의 정수 입력(1~3) : ");
		num = System.in.read();
		
		switch(num)
		{
		case 51: result = "★★★"; break;
		case 50: result = "★★"; break;
		case 49: result = "★";
		}

		System.out.println(result);
	}
}

/*================================================
   ■■■ 배열 ■■■
   - 배열의 배열(2차원 배열)
   - 배열과 난수 처리 (※ Random 클래스 활용)
   math클래스의 random메소드를 사용하면 0~1사이의 실수값을 주기에
   추가 연산이 필요하므로로 Random클래스가 새로 등장
==================================================*/

//사용자로부터 임의의 정수를 입력받아
//그 정수의 갯수만큼 난수(1~100)를 발생시켜 배열에 담고
//배열에 담겨있는 데이터들 중
//가장 큰 값과 가장 작은 값을 선택하여
//결과를 출력하는 프로그램을 구현한다.

//실행예)
//발생시킬 난수의 갯수 입력 : 10
//(50 7 2 4 3 1 19 81 20 17 → 무작위로	발생한 정수들...)
//(int[] arr = {50 7 2 4 3 1 19 81 20 17} → 배열에 담아내기 (배열 구성)
// 가장 큰 값 :99 가장 작은 값:1
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.util.Random;
public class Test095
{
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);


		//주요 변수 선언
		int size;			//--사용자의 입력값을 담아낼 변수

		//안내 메세지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		size = sc.nextInt();

		//size 변수에 담아낼 수 만큼의 배열방 만들기(배열 길이)
		int[] arr = new int[size];
	
		//무작위 정수(난수)를 발생시키기 위해서는
		//난수 발생 전용 객체가 필요하다.
		//→ 『java.util.Random』
		Random rd = new Random();
		//-- Random 클래스 인스턴스 생성

		// ※Random 클래스의 『nextInt()』메소드   //Scanner 클래스의『nextInt()』 이름만 같음
		// 둘이 클래스 안에서 정의해둔 기능이 다르기에 다르다는것을 꼭 인지할 것
		// ※Random 클래스의『nextInt()』메소드
		//	0~매개변수로 넘겨받은 정수 n-1까지의 수 중
		//	무작위 정수(난수) 1개를 발생시킨다.

		//rd.nextInt(10) --==>> 0~9까지 정수 중 난수 하나만 발생시킴
		
		//테스트(확인)
		//System.out.println("발생한 난수 : " + rd.nextInt(10));
		//0 ~ 9 까지의 범위 내에서 무작위 정수 한 개 발생~!!!

		//배열 구성
		//for (int i=0; i<arr.length; i++)
		for (int i=0; i<size; i++)
		{
			//rd.nextInt(101);
			//→ 0 ~ 100 중 1개
			//rd.nextInt(100);
			//→ 0 ~ 99 중 1개
			arr[i] = rd.nextInt(100)+1;
			//			------------
			//			  0 ~ 99
			//			----------------
			//				1 ~ 100
			//1 ~ 100까지 中 1개

		}
		
		//테스트 → 구성된 배열 전체 요소 출력
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		//--==>>
		/*
		발생시킬 난수의 갯수 입력 : 10
	    91  33  29  42  33  65  46  74  43  67
		
		발생시킬 난수의 갯수 입력 : 10
		28  68  77  38  90  16  94  76   8  67
		*/
		//--------------------여기까지 수행하게 되면 배열 구성 완료~!!!!!
		/*내가 완성 시킨 코드
		int max=arr[0], min=arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>max)
				max = arr[i];
			else
				max = max;

			if (arr[i]<min)
				min = arr[i];
			else
				min = min;
		}	
		System.out.printf("가장 큰 값 : %d , 가장 작은 값 : %d%n", max, min);
		*/

		//같이 한 풀이
		int max, min;				//--최대값 최소값
		max=min=arr[0];				//--arr[0]의 값을 min에 대입하고
									//	min의 값을 max에 대입
		
		//반복문은 한번이라도 덜도는게 좋으니까 i=0말고 i=1로 초기화 해줬음
		for (int i=1; i<arr.length; i++)
		{
			if (max<arr[i])
				max = arr[i];
			if (min>arr[i])
				min = arr[i];
		}

		//결과 출력
		System.out.printf("가장 큰 값 : %d , 가장 작은 값 : %d\n", max, min);
	}
}


//실행 결과
/*

발생시킬 난수의 갯수 입력 : 10
  58  37  10  80  97  69  10   6  22  26
가장 큰 값 : 97 , 가장 작은 값 : 6
계속하려면 아무 키나 누르십시오 . . .

*/

/*
연구해 볼 거리
아직 i와 j 바뀔때 배열길이 등 이해를 못했음
		int[][] arr= new int[4][5];
		int n=0;
		
		for (int i=0; i<4; i++)
		{
			for (int j=0;j<5; j++)
			{
				n++;
				arr[j][i] = n;
			}
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d",arr[i][j]);
			System.out.println();
*/
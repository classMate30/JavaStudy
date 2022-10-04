/*
상근이는 매일 아침 알람을 듣고 일어난다. 
알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.

상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.

이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.

바로 "45분 일찍 알람 설정하기"이다.

이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 
어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 
이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.

현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 
이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.

첫째 줄에 두 정수 H와 M이 주어진다.
(0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.

입력 시간은 24시간 표현을 사용한다.
24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
*/

/*
예제입력 
10 10
60 *10 + 10 = 610 / 60 + 610%60 
예제 출력
9 25
610 -45  =565 = 565/60 = 9 +565%60 


1. 입력받은 값의h를 *60 하고, 입력받은 값의 m을 더하고 -45를 한다
2. 연산 값을 60으로 나눈 값으로 시간을 출력해주고, 60으로 나눴을때의 나머지를 분으로 출력해준다.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj2884
{
	public static void main(String[] args) throws IOException
	{	
		//변수 선언 및 값 담아내기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strarr = br.readLine().split(" ");
		int h = Integer.parseInt(strarr[0]);
		int m = Integer.parseInt(strarr[1]);
		
		//잘못 들어온 값 걸러내기
		if (h>24 || m>60)
		{
			return;
		}

		//연산 처리
		int sum = h * 60 + m -45;
		if (sum<0)
		{
			sum += 24*60;
		}

		h = sum / 60;
		m = sum % 60;
		

		System.out.println(h + " " + m);
		

	}
	
}
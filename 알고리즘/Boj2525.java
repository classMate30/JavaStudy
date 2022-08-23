import java.util.Scanner;
public class Boj2525
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int hour, minute, c , cHour, cMinute;
		do
		{
			hour = sc.nextInt();
			minute = sc.nextInt();
		}
		while ((0>hour||hour>23) || (0>minute||minute>59));
		
		do
		{
			c =sc.nextInt();
		}
		while (0>c || c>1000);
		
		
		if (c<=59)
		{
			minute += c;
			if (minute>=60)
			{
				int temp = minute / 60;
				minute -= 60;
				hour += temp;
			}
			if (hour>=24)
			{
				hour -= 24;
			}
		}

		if (c>59)
		{
			cHour = c/60;
			cMinute = c%60;
			
			hour += cHour;
			minute += cMinute;

			if (minute>=60)
			{
				int temp = minute / 60;
				minute -= 60;
				hour += temp;
			}
			if (hour>=24)
			{
				hour -= 24;
			}
		}
		
		System.out.println(hour + " " + minute);

	}
}

/*
첫째 줄에는 현재 시각이 나온다. 
현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다. 

첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. 
(단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다.
디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)

*/

/*
※풀이
1.처음에 현재시각을 입력받아온다.(Scanner에 시와 분을 입력받아와 각각 변수에 담는다)
2.연산처리 
(60분이 넘어갈때마다 분에서 -60해주고 시에서 +1 해주는 방식
/ 24시가 지나면 시에서 -24해줘서 00시로 초기화?)



*/


/*
①
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		
		// 모든 시간을 분으로 바꾼다!
		int a = h*60 + m + n;
		h = a/60;
		m = a%60;
		
		//h가 24를 넘는다면?
		if (h>=24) {
			h= h-24;
		}
		
		System.out.println(h + " "+ m);

	}
}
*/


/*
②
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		
		sc.close();
		
		int min = A * 60 + B;
		min += C;
		
		int hour = (min/60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " "+ minute);
		
		
				
	}

}
*/


/*
③
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        
        StringTokenizer st = new StringTokenizer(str1, " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(str2);
        
        int total_time = (h*60) + m + time;
        int hour = (total_time/60)%24;
        int minute = total_time%60;
        System.out.println(hour + " " + minute);
    }
}
*/
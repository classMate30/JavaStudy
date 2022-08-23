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
ù° �ٿ��� ���� �ð��� ���´�. 
���� �ð��� �� A (0 �� A �� 23) �� �� B (0 �� B �� 59)�� ������ ��ĭ�� ���̿� �ΰ� ������� �־�����.
�� ��° �ٿ��� �丮�ϴ� �� �ʿ��� �ð� C (0 �� C �� 1,000)�� �� ������ �־�����. 

ù° �ٿ� ����Ǵ� �ð��� �ÿ� ���� ������ ���̿� �ΰ� ����Ѵ�. 
(��, �ô� 0���� 23������ ����, ���� 0���� 59������ �����̴�.
������ �ð�� 23�� 59�п��� 1���� ������ 0�� 0���� �ȴ�.)

*/

/*
��Ǯ��
1.ó���� ����ð��� �Է¹޾ƿ´�.(Scanner�� �ÿ� ���� �Է¹޾ƿ� ���� ������ ��´�)
2.����ó�� 
(60���� �Ѿ������ �п��� -60���ְ� �ÿ��� +1 ���ִ� ���
/ 24�ð� ������ �ÿ��� -24���༭ 00�÷� �ʱ�ȭ?)



*/


/*
��
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		
		// ��� �ð��� ������ �ٲ۴�!
		int a = h*60 + m + n;
		h = a/60;
		m = a%60;
		
		//h�� 24�� �Ѵ´ٸ�?
		if (h>=24) {
			h= h-24;
		}
		
		System.out.println(h + " "+ m);

	}
}
*/


/*
��
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
��
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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj2753
{
	public static void main(String[] args)	throws IOException
	{

		int year;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			
		year = Integer.parseInt(br.readLine());


		}
		while (year<1 || year>4000);	

		if ((year%4==0&&year%100!=0) || year%400==0)
		{
			System.out.println("1");
		}
		else if (!((year%4==0&&year%100!=0) || year%400==0))
		{
			System.out.println("0");

		}
	}
}

/*
연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
하지만, 2000년은 400의 배수이기 때문에 윤년이다.
*/

/*
다른 사람 코드

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.valueOf(br.readLine());
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		if(year % 4 == 0 && year % 100 != 0) {
			bw.write("1");
		}else if(year % 400 == 0) {
			bw.write("1");
		}else {
			bw.write("0");
		}
			
		bw.flush();
		bw.close();
	}
}
*/


/*
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    bw.write(String.valueOf(1));
                }
                else {
                    bw.write(String.valueOf(0));
                }
            }
            else{
                bw.write(String.valueOf(1));
            }
        }
        else{
            bw.write(String.valueOf(0));
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

*/
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
������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.

���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. 
������, 2000���� 400�� ����̱� ������ �����̴�.
*/

/*
�ٸ� ��� �ڵ�

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
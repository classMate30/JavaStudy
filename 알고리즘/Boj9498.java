/*
* 1. ���� ������ �Է¹޴´�
* 2. 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F ��� 
* 3. Default�� 'F'�� �� ��

sudo
1. ���۵� ��ü ���� �� ���۵带 ���ؼ� ���� �Է� ����
2. if / switch ���� Ȱ���ؼ� ������ ����
 switch�� Ȱ��� ������ ������ ���� %10 = 10 or 9 / =8 / =7 / =6 / default�� ����
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj9498
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score;

		score = Integer.parseInt(br.readLine());

		switch (score/10)
		{
		case 10 : case 9: System.out.println("A"); break;
		case 8	   : System.out.println("B"); break;
		case 7	   : System.out.println("C"); break;
		case 6	   : System.out.println("D"); break;
		default	   : System.out.println("F");		
		}

	}
}

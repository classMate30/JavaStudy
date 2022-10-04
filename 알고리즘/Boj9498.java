/*
* 1. 시험 점수를 입력받는다
* 2. 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F 출력 
* 3. Default를 'F'로 줄 것

sudo
1. 버퍼드 객체 생성 → 버퍼드를 통해서 점수 입력 받음
2. if / switch 문을 활용해서 조건을 걸음
 switch문 활용시 나누기 연산을 통해 %10 = 10 or 9 / =8 / =7 / =6 / default로 나눔
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

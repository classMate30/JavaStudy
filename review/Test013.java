/*=====================================================
 ■■■■■ 자바의 개요 및 특징 ■■■■■
 -변수와 자료형
 -자바 기본 입출력 : Quiz
=======================================================*/
/* 퀴즈
	삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
	이 삼각형의 넓이를 구하는 프로그램을 구현한다


실행예)
	■삼각형의 넓이 구하는 프로그램■
	-삼각형의 밑변 입력 :
	-삼각형의 높이 입력 : 

	>>밑변이 ?, 높이가 5인 삼각형의 넓이 : xxxx
	계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test013
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int underLength, height;
		double area;

		System.out.println("■삼각형의 넓이 구하는 프로그램■");
		System.out.print("삼각형의 밑변 입력 : ");
		underLength = Integer.parseInt(br.readLine());
		System.out.print("삼각형의 높이 입력 : ");
		height = Integer.parseInt(br.readLine());
		

		area = underLength * height / 2.0;
		//System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f%n", underLength, height, (underLength*height/2.0));
		System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이 %.2f%n", underLength, height, area);

	}
}

//실행 결과

/*
■삼각형의 넓이 구하는 프로그램■
삼각형의 밑변 입력 : 10
삼각형의 높이 입력 : 50
밑변이 10, 높이가 50인 삼각형의 넓이 250.00
계속하려면 아무 키나 누르십시오 . . .
*/
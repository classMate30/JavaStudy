/*=============================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
 	- 자바에서 기본적으로 제공하는 주요 클래스들
	- BigInteger 클래스
=============================================*/	

import java.math.BigInteger;

public class Test132
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;
		//System.out.println(a1);
		//에러

		//long b1 = 123456789123456789;
		//System.out.println(b1);
		//에러

		//long c1 = 123456789123456789l;
		//System.out.println(c1);
		//--==>>123456789123456789


		//불가능 long형에 담기에도 너무큼
		//long d1 = 123456789123456789123456789l;
		//System.out.println(d1);


		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		//BigInteger 클래스 확인해 볼 것.
		
		//객체와 객체를 더하라고 하면 뭘 더하는지 모름 그래서 메소드 활용 해야함
		//BigInteger c = a + b;
		//System.out.println(c);
		
		//더하기
		BigInteger c = a.add(b);
		System.out.println("덧셈 결과 : " + c);
		//--==>>덧셈 결과 : 246913578246913578

		//빼기
		BigInteger d = a.subtract(b);
		System.out.println("뺏셈 결과 : " +d);

		//곱하기
		BigInteger e = a.multiply(b);
		System.out.println("곱셈 결과 : " +e);

		//나누기
		BigInteger f = a.divide(b);
		System.out.println("나눗셈 결과 : " +f);


		//지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : "+ g.pow(3));


	}
}
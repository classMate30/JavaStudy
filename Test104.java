/*====================================================================
   ■■■ 메소드 중복정의■■■
   - 메소드 오버 로딩(Method Overloading)이 가능한 형태와 불가능한 형태
======================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		
		print('A');

		print(3.14);

		double result = print(3.14);

	}


	public static void print(){}				
	//public static void print(){}							//-- [X] 14번에 이미 존재
	
	public static void print(int i){}
	//public static void print(int j){}						//-- [X] 17번에 같은타입의 같은개수의 매개변수로쓰는 메소드 이미 존재
	
	public static void print(char c){}						//자동 형 변환 규칙 check~!!!! 가능, 그러나 조심
	
	public static void pritn(int i, int j){}				//가능

	public static void print(double d){}					//자동 형 변환 규칙 check~!!!!

	//public static void print(double e){return 10.0;}		//-- 정의 불가 / 메소드 기본규칙 return자료형 double도 안지킴
	//public static double print(double e){return 10.0;}	//-- [X]
	


}
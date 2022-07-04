/*=======================================
■■■■자바 기본 프로그래밍 ■■■■■
-변수와 자료형
-자바의 기본 입출력 : System.out.printf();
==========================================*/
public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");			//--『\n』개행
		//--==>>AAABBBCCC

		System.out.println();				//-- 개행
		//System.out.print();
		//--==>> 에러 발생(컴파일 에러)

		System.out.print("\n");				//-- 개행
		//System.out.print(\n);				
		//--==>>에러 발생(컴파일 에러)

		System.out.printf("1234567890");
		System.out.printf("1234567890\n");	//-- 『\n』개행
		System.out.printf("1234567890%n");	//-- 『%n』개행

		//System.out.printf();
		//--==>>에러 발생(컴파일 에러)

		System.out.printf("%d + %d = %d%n",10,20,30);
		//--==>>10+20=30

		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123); // %뒤의 숫자는 공간을 나타냄
		//--==>>
		/*
		123
		       123
		*/
		System.out.printf("%8d\n",1234);
		System.out.printf("%010d\n",1234); //공간앞에 0을 붙이면 공간을 0으로 채움

		System.out.printf("%+d\n",365); //+365
		System.out.printf("+%d\n",365); //+365

		System.out.printf("%d\n",+365);  //365
		//System.out.printf("%-d\n",365);
		//에러(런타임 에러) 음수를 표현하고 싶은데 d앞에 -를 붙이면 에러

		System.out.printf("-%d\n",365); //%앞에 음수 표시
		System.out.printf("%d\n",-365); //,뒤에 음수 표시
		
		//System.out.printf("%d\n",'A');
		//--==>>에러 발생(런타임 에러) 문자는 %c에 담아야함
		System.out.printf("%c\n",'A');

		//System.out.printf("%c\n","ABCD");
		//--==>>에러 발생(런타임 에러) 문자열은 %s에 담아야함
		System.out.printf("%s%n","ABCD");

		System.out.printf("%h\n",365);
		//--==>>16d  16진수로 반환한 것임
		System.out.printf("%o\n",24);
		//--==>>30 
		System.out.printf("%b\n",true);
		System.out.printf("%b\n",false);
		
		System.out.printf("%f\n",123.23);
		//--==>>123.230000
		//뒷자리 여섯자리까지 표현되는 형태로 나오기때문 123.230000
		System.out.printf("%.2f\n",123.23);	//--소수점 이하 두번째 자리까지
		//--==>>123.23
		System.out.printf("%.2f\n",123.231);
		//소수점 이하 두번째 자리까지 표현
		// (소수점 이하 세번째 자리까지 절삭)
		//--==>>123.23
		System.out.printf("%.2f\n",123.235);
		//소수점 이하 두번째 자리까지 표현
		// (소수점 이하 세번째 자리 올림)
		//--==>>123.24

		System.out.printf("%8.2f\n",123.236); //앞의 8은 전체자리 의미
		//--==>>  123.24 (소수점 포함 해서 자리 수 차지)
		System.out.printf("%2.2f\n",123.236);
		//.앞에 무시됨
	}
}
/*
AAABBBCCC


12345678901234567890
1234567890
10 + 20 = 30
123
       123
    1234
0000001234
+365
+365
365
-365
-365
A
ABCD
16d
30
true
false
123.230000
123.23
123.23
123.24
  123.24
123.24
계속하려면 아무 키나 누르십시오 . . .
*/
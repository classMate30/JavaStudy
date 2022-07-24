public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");

		System.out.println();
		
		System.out.print("\n");
		//System.out.print();에러
		//System.out.print(\n); 에러
		//System.out.printf();	에러

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		
		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n",123);

		System.out.printf("%8d\n", 1234);
		System.out.printf("%010d\n",1234);

		System.out.printf("%+d\n",365);
		System.out.printf("+%d\n",365);
		System.out.printf("%d\n", +365);

		/*
		+365
		+365
		365
		*/
		
		//System.out.printf("%-d\n",365);	런타임 에러

		System.out.printf("-%d%n",365);
		System.out.printf("%d%n", -365);
		/*
		-365
		-365
		*/


		System.out.printf("%c%n", 'A');
		System.out.printf("%s%n", "ABCD");
		
		System.out.printf("%h\n", 365);
		System.out.printf("%o\n", 24);
		System.out.printf("%b\n", true);
		System.out.printf("%b\n", false);
		System.out.printf("%f\n",123.23);
		System.out.printf("%.2f\n",123.23);
		System.out.printf("%.2f\n",123.231);

		System.out.printf("%.2f\n",123.235);
		System.out.printf("%8.2f\n",123.236);
		System.out.printf("%2.2f\n",123.236);

	
	
	}
}

//실행 결과

/*
AAABBBCCC


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

*/
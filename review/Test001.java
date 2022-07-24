public class Test001
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Java");
		System.out.println("First Java Program");

		int num1=7;
		int num2,num3;

		num2=++num1;
		num3=--num1;
		System.out.println(num1+" " +num2+ " " +num3);
		int a=10;
		byte b= a;
		System.out.println(a);
	}
}

// - class의 이름은 『Test001』
// - 자바 프로그램의 클래스 이름은 첫글자를 『대문자』로 시작해야함(必)
/* - 자바 프로그램 시작할때 클래스(class)와 main()메소드를 기본적으로 작성할 것*/
// - 소스코드 저장 시 클래스 이름과 동일한 파일 이름으로 저장 이때 확장자는 『.java』

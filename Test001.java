import java.io.IOException;
public class Test001
{
	public static void main(String[] args) throws IOException
	{
		char temp,temp1;
		System.out.print("한 문자 입력 : ");
		temp = (char)System.in.read();
		//대문자이냐? 소문자로변환 : (소문자 이느냐 ? 대문자로변환 : 있는그대로)
		temp1 = (temp >= 65 && temp <= 90) ? (char)(temp+32) : ((temp >= 97 && temp <=122) ? (char)(temp-32): temp);
	
		System.out.println(temp+ "→" +temp1);

		
		
		//System.out.println("Welcome to Java");
		//System.out.println("First Java Program");
	}
}

// - class의 이름은 『Test001』
// - 자바 프로그램의 클래스 이름은 첫글자를 『대문자』로 시작해야함(必)
/* - 자바 프로그램 시작할때 클래스(class)와 main()메소드를 기본적으로 작성할 것*/
// - 소스코드 저장 시 클래스 이름과 동일한 파일 이름으로 저장 이때 확장자는 『.java』

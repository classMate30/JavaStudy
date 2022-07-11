/*==========================================
■■■■ 클래스와 인스턴스■■■■■
==========================================*/
// ※ CircleTest.java 파일과 세트
import java.io.IOException;
public class Test071
{
	public static void main(String[] args) throws IOException
	{
		CircleTest circle = new CircleTest();
		circle.input();
		double length = circle.calLength();
		double area = circle.calArea();

		circle.print(area, length);
	}	
}
import java.io.IOException;
public class Test001
{
	public static void main(String[] args) throws IOException
	{
		char temp,temp1;
		System.out.print("�� ���� �Է� : ");
		temp = (char)System.in.read();
		//�빮���̳�? �ҹ��ڷκ�ȯ : (�ҹ��� �̴��� ? �빮�ڷκ�ȯ : �ִ±״��)
		temp1 = (temp >= 65 && temp <= 90) ? (char)(temp+32) : ((temp >= 97 && temp <=122) ? (char)(temp-32): temp);
	
		System.out.println(temp+ "��" +temp1);

		
		
		//System.out.println("Welcome to Java");
		//System.out.println("First Java Program");
	}
}

// - class�� �̸��� ��Test001��
// - �ڹ� ���α׷��� Ŭ���� �̸��� ù���ڸ� ���빮�ڡ��� �����ؾ���(��)
/* - �ڹ� ���α׷� �����Ҷ� Ŭ����(class)�� main()�޼ҵ带 �⺻������ �ۼ��� ��*/
// - �ҽ��ڵ� ���� �� Ŭ���� �̸��� ������ ���� �̸����� ���� �̶� Ȯ���ڴ� ��.java��

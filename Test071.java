/*==========================================
����� Ŭ������ �ν��Ͻ�������
==========================================*/
// �� CircleTest.java ���ϰ� ��Ʈ
// �� Test071.java�� ��Ʈ

//���� ���̿� �ѷ� ���ϱ�
//���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�
// (Ŭ������ : CircleTest) �� CircleTest.java
// BufferedReader�� readLine();

//���� ���� = ������ * ������ * 3.141592
//���� �ѷ� = ������ * 2 * 3.141592

//���� ��)
//������ �Է� : xxx

// >> �������� xxx�� ���� 
// >> ���� : xxxx.xx
// >> �ѷ� : xxxx.xx
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;
public class Test071
{
	public static void main(String[] args) throws IOException
	{	
		// CircleTest Ŭ���� ��� �ν��Ͻ� ����
		// CircleTest �ν��Ͻ� ����
		// CircleTest ��ü ����

		CircleTest ob = new CircleTest();
		// new CircleTest();�� �޸𸮿� �ۿ÷��༭ ��üȭ ��Ű��
		// ob��� ���������� �ּҸ� �����ϰ� �Ѵ�
		// ob.~~~~�� Ŭ���� ���� �޼ҵ� ��밡��

		ob.input();

		double num1 = ob.calArea();
		
		double num2 = ob.calLength();

		ob.print(num1,num2);

	}
}
		

		



		/*
		CircleTest circle = new CircleTest();
		circle.input();
		double length = circle.calLength();
		double area = circle.calArea();

		circle.print(area, length);
		*/

/*

������ �Է� : 25
>> �������� 25�� ����
>> ���� : 1963.495000
>> �ѷ� : 157.079600
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/

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
		CircleTest ct = new CircleTest();
		
		ct.input();
		double area = ct.calArea();
		double length = ct.calLength();
		ct.print(area, length);

	}
}


//���� ���

/*
������ �Է� : 25
>> �������� 25�� ����
>> ���� : 1963.495000
>> �ѷ� : 157.079600
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/
/*=============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
 	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- BigInteger Ŭ����
=============================================*/	

import java.math.BigInteger;

public class Test132
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;
		//System.out.println(a1);
		//����

		//long b1 = 123456789123456789;
		//System.out.println(b1);
		//����

		//long c1 = 123456789123456789l;
		//System.out.println(c1);
		//--==>>123456789123456789


		//�Ұ��� long���� ��⿡�� �ʹ�ŭ
		//long d1 = 123456789123456789123456789l;
		//System.out.println(d1);


		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		//BigInteger Ŭ���� Ȯ���� �� ��.
		
		//��ü�� ��ü�� ���϶�� �ϸ� �� ���ϴ��� �� �׷��� �޼ҵ� Ȱ�� �ؾ���
		//BigInteger c = a + b;
		//System.out.println(c);
		
		//���ϱ�
		BigInteger c = a.add(b);
		System.out.println("���� ��� : " + c);
		//--==>>���� ��� : 246913578246913578

		//����
		BigInteger d = a.subtract(b);
		System.out.println("���� ��� : " +d);

		//���ϱ�
		BigInteger e = a.multiply(b);
		System.out.println("���� ��� : " +e);

		//������
		BigInteger f = a.divide(b);
		System.out.println("������ ��� : " +f);


		//������
		BigInteger g = new BigInteger("2");
		System.out.println("2�� 3�� : "+ g.pow(3));


	}
}
/*====================================================================
   ���� �޼ҵ� �ߺ����ǡ���
   - �޼ҵ� ���� �ε�(Method Overloading)�� ������ ���¿� �Ұ����� ����
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
	//public static void print(){}							//-- [X] 14���� �̹� ����
	
	public static void print(int i){}
	//public static void print(int j){}						//-- [X] 17���� ����Ÿ���� ���������� �Ű������ξ��� �޼ҵ� �̹� ����
	
	public static void print(char c){}						//�ڵ� �� ��ȯ ��Ģ check~!!!! ����, �׷��� ����
	
	public static void pritn(int i, int j){}				//����

	public static void print(double d){}					//�ڵ� �� ��ȯ ��Ģ check~!!!!

	//public static void print(double e){return 10.0;}		//-- ���� �Ұ� / �޼ҵ� �⺻��Ģ return�ڷ��� double�� ����Ŵ
	//public static double print(double e){return 10.0;}	//-- [X]
	


}
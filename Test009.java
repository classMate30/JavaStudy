/*=====================================================
 ������ �ڹ��� ���� �� Ư¡ ������
 -������ �ڷ���
 -������ �ڷ��� �ǽ� �� �׽�Ʈ:double
=======================================================*/
public class Test009
{
	public static void main(String[] args)
	{
		//������ ������ ������
		double a = 1 / 2; //������ ������ /�� ������ ������ ���������� �� ���Ѵ�.
		// double a=0; 0�� double ������ �ڵ�����ȯ��. �׷��� a�� ������� 0.0�� ����
		System.out.println("double a :" +a);
		//--==>> double a: 0.0

		double b =(double)1/2;
		System.out.println("double b: " +b);
		//--==>> double b: 0.5
		/*���� double b= (double)0;�� �ȴٰ� ���� �� �� ������
		  �������� ����������� ()�� ��������� ���⿡
		  double b= 1.0/2;�̶�� ������
		  �׷��Ƿ� ���� double b:0.5�� �Ǵ� ��!
		*/
		
		double c= 1/2+1/2;
		System.out.println("double c: " +c);


		
		//�� �����ڷ� �Ǽ��� ���ԵǾ� �ִ� ������ ����
		double d= 1/2.0;
		System.out.println("double d: " +d);
		//--==>> double d:0.5
		//--������ ����� �����Ͽ�
		//	�� ������ �� �Ǽ��� �ϳ��� ���ԵǾ� �ִٸ�
		//	������ �Ǽ� ����� ������ ����Ǹ�
		//	����� ���� �Ǽ� ���·� ��ȯ�ȴ�.

		double e= 3/2 + 1/2;
		System.out.println("double e : " +e);
		//double e= 1 + 1/2;
		//double e= 1 + 0;
		//double e= 1;
		//--==>>double e= 1.0

		double f= 3/2 + 1/2.0;
		System.out.println("double f : " +f);
		//double f = 1 +1/2.0;
		//double f = 1 +0.5;
		//double f = 1.5;
		//--==>>double f: 1.5

		double g= 3.0/2 + 1.0/2;
		System.out.println("double g : " +g);
	}
}
/*
double a :0.0
double b: 0.5
double c: 0.0
double d: 0.5
double e : 1.0
double f : 1.5
double g : 2.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
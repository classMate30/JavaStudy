/*=====================================================
 ������ �ڹ��� ���� �� Ư¡ ������
 -������ �ڷ���
 -������ �ڷ��� �ǽ� �� �׽�Ʈ: Quiz
=======================================================*/
//������
/* 
	������ �ο��� ������ ������ ����
	���� ���̿� �ѷ��� ���ϴ� ���α׷��� �����Ѵ�.
	������� 10
	���� ����: ������*������*3.141592
	���� �ѷ�: ������*2*3.141592
���� : ????
�ѷ� : ?????
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
�������� ����� ��
*/
public class Test010
{
	public static void main(String[] args)
	{
		final double PI = 3.141592;
		int r=10;

		double area, length;

		area = r * r * PI;
		length = r * 2 * PI;

		System.out.printf("���� : %f%n", area);
		System.out.printf("�ѷ� : %f%n", length);
	}
}
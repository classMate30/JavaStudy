/*=====================================================
 ������ �ڹ��� ���� �� Ư¡ ������
 -������ �ڷ���
 -������ �ڷ��� �ǽ� �� �׽�Ʈ: char
=======================================================*/
public class Test008
{
	public static void main(String[] ars)
	{
		//�ֿ� ���� ����
		char ch1,ch2,ch3,ch4;
		int a;

		//���� �� ó��
		ch1 = 'A';
		ch2 = '\n'; 
		ch3 = '��';
		ch4 = '\\';

		a= ch1; //ch1�� charŸ�� a�� intŸ�� ,charŸ���� int�� ��� �׷��Ƿ� �ڵ�����ȯ �Ͼ
		//a= (int)ch1; ����� ����ȯ 2��° ���� �ǵ��� ���̶�� ���� �˷��ٶ�

		//������
		System.out.println("ch1 : " +ch1);
		System.out.println("ch2 : " +ch2);
		System.out.println("ch3 : " +ch3);
		System.out.println("ch4 : " +ch4);
		System.out.println("a : " +a);//���� �ϰ� �ʱ�ȭ ���ϸ� ������
		System.out.printf("%c,%c,%c,%c,%d%n",ch1,ch2,ch3,ch4,a);


	}
}

/*
ch1 : A
ch2 :

ch3 : ��
ch4 : \
a : 65
A,
,��,\,65
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
/*=======================================
   ���� �迭 ����
   - �迭�� ����� �ʱ�ȭ
   - �迭�� �⺻�� Ȱ��
=========================================*/

//��char���ڷ����� �迭�� �����
//�� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
//ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
//��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// A B C D E F G H I J K ... V W X Y Z
// ����Ϸ��� �ƹ� Ű�� ��������...



public class Test081
{
	public static void main(String[] args)
	{
		char[] chArr = new char[26];
		char ch = 'A';

		for (int i=0; i<chArr.length; i++)
		{
			chArr[i] = ch;
			ch++;
			System.out.print(chArr[i] + " ");
		}
		System.out.println();
		/*
		for (int i=0; i<chArr.length; i++)
		{
			System.out.print(chArr[i] + " ");
		}
		System.out.println();
		*/
	}
}
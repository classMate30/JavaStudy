/*����� ���� �帧�� ��Ʈ��(���) ������
- �ݺ���(for) �ǽ�
- �����
==========================================*/
// ����	for��(�ݺ����� ��ø)�� Ȱ���� ����� �ǽ�
//�� ����
//	 ������ ���� ������ ��µ� �� �ֵ���
//	 �ݺ����� ��ø ������ �ۼ��Ͽ� ���α׷��� �����Ѵ�.

//	���� ��)
/*

	*
   **
  ***
 ****
*****

*/

public class Test061
{
	public static void main(String[] args)
	{
		//��~ ��~ �ټ��� �ϰ� ���� ��
		//��~�� , ��~���� , ��~������ , ��~�������� , ��~����������
		//�ٵ� ���ʿ������� ������ �ƴ϶� �����ʿ������� �ϰ� �� ��
		
		//�ֿ亯�� ����
		int i, j ,k;		//for ���� ���� ���� ���� ����
		for (i=1; i<=5; i++)					//�� 5���� ��~�� ���� �� ��
		{
			for (k=1; k<=5-i; k++)				//ù�ٿ� ������ 4���� ������ְ� ���ٸ��� 1���� �پ��
			{
				System.out.print(" ");			//�ʱⰪ�� 1�� �����ؼ� 4���� ��µǰ� �ø��� ��� ���
			}
			for (j=1; j<=i; j++)				//ù�ٿ� ���� �Ѱ�������ְ� ���ٸ��� 1���� �þ
			{
				System.out.print("*");			//��~����4��1���~����3��2���~����2��3���~����1��4���~��5
			}
			System.out.println();				//��~�ѹ��� ����ɶ����� ������ �� ��
		}
		
	}
}


//���� ���
/*
    *
   **
  ***
 ****
*****
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
/*=======================================
����Ῥ����(Operator)������
- ���� ������ == ���� ������
==========================================*/

// ����ڷκ��� ������ ���� �ϳ� �Է¹޾Ƽ� 
// �빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ�
// ���ĺ��� �ƴ� ��Ÿ �����̸� �� ���� �״�� ����ϴ�
// ���α׷��� �����Ѵ�.

// ���� ��)
// �� ���� �Է� : A
// A �� a 
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� : b
// b �� B
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� : 7
// 7 �� 7
// ����Ϸ��� �ƹ� Ű�� ��������...

/*
���ĺ��빮�� ? ���ĺ��ҹ��ڷκ�ȯ : (���ĺ��ҹ��� ? ���ĺ��빮�ڷκ�ȯ : �ִ±״��); 
									-------------	------------------	-----------
										1				2					3
------------   -----------------    ------------------------------------------------
	1				2								3

result




*/

//System.in.read()�� ������ ���� 4����Ʈ ��Ʈ��

import java.io.IOException;
public class Test029
{
	public static void main(String[] args) throws IOException
	{
		//������ Ǯ��
		//char temp;
		//System.out.print("�� ���� �Է� : ");
		//temp = (char)System.in.read();

		//System.out.println("�Է¹��� �� Ȯ��  " +temp);
		
		//�빮��? �빮�ھƴ�?
		//temp == 'A'
		//temp == 'B'

		//String result = temp >= 65 && temp <=90 ? "�빮��" : "�빮�ھƴ�";
		//System.out.println("��� : "+ result);

		//String result temp >= 'A' && temp <= 'Z' ? "�빮��" : "�빮�ھƴ�";
		//System.out.println("��� : " + result);
		// �����Ҷ� ��Ʈ������ �ٲ�� ���� 
	
		// �빮�� �� �ҹ���
		// 'A'(65) �� 'a'(97) ==> +32
		// 'B'(66) �� 'b'(98) ==> +32
		// 'C'(67) �� 'c'(99) ==> +32
		//			:

	
		// �ҹ��� �� �빮��
		//'a'(97) �� 'A'(65) ==> -32
		//'b'(98) �� 'B'(66) ==> -32
		//'c'(99) �� 'B'(67) ==> -32
		//			:

		char ch, result;
		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();

		//result = () ? () : ();
		//result = (�Է°��빮��) ? (�ҹ��ڷ� ��ȯ) : ((�Է°��ҹ���? �빮�ڷ� ��ȯ : �״�ι�ȯ));
		result = (ch >= 'A' && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
		System.out.println(ch + " ��" + result);
		//����ڰ� �빮�� 'Q(81)'
//		result = (81 >= 65 && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && ch <= 90) ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && true) ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = true ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && true) ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && true) ? ((char)(81+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && true) ? ((char)(113)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && true) ? ('q') : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = 'q';

		//����ڰ� �ҹ��� 'm(109)'
//		result = (109 >= 65 && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && 109 <= 90) ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (true && false) ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = false ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((109 >= 97 && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((true && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((true && 109 <= 122) ? (char)(ch-32) :ch);
//		result = ((true && true) ? (char)(ch-32) :ch);
//		result = (char)(ch-32);
//		result = (char)(109-32);
//		result = (char)(77);
//		result = 'M';


		//����ڰ� '8(56)'
//		result = (8 >= 65 && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = (false && ch <= 'Z') ? ((char)(ch+32)) : ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((ch >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((56 >= 'a' && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((56 >= 97 && ch <= 'z') ? (char)(ch-32) :ch);
//		result = ((false && ch <= 'z') ? (char)(ch-32) :ch);
//		result = false ? (char)(ch-32) :ch);
//		result = ch;
//		result = '8';




		/* ���� Ǭ Ǯ��   Test001�� �ϼ��� ����.
		char ch1, ch2;
		int n;

		System.out.print("�� ���� �Է� : ");
		ch1 = (char)System.in.read();
		
		ch2 = (ch1 <= 65 && ch1 >= 90) ? (char)(ch1 + 32) : ch1 ;

		System.out.println(ch1 + "��" +ch2);
		*/

		/* ������ Ǯ��
		char ch1, ch2;
		int n;

		System.out.print("�� ���� �Է� : ");
		n = System.in.read();
		
		ch2 = (n < 60) ? ((char)n) : ((n < 91) ? (char)(n + 32) : (char)(n - 32));
		ch1 = (char)n;
		System.out.println();
		System.out.printf("%c �� %c%n", ch1, ch2);
*/
	}
}

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,a,b;
		char ch1;
		String strResult;
		System.out.print("�� ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		a = (n >= 65 && n <=90) ? (n += 32) :(char)n;
		
		//b = (char)a;
		
		System.out.println(a);


		// ������ and
		// ��� �ʿ��ϸ� or


		*/
		//�ֿ� ���� ����



//������

/*
�� ���� �Է� : A
A ��a
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


�� ���� �Է� : b
b ��B
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� �Է� : 7
7 ��7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
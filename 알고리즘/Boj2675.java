/*
���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. 
S���� QR Code "alphanumeric" ���ڸ� ����ִ�.

QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.

ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. 
�� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), ���ڿ� S�� �������� ���еǾ� �־�����. 
S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 

*/

/*
���� �Է�
2
3 ABC
5 /HTP
���� ���
AAABBBCCC
/////HHHHHTTTTTPPPPP
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj2675
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());

		for (int i=0; i<n; i++)
		{
			String[] strarr = br.readLine().split(" ");
			int m = Integer.parseInt(strarr[0]);
			String s = strarr[1];

			for (int j=0; j<s.length(); j++)
			{
				for (int k=0;k <m; k++)
				{
					System.out.print(s.charAt(j));
				}

			}
				System.out.println();
		
		}

		
	}
}


/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Boj2675 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
	
			String[] str = br.readLine().split(" ");	// ���� �и�
			
			int R = Integer.parseInt(str[0]);	// String -> int
			String S = str[1];
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
 
 
}
*/

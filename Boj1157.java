
/*
���ĺ� ��ҹ��ڷ� �� �ܾ �־�����
, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
*/

/*
1. ���ĺ� a~z���� ���� ��Ʈ �迭 [26] ���� ����
2. �ԷµǴ� �ܾ charAt() �Լ��� ���ؼ� �ѱ��ھ� �迭�������ٰ� ����
3. �ҹ����Ͻÿ� -65 , �빮���Ͻÿ� -97�� ����
4. �񱳸� ���� �ִ밪�� ���� ���� ���
5. �ִ� ���� ���ٸ� ? ���
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj1157
{
	public static void main(String[] args) throws IOException
	{
		
		//�ֿ� ���� ����
		int[] alphaArr = new int[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		

		//�迭�濡 �� ä���ֱ�
		for (int i=0; i<s.length(); i++)
		{
			if (s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				alphaArr[s.charAt(i) - 65] += 1; 
			}
			else if (s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				alphaArr[s.charAt(i) - 97] += 1; 
			}
		}
		
		int max = 0;
		char ch = '?';
		//��
		for (int i=0; i<alphaArr.length; i++)
		{
			if (alphaArr[i]>max)
			{
				max = alphaArr[i];
				ch = (char) (i+65);
			}
			else if (alphaArr[i]==max)
			{
				ch ='?';
			}
		}
		System.out.println(ch);
	}
}

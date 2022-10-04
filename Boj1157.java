
/*
알파벳 대소문자로 된 단어가 주어지면
, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
단, 대문자와 소문자를 구분하지 않는다.
*/

/*
1. 알파벳 a~z까지 담을 인트 배열 [26] 공간 생성
2. 입력되는 단어를 charAt() 함수를 통해서 한글자씩 배열공간에다가 저장
3. 소문자일시에 -65 , 대문자일시에 -97을 해줌
4. 비교를 통해 최대값을 가진 문자 출력
5. 최대 값이 같다면 ? 출력
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj1157
{
	public static void main(String[] args) throws IOException
	{
		
		//주요 변수 선언
		int[] alphaArr = new int[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		

		//배열방에 값 채워넣기
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
		//비교
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

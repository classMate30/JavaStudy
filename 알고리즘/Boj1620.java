/*

예제 입력
26 5
Bulbasaur
Ivysaur
Venusaur
Charmander
Charmeleon
Charizard
Squirtle
Wartortle
Blastoise
Caterpie
Metapod
Butterfree
Weedle
Kakuna
Beedrill
Pidgey
Pidgeotto
Pidgeot
Rattata오후 11:39
Spearow
Fearow
Ekans
Arbok
Pikachu
Raichu
25
Raichu
3
Pidgey
Kakuna

예제 출력
Pikachu
26
Venusaur
16
14
*/

/*
1. n과 m의 입력을 받아와서 몇개의 데이터(n)를 저장하고, 몇번의 출력(m)을 걸어줄지 결정
2. n개의 숫자만큼 key와 value를 가지고 있는 HashMap에 저장할것 (key는 숫자 value는 영어)
3. 출력으로 내보낼때 숫자로 값이 들어오면 value값 찾아주고, 영어로 값이 들어오면 key값을 반환

 
 
isDigit<<<<  
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Boj1620
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		//int n = Integer.parseInt(st.nextToken());
		//int m = Integer.parseInt(st.nextToken());
		String[] strnum = br.readLine().split(" ");
		//받아오는 문자열의 공백을 짤라서 스트링 배열에 담음
		int n =Integer.parseInt(strnum[0]);
		int m =Integer.parseInt(strnum[1]);

		//String배열에 담으면 인덱스로 접근하면 ... 더 알맞은 자료구조로 사용가능
		//맵으로 둘다 담으면 되긴하지만 인덱스로 다루는 배열이 더빠름 
		//String[] strarr= new String[n];
		

		//key값으로는 정수(1씩 증가시켜서), value값으로는 문자열 입력받아와서 저장
		Map<Integer,String> map = new HashMap<Integer,String>(n);
		Map<String,Integer> map2 = new HashMap<String,Integer>(n);
		//숫자가 주어지면 → key(숫자)로 문자 검색
		//key가 주어지면 value ○

		//문자가 주어지면 ????
		//value로 key를 검색한다...Ⅹ
		for (int i=0; i<n; i++)
		{
			String tmp=br.readLine();
			map.put(i+1, tmp);
			//strarr[i] = tmp;
			map2.put(tmp,i+1);
		}

		//숫자가 주어지면 map에서 key값을 토대로 value를 찾아옴
		for (int i=0; i<m; i++)
		{
			String temp = br.readLine();
			

			//숫자라면 48~57의 값만 가지고 있음 if문으로 48~57이면 전부 숫자 아니면 문자 처리하면됨
			if(temp.charAt(0)>48 && temp.charAt(0)<=57)
			{
				//숫자 인걸 확인했으니 map에서 key값에 해당하는 value값을 반환해주면 됨 
				
				//int keyResult = temp.charAt(0)-48;
				int keyResult = Integer.parseInt(temp);
				System.out.println(map.get(keyResult));
			}

			//문자열이 입력으로 들어왔을때 해당 인덱스 값을 찾아와야함 equals()활용?
			else
			{	
				/*
				for (int j=0; j<strarr.length; j++)
				{	
					if (strarr[j].equals(temp)==true)
					{
					System.out.println(j+1);
					break;
					}

				}
				*/
				System.out.println(map2.get(temp));
			}
		}
	}
}
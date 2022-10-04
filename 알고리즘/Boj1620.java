/*

���� �Է�
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
Rattata���� 11:39
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

���� ���
Pikachu
26
Venusaur
16
14
*/

/*
1. n�� m�� �Է��� �޾ƿͼ� ��� ������(n)�� �����ϰ�, ����� ���(m)�� �ɾ����� ����
2. n���� ���ڸ�ŭ key�� value�� ������ �ִ� HashMap�� �����Ұ� (key�� ���� value�� ����)
3. ������� �������� ���ڷ� ���� ������ value�� ã���ְ�, ����� ���� ������ key���� ��ȯ

 
 
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
		//�޾ƿ��� ���ڿ��� ������ ©�� ��Ʈ�� �迭�� ����
		int n =Integer.parseInt(strnum[0]);
		int m =Integer.parseInt(strnum[1]);

		//String�迭�� ������ �ε����� �����ϸ� ... �� �˸��� �ڷᱸ���� ��밡��
		//������ �Ѵ� ������ �Ǳ������� �ε����� �ٷ�� �迭�� ������ 
		//String[] strarr= new String[n];
		

		//key�����δ� ����(1�� �������Ѽ�), value�����δ� ���ڿ� �Է¹޾ƿͼ� ����
		Map<Integer,String> map = new HashMap<Integer,String>(n);
		Map<String,Integer> map2 = new HashMap<String,Integer>(n);
		//���ڰ� �־����� �� key(����)�� ���� �˻�
		//key�� �־����� value ��

		//���ڰ� �־����� ????
		//value�� key�� �˻��Ѵ�...��
		for (int i=0; i<n; i++)
		{
			String tmp=br.readLine();
			map.put(i+1, tmp);
			//strarr[i] = tmp;
			map2.put(tmp,i+1);
		}

		//���ڰ� �־����� map���� key���� ���� value�� ã�ƿ�
		for (int i=0; i<m; i++)
		{
			String temp = br.readLine();
			

			//���ڶ�� 48~57�� ���� ������ ���� if������ 48~57�̸� ���� ���� �ƴϸ� ���� ó���ϸ��
			if(temp.charAt(0)>48 && temp.charAt(0)<=57)
			{
				//���� �ΰ� Ȯ�������� map���� key���� �ش��ϴ� value���� ��ȯ���ָ� �� 
				
				//int keyResult = temp.charAt(0)-48;
				int keyResult = Integer.parseInt(temp);
				System.out.println(map.get(keyResult));
			}

			//���ڿ��� �Է����� �������� �ش� �ε��� ���� ã�ƿ;��� equals()Ȱ��?
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
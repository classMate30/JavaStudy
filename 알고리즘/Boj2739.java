import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj2739
{
	public static void main(String[] args) throws IOException
	{
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());

		if (n<1 || n>9)
		{
			System.out.println("잘못 입력하셨습니다.");
			System.exit(-1);
		}

		for (int i=1;i<=9; i++)
		{
			System.out.println(n + " * " + i +" = " + n*i);
		}
	}
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 9; i++) {
			
			sb.append(a)
			.append(" * ")
			.append(i)
			.append(" = ")
			.append(i * a)
			.append("\n");
		}
		
		System.out.println(sb);
	}

}
*/
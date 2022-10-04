import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Boj1008
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		double a = Integer.parseInt(str[0]);
		double b = Integer.parseInt(str[1]);
		//int c = Integer.parseInt(str[2]);
		System.out.println(a/b);
		//System.out.println(c);
	}
}

// BufferedReader로 메모리 낭비 최소화
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        System.out.println(a+b);
    }
}
*/

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        str = br.readLine();

        double a;
        double b;

        StringTokenizer st = new StringTokenizer(str," ");
//        for(int i = 0 ; i < st.countTokens() ; i++){
//            st.
//        }
        a = Double.parseDouble(st.nextToken());
        b = Double.parseDouble(st.nextToken());

        System.out.println(a/b);

    }
}
*/
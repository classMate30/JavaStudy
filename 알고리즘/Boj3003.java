/*�����̴� ������ â�� �����ٰ� ���� ü���ǰ� �ǽ��� �߰��ߴ�.

ü������ ������ �о�� �ɷ��� ������ �׷����� ������ ü������ �Ǿ���. 
������, ������ �ǽ��� ��� �־�����, ��� �ǽ��� ������ �ùٸ��� �ʾҴ�.

ü���� �� 16���� �ǽ��� ����ϸ�, ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8���� �����Ǿ� �ִ�.

�����̰� �߰��� ��� �ǽ��� ������ �־����� ��, �� ���� ���ϰų� ���� �ùٸ� ��Ʈ�� �Ǵ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
//1 1 2 2 2 8


//0 1 2 2 2 7
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Boj3003
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] arr = new int[6];
		int[] white = {1, 1, 2, 2, 2, 8};
		
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = Integer.parseInt(input[i]);
		}

		for (int i=0; i<arr.length; i++)
		{
			arr[i] = white[i] - arr[i];
		}

		for (int a : arr)
		{
			System.out.print(a + " ");
		}

	}
}
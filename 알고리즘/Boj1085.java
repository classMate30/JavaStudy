/*
�Ѽ��� ���� (x, y)�� �ִ�. 
���簢���� �� ���� ��ǥ�࿡ �����ϰ�, ���� �Ʒ� �������� (0, 0), ������ �� �������� (w, h)�� �ִ�.
���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

/*
6 2 10 3  > 1

1 1 5 5   > 1

653 375 1000 1000 > 347



161 181 762 375 >  161

*/
import java.util.Scanner;
public class Boj1085
{
	public static void main(String[] args)
	{	
		//��ĳ�ʷ� �Է� �� �޾� �� �� 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//�Ÿ��� �ּ� ���� �����̱� ������, (x-0),(y-0),(w-x),(h-y) �� �� �� �߿� ����
		//���� ���� ���� ��� ���ָ� �Ǳ⿡ �迭�� ��Ƽ� ���� �� �ּڰ��� ���
		int[] arr = {(x-0),(y-0),(w-x),(h-y)};
		for (int i=1; i<arr.length; i++)
		{
			int j;
			int tmp =arr[i];
			for (j=i; j>0&&arr[j-1]>tmp; j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=tmp;
		}

		System.out.println(arr[0]);
	}
}
/*==================================
 ���� �޼ҵ��� ��� ȣ�� ����
 ===================================*/
public class InfRecul
{	
	public static void main(String[] args)
	{
		showHi(7);
	}

	//�ڵ� ������ 2���� ��ġ �ٲٱ�

	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		if (cnt==1)
			return;
		showHi(--cnt);	

		/*
		System.out.println("Hi~");
		showHi(cnt--);			//showHi(3)	 //����ó���� �ƴ϶� ���� �ٲܼ� �ְ� shwoHi(--cnt);
		if (cnt==1)
			return;
		*/     

	}
}

	/*
	public static void showHi(3)
	{
		System.out.println("Hi~");
		if (cnt==1)
			return;
		showHi(cnt--);			//showHi(3)
	}

		public static void showHi(3)
	{
		System.out.println("Hi~");
		if (cnt==1)
			return;
		showHi(cnt--);			//showHi(3)
	}

		public static void showHi(3)
	{
		System.out.println("Hi~");
		if (cnt==1)
			return;
		showHi(cnt--);			//showHi(3)
	}

	*/

	/*
	public static void showHi(3)
	{
		System.out.println("Hi~");
		showHi(--cnt);			//showHi(2)
		if (cnt==1)
			return;
	}

		public static void showHi(2)
	{
		System.out.println("Hi~");
		showHi(cnt--);			//showHi(1)
		if (cnt==1)
			return;
	}

		public static void showHi(1)
	{
		System.out.println("Hi~");
		showHi(cnt--);			//showHi(0)
		if (cnt==1)				//������ Ȯ���غ� ���� ����
			return;
	}

	*/


/*==================================
 ■■■ 메소드의 재귀 호출 ■■■
 ===================================*/
public class InfRecul
{	
	public static void main(String[] args)
	{
		showHi(7);
	}

	//코드 내에서 2군데 위치 바꾸기

	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		if (cnt==1)
			return;
		showHi(--cnt);	

		/*
		System.out.println("Hi~");
		showHi(cnt--);			//showHi(3)	 //다음처리가 아니라 당장 바꿀수 있게 shwoHi(--cnt);
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
		if (cnt==1)				//조건을 확인해볼 일이 없음
			return;
	}

	*/


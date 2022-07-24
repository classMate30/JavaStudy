public class Test024
{
	public static void main(String[] args)
	{
	int x=20 , y=23;
	System.out.printf("x → %d, y → %d%n", x, y); 	
	x = x^y;
	y = y^x;
	x = x^y;

	System.out.printf("x → %d, y → %d%n", x, y); 
	}
}


//실행 결과
/*
x → 20, y → 23
x → 23, y → 20
계속하려면 아무 키나 누르십시오 . . .

*/
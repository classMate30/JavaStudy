/*=============================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
 	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Random 클래스
=============================================*/	
/*
○  java.util.Random 클래스는
	
	여러 형태의 난수를 발생시켜 제공하는 클래스이다
	Math 클래스의 정적 메소드인 random() 메소드는 난수를 제공하는 메소드이지만
	0.0 ~ 1.0사이의 실수 형태만 발생하게 되므로
	필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산을 수행해야 한다
	그래서 자바는 여러 형태의 난수를 발생시켜주는
	전용 클래스인 Random클래스를 별도로 제공하고 있다

// 로또 번호 생성(난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를
// 5게임 수행하는 프로그램을 구현한다


// 실행 예)
// 3 5 12 24 31 41
// 1 2 8  36 41 42
// 4 9 12 13 22 30
// 5 10 13 14 22 40
// 22 31 36 40 43 44

*/
import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6칸
	private int[] num;
 

	// 생성자
	Lotto()
	{
		num = new int[6];

	}
	
	//getter
	public int[] getNum()
	{
		return num;
	}

	
	//같이 푼 풀이
	//6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		Random rd = new Random();
		int n;
		int cnt = 0;
		
		jump:

		while (cnt<6)					// 0 1 2 3 4 5
		{
			n = rd.nextInt(45) + 1;			// 0 ~ 44 → 『+1』 → 1 ~45
			
			for (int i=0; i<cnt; i++)	// cnt → 4 / i → 0123
			{
				if(num[i]==n)
					continue jump;
			}
			num[cnt++] = n;
		}
		sorting();
	}

	//정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);
	}

}

public class Test146
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();
		//기본 5게임
		for (int i=0; i<5; i++)
		{
			// 로또 게임 수행
			lotto.start();
			for (int n: lotto.getNum())
			{
				System.out.printf("%4d", n);	
			}
			System.out.println();
		}
		
	}
}

/*
   3   9  11  21  23  25
   3   5  20  24  36  44
   4  13  19  23  24  30
   2  11  14  23  37  43
   7   8  13  18  24  29
계속하려면 아무 키나 누르십시오 . . .
*/


/*
import java.util.Random;
class Lotto
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6칸
	private int[] num;
 

	// 생성자
	Lotto()
	{
		num = new int[6];

	}
	
	//getter
	public int[] getNum()
	{
		return num;
	}

	//6개의 난수를 발생시키는 메소드 정의
	//중복 값 처리하고 , 정렬 시켜줘야함
	// 중복 값이 없어지면 그제서야 정렬?

	public void start()
	{
		Random rd = new Random();
		for (int i=0; i<num.length; i++)
		{
			num[i] = rd.nextInt(45) + 1;	//
			for (int j=0; j<i; j++)
			{
				if (num[i] == num[j])
				{
					i--;					//값이 중복이면 i삭제시키고 한번더 로또 생성 다시 할 것
				}
			}
		}
		
		// 중복 값 처리 했으니 정렬 해줄 것임
		// 향상된 버블 정렬 활용
		int pass = 0;
		boolean flag;
		
		do
		{
			flag = false;
			pass++;
			for (int i=0; i<num.length-pass; i++)
			{
				if (num[i]>num[i+1])
				{
					num[i] = num[i]^num[i+1];
					num[i+1] = num[i+1]^num[i];
					num[i] = num[i]^num[i+1];

					flag = true;
				}
			}
		}
		while (flag);
	
		for (int j=0; j<num.length; j++)
		{
			System.out.printf("%3d",num[j]);
		}
			System.out.println();

	}


	
public class Test146
{
	public static void main(String[] args)
	{
		Lotto lt = new Lotto();
		for (int i=0; i<5; i++)
		{
			lt.start();
			lt.getNum();
		}
		
	}
}

*/
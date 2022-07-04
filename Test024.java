/*=======================================
■■■■연산자(Operator)■■■■■
- 비트 단위 연산자
- 두 변수에	담겨있는 내용(값) 바꾸기 → 스왑(swap)
  → 『xor』연산자 활용 가능 

==========================================*/
public class Test024
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int x = 20, y = 23;

		//int temp;				//-- 임시 저장 변수(빈 컵)
		
		//담겨있는 내용물 확인
		System.out.printf("x → %d, y → %d%n", x, y);

		/*
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		*/
	
		y = y ^ x;
		x = x ^ y;
		y = y ^ x;


		// 연산 및 처리
		/*temp = x;
		x = y;
		y = temp;*/
		System.out.printf("x → %d, y → %d%n", x, y);


		// 결과 출력

	}
}
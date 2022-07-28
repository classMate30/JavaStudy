/*=============================================
       ■■■ 컬렉션 (Collection) ■■■
=============================================*/	
import java.util.Stack;

public class Test155
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors =
		{"검정", "노랑", "초록", "파랑", "빨강", "연두"};
	
	//생성자
	public Test155()
	{	
		//st라는 Stack 자료구조 생성
		//제네릭을 활용하여 자료구조에 담기는 데이터 표현 → 『<String>』
		Stack<String> st = new Stack<String>();
		
		//st라는 Stack 자료구종에 데이터(colors) 담기
		//st = colors; //(X)
		
		//st.push(colors[0])			//st.add(colors[0])
		//st.push(colors[1])			//st.add(colors[1])
		//st.push(colors[2])			//st.add(colors[2])
		//st.push(colors[3])			//st.add(colors[3])
		//st.push(colors[4])			//st.add(colors[4])
		//st.push(colors[5])			//st.add(colors[5])
		
		/*
		for (int i=0; i<colors.length; i++)
		{
			st.push(colors[i]);		//st.add(colors[i]);
		}
		*/

		for (String color : colors)
		{
			st.push(color);		//st.add(color);
		}
		st.push("보라");

		//st.push(10);
		//st.push(10.0);
		//제네릭 표현식 때문에 안되는 것임
		//--==>> 에러 발생(컴파일 에러)
		//-- 제네릭 표현식을 통해 선언하고 있는
		//	 String이 아닌 다른 자료형(int나 double)을
		//	 스택 자료구조 st에 push()하려고 했기 때문에...


		//출력 메소드 호출
		popStack(st);
		

	}

	//출력메소드
	private void popStack(Stack<String> st)			//Check~!!!!!! 처음사용하는 구문이니 잘확인
	{
		System.out.print("pop : ");
		while(!st.empty())		//isEmpty()
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		new Test155();

	}
}

//실행 결과

/*
pop : 연두 빨강 파랑 초록 노랑 검정
*/

/*
pop : 보라 연두 빨강 파랑 초록 노랑 검정
*/

/*=============================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=============================================*/	
/*
○ 컬렉션 프레임워크(Collection Framework)
   = 컬렉션(Collection) + 프레임워크(Framework)
     -----------------    --------------------
	 		|			  1.환경 2.틀 3.약속
			|
		집합의개념→ 수집품, 소장품, (물건,사람들의) 무리, 더미, 수집, 수거
					------------------------------------------------------
								모아놓은 것들... 모여있는 것들

==>> 자료 구조

알고리즘이란건 ? → 이 자료구조를 어떻게 접근하느냐? 어떻게 활용하느냐? 어떻게 이용하느냐?

정보라는걸 얻기위해 데이터가 수집되어야 함

○ 자료
   
   현실 세계로부터 단순한 관찰이나 측정을 통해
   사실이나 개념의 값들 또는 그 값들의 집합
	
	↓

○ 자료구조

   자료 처리를 위한 자료의 표현, 저장, 관계, 관리 및
   이용에 관한 방법 등의 개념을 이해하여 프로그램에 사용하고
   컴퓨터에 의해 처리되는 과정에서 적절한 자료의 표현, 구성, 저장 및
   처리를 위한 알고리즘 작성 및 선택과 이용 방법을 연구하는 분야

	↓

○ 컬렉션 프레임워크(Collection Framework)
   컬렉션 (모아놓은 데이터들)의 표현과 조작을 위한 통일된 아키텍처로 
   컬렉션 프레임워크를 구성하는 요소는 다음과 같다

   1.인터페이스(Interface)
	 기본적으로 컬렉션에 필요한 데이터 관리 기능을 제공한다
	 예를들어, list는 추가, 삭제, 검색, 등의 기능을 제공하는
	 컬렉션 인터페이스가 존재하며
	 각 컬렉션마다 고유의 인터페이스가 정의되어 있다
   
   2.구현(Implementation)
     인터페이스를 구현한 클래스로 각 컬렉션을
	 실제 어떤 자료구조를 이용하여 표현했느냐에 따라
	 컬렉션의 종류가 달라지게 된다


   3.알고리즘(Algorithms)
	 각 컬렉션들마다 유용하게 사용될 수 있는 메소드를 의미한다

※ 자바의 컬렉션은 견고한 컬렉션 프레임워크 기반 위에 정의되어 있으므로
   각 컬렉션 종류마다 제공되는 메소드의 일관성이 있기 때문에
   한 가지 컬렉션을 익혀두면 다른 컬렉션을 사용하는데 용이하다


그릇으로 이해해보자면)
사용도에 따라 담을 어떤 그릇을 쓰는지 달라진다는 것
그릇안에 순차적으로 꺼내서 쓰는지, 아니면 김치처럼 나중에 보관한걸 먼저 꺼내 쓰는지
그릇안에서 내용물이 뒤섞여도 되는지, 아니면 집어 넣은 그대로 보관돼도 되는지

list 순서가 있을때 사용하는 것
set  순서 없는 목록(중복된 데이터를 받아내면 안됨- 구분이 안되기 때문에)
map 

단일의 데이터보다 다수의 데이터를 다루기에 반복문 다루는게 거의 필수처럼 여겨짐...

1. 자료구조 특징 파악
2. 메소드 파악
3. 메소드 토대로 반복문을 어떻게 결합해서 활용하느냐

*/

/*

○ 스택(Stack)			(Last Input First Output)
   Stack 클래스는 오브젝트 후입선출(LIFO) 구조의 Stack을 나타낸다
   이는 벡터(Vector)를 스택으로 처리하는 5개의 메소드로
   벡터(Vector) 클래스를 확장하게 된다

   통상의 pust() 메소드와 pop() 메소드가 제공되는 것 외에
   스택의 선두 항목으로 peek()을 실시하는 메소드,
   스택이 비어있는지의 여부를 확인하는 메소드 isEmpty(),
   스택으로 항목을 찾아서 선두로부터 몇 번째인지를 찾아내는 메소드 등이 제공된다

   스택이 처음으로 작성되었을때, 항목은 존재하지 않는다

   - boolean empty()
   	 스택이 비어있는지 확인한다
   - E object peek()
     스택의 맨 위의 객체를 스택에서 제거하지 않고 반환한다
   - E object pop()
     스택의 맨 위의 객체를 반환하고 스택에서 제거한다
   - E object push(item)
     객체를 스택 자료구조에 저장한다
   - int search(Object o)
     스택의 맨 위에서부터 파라미터 값으로 넘겨받은 객체까지의 거리를 반환한다
	 맨 위의 객체의 경우 1을 반환하고 그 아래 객체는 2를 반환하는 형식


스택 - 김치통 같은애
*/



//제네릭, 제네릭 표현식

import java.util.Stack;

public class Test154
{
	public static void main(String[] args)
	{
		// Stack 자료구조 생성
		//Stack<String> myStack = new Stack<String>();
		//Stack<Circle> myStack = new Stack<Circle>();
		Stack<Object> myStack = new Stack<Object>();
		
		String str1 = "임시연";
		String str2 = "장현성";
		String str3 = "정미경";
		String str4 = "조현하";

		// myStack이라는 Stack 자료구조 안에 str1~str4까지 담아내기
		// add(), push() 스택 자료구조 안에 적재 할때 쓰는 메소드
		
		myStack.add(str1);
		myStack.add(str2);
		myStack.add(str3);
		myStack.add(str4);


		
		// peek() : 스택 맨 위의 객체 반환, 제거하지 않는다
		String val1 = (String)myStack.peek();
		System.out.println("val1 : " + val1);	
		//--==>> val1 : 조현하

		String val2 = (String)myStack.peek();
		System.out.println("val2 : " + val2);
		//--==>> val1 : 조현하 //peek()은 제거하지 않고 반환만 하는 메소드이기에...

		String val3 = (String)myStack.peek();
		System.out.println("val3 : " + val3);
		
		String value = "";

		// myStack이라는 이름을 가진	Stack 자료구조에
		// 데이터가 비어있는 상태가 아니라면...(즉, 채워져있는 상태라면...)
		// isEmpty()
		//							//현하 미경 현성 시연 / 미경 현성 시연 / 현성 시연		/시연			/(비어있는 상태)
		while (!myStack.isEmpty())	//!false → true		 / !false → true /	!false → true	/!false → true	/!true → false(반복문 종료)	 
		{
			// pop() : 스택 맨위의 객체 반환. 제거한다.
			value = (String)myStack.pop();
			System.out.println("value : " + value);
//현하 미경 현성 시연 / 미경 현성 시연 / 현성 시연		/시연			/(비어있는 상태)
//!false → true		 / !false → true /	!false → true	/!false → true	/!true → false(반복문 종료)	
		}
		//--==>>
		/*
		value : 조현하
		value : 정미경
		value : 장현성
		value : 임시연
		*/
	}
}

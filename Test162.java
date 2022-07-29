/*=============================================
       ■■■ 컬렉션 (Collection) ■■■
=============================================*/	

//사용빈도가 굉장히 높음
//그렇기에 굉장히 중요하게 눈여겨 봐야함

//자료구조 객체 선언 및 생성 시
//사용자 정의 클래스 활용
//→ 자료형

//앞으로 DB쪽 파트 배울때도 항상 사용할 개념이니 반복해서 숙지


// 클래스 → 사용자 정의 자료형으로 활용
import java.util.Vector;
import java.util.Iterator;
class MyData
{
	//주요 속성 구성 → 주요 변수 선언(멤버 변수)				//이런유형은 private을 붙인다고
	private String name;			//-- 이름				//바로 반응할 수 있어야함
	private int age;				//-- 나이
	
	//getXxx()	→ getter			//※ 얻는 데이터의 속성이 변수의 속성과 같아야함
	//SetXxx()	→ setter

	//getter / setter 구성

	public String getName() 
	{
		return name;
	}

	public void setName(String name)				//직접 값을 얻지 못하니까 메소드를 통해서 세팅
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	//생성자(매개변수 2개인 생성자)  →  사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// ※ 사용자 정의 생성자가 구성될 경우
	//	  default 생성자가 자동으로 삽입되지 않기 때문에
	//	  default 생성자 형태의 생성자를 사용자 정의 생성자로
	//	  추가 구성하게 되는 것이 일반적인 클래스 설계 과정
	//    (반드시 설계해야 한다는 문법적인 규칙은 없음)

	// 생성자 (매개변수 없는 생성자) → 사용자 정의 생성자
	public MyData()
	{
		//this("",0);
		name="";
		age=0;
	}



}


public class Test162
{
	public static void main(String[] args)
	{
		//벡터 자료구조 생성
		Vector<Object>

		Vector<MyData> v = new Vector<MyData>();		//MyData객체를 담아서 쓸거야

		//벡터 자료구조 v에
		//정영준 13세 / 정미경 7세 / 한은영 3세
		//담아내기
		
		//v.setName(name);
		
		//벡터 자료구조 v에 colors 배열 데이터를 요소로 추가
		//for (String color:colors)
		//	v.add(color);

		//MyData md1 = new MyData("정영준",13);
		//v.add(md1);
		//MyData md2 = new MyData("정미경",7);
		//v.add(md2);
		//MyData md3 = new MyData("한은영",3);
		//v.add(md3);

		//①
		/*
		MyData st1 = new MyData();
		st1.setName("정영준");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("정미경");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("한은영");
		st3.setAge(3);
		v.add(st3);
		*/

		//②
		/*
		MyData st1 = new MyData("정영준",13);
		v.add(st1);
		MyData st2 = new MyData("정미경",7);
		v.add(st2);
		MyData st3 = new MyData("한은영",3);
		v.add(st3);
		*/

		//③
		v.add(new MyData("정영준",13));
		v.add(new MyData("정미경",7));
		v.add(new MyData("한은영",3));

		//벡터 자료구조 v에 담긴 내용(요소)전체 출력하기
		//실행 예)
		// 이름: 정영준 , 나이:13세
		// 이름: 정미경 , 나이:7세
		// 이름: 한은영 , 나이:3세
		/*
		String name;
		int age;
		for (int i=0; i<3; i++)
		{
			name = v.get(i).getName();
			age = v.get(i).getAge();
			System.out.print("이름 : " + name + " , 나이 : " +age +"\n");
		}
		*/
		// ①		
		
		for (MyData obj : v)
		{
			System.out.printf("이름:%s, 나이:%d세%n",obj.getName(),obj.getAge());
		}
		System.out.println();
		//--==>>이름:정영준, 나이:13세
		//		이름:정미경, 나이:7세
		//		이름:한은영, 나이:3세
		
		
		// ②
		for (int i=0; i<v.size(); i++)
		{
			System.out.printf("이름:%s, 나이:%d세%n",v.elementAt(i).getName(), v.elementAt(i).getAge());
		}
		System.out.println();
		//--==>>이름:정영준, 나이:13세
		//		이름:정미경, 나이:7세
		//		이름:한은영, 나이:3세
		

		// ③
		
		for (int i=0; i<v.size(); i++)
		{
			System.out.printf("이름:%s, 나이:%d세%n",v.get(i).getName(), v.get(i).getAge());
		}
		System.out.println();
		//--==>>이름:정영준, 나이:13세
		//		이름:정미경, 나이:7세
		//		이름:한은영, 나이:3세


		//④
		for (Object temp :v)
		{
			System.out.printf("이름:%s, 나이:%d세%n",((MyData)temp).getName(), ((MyData)temp).getAge());
													//-->>이게 MyData obj가 되는것
		}

		//--==>>이름:정영준, 나이:13세
		//		이름:정미경, 나이:7세
		//		이름:한은영, 나이:3세



	}
}
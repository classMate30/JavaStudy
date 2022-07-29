/*=============================================
       ■■■ 컬렉션 (Collection) ■■■
=============================================*/	

// Map	→ Hashtable , HasMap
// (쌍)

/*
○  java.util.Map 인터페이스는
	키(key)를 값(value)에 매핑(mapping)하여
	동일한 키를 등록할 수 없고, 유일해야 하며
	각 키는 한개의 값만을 매핑해야 한다
	즉, 하나의 키에 대응하는 값을 하나의 값을 갖는 자료구조이다.
*/

/*
○  Hashtable<K, V> 클래스
	
	- 해시테이블 구조를 객체 모델링한 클래스로
	  검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다

	- 해시테이블이란 키(key)와 그에 상응하는 데이터(value)로
	  구분된 데이터 구조이다

	- 데이터를 저장하고, 검색하기 위해서 키(key)로 접근하며
	  이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다

	- 또한, Hashtable 클래스는 key 또는 value의 값으로 null을 허용하지 않는다
	
*/
import java.util.Hashtable;

public class Test170
{	
	private static final String[] names 
	= {"조현하", "민찬우", "최나윤", "고연수", "정영준", "반보영"};

	private static final String[] tels 
	= {"010-7202-6306", "010-2546-0266", "010-7236-0813", "010-4016-6208", "010-4051-5510", "010-6375-7524"};

	public static void main(String[] args)
	{
		// Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> ht = new Hashtable<String, String>();
				//key      value 해당하는 데이터 타입	
		// ht 라는 Hashtable 자료구조에 
		// 배열(names, tels)에 담겨있는 데이터를 요소로 담아내기
		// → put(k,v);
		for (int i=0; i<names.length; i++)
		{
			//ht.put("조현하","010-7202-6306");			//ht라는 Hashtable에 put()하겠다!
			ht.put(names[i], tels[i]);
		}
		
		// ht라는 Hashtable 자료구조에서 
		// key를 이용하여 검색 
		// → get(k);
		String findName1 = "정영준";
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + " 전화번호 : " + str);
		}
		//else 
		//{
		//	System.out.println("띠용~~");
		//}
		System.out.println();
		//--==>>정영준 전화번호 : 010-4051-5510
		
		
		// ht라는 Hashtable 자료구조에... key가 존재하는지의 여부 확인
		// → containsKey()
		String findName2 = "최동현";
		
		if (ht.containsKey(findName2))
		{
			System.out.println("데이터가 존재합니다.");
		}
		else
		{
			System.out.println(findName2 + " 데이터가 존재하지 않습니다.");
		}
		//--==>>최동현 데이터가 존재하지 않습니다.
		

		String findName3 = "최나윤";
		if (ht.containsKey(findName3))
		{
			System.out.println(findName3 + " 데이터가 존재합니다.");
		}
		else
		{
			System.out.println(findName3 + " 데이터가 존재하지 않습니다.");
		}
		System.out.println();
		//--==>>최나윤 데이터가 존재합니다.


		// ht라는 Hashtable 자료구조에... value가 존재하는지의 여부 확인
		// → contains()
		String findTel1 = "010-2546-0266";
		if (ht.contains(findTel1))
		{
			System.out.println(findTel1 + " 데이터가 존재합니다.");
		}
		else 
		{
			System.out.println(findTel1 + " 데이터가 존재하지 않습니다.");
		}
		System.out.println();
		//--==>>010-2546-0266 데이터가 존재합니다.
		
		// ht 라는 Hashtable 자료구조에서 『반보영』데이터 삭제
		// → remove()
		ht.remove("반보영");
		
		// ※ 『remove()』메소드는 인자값으로 key를 넘겨받지만
		//     이 때, key만 삭제되는 것이 아니다
		//	   해당 key와 연결되어(매핑되어) 있는 value도 함께 remove() 된다.

		// 삭제(remove()) 이후 key가 존재하는지 확인
		if (ht.containsKey("반보영"))
			System.out.println("보영이가 존재합니다.");
		else
			System.out.println("보영이 어디갔어???????");
		System.out.println();
		//--==>>보영이 어디갔어???????

		// 삭제(remove()) 이후 value가 존재하는지 확인
		if (ht.contains("010-6375-7524"))
			System.out.println("보영이 전화번호가 존재합니다.");
		else 
			System.out.println("보영이 전화번호가 존재하지 않습니다.");
		System.out.println();
		//--==>>보영이 전화번호가 존재하지 않습니다.
		
		
		// ※ null 관련 처리			null ← 아무것도 없다는 상태값  // 아무것도 없는것도 상태마다 다 다름 empty,null,undefined,void
		//ht.put(null, null);				//-- key, value 모두 null
		//--==>> 에러 발생(런타임 에러)
		//		 NullPointerException
		
		//ht.put("도규희", null);			//-- value가 null
		//--==>> 에러 발생(런타임 에러)
		//		 NullPointerException
		
		//ht.put(null, "010-1234-5678");	// key가 null
		//--==>> 에러 발생(런타임 에러)
		//		 NullPointerException
		
		// 중복된 key 입력
		ht.put("민찬우","010-1111-1111");
		System.out.println(ht.get("민찬우"));
		//--==>> 010-1111-1111
		//-- 중복된 key를 활용하여 데이터를 입력할 경우
		//	 기존 "010-2546-0266"에서 "010-1111-1111"로 변경되었음을 확인
		//	 (덮어쓰기 개념)

		// 중복된 value 입력
		ht.put("김태민", "010-7202-6306");
		System.out.println(ht.get("조현하"));
		//--==>> 010-7202-6306
		System.out.println(ht.get("김태민"));
		//--==>> 010-7202-6306

		// ※ value는 중복된 값이 입력되더라도 기존 데이터에 아무런 영향을 미치지 않음

	}	
}
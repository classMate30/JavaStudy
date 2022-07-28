/*=============================================
       ■■■ 컬렉션 (Collection) ■■■
=============================================*/	

//Test163 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다

/*
실행 예)

	[메뉴 선택]=======
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	=================
>>메뉴 선택(1~6)	 : 1

1번째 요소 입력 : 장현성
1번째 요소 입력 성공~!!!
요소 입력 계속(Y/N)? : y

2번째 요소 입력 : 엄소연
2번재 요소 입력 성공~!!!
요소 입력 계속(Y/N)? : N


	[메뉴 선택]=======
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	=================
>>메뉴 선택(1~6)	 : 2

[벡터 전체 출력]
장현성
엄소연
백터 전체 출력 완료~!!!


	[메뉴 선택]=======
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	=================
>>메뉴 선택(1~6)	 : 3

>>검색할 요소 입력 : 장현성

[검색 결과 출력]
항목이 존재합니다.



	[메뉴 선택]=======
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	=================
>>메뉴 선택(1~6)	 : 3

>>검색할 요소 입력 : 반보영

[검색 결과 출력]
항목이 존재하지 않습니다.

	[메뉴 선택]=======
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	=================
>>메뉴 선택(1~6)	 : 4

>>삭제할 요소 입력: 김보경

[삭제 결과 출력]
항목이 존재하지 않아 삭제할 수 없습니다


	[메뉴 선택]=======
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	=================
>>메뉴 선택(1~6)	 : 4

>>삭제할 요소 입력: 장현성

[삭제 결과 출력]
장현성 항목이 삭제되었습니다


	[메뉴 선택]=======
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	=================
>>메뉴 선택(1~6)	 : 5

>>변경할 요소 입력 : 도규희

[변경 결과 출력]
변경할 대상이 존재하지 않습니다


	[메뉴 선택]=======
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	=================
>>메뉴 선택(1~6)	 : 5

>>변경할 요소 입력 : 엄소연
>>수정할 내용 입력 : 도규희

[변경 결과 출력]
변경이 완료되었습니다

	[메뉴 선택]=======
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	=================
>>메뉴 선택(1~6)	 : 2

[벡터 전체 출력]
도규희
백터 전체 출력 완료~!!!


	[메뉴 선택]=======
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	=================
>>메뉴 선택(1~6)	 : 6

프로그램 종료~!!!
계속하려면 아무키나 누르세요...




*/
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Menus			//→ 완성
{
	public static final int E_ADD = 1;			//-- 요소 추가
	public static final int E_DISP = 2;			//-- 요소 출력
	public static final int E_FIND = 3;			//-- 요소 검색
	public static final int E_DEL = 4;			//-- 요소 삭제
	public static final int E_CHA = 5;			//-- 요소 변경
	public static final int E_EXIT = 6;			//-- 종료
}

public class Test163
{

	//주요 속성 구성			→ 완료
	private static final Vector<Object> vt;		//-- 자료구조
	private static BufferedReader br;			//-- 입력 시 활용
	private static Integer sel;					//-- 선택 값
	private static String con;					//-- 계속 진행 여부


	//static 초기화 블럭
	static
	{
		
		//Vector 자료구조 생성
		vt = new Vector<Object>();

		// BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		//사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}

	//메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.println("\t[메뉴 선택]=======");
		System.out.println("\t1.요소 추가");
		System.out.println("\t2.요소 출력");
		System.out.println("\t3.요소 검색");
		System.out.println("\t4.요소 삭제");
		System.out.println("\t5.요소 변경");
		System.out.println("\t6.종료");
		System.out.println("\t=================");
		System.out.print("메뉴 선택(1~6) : ");

	}
	
	//메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
		sel = Integer.parseInt(br.readLine());
		if (sel<1 || sel>6)
		{
			exit();
		}
		
		/*
		switch (sel)
		{
		case 1: sel=Menus.E_ADD; break;
		case 2: sel=Menus.E_DISP; break;
		case 3: sel=Menus.E_FIND; break;
		case 4: sel=Menus.E_DEL; break;
		case 5: sel=Menus.E_CHA; break;
		case 6: sel=Menus.E_EXIT; break;
		}
		*/
		
		
	}


	//선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		System.out.println();

		switch (sel)
		{
		/*
		case 1: addElement(); break;
		case 2: dispElement();break;
		case 3: findElement();break;
		case 4: delElement(); break;
		case 5: chaElement(); break;
		case 6: exit(); break;
		*/
		//case Menus.E_ADD: addElement(); break;
		
		case Menus.E_ADD: addElement();break;
		case Menus.E_DISP: dispElement();break;
		case Menus.E_FIND: findElement();break;
		case Menus.E_DEL: delElement();break;
		case Menus.E_CHA:chaElement();break;
		case Menus.E_EXIT:exit();break;
		
		}

		
	}

	//자료구조에 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		
		//1번 요소 추가 메소드
		//Test065 ch!='y' && ch!='Y' 참고해서 문자열은 안돼서 equals활용했음. 
		jump:
		if (sel == 1)
		{	
			int n=1;
			while (true)
			{	
				System.out.print(n + "번째 요소 입력 : ");
				vt.add(br.readLine());
				System.out.println(n + "번째 요소 입력 성공~!!!");
				n++;
				System.out.print("요소 입력 계속 (Y/N)? : ");
				con = br.readLine();
				//System.out.print(vt.elementAt(0));	
				if (!(con.equals("y")||(con.equals("Y"))))
				{
					break jump;
				}
				
			}
			

		}
		/*
		현하님꺼
		int i=1;
		  do
		 {
         System.out.printf("%d번째 요소 입력 : ", i);
         vt.addElement(br.readLine());
         System.out.printf("%d번째 요소 입력 성공~!!!\n", i);
         System.out.print("요소 입력 계속(Y/N)? : "); 
         con = br.readLine();
         System.out.println();

         i++;
         
		 }
		 while (con.equals("Y") || con.equals("y"));

		*/


	}
	
	//출력메소드 162번 참고
	//자료구조 전체 출력 메소드
	public static void dispElement()
	{
		if (sel==2)
		{
			/*
			System.out.println("[벡터 전체 출력]");
			for (int i=0; i<vt.size(); i++)
			{
				System.out.printf("%s%n" ,vt.elementAt(i));
			}
			System.out.println();
			*/
			System.out.print("[벡터 전체 출력]\n ");
			for (Object obj : vt)
			{
				System.out.print(obj + " ");
			}
			System.out.println();

		}
		/*
		보경님꺼
		public static void dispElement()
		 {
		   System.out.println("[벡터 전체 출력]");
		  for (Object obj : vt)
		  {
			 System.out.println(obj);
		  }
		  System.out.println();
		 }

		*/
	}
	
	//검색 Test161참고
	//자료구조 내 요소 검색 메소드
	public static void findElement() throws IOException
	{	
		String searchName;

		if (sel==3)
		{
			System.out.print("검색할 요소 입력 : ");
			
			searchName = br.readLine();

			if (vt.contains(searchName))
			{
				System.out.println("[검색 결과 출력]");
				System.out.println("항목이 존재합니다");
				System.out.println();
			}
			else if (!(vt.contains(searchName)))
			{
				System.out.println("[검색 결과 출력]");
				System.out.println("항목이 존재하지 않습니다.");
				System.out.println();
			}
			else
			{
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				return;
			}

		}
		
	}


/*
			
			if (v.contains(s2))
		{
			i = v.indexOf(s2);
			System.out.println(s2 + " → index 위치 : " + i);
			
			//① 존재하는지의 여부를 확인하고
			//② 우선 위의 코드를 찾고...
			//③ 확인했다면 제거해라(삭제해라)
			v.remove(i);
		}
*/	//삭제 = Test161참고
	//자료구조 내 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		String removeName;
		int i;
		if (sel==4)
		{	
			System.out.print("삭제할 요소 입력 : ");
			removeName = br.readLine();
			System.out.println();
			if(vt.contains(removeName))
			{	
				i=vt.indexOf(removeName);
				System.out.println("[삭제 결과 출력]");
				System.out.println(removeName +"항목이 삭제되었습니다.");
				vt.remove(i);

			}
			else 
			{
				System.out.println("[삭제 결과 출력]");
				System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
			}
		}	
	}


	//  Test160참고
	//  ○ 첫번째 요소를 "하양"으로 변.경. → set() //덮어씌우는 개념임
	//	v.set(0, "하양");
	//자료구조 내 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		if (sel==5)
		{
			String oriName;
			String chaName;
			int i;
			System.out.print("변경할 요소 입력 : ");
			oriName = br.readLine();
			//System.in.skip(2);
			if (vt.contains(oriName))
			{	
				System.out.print("수정할 내용 입력 : ");
				chaName=br.readLine();
				i=vt.indexOf(oriName);
				vt.set(i, chaName);

				System.out.println("[변경 결과 출력]");
				System.out.println("변경이 완료되었습니다.");
			}
			else 
			{
				System.out.println("[변경 결과 출력]");
				System.out.println("변경할 대상이 존재하지 않습니다.");
			}
		}
	}

	
	//프로그램 종료 메소드()		→	완성
	public static void exit()
	{
		System.out.println("프로그램 종료~!!!");
		System.exit(-1);
	}
	

	
	//main() 메소드				→	완성
	public static void main(String[] args) throws IOException, NumberFormatException
	{	


		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);

	}
}
/*======================================
   ■■■ 주민등록번호 유효성 검사■■■
=======================================*/

/*
○ 주민등록번호 검증 공식
	
	① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.
		123456-1234567(주민등록번호)
		****** ****** ----------------------각 자릿수에 곱하기
		234567 892345 (각 자리에 곱해질 수)
		
	② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.
	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5

		=217

	③ 더해진 결과값을 11로 나누어 『나머지』를 취한다
		나머지 : 8    (217 % 11 = 8)
	
	④ 11에서 나머지 8을 뺀 결과값을 구한다.
		11 - 8 → 3
	
		※ ③의 처리 과정에서 나머지가 0인 경우	→ 11 - 0 →11
							 나머지가 1인 경우	→ 11 - 1 →10

			이를 다시 10으로 나누어 나머지를 취한다.		11→1
														10→0

	⑤ ④의 연산 결과가 주민번호를 구성하는 마지막 숫자와 일치하는지의 여부를 
		비교하여 확인한다.
		
		일치		→ 유효한 주민번호
		불일치  → 잘못된 주민번호

*/

// 실행 예)
// 주민번호입력(xxxxxx-xxxxxxx) : 123456-12345678	→입력 갯수 초과
// >>입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(xxxxxx-xxxxxxx) : 123456-123456		→입력 갯수 미달
// >>입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(xxxxxx-xxxxxxx) : 123456-123456		→ 유효한 주민번호
// >>정확한 주민번호~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(xxxxxx-xxxxxxx) : 123456-123456		→ 잘못된 주민번호
// >>잘못된 주민번호~!!!
// 계속하려면 아무 키나 누르세요...

// ※ 문제 해결을 위한 추가 팁~!!

//		배열.length			(속성)		→ 배열의 길이(배열방의 갯수) 반환
//		문자열.length()		(메소드)		→ 문자열의 길이 반환
//		문자열.substring()				→ 문자열 추출
//		문자열.substrint(m, n)			→ 문자열 m번째 위치에서 n-1번째 위치까지 추출(인덱스는0부터 n-1까지)
//		문자열.substrint(m)				→ 문자열 m번째 위치에서 문자열의 끝까지 추출

		/*
		String strTemp;
		
		//테스트
		String strTemp = "김태민";
		System.out.println(strTemp.length());
		//		--==>>3

		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		//		--==>>9 (공백도 포함임)

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//		--==>>10 

		

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		//		--==>>NOPQ

		//System.out.println(strTemp.substring(13, 57));
		//--==>> 에러발생 (런타임 에러)
		//		 StringIndexOutOfBounds

		System.out.println(strTemp.substring(13));
		*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test106
{
	public static void main(String[] args) throws IOException
	{	
		String str;
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13;
		int sum = 0;
		int check,result;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("주민번호입력 (xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if (str.length()<14)
		{
			System.out.println("입력 오류~!!!");	
			return;
		}
		else if (str.length()>14)
		{
			System.out.println("입력 오류~!!!");
			return;		
		}
		else if (str.length()==14)
		{
			//주민등록번호가 유효한지 연산
			//System.out.println(str.substring(0,1));
			//한개 출력
			//System.out.println(str.substring(0,6));
			//주민등록번호 앞자리
			//System.out.println(str.substring(7,14));
			//주민등록번호 뒷자리
			/*for (int i=0; i<6; i++)
			{
				num1 = Integer.parseInt(str.substring(i));
			}
			*/
			num1 = Integer.parseInt(str.substring(0,1));
			num2 = Integer.parseInt(str.substring(1,2));
			num3 = Integer.parseInt(str.substring(2,3));
			num4 = Integer.parseInt(str.substring(3,4));
			num5 = Integer.parseInt(str.substring(4,5));
			num6 = Integer.parseInt(str.substring(5,6));
			num7 = Integer.parseInt(str.substring(7,8));
			num8 = Integer.parseInt(str.substring(8,9));
			num9 = Integer.parseInt(str.substring(9,10));
			num10= Integer.parseInt(str.substring(10,11));
			num11= Integer.parseInt(str.substring(11,12));
			num12= Integer.parseInt(str.substring(12,13));
			num13= Integer.parseInt(str.substring(13,14));	//주민등록번호 마지막 자리
			
			sum = (num1*2)+(num2*3)+(num3*4)+(num4*5)+(num5*6)+(num6*7)+(num7*8)+(num8*9)+(num9*2)+(num10*3)+(num11*4)+(num12*5);
			
			check = (sum%11);	//나머지 연산 
			if (check == 0)
				check =1;
			else if (check ==1)
				check =0;
			
			result = 11 - check;

			if (result == num13)
			{
				System.out.println("정확한 주민번호~!!!");
			}
			else if (result != num13)
			{
				System.out.println("잘못된 주민번호~!!!");
			}

			
		}




	}
}


// 1.처음에 주민등록번호를 사용자로부터 받아 올 것
// 2. ①받아온 문자열이 14자리보다 적으면 입력 갯수 미달
//	  ②받아온 문자열이 14자리보다 많으면 입력 갯수 초과
// 3. 받아온 주민등록번호가 14자리면 연산을 할 것
//    ① 연산 결과가 참이면 유효한 주민번호
//	  ② 연산 결과가 거짓이면 잘못된 주민번호

/*
○ 주민등록번호 검증 공식
	
	① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.
		123456-1234567(주민등록번호)
		****** ****** ----------------------각 자릿수에 곱하기
		234567 892345 (각 자리에 곱해질 수)
		
	② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.
	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5

		=217

	③ 더해진 결과값을 11로 나누어 『나머지』를 취한다
		나머지 : 8    (217 % 11 = 8)
	
	④ 11에서 나머지 8을 뺀 결과값을 구한다.
		11 - 8 → 3
	
		※ ③의 처리 과정에서 나머지가 0인 경우	→ 11 - 0 →11
							 나머지가 1인 경우	→ 11 - 1 →10

			이를 다시 10으로 나누어 나머지를 취한다.		11→1
														10→0

	⑤ ④의 연산 결과가 주민번호를 구성하는 마지막 숫자와 일치하는지의 여부를 
		비교하여 확인한다.
		
		일치		→ 유효한 주민번호
		불일치  → 잘못된 주민번호




/*
// 실행 예)
// 주민번호입력(xxxxxx-xxxxxxx) : 123456-12345678	→입력 갯수 초과
// >>입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(xxxxxx-xxxxxxx) : 123456-123456		→입력 갯수 미달
// >>입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(xxxxxx-xxxxxxx) : 123456-1234567		→ 유효한 주민번호
// >>정확한 주민번호~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(xxxxxx-xxxxxxx) : 123456-1234567		→ 잘못된 주민번호
// >>잘못된 주민번호~!!!
// 계속하려면 아무 키나 누르세요...
*/
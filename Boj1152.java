/*
아마 윈도우에서 돌리시는 것 같아 발생하는 문제인 것 같습니다.
백준 서버는 우분투로 줄바꿈이 '\n'이지만, 윈도우에서는 '\r\n'이라 \r이 또 하나의 값으로 발생하여 생기는 문제인 것 같습니다 :) 
*/
import java.io.IOException;
 
public class Boj1152 {
 
	public static void main(String[] args) throws IOException {
 
		int count = 0;
		int pre_str = 32;	// 공백을 의미한다.
		int str ;
		
		
		while(true) {
			str = System.in.read();
            
			// 입력받은 문자가 공백일 때,
			if(str == 32) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) count++;
			}
 
			// 입력받은 문자가 개행일때 ('\n')
			else if(str == 10) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) 
				{
					count++;
				}
				break;
			

			}
			
			pre_str = str;
			
		}
		
		System.out.println(count);
	}
 
}
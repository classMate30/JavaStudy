/*
�Ƹ� �����쿡�� �����ô� �� ���� �߻��ϴ� ������ �� �����ϴ�.
���� ������ ������� �ٹٲ��� '\n'������, �����쿡���� '\r\n'�̶� \r�� �� �ϳ��� ������ �߻��Ͽ� ����� ������ �� �����ϴ� :) 
*/
import java.io.IOException;
 
public class Boj1152 {
 
	public static void main(String[] args) throws IOException {
 
		int count = 0;
		int pre_str = 32;	// ������ �ǹ��Ѵ�.
		int str ;
		
		
		while(true) {
			str = System.in.read();
            
			// �Է¹��� ���ڰ� ������ ��,
			if(str == 32) {
				// ������ ���ڰ� ������ �ƴϸ�
				if(pre_str != 32) count++;
			}
 
			// �Է¹��� ���ڰ� �����϶� ('\n')
			else if(str == 10) {
				// ������ ���ڰ� ������ �ƴϸ�
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
import java.util.Vector;
import java.util.Scanner;
import java.io.IOException;

public class UserList extends User
{
	static Vector<User> user = new Vector<User>(); // ���� ������ ��� �׸�
	public static boolean flag;
	public static String pn;
	public static int couponForLogIn; 
	public static int dispUserNumber;
	
	// ����� �ӽ� ����ȸ����
	static
	{
		user.add(new User("��"));
		user.add(new User("��"));
		user.add(new User("��"));
		user.get(1).setCoupon(1);
		user.get(2).setCoupon(2);
	}
	
	// ���� ��� �� ������ ������ ȣ��Ǵ� �α��� �޼ҵ�
	public static void userLogin() throws IOException
	{
		// �α��� �޼ҵ尡 ȣ��Ǹ� ��ȣ�� �Է¹ް� �̸� ���� pn�� ������
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ��ȣ�� �Է��ϼ��� : " );
		pn = sc.next();

		for (int i = 0; i < user.size(); i++)
		{
			// �ݺ����� Ȱ���� User��ü�� ��� user ���͸� Ž��
			// getPhoneNumber() �޼���� ����Ǿ��ִ� �ڵ��� ��ȣ�� ��ȯ�ϴ� �޼ҵ�
			// �װ� pn�� ��ġ�ϸ� ����ȸ���̶�� ��
			if (user.get(i).getPhoneNumber().equals(pn)) // ���� ȸ��
			{
				// �α��ο� ���������� enroll �޼ҵ� ����
				enroll(i);

				flag = true;
				couponForLogIn = user.get(i).getCoupon();
				break;
			}
			// pn�� ��ġ�ϴ� ��ȣ�� ������ �ű�ȸ��
			else if (!user.get(i).getPhoneNumber().equals(pn) && i == user.size() - 1) // �ű� ȸ��
			{
				// �ű� ȸ�������� ���� ������ add�޼��带 Ȱ�����ְ� ������ �Ű������� pn�� �־���
				user.add(new User(pn));
				// ������ ���������� ���������� enroll �޼ҵ� ����
				enroll(user.size() - 1);
				
				break;
			}
		}
	}
	
	public static void enroll(int i)
	{
		// ȸ�� ��ȣ ����. (�α��� ������ ��ü�� �ٷ� �������� �ٷ�� ���ؼ�)
		user.get(i).setUserNumber(i + 1);
		dispUserNumber = user.get(i).getUserNumber();
		
		// Stamp Ŭ������ userStamp�� userCoupon ������
		// ȸ�� ��ü�� ����ִ� ������ ���� ���� (���� ���� ������ ����)�� ����
		Stamp.userStamp = user.get(i).getStamp();
		Stamp.userCoupon = user.get(i).getCoupon();
		// ������ ��� �޼ҵ� ����
		Stamp.stampCal();
		
		// ������ ����� ����� �� ������ �������� ���� ������ �ٽ� ���� ��ü�� ����
		user.get(i).setStamp(Stamp.userStamp);
		user.get(i).setCoupon(Stamp.userCoupon);
	}
}